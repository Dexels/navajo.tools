package com.dexels.navajo.metrics.dependency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.dexels.navajo.dependency.Dependency;

public class DependencyAnalyzer {

    protected MetricsTslPreCompiler precompiler;

    protected Map<String, List<Dependency>> dependencies;
    protected Map<String, List<Dependency>> reverseDependencies;
    protected String scriptFolder;

    public void activate() {
        precompiler = new MetricsTslPreCompiler();
        scriptFolder = "/home/chris/git/sportlink/scripts";
        initialize();

    }

    protected void initialize() {
        dependencies = new HashMap<String, List<Dependency>>();
        reverseDependencies = new HashMap<String, List<Dependency>>();
    }

    public void addDependencies(String script) {

        List<Dependency> myDependencies = new ArrayList<Dependency>();
        String scriptTenant = tenantFromScriptPath(script);

        try {
            precompiler.getAllDependencies(script, scriptFolder, myDependencies, scriptTenant);
            // codeSearch.getAllWorkflowDependencies(scriptFile, scriptPath,
            // scriptFolder, myDependencies);
        } catch (Exception e) {
            return;
        }
        dependencies.put(script, myDependencies);

        updateReverseDependencies(myDependencies);
    }

    public List<Dependency> getDependencies(String scriptName) {
        return dependencies.get(scriptName);
    }
    
    public List<Dependency> getDependencies(String scriptPath, int dependencyType) {
        List<Dependency> allDeps = dependencies.get(scriptPath);
        List<Dependency> result = new ArrayList<Dependency>();
        
        if (allDeps == null) {
            return result;
        }
        
        for (Dependency dep : allDeps) {
            if (dep.getType() == dependencyType) {
                result.add(dep);
            }
        }
        return result;
    }

    public List<Dependency> getReverseDependencies(String scriptPath) {
        String script = scriptPath;

        if (scriptPath.indexOf('_') > 0) {
            int slashIndex = scriptPath.lastIndexOf("/");
            
            if (slashIndex != -1) {
                // Check if the last '_' is after the / part, since a _ might occur in a directory name
                String bareScript = scriptPath.substring(slashIndex + 1);
                if (bareScript.indexOf('_') != -1) {
                    script = scriptPath.substring(0, scriptPath.lastIndexOf('_'));
                }
            } else {
                script = scriptPath.substring(0, scriptPath.lastIndexOf('_'));
            }
        }
        if (reverseDependencies.containsKey(script)) {
            return reverseDependencies.get(script);
        }
        return new ArrayList<>();

    }

    private String tenantFromScriptPath(String scriptPath) {
        int scoreIndex = scriptPath.lastIndexOf('_');
        int slashIndex = scriptPath.lastIndexOf("/");
        
        if (slashIndex != -1) {
            String bareScript = scriptPath.substring(slashIndex + 1);
            scoreIndex = bareScript.lastIndexOf('_');
            if (scoreIndex != -1) {
                return bareScript.substring(scoreIndex+1, bareScript.length());
            } 
        } else if (scoreIndex > -1)  {
            return scriptPath.substring(scoreIndex+1, scriptPath.length());
        }
        return null;
        
    }

    protected void updateReverseDependencies(List<Dependency> dependencies) {

        for (Dependency dep : dependencies) {

            if (!reverseDependencies.containsKey(dep.getDependee())) {
                reverseDependencies.put(dep.getDependee(), new ArrayList<Dependency>());
            }
            reverseDependencies.get(dep.getDependee()).add(dep);
        }
    }

    

}
