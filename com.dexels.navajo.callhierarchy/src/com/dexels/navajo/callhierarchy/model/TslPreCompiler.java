package com.dexels.navajo.callhierarchy.model;

/**
 * <p>Title: Navajo Product Project</p>"
 * <p>Description: This is the official source for the Navajo server</p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: Dexels BV</p>
 * @author Arjen Schoneveld
 * @version $Id$get
 */

/**
 *
 * $columnValue('AAP') -> Object o = contextMap.getColumnValue('AAP') -> symbolTable.put("$columnValue('AAP')", o);
 *laz
 *
 *
 */
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.AbstractFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.dexels.navajo.callhierarchy.dependency.Dependency;
import com.dexels.navajo.document.jaxpimpl.xml.XMLDocumentUtils;
import com.dexels.navajo.mapping.compiler.meta.MapMetaData;

public class TslPreCompiler {
    private final static Logger logger = LoggerFactory.getLogger(TslPreCompiler.class);

    public void getAllDependencies(File scriptFile, String script, String scriptFolder, List<Dependency> deps) {
        String fullScriptPath = scriptFile.getAbsolutePath();
        Document tslDoc = null;
        InputStream is = null;

        try {
            // Check for metascript.
            if (MapMetaData.isMetaScript(fullScriptPath)) {
                MapMetaData mmd = MapMetaData.getInstance();
                FileInputStream metais = new FileInputStream(scriptFile);

                String intermed = mmd.parse(fullScriptPath, metais);
                metais.close();
                is = new ByteArrayInputStream(intermed.getBytes());
            } else {
                is = new FileInputStream(scriptFile);
            }

            tslDoc = XMLDocumentUtils.createDocument(is, false);
            findIncludeDependencies(script, scriptFile.getAbsolutePath(), scriptFolder, deps, tslDoc);
            findNavajoDependencies(script, scriptFile.getAbsolutePath(),  scriptFolder, deps, tslDoc);
            findMethodDependencies(script, scriptFile.getAbsolutePath(),  scriptFolder, deps, tslDoc);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void findIncludeDependencies(String script, String scriptFile, String scriptFolder, List<Dependency> deps, Document tslDoc) {
        NodeList includes = tslDoc.getElementsByTagName("include");
        int included = 0;
        for (int i = 0; i < includes.getLength(); i++) {
            Node n = includes.item(i);
            String includeScript = ((Element) n).getAttribute("script");
            if (includeScript == null || includeScript.equals("")) {
               return;
            }
            
            String includeScriptFile = scriptFolder + File.separator + includeScript + ".xml";
            
            // Check if exists
            if (! new File(includeScriptFile).exists()) {
                deps.add(new Dependency(scriptFile, includeScriptFile, Dependency.BROKEN_DEPENDENCY));
                continue;
            }
            deps.add(new Dependency(scriptFile, includeScriptFile, Dependency.INCLUDE_DEPENDENCY));
            
            // Going to check for tenant-specific include-variants
            File scriptFolderFile = new File(includeScriptFile).getParentFile();
            AbstractFileFilter fileFilter = new WildcardFileFilter(FilenameUtils.getName(includeScript) + "_*.xml");
            Collection<File> files = FileUtils.listFiles(scriptFolderFile, fileFilter, null);
            for (File f : files) {
                deps.add(new Dependency(scriptFile, f.getAbsolutePath(), Dependency.INCLUDE_DEPENDENCY));
            }
            included++;

            if (included > 1000) {
               return;
            }
        }
    }
    
    private void findMethodDependencies(String script, String scriptFile, String scriptFolder, List<Dependency> deps, Document tslDoc) {
        NodeList methods = tslDoc.getElementsByTagName("method");
        for (int i = 0; i < methods.getLength(); i++) {
            Node n = methods.item(i);
            String methodScript = ((Element) n).getAttribute("name");
            if (methodScript == null || methodScript.equals("")) {
               return;
            }
            String methodScriptFile = scriptFolder + File.separator + methodScript + ".xml";
            
            // Check if exists
            if (! new File(methodScriptFile).exists()) {
                deps.add(new Dependency(scriptFile, methodScriptFile, Dependency.BROKEN_DEPENDENCY));
                continue;
            }
            deps.add(new Dependency(scriptFile, methodScriptFile, Dependency.METHOD_DEPENDENCY));

            // Going to check for tenant-specific include-variants
            File scriptFolderFile =new File(methodScriptFile).getParentFile();
            AbstractFileFilter fileFilter = new WildcardFileFilter(FilenameUtils.getName(methodScript) + "_*.xml");
            Collection<File> files = FileUtils.listFiles(scriptFolderFile, fileFilter, null);
            for (File f : files) {
                deps.add(new Dependency(scriptFile, f.getAbsolutePath(), Dependency.METHOD_DEPENDENCY));
            }
          
        }
    }
    

    private void findNavajoDependencies(String script, String scriptFile, String scriptFolder, List<Dependency> deps, Document tslDoc)
            throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodes = (NodeList) xPath.evaluate(
                "//map[@object='com.dexels.navajo.adapter.NavajoMap']/field[@name='doSend']/expression/value",
                tslDoc.getDocumentElement(), XPathConstants.NODESET);

        for (int i = 0; i < nodes.getLength(); ++i) {
            Element value = (Element) nodes.item(i);
            String navajoScript = value.getTextContent();
            if (navajoScript.contains("@")) {
                // Going to try to parse param ...
                List<String> result = getParamValue(tslDoc, navajoScript);
                for (String res : result) {
                    addNavajoDependency(scriptFile, deps, res, scriptFolder);
                }

            } else {
                addNavajoDependency(scriptFile, deps, navajoScript, scriptFolder);
                
            }
        }
    }

    private void addNavajoDependency(String scriptFile, List<Dependency> deps, String navajoScript, String scriptFolder) {
        String cleanScript = navajoScript.replace("'", "");
        String navajoScriptFile = scriptFolder + File.separator + cleanScript + ".xml";
        
        // Check if exists
        if (! new File(navajoScriptFile).exists()) {
            deps.add(new Dependency(scriptFile, navajoScriptFile, Dependency.BROKEN_DEPENDENCY));
            return;
        }
        
        deps.add(new Dependency(scriptFile, navajoScriptFile, Dependency.NAVAJO_DEPENDENCY));
        
        // Going to check for tenant-specific include-variants
        File scriptFolderFile = new File(scriptFile).getParentFile();
        AbstractFileFilter fileFilter = new WildcardFileFilter(FilenameUtils.getName(cleanScript) + "_*.xml");
        Collection<File> files = FileUtils.listFiles(scriptFolderFile, fileFilter, null);
        for (File f : files) {
            deps.add(new Dependency(scriptFile, f.getAbsolutePath(), Dependency.NAVAJO_DEPENDENCY));
        }
    }

    
    
    private List<String> getParamValue(Document tslDoc, String paramString) throws XPathExpressionException {
        String paramName = paramString.split("\\@")[1];
        paramName = paramName.substring(0, paramName.length() - 1);
        List<String> result = new ArrayList<String>();

        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodes = (NodeList) xPath.evaluate("//param[@name='" + paramName + "']/expression",
                tslDoc.getDocumentElement(), XPathConstants.NODESET);

        for (int i = 0; i < nodes.getLength(); ++i) {
            Element expression = (Element) nodes.item(i);
            String scriptString = expression.getAttribute("value");
            if (scriptString.contains("@")) {
                // Going to try to recursively parse param ...
                if (scriptString.equals(paramString)) {
                    return null;
                }
                result.addAll(getParamValue(tslDoc, scriptString));
            } else {
                String cleanScript = scriptString.replace("'", "");
                result.add(cleanScript);

            }
        }
        return result;
    }

}