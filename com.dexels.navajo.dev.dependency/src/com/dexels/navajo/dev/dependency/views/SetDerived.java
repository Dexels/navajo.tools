package com.dexels.navajo.dev.dependency.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class SetDerived {

	
	public static void setDerived() {
		for (IProject project: getJavaProjects()) {
			IFolder folder = project.getFolder("target");
			try {
				folder.setDerived(true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	 private static List<IProject> getJavaProjects() {
	      List<IProject> projectList = new ArrayList<IProject>();
	      try {
	         IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	         IProject[] projects = workspaceRoot.getProjects();
	         for(int i = 0; i < projects.length; i++) {
	            IProject project = projects[i];
	            if(project.isOpen() && project.hasNature("org.eclipse.jdt.core.javanature")) {
	               projectList.add(project);
	            }
	         }
	      }
	      catch(CoreException ce) {
	         ce.printStackTrace();
	      }
	      return projectList;
	}
}
