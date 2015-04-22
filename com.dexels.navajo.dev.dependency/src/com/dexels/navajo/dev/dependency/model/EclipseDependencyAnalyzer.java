package com.dexels.navajo.dev.dependency.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dexels.navajo.dependency.Dependency;
import com.dexels.navajo.dependency.DependencyAnalyzer;
import com.dexels.navajo.dev.dependency.preferences.NavajoDependencyPreferences;
import com.dexels.navajo.dev.dependency.views.ViewContentProvider;

public class EclipseDependencyAnalyzer extends DependencyAnalyzer {
    private static class Holder {
        static final EclipseDependencyAnalyzer INSTANCE = new EclipseDependencyAnalyzer();
    }

    public static final String INIT_JOB_NAME = "Calculating Navajo Dependencies";
    private final static Logger logger = LoggerFactory.getLogger(EclipseDependencyAnalyzer.class);
    private String rootFolder;

    private Job initializeJob;

    private CodeSearch codeSearch;
    private boolean initialized = false;

    public EclipseDependencyAnalyzer() {
        precompiler = new EclipseTslPreCompiler();
        codeSearch = new CodeSearch();
        initialize();
        IProject scriptsProject = NavajoDependencyPreferences.getInstance().getScriptsProject();
        rootFolder = scriptsProject.getRawLocation().toString() + File.separator;
    }

    public static EclipseDependencyAnalyzer getInstance() {
        return Holder.INSTANCE;
    }

    public void initialize(ViewContentProvider callback) {
        if (initialized || initializeJob != null) {
            return;
        }  
        rebuild(callback);
     
    }

    public void rebuild(final ViewContentProvider callback) {
        // Resetting the following values will trigger a rebuild
        initialized = false;
        initializeJob = null;
        dependencies = new HashMap<String, List<Dependency>>();
        reverseDependencies = new HashMap<String, List<Dependency>>();
        
        initializeJob = createJob();
        initializeJob.schedule();
        initializeJob.addJobChangeListener(new JobChangeAdapter() {
            @Override
            public void done(IJobChangeEvent arg0) {
                callback.triggerTreeRefresh();
            }
        });
    }

    private Job createJob() {

        return new Job(INIT_JOB_NAME) {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                scriptFolder = rootFolder + "scripts";

                // Read in existing dependencies
                importPersistedDependencies(scriptFolder);

                // We missed changes, so re-read all files
                String[] xmlExt = { "xml" };
                Collection<File> files = FileUtils.listFiles(new File(scriptFolder), xmlExt, true);
                
                Collection<File> workflowFiles = FileUtils.listFiles(new File( rootFolder + "workflows"), xmlExt, true);

                try {
                    // Files.size + 'fake' 500 for workflow progress
                    monitor.beginTask("Calculating Navajo dependencies", files.size() + workflowFiles.size() + 500);

                    for (File f : files) {
                        monitor.subTask("Calculating dependencies of: " + f.getAbsolutePath());
                        try {
                            addDependencies(TreeObject.getScriptFromFilename(f.getAbsolutePath()));
                        } catch (Exception e) {
                            // Something went wrong in this file, going to try to continue
                            logger.error("Exception in getting dependencies of {}: {}", f.getAbsolutePath(), e);
                        }
                        monitor.worked(1);

                        if (monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                    }
                    addWorkflowDependencies(scriptFolder, monitor);
                    persistDependencies(scriptFolder);

                    addExternalProjectDependencies(monitor);

                    if (monitor.isCanceled()) {
                        return Status.CANCEL_STATUS;
                    }

                    initialized = true;
                } finally {
                    monitor.done();
                    if (!initialized) {
                        initializeJob = null;
                    }
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
            try {
                if (!dependencies.containsKey(dep.getScript())) {
                    dependencies.put(dep.getScript(), new ArrayList<Dependency>());
                }

                dependencies.get(dep.getScript()).add(dep);

                if (!reverseDependencies.containsKey(dep.getDependee())) {
                    reverseDependencies.put(dep.getDependee(), new ArrayList<Dependency>());
                }

                reverseDependencies.get(dep.getDependee()).add(dep);
            } catch (Exception e) {
                logger.error("HE {}" + e);
            }
            ;
        }

        logger.debug("Done workflow dependencies");

    }

    private void addExternalProjectDependencies(IProgressMonitor monitor) {

        List<Dependency> myDependencies = new ArrayList<Dependency>();
        NavajoDependencyPreferences pref = NavajoDependencyPreferences.getInstance();
        List<IProject> projectsToSearch = pref.getTipiProjects();

        for (IProject project : projectsToSearch) {
            try {
                codeSearch.addProjectDependencies(project, myDependencies, scriptFolder, monitor);
            } catch (Exception e) {
                logger.error("Exception on getting workflow depencencies for {}: {}", e);
            }

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

    }

    public void refresh(String scriptFile, boolean recursive) {
        String scriptName = TreeObject.getScriptFromFilename(scriptFile);
        removeScriptFromReverseValues(scriptName);
        dependencies.remove(scriptName);
        addDependencies(scriptName);

        // Update the dependencies of all scripts that point(ed) to me
        List<Dependency> deps = reverseDependencies.get(scriptName);

        if (deps != null && recursive) {
            // The refresh action can trigger removing dependencies.
            // Therefore make a copy of the list to prevent ConcurrentMod
            // exceptions
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
            dep.setBroken(true);
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
        List<Dependency> deps = getDependencies(scriptPath);
        if (deps == null) {
            return false;
        }

        for (Dependency dep : deps) {
            if (dep.isBroken()) {
                return true;
            }
        }
        return false;
    }
}
