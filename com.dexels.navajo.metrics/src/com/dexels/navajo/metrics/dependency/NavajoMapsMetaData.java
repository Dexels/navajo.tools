package com.dexels.navajo.metrics.dependency;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.jar.Manifest;

import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.slf4j.Logger;

import com.dexels.navajo.document.nanoimpl.CaseSensitiveXMLElement;
import com.dexels.navajo.document.nanoimpl.XMLElement;
import com.dexels.navajo.mapping.compiler.meta.MapMetaData;

public class NavajoMapsMetaData {
    Logger l;
    public NavajoMapsMetaData() {
        addMapMetaData(new File("/home/chris/git/navajo/"));
        addMapMetaData(new File("/home/chris/git/enterprise/"));
        addMapMetaData(new File("/home/chris/git/sportlink.library/"));
    }

    /** This helper class goes through the projects currently opened in the workspace, looks 
     * for their Manifest file, and determine whether the 'Navajo-Extension' property
     * is defined. If so, the relevant XML file(s) are read in and their meta-data added to
     * MapMetaData. This allows for later parsing of Navascript files.
     */
    public void addMapMetaData(File folder) {

        File manifestfile = new File(folder, "META-INF/MANIFEST.MF");
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

                    for (String extFile : navajoExtensionHeader.split(",")) {
                        File xmlFile = new File(folder, "src" + File.separator + extFile);
                        FileInputStream fis = new FileInputStream(xmlFile);
                        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                        XMLElement config = new CaseSensitiveXMLElement();
                        config.parseFromReader(br);
                        br.close();

                        if (config.getName().equals("adapterdef")) {
                            Vector<XMLElement> allmaps = config.getElementsByTagName("map");

                            for (int j = 0; j < allmaps.size(); j++) {
                                XMLElement map = allmaps.get(j);
                                MapMetaData.getInstance().addMapDefinition(map);
                            }
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } else {
            String[] subdirectories = folder.list(DirectoryFileFilter.INSTANCE);
            for (int j = 0; j < subdirectories.length; j++) {
                File subdir = new File(folder, subdirectories[j]);
                addMapMetaData(subdir);
            }
        }

    }

}
