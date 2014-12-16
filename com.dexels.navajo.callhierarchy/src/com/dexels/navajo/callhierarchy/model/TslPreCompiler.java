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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.dexels.navajo.document.jaxpimpl.xml.XMLDocumentUtils;
import com.dexels.navajo.mapping.compiler.meta.IncludeDependency;
import com.dexels.navajo.mapping.compiler.meta.MapMetaData;
import com.dexels.navajo.mapping.compiler.meta.NavajoDependency;
import com.dexels.navajo.script.api.Dependency;
import com.dexels.navajo.script.api.UserException;

public class TslPreCompiler {

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
            findIncludeDependencies(script,  scriptFolder, deps, tslDoc);
            findNavajoDependencies(script, deps, tslDoc);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void findIncludeDependencies(String script,  String scripFolder, List<Dependency> deps, Document tslDoc) {
        NodeList includes = tslDoc.getElementsByTagName("include");
        int included = 0;
        for (int i = 0; i < includes.getLength(); i++) {
            Node n = includes.item(i);
            String includeScript = ((Element) n).getAttribute("script");
            if (includeScript == null || includeScript.equals("")) {
               return;
            }
            
            deps.add(new IncludeDependency(IncludeDependency.getScriptTimeStamp(includeScript), script,  includeScript));
            File scriptFolderFile = new File(scripFolder);
            
            // Going to check for tenant-specific include-variants
            AbstractFileFilter fileFilter = new WildcardFileFilter(FilenameUtils.getName(includeScript) + "_*.xml");
            Collection<File> files = FileUtils.listFiles(scriptFolderFile, fileFilter, null);
            for (File f : files) {
                String includeScriptPath = f.getAbsolutePath().substring(scripFolder.length());
                String includeScriptTenant = includeScriptPath.substring(1, includeScriptPath.indexOf(".xml"));
                deps.add(new IncludeDependency(IncludeDependency.getScriptTimeStamp(includeScriptTenant), script,  includeScriptTenant));
            }
            included++;

            if (included > 1000) {
               return;
            }
        }
    }

    private void findNavajoDependencies(String script, List<Dependency> deps, Document tslDoc)
            throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodes = (NodeList) xPath.evaluate(
                "//map[@object='com.dexels.navajo.adapter.NavajoMap']/field[@name='doSend']/expression/value",
                tslDoc.getDocumentElement(), XPathConstants.NODESET);

        for (int i = 0; i < nodes.getLength(); ++i) {
            Element value = (Element) nodes.item(i);
            String scriptString = value.getTextContent();
            if (scriptString.contains("@")) {
                // Going to try to parse param ...
                List<String> result = getParamValue(tslDoc, scriptString);
                for (String res : result) {
                    deps.add(new NavajoDependency(NavajoDependency.getScriptTimeStamp(res), script, res));
                }

            } else {
                String cleanScript = scriptString.replace("'", "");
                deps.add(new NavajoDependency(NavajoDependency.getScriptTimeStamp(cleanScript), script, cleanScript));
            }
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