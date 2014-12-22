package com.dexels.navajo.dev.dependency.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;

public class CodeSearch {

    public void addWorkflowDependencies(String scriptFolder, List<Dependency> deps, IProgressMonitor monitor) {

        File rootDir = new File(scriptFolder).getParentFile();
        File workflowDir = new File(rootDir, "workflows");
        searchScriptDependenciesInDir(workflowDir, deps, scriptFolder, monitor);

    }

    private void searchScriptDependenciesInDir(File directory, List<Dependency> deps, String scriptFolder,
            IProgressMonitor monitor) {
        for (File dirEntry : directory.listFiles()) {
            if (monitor.isCanceled()) {
                return;
            }
            if (dirEntry.isFile()) {
                searchFiles(dirEntry, deps, scriptFolder);
                monitor.worked(1);
            } else if (dirEntry.isDirectory()) {
                searchScriptDependenciesInDir(dirEntry, deps, scriptFolder, monitor);
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
                    String scriptFullPath = scriptFolder + File.separator + scriptName + ".xml";
                    deps.add(new Dependency(workflowFile.getAbsolutePath(), scriptFullPath,
                            Dependency.WORKFLOW_DEPENDENCY));
                }

                m = p2.matcher(line);
                while (m.find()) {
                    String match = m.group(1);
                    String scriptName = match.substring(0, match.indexOf('"'));
                    String scriptFullPath = scriptFolder + File.separator + scriptName + ".xml";
                    deps.add(new Dependency(workflowFile.getAbsolutePath(), scriptFullPath,
                            Dependency.WORKFLOW_DEPENDENCY));
                }
            }
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
