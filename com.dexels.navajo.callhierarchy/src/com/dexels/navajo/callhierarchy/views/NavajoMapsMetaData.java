package com.dexels.navajo.callhierarchy.views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

import com.dexels.navajo.document.nanoimpl.CaseSensitiveXMLElement;
import com.dexels.navajo.document.nanoimpl.XMLElement;
import com.dexels.navajo.mapping.compiler.meta.MapMetaData;

public class NavajoMapsMetaData {

    public NavajoMapsMetaData() {
        addMapMetaData();
    }

    public void addMapMetaData() {
        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

        for (IProject project : projects) {
           
            File projectFile = project.getLocation().toFile();
            File manifestfile = new File(projectFile, "META-INF/MANIFEST.MF");
            if (manifestfile.exists()) {
                Manifest manifest = null;

                try {
                    FileInputStream is = new FileInputStream(manifestfile);
                    manifest = new Manifest(is);
                    is.close();
                } catch (FileNotFoundException e) {
                    return;
                } catch (IOException e) {
                    return;
                }

                String navajoExtensionHeader = manifest.getMainAttributes().getValue("Navajo-Extension");
                String navajoName = manifest.getMainAttributes().getValue("Navajo-Name");

                if (navajoExtensionHeader != null && navajoName != null) {
                    try {
                        
                        for (String extFile :navajoExtensionHeader.split(",") ) {
                            File xmlFile = new File(projectFile, "src" + File.separator + extFile);
                            FileInputStream fis = new FileInputStream(xmlFile);
                            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                            XMLElement config = new CaseSensitiveXMLElement();
                            config.parseFromReader(br);
                            br.close();

                            if (config.getName().equals("adapterdef")) {
                                Vector<XMLElement> allmaps = config.getElementsByTagName("map");
                                // System.err.println("Found " + allmaps.size() +
                                // " map definitions");
                                for (int i = 0; i < allmaps.size(); i++) {
                                    XMLElement map = allmaps.get(i);
                                    MapMetaData.getInstance().addMapDefinition(map);
                                }
                            }
                        }
                      

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        }

    }

}
