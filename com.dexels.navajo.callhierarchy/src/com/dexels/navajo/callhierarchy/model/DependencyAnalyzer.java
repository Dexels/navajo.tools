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
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dexels.navajo.callhierarchy.views.NavajoMapsMetaData;
import com.dexels.navajo.mapping.compiler.meta.IncludeDependency;
import com.dexels.navajo.mapping.compiler.meta.NavajoDependency;
import com.dexels.navajo.script.api.Dependency;
import com.dexels.navajo.script.api.NavajoClassSupplier;
import com.dexels.navajo.script.api.SystemException;
import com.dexels.navajo.server.DispatcherFactory;
import com.dexels.navajo.server.NavajoConfig;
import com.dexels.navajo.server.test.TestDispatcher;

public class DependencyAnalyzer {
    private static final String NAVAJO_DEPS_FILE = ".navajodeps";
    public static final String DEFAULT_SERVER_XML = "config/server.xml";
    private final static Logger logger = LoggerFactory.getLogger(DependencyAnalyzer.class);

    private TslPreCompiler precompiler;
    private boolean initialized = false;
    private String scriptFolder;

    private Map<String, List<Dependency>> dependencies = new HashMap<String, List<Dependency>>();
    private Map<String, Set<String>> reverseIncludeDependencies = new HashMap<String, Set<String>>();
    private Map<String, Set<String>> reverseNavajoDependencies = new HashMap<String, Set<String>>();

    public DependencyAnalyzer() {
        precompiler = new TslPreCompiler();
    }

    public void initialize(String aScript) {
        if (initialized) {
            return;
        }
        logger.debug("Initializing DependencyAnalyzer");
        String rootPath = aScript.split("scripts")[0];
        initializeDispatcher(rootPath);
        scriptFolder = rootPath + "scripts";

        // Read in existing dependencies
        importDependencies(scriptFolder);

        // Check for missing/new files
        String[] xmlExt = { "xml" };
        Collection<File> files = FileUtils.listFiles(new File(scriptFolder), xmlExt, true);
        int totalSize = files.size();
        int done = 0;
        int previousDonePerc = 0;
        for (File f : files) {
            String fullScriptName = f.getPath().split("scripts" + File.separator)[1];
            String scriptName = fullScriptName.substring(0, fullScriptName.indexOf('.'));
            if (!dependencies.containsKey(scriptName)) {
                addDependencies(scriptName, f);
                done++;
                Double newDonePercDouble = (((double) done / totalSize) * 100);
                int newDonePerc = newDonePercDouble.intValue();
                if (newDonePerc != previousDonePerc) {
                    previousDonePerc = newDonePerc;
                    System.out.println(newDonePerc + " % done");
                }

            }

        }
        persistDependencies(scriptFolder);
        initialized = true;

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
        } catch (Exception e) {
            throw e;
        }
        dependencies.put(scriptPath, myDependencies);

        updateReverseDependencies(scriptPath, myDependencies);

    }

    public Set<String> getDependentScripts(String scriptPath) {
        String script = scriptPath;
        if (scriptPath.indexOf('_') > 0) {
            // Remove tenant-specific part
            script = scriptPath.substring(0, scriptPath.indexOf('_'));
        }
        if (!reverseIncludeDependencies.containsKey(script)) {
            return new HashSet<String>();
        }
        return reverseIncludeDependencies.get(script);
    }

    
    public Set<String> getDependentNavajo(String scriptPath) {
        String script = scriptPath;
        if (scriptPath.indexOf('_') > 0) {
            // Remove tenant-specific part
            script = scriptPath.substring(0, scriptPath.indexOf('_'));
        }

        if (!reverseNavajoDependencies.containsKey(script)) {
            return new HashSet<String>();
        }

        return reverseNavajoDependencies.get(script);
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
            updateReverseDependencies(script, myDependencies);

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

    private void updateReverseDependencies(String originScript, List<Dependency> dependencies) {
        for (Dependency dep : dependencies) {

            if (dep instanceof NavajoDependency) {
                NavajoDependency navajoDep = (NavajoDependency) dep;
                String navajoScript = navajoDep.getScriptPath();

                if (!reverseNavajoDependencies.containsKey(navajoScript)) {
                    reverseNavajoDependencies.put(navajoScript, new HashSet<String>());
                }

                reverseNavajoDependencies.get(navajoScript).add(scriptFolder + File.separator + originScript + ".xml");
            } else if (dep instanceof IncludeDependency) {

                IncludeDependency includeDep = (IncludeDependency) dep;
                String includeScript = includeDep.getScriptPath();

                if (!reverseIncludeDependencies.containsKey(includeScript)) {
                    reverseIncludeDependencies.put(includeScript, new HashSet<String>());
                }
                reverseIncludeDependencies.get(includeScript)
                        .add(scriptFolder + File.separator + originScript + ".xml");

            }
        }
    }

}
