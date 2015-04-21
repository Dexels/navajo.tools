package com.dexels.navajo.dev.dependency.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import com.dexels.navajo.dependency.Dependency;

public class CodeSearch {

    public void addWorkflowDependencies(String scriptFolder, List<Dependency> deps, IProgressMonitor monitor) {
        File rootDir = new File(scriptFolder).getParentFile();
        File workflowDir = new File(rootDir, "workflows");
        int nrFiles = countFiles(workflowDir);
        IProgressMonitor submonitor = new SubProgressMonitor(monitor, nrFiles);
        searchWorkflowScriptDependenciesInDir(workflowDir, deps, scriptFolder, submonitor);
    }
    
    public void addProjectDependencies(IProject project, List<Dependency> deps,String scriptFolder, IProgressMonitor monitor) {
        IFolder s = project.getFolder("tipi");
        if ( s.exists()) { 
           
            File tipiDir = s.getRawLocation().makeAbsolute().toFile();
            int nrFiles = countFiles(tipiDir);
            IProgressMonitor submonitor = new SubProgressMonitor(monitor, nrFiles);
            for (File dirEntry : tipiDir.listFiles()) {
                if (monitor.isCanceled()) {
                    return;
                }
                if (dirEntry.isFile()) {
                    searchTipiFile(dirEntry, deps, scriptFolder);
                    submonitor.worked(1);
                } else if (dirEntry.isDirectory()) {
                    searchExternalProjectScriptDependenciesInDir(dirEntry, deps, scriptFolder, monitor);
                }
            }
            
            
        }
        System.out.println(s);
      // File tipiDir = new File(project.getFile("tipp"))
    }
    
    

    private void searchWorkflowScriptDependenciesInDir(File directory, List<Dependency> deps, String scriptFolder, IProgressMonitor monitor) {
        for (File dirEntry : directory.listFiles()) {
            if (monitor.isCanceled()) {
                return;
            }
            if (dirEntry.isFile()) {
                searchWorkflowFile(dirEntry, deps, scriptFolder);
                monitor.worked(1);
            } else if (dirEntry.isDirectory()) {
                searchWorkflowScriptDependenciesInDir(dirEntry, deps, scriptFolder, monitor);
            }
        }
    }
    
    private void searchExternalProjectScriptDependenciesInDir(File directory, List<Dependency> deps, String scriptFolder, IProgressMonitor monitor) {
        for (File dirEntry : directory.listFiles()) {
            if (monitor.isCanceled()) {
                return;
            }
            if (dirEntry.isFile()) {
                searchTipiFile(dirEntry, deps, scriptFolder);
                monitor.worked(1);
            } else if (dirEntry.isDirectory()) {
                searchExternalProjectScriptDependenciesInDir(dirEntry, deps, scriptFolder, monitor);
            }
        }
    }


    public void searchWorkflowFile(File workflowFile, List<Dependency> deps, String scriptFolder) {
        String line;
        int linenr = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(workflowFile));

            Pattern p1 = Pattern.compile("\\b" + "(:?before)?navajo:([a-zA-Z0-9/]*)", Pattern.CASE_INSENSITIVE);
            Pattern p2 = Pattern.compile("\\b" + "service=\"([a-zA-Z0-9/]*)", Pattern.CASE_INSENSITIVE);

            while ((line = bf.readLine()) != null) {
                Matcher m = p1.matcher(line);
                linenr++;
                while (m.find()) {
                    String scriptName = m.group(2);
                    if (scriptName.indexOf(':') > 0) {
                        continue;
                    }

                    String scriptFullPath = scriptFolder + File.separator + scriptName + ".xml";
                    // Check if exists
                    boolean isBroken = false;
                    if (!new File(scriptFullPath).exists()) {
                        isBroken = true;
                    }
                    deps.add(new Dependency(workflowFile.getAbsolutePath(), scriptFullPath, Dependency.WORKFLOW_DEPENDENCY, linenr, isBroken));
                }

                m = p2.matcher(line);
                while (m.find()) {
                    String scriptName = m.group(1);
                    String scriptFullPath = scriptFolder + File.separator + scriptName + ".xml";

                    // Check if exists
                    boolean isBroken = false;
                    if (!new File(scriptFullPath).exists()) {
                        isBroken = true;
                    }
                   

                    deps.add(new Dependency(workflowFile.getAbsolutePath(), scriptFullPath, Dependency.WORKFLOW_DEPENDENCY, linenr, isBroken));
                }
            }
            bf.close();

        } catch (IOException e) {
            System.err.println("EXCEPTION! " + e);
            e.printStackTrace();
        }
    }
    
    public void searchTipiFile(File workflowFile, List<Dependency> deps, String scriptFolder) {
        String line;
        int linenr = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(workflowFile));

            Pattern p1 = Pattern.compile("\\b" + "callService(.*)service=\"'([a-zA-Z0-9/]*)'", Pattern.CASE_INSENSITIVE);

            while ((line = bf.readLine()) != null) {
                Matcher m = p1.matcher(line);
                linenr++;
                while (m.find()) {
                    String scriptName = m.group(2);
                    if (scriptName.indexOf(':') > 0) {
                        continue;
                    }

                    String scriptFullPath = scriptFolder + File.separator + scriptName + ".xml";
                    // Check if exists
                    boolean isBroken = false;
                    if (!new File(scriptFullPath).exists()) {
                        isBroken = true;
                    }
                   
                    deps.add(new Dependency(workflowFile.getAbsolutePath(), scriptFullPath, Dependency.TIPI_DEPENDENCY, linenr, isBroken));
                }
            }
            bf.close();

        } catch (IOException e) {
            System.err.println("EXCEPTION! " + e);
            e.printStackTrace();
        } 
    }
    

   
    
    public static int countFiles(File directory) {
        int count = 0;
        for(File file : directory.listFiles()) {
            if(file.isDirectory()) {
                count += countFiles(file); 
            }
            count++;
        }
        return count;
    }
}
