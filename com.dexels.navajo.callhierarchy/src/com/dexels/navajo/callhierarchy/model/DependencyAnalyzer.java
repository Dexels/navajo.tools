package com.dexels.navajo.callhierarchy.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dexels.navajo.callhierarchy.dependency.Dependency;
import com.dexels.navajo.callhierarchy.views.NavajoMapsMetaData;
import com.dexels.navajo.script.api.NavajoClassSupplier;
import com.dexels.navajo.script.api.SystemException;
import com.dexels.navajo.server.DispatcherFactory;
import com.dexels.navajo.server.NavajoConfig;
import com.dexels.navajo.server.test.TestDispatcher;

public class DependencyAnalyzer {
    public static final String INIT_JOB_NAME = "Calculating Navajo Dependencies";
    
    private static final String DEFAULT_SERVER_XML = "config/server.xml";
    private static final int WORKFLOW_WORKCOUNT = 500;
    private static final String NAVAJO_DEPS_FILE = ".navajodeps";
    private final static Logger logger = LoggerFactory.getLogger(DependencyAnalyzer.class);

    private Job initializeJob;
    
    private TslPreCompiler precompiler;
    private CodeSearch codeSearch;
    private boolean initialized = false;
    private String scriptFolder;

    private Map<String, List<Dependency>> dependencies;;
    private Map<String, List<Dependency>> reverseDependencies;

    public DependencyAnalyzer() {
        precompiler = new TslPreCompiler();
        codeSearch = new CodeSearch();
        
    }

    public void initialize(String aScript) {
        if (initialized || initializeJob != null) {
            return;
        }
       
        initializeJob = createJob(aScript);
        initializeJob.schedule();
    }
    
    public void rebuild() {
        // Resetting the following values will trigger a rebuild
        initialized = false;
        initializeJob = null;
    }

    private Job createJob(final String aScript) {

        return new Job(INIT_JOB_NAME) {

            private String script = aScript;

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                dependencies = new HashMap<String, List<Dependency>>();
                reverseDependencies = new HashMap<String, List<Dependency>>();
                
                String rootPath = script.split("scripts")[0];
                initializeDispatcher(rootPath);
                scriptFolder = rootPath + "scripts";

                // Read in existing dependencies
                importDependencies(scriptFolder);

                // Check for missing/new files
                String[] xmlExt = { "xml" };
                Collection<File> files = FileUtils.listFiles(new File(scriptFolder), xmlExt, true);

                try {
                    // Files.size + 'fake' 100 for workflow progress
                    monitor.beginTask("Calculating Navajo dependencies", files.size() + WORKFLOW_WORKCOUNT);

                    for (File f : files) {
                        monitor.subTask("Calculating dependencies of: " + f.getAbsolutePath());
                        
                        String fullScriptName = f.getPath().split("scripts" + File.separator)[1];
                        String scriptName = fullScriptName.substring(0, fullScriptName.indexOf('.'));
                        if (!dependencies.containsKey(scriptName)) {
                            addDependencies(scriptName, f);
                            monitor.worked(1);
                        }
                        if(monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                    }
                    addWorkflowDependencies(scriptFolder, new SubProgressMonitor(monitor, 500));
                    persistDependencies(scriptFolder);
                    
                    if(monitor.isCanceled()) {
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

    private static void initializeDispatcher(String rootPath) {
        if (DispatcherFactory.getInstance() == null) {
            URL configurationUrl = null;
            try {
                File f = new File(rootPath);
                URL rootUrl = f.toURI().toURL();
                configurationUrl = new URL(rootUrl, DEFAULT_SERVER_XML);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return;
            }

            NavajoConfig nc = null;
            try {
                nc = new NavajoConfig((NavajoClassSupplier) null, configurationUrl.openStream(), rootPath, rootPath);
            } catch (SystemException | IOException e) {
                logger.error("Error in opening a (dummy) NavajoConfig!", e);
            }
            TestDispatcher td = new TestDispatcher(nc);
            new DispatcherFactory(td);
            new NavajoMapsMetaData();

        }

    }

    private void addDependencies(String scriptPath, File scriptFile) {

        List<Dependency> myDependencies = new ArrayList<Dependency>();
        try {
            precompiler.getAllDependencies(scriptFile, scriptPath, scriptFolder, myDependencies);
            //codeSearch.getAllWorkflowDependencies(scriptFile, scriptPath, scriptFolder, myDependencies);
        } catch (Exception e) {
            throw e;
        }
        dependencies.put(scriptPath, myDependencies);

        updateReverseDependencies(myDependencies);
    }
    
    private void addWorkflowDependencies(String scriptFolder, IProgressMonitor monitor) {
        logger.debug("Starting workflow dependencies");
        List<Dependency> myDependencies = new ArrayList<Dependency>();
        try {
            codeSearch.addWorkflowDependencies(scriptFolder, myDependencies, monitor);
        } catch (Exception e) {
            throw e;
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
    
       
    public List<Dependency> getDependencies(String scriptPath) {
        return dependencies.get(scriptPath);
    }
    
    public List<Dependency> getReverseDependencies(String scriptPath) {
        String script = scriptPath;

        if (scriptPath.indexOf('_') > 0) {
            // Remove tenant-specific part
            script = scriptPath.substring(0, scriptPath.indexOf('_'));
        }
        return reverseDependencies.get(script);
    }
    

    @SuppressWarnings({ "unchecked" })
    private void importDependencies(String scriptPath) {
        Map<String, List<Dependency>> result = null;
        File depsFile = new File(scriptPath, NAVAJO_DEPS_FILE);
        if (!depsFile.exists()) {
            return;
        }

        try {
            FileInputStream f = new FileInputStream(depsFile);
            ObjectInputStream s = new ObjectInputStream(f);
            result = (HashMap<String, List<Dependency>>) s.readObject();
            s.close();
            f.close();
        } catch (FileNotFoundException e) {
            logger.error("Error in opening navajoDeps file - file disappeared?", e);
            return;
        } catch (IOException e) {
            logger.error("IOException in opening navajoDeps file", e);
            return;
        } catch (ClassNotFoundException e) {
            logger.error("ClassNotFoundException in opening navajoDeps file", e);
            return;
        }

        dependencies.putAll(result);

        for (String script : dependencies.keySet()) {
            List<Dependency> myDependencies = dependencies.get(script);
            updateReverseDependencies(myDependencies);

        }
    }

    private void persistDependencies(String scriptPath) {
        File scriptFolder = new File(scriptPath);

        if (!scriptFolder.exists()) {
            return;
        }

        File depsFile = new File(scriptFolder, NAVAJO_DEPS_FILE);

        try {
            FileOutputStream f = new FileOutputStream(depsFile);
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(dependencies);
            s.close();
            f.close();
        } catch (FileNotFoundException e) {
            logger.error("FileNotFound exception in writing navajoDeps file", e);

        } catch (IOException e) {
            logger.error("IOException exception in writing navajoDeps file", e);
        }

    }

    private void updateReverseDependencies(List<Dependency> dependencies) {

        for (Dependency dep : dependencies) {

            if (!reverseDependencies.containsKey(dep.getDependee())) {
                reverseDependencies.put(dep.getDependee(), new ArrayList<Dependency>());
            }

            reverseDependencies.get(dep.getDependee()).add(dep);
        }
    }

    public void refresh(String filePath) {
        String relScript = filePath.split("scripts" + File.separator)[1];
        String scriptName = relScript.substring(0,  relScript.indexOf("."));
        dependencies.remove(scriptName);
        
        addDependencies(scriptName, new File(filePath));
        updateReverseDependencies(dependencies.get(scriptName));
        
    }

    public void remove(String filePath) {
        String relScript = filePath.split("scripts"  + File.separator)[1];
        String scriptName = relScript.substring(0,  relScript.indexOf("."));
        dependencies.remove(scriptName);
        
    }

}
