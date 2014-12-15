package com.dexels.navajo.callhierarchy.views;

import java.util.Set;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IViewSite;

import com.dexels.navajo.callhierarchy.model.DependencyAnalyzer;

public class ViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
    private static int MAX_STACK_DEPTH = 5;
    private TreeParent invisibleRoot;
    private IViewSite viewSite;
    private DependencyAnalyzer depAnalyzer;

    public ViewContentProvider(IViewSite viewSite) {
        this.viewSite = viewSite;
        depAnalyzer = new DependencyAnalyzer();
    }

    public void inputChanged(Viewer v, Object oldInput, Object newInput) {

    }

    private void initialize() {
        invisibleRoot = new TreeParent("", TreeObject.TYPE_ROOT);
    }

    public void dispose() {
        for (TreeObject child : invisibleRoot.getChildren()) {
            invisibleRoot.removeChild(child);
        }
    }

    public Object[] getElements(Object parent) {
        if (parent.equals(viewSite)) {
            if (invisibleRoot == null) {
                initialize();
            }
            return getChildren(invisibleRoot);
        }
        return getChildren(parent);
    }

    public Object getParent(Object child) {
        if (child instanceof TreeObject) {
            return ((TreeObject) child).getParent();
        }
        return null;
    }

    public Object[] getChildren(Object parent) {
        if (parent instanceof TreeParent) {
            return ((TreeParent) parent).getChildren();
        }
        return new Object[0];
    }

    public boolean hasChildren(Object parent) {
        if (parent instanceof TreeParent)
            return ((TreeParent) parent).hasChildren();
        return false;
    }

    public void setRoot(TreeParent node) {
        if (invisibleRoot == null) {
            initialize();
        }
  
        for (TreeObject child : invisibleRoot.getChildren()) {
            invisibleRoot.removeChild(child);
        }
       
        addDependencies(node, MAX_STACK_DEPTH);
        invisibleRoot.addChild(node);
    }

    private void addDependencies(TreeParent node, int ttl) {
        
        if (ttl < 1) { 
            TreeParent newChild = new TreeParent("", TreeObject.TYPE_ROOT);
            node.addChild(newChild);
            return;
        }
        --ttl;
        
        depAnalyzer.initialize(node.getFilePath());
        Set<String> deps = depAnalyzer.getDependentNavajo(node.getScriptName());
        if (deps == null) {
            return;
        }
        for (String depFile : deps) {
            TreeParent newChild = new TreeParent(depFile, TreeObject.TYPE_NAVAJO);
            addDependencies(newChild, ttl);
            node.addChild(newChild);
        }
       
        deps = depAnalyzer.getDependentScripts(node.getScriptName());
        if (deps == null) {
            return;
        }
        for (String depFile : deps) {
            TreeParent newChild = new TreeParent(depFile, TreeObject.TYPE_INCLUDE);
            addDependencies(newChild, ttl);
            node.addChild(newChild);
        }

    }

}