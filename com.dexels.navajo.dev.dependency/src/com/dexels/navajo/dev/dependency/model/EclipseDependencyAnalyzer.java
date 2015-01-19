package com.dexels.navajo.dev.dependency.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dexels.navajo.dependency.Dependency;
import com.dexels.navajo.dependency.DependencyAnalyzer;
import com.dexels.navajo.dev.dependency.views.ViewContentProvider;

public class EclipseDependencyAnalyzer extends DependencyAnalyzer {
    private static class Holder {
        static final EclipseDependencyAnalyzer INSTANCE = new EclipseDependencyAnalyzer();
    }

    public static final String INIT_JOB_NAME = "Calculating Navajo Dependencies";
    private static final int WORKFLOW_WORKCOUNT = 500;
    private final static Logger logger = LoggerFactory.getLogger(EclipseDependencyAnalyzer.class);
    private String rootFolder;
    
    private Job initializeJob;

    private CodeSearch codeSearch;
    private boolean initialized = false;

    public EclipseDependencyAnalyzer() {
        precompiler = new EclipseTslPreCompiler();
        codeSearch = new CodeSearch();
        initialize();

    }

    public static EclipseDependencyAnalyzer getInstance() {
        return Holder.INSTANCE;
    }

    public void initialize(String aScript, final ViewContentProvider callback) {
        if (rootFolder != null && ! aScript.contains(rootFolder)) {  
            // Opened a script in another root folder than the current dependency tree
            rebuild();
        }

        if (initialized || initializeJob != null) {
            return;
        }

        initializeJob = createJob(aScript);
        initializeJob.schedule();
        initializeJob.addJobChangeListener(new JobChangeAdapter() {
            @Override
            public void done(IJobChangeEvent arg0) {
                callback.triggerTreeRefresh();
            }
        });
    }

    public void rebuild() {
        // Resetting the following values will trigger a rebuild
        initialized = false;
        initializeJob = null;
        dependencies = new HashMap<String, List<Dependency>>();
        reverseDependencies = new HashMap<String, List<Dependency>>();
    }

    private Job createJob(final String aScript) {

        return new Job(INIT_JOB_NAME) {

            private String script = aScript;

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                rootFolder = null;
                if (script.contains("scripts")) {
                    rootFolder = script.split("scripts")[0];
                } else if (script.contains("workflows")){
                    rootFolder = script.split("workflows")[0];
                } else {
                    throw new RuntimeException("Unexpected script path - expecting 'scripts' or 'workflows' in path: " + script);
                }
                scriptFolder = rootFolder + "scripts";

                // Read in existing dependencies
                importPersistedDependencies(scriptFolder);

                // We missed changes, so re-read all files
                String[] xmlExt = { "xml" };
                Collection<File> files = FileUtils.listFiles(new File(scriptFolder), xmlExt, true);

                try {
                    // Files.size + 'fake' 100 for workflow progress
                    monitor.beginTask("Calculating Navajo dependencies", files.size() + WORKFLOW_WORKCOUNT);

                    for (File f : files) {
                        monitor.subTask("Calculating dependencies of: " + f.getAbsolutePath());

                        addDependencies(TreeObject.getScriptFromFilename(f.getAbsolutePath()));
                        monitor.worked(1);

                        if (monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                    }
                    addWorkflowDependencies(scriptFolder, new SubProgressMonitor(monitor, 500));
                    persistDependencies(scriptFolder);

                    if (monitor.isCanceled()) {
                        return Status.CANCEL_STATUS;
                    }

                    initialized = true;

                } finally {
                    monitor.done();

                }

                return Status.OK_STATUS;
            }
        };
    }

    private void addWorkflowDependencies(String scriptFolder, IProgressMonitor monitor) {
        logger.debug("Starting workflow dependencies");
        List<Dependency> myDependencies = new ArrayList<Dependency>();
        try {
            codeSearch.addWorkflowDependencies(scriptFolder, myDependencies, monitor);
        } catch (Exception e) {
            logger.error("Exception on getting workflow depencencies for {}: {}", e);
            return;
        }

        for (Dependency dep : myDependencies) {

            if (!dependencies.containsKey(dep.getScript())) {
                dependencies.put(dep.getScript(), new ArrayList<Dependency>());
            }

            dependencies.get(dep.getScript()).add(dep);

            if (!reverseDependencies.containsKey(dep.getDependee())) {
                reverseDependencies.put(dep.getDependee(), new ArrayList<Dependency>());
            }

            reverseDependencies.get(dep.getDependee()).add(dep);
        }
        logger.debug("Done workflow dependencies");

    }

    public void refresh(String scriptFile, boolean recursive) {
        String scriptName = TreeObject.getScriptFromFilename(scriptFile);
        removeScriptFromReverseValues(scriptName);
        dependencies.remove(scriptName);
        addDependencies(scriptName);
        
        // Update the dependencies of all scripts that point(ed) to me
        List<Dependency> deps = reverseDependencies.get(scriptName);
      
        if (deps != null && recursive) {
            // The refresh action can trigger removing dependencies. Therefore make a copy
            // of the list to prevent ConcurrentMod exceptions
            List<Dependency> depsCopy = new ArrayList<Dependency>(deps);
            for (Dependency dep : depsCopy) {
                if (!dep.getScriptFile().equals(scriptFile)) {
                    refresh(dep.getScriptFile(), false);
                }
            }
        }
       
    }

    public void remove(String scriptFile) {
        String scriptName = TreeObject.getScriptFromFilename(scriptFile);
        removeScriptFromReverseValues(scriptName);
        updatedReverseToBroken(scriptName);
        dependencies.get(scriptName);
        dependencies.remove(scriptName);
    }
    
    private void updatedReverseToBroken(String scriptName) {
        List<Dependency> deps = reverseDependencies.get(scriptName);
        if (deps == null) {
            return;
        }
        
        for (Dependency dep : deps) {
            dep.setType(Dependency.BROKEN_DEPENDENCY);
        }
    }

    private void removeScriptFromReverseValues(String scriptName) {
        List<Dependency> deps = dependencies.get(scriptName);
        if (deps == null) {
            return;
        }

        for (Dependency dep : deps) {
            List<Dependency> reverseDeps = reverseDependencies.get(dep.getDependee());
            if (reverseDeps == null)
                continue; // nothing to do...

            List<Dependency> toRemove = new ArrayList<Dependency>();
            for (Dependency reverseDep : reverseDeps) {
                if (dep == reverseDep) {
                    toRemove.add(reverseDep);
                }
            }
            reverseDeps.removeAll(toRemove);
            reverseDependencies.put(dep.getDependee(), reverseDeps);
        }
    }
    
    public boolean containsBrokenDependencies(String scriptPath) {
        List<Dependency> deps =  getDependencies(scriptPath);
        if (deps == null) {
            return false;
        }
        
        for (Dependency dep : deps) {
            if (dep.getType() == Dependency.BROKEN_DEPENDENCY) {
                return true;
            }
        }
        return false;
    }
}
