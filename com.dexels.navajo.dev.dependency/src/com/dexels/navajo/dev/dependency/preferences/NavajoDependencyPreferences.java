package com.dexels.navajo.dev.dependency.preferences;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.IPreferenceStore;

import com.dexels.navajo.dev.dependency.Activator;

public class NavajoDependencyPreferences {
    private static NavajoDependencyPreferences instance = null;
    IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();

    public static NavajoDependencyPreferences getInstance() {
        if (instance == null) {
            synchronized (NavajoDependencyPreferences.class) {
                if (instance == null) {
                    instance = new NavajoDependencyPreferences();
                }
            }
        }

        return instance;
    }

    public List<IProject> getTipiProjects() {
        String projectsString = prefStore.getString(PreferenceConstants.P_TIPIPATHS);
        String[] projects = parseString(projectsString);
        List<IProject> result = new ArrayList<IProject>();

        for (String projectName : projects) {
            result.add(getProjectNamed(projectName));
        }
        return result;
    }
    
    public IProject getScriptsProject() {
        String projectsString = prefStore.getString(PreferenceConstants.P_SCRIPTPATH);
        return getProjectNamed(projectsString);
    }
    
    public List<IProject> getAllProjects() {
        List<IProject> p1 = getTipiProjects();
        p1.add(getScriptsProject());
        return p1;
    }

    private IProject getProjectNamed(String name) {
        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        for (IProject project : projects) {
            if (project.getName().equals(name)) {
                return project;
            }
        }
        return null;
    }

    private String[] parseString(String stringList) {
        StringTokenizer st = new StringTokenizer(stringList, File.pathSeparator);
        List<String> v = new ArrayList<String>();
        while (st.hasMoreElements()) {
            v.add((String) st.nextElement());
        }
        return (String[]) v.toArray(new String[v.size()]);
    }
}
