package com.dexels.navajo.callhierarchy.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dexels.navajo.callhierarchy.dependency.Dependency;

public class CodeSearch {

    public void addWorkflowDependencies(String scriptFolder, List<Dependency> deps) {
        
        File rootDir = new File(scriptFolder).getParentFile();
        File workflowDir = new File(rootDir, "workflows");
        searchScriptDependenciesInDir(workflowDir, deps, scriptFolder);

    }

  

    private void searchScriptDependenciesInDir(File directory, List<Dependency> deps, String scriptFolder) {
        for (File dirEntry : directory.listFiles()) {

            if (dirEntry.isFile()) {
                searchFiles(dirEntry, deps, scriptFolder);
            } else if (dirEntry.isDirectory()) {
                searchScriptDependenciesInDir(dirEntry,  deps, scriptFolder);
            }
        }

    }

    public static void searchFiles(File workflowFile, List<Dependency> deps, String scriptFolder) {
        String line;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(workflowFile));

            Pattern p1 = Pattern.compile("\\b" + "navajo:(.*)\"" + "\\b", Pattern.CASE_INSENSITIVE);
            Pattern p2 = Pattern.compile("\\b" + "service=\"(.*)\"" + "\\b", Pattern.CASE_INSENSITIVE);


            while ((line = bf.readLine()) != null) {
                Matcher m = p1.matcher(line);

                while (m.find()) {
                    String match = m.group();
                    String scriptName = match.substring("navajo:".length(), match.indexOf('"'));
                    if (scriptName.indexOf(':') > 0) {
                        continue;
                    }
                    String scriptFullPath =  scriptFolder + File.separator + scriptName + ".xml";
                    deps.add(new Dependency(workflowFile.getAbsolutePath(), scriptFullPath, Dependency.WORKFLOW_DEPENDENCY));
                }
                
                m = p2.matcher(line);
                while (m.find()) {
                    String match = m.group(1);
                    String scriptName = match.substring(0, match.indexOf('"'));
                    String scriptFullPath =  scriptFolder + File.separator + scriptName + ".xml";
                    deps.add(new Dependency(workflowFile.getAbsolutePath(), scriptFullPath, Dependency.WORKFLOW_DEPENDENCY));
                }
            }
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
