package com.dexels.navajo.dev.dependency.model;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.dexels.navajo.dependency.Dependency;
import com.dexels.navajo.dependency.TslPreCompiler;
import com.dexels.navajo.mapping.compiler.meta.MapMetaData;
import com.dexels.navajo.script.api.UserException;

/**
 * A TslPreCompiler that is independent of a running NavajoConfig. Differs in how the 
 * script file is parsed to a Document.
 * 
 * @author Chris Brouwer
 *
 */
public class EclipseTslPreCompiler extends TslPreCompiler {

    private final static Logger logger = LoggerFactory.getLogger(EclipseTslPreCompiler.class);
    
    public EclipseTslPreCompiler() {
        super();
        new NavajoMapsMetaData();
    }

    
    @Override
    public void getAllDependencies(String script, String scriptFolder, List<Dependency> deps, String scriptTenant)
            throws XPathExpressionException, UserException {
        
        String fullScriptPath = scriptFolder + File.separator + script + ".xml";
        Document tslDoc = null;
        InputStream is = null;

        try {
            // Check for metascript.
            if (MapMetaData.isMetaScript(fullScriptPath)) {
                MapMetaData mmd = MapMetaData.getInstance();
                FileInputStream metais = new FileInputStream(new File(fullScriptPath));

                String intermed = mmd.parse(fullScriptPath, metais);
                metais.close();
                is = new ByteArrayInputStream(intermed.getBytes());
            } else {
                is = new FileInputStream(new File(fullScriptPath));
            }

            tslDoc = newDocumentFromInputStream(is);
            getAllDependencies(fullScriptPath, scriptTenant, scriptFolder, deps, tslDoc);

        } catch (Exception e) {
            logger.error("Exception in reading XML of {}: {}", script,e.getMessage(), e);
        }

    }

    private static Document newDocumentFromInputStream(InputStream in) {
        DocumentBuilderFactory factory = null;
        DocumentBuilder builder = null;
        Document ret = null;

        try {
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        try {
            ret = builder.parse(new InputSource(in));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

}