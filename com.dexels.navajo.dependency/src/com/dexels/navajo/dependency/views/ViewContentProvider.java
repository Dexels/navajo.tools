package com.dexels.navajo.dependency.views;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IViewSite;

import com.dexels.navajo.dependency.model.Dependency;
import com.dexels.navajo.dependency.model.DependencyAnalyzer;

public class ViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
    private static int MAX_STACK_DEPTH = 5;
    private TreeParent invisibleRoot;
    private IViewSite viewSite;
    private DependencyAnalyzer depAnalyzer;
    private boolean reverseMode = true;
    private CallHierarchyView parent;

    public ViewContentProvider(IViewSite viewSite, CallHierarchyView parent) {
        this.viewSite = viewSite;
        this.parent = parent;
        depAnalyzer = new DependencyAnalyzer();
    }

    public void inputChanged(Viewer v, Object oldInput, Object newInput) {

    }

    private void initialize() {
        invisibleRoot = new TreeParent("", 0);
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

    public Object[] getChildren(Object parentObj) {
        if (parentObj instanceof TreeParent) {
            TreeParent parent = (TreeParent) parentObj;
            Object[] children = parent.getChildren();
            if (children.length == 1) {
                TreeObject child = (TreeObject) children[0];
                if (child.isEmptyTreeObject()) {
                    parent.removeChild(child);
                    addDependencies(parent, MAX_STACK_DEPTH);

                }
            } 
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
  
        // Remove any existing root
        for (TreeObject child : invisibleRoot.getChildren()) {
            invisibleRoot.removeChild(child);
        }
        
        // remove any existing children of the new root
        for (TreeObject child : node.getChildren()) {
            node.removeChild(child);
        }
        depAnalyzer.initialize(node.getFilePath(), this);
        addDependencies(node, MAX_STACK_DEPTH);
        invisibleRoot.addChild(node);
    }
    
    public TreeObject getRoot() {
        TreeObject[] children = invisibleRoot.getChildren();
        if (children != null && children.length > 0) {
            return children[0];
        }
        return null;
    }
    

    public boolean isReverseMode() {
        return reverseMode;
    }

    public void setReverseMode(boolean reverseMode) {
        this.reverseMode = reverseMode;
    }
    
    public void rebuild() {
        depAnalyzer.rebuild();
        
    
    }

    private void addDependencies(TreeParent node, int ttl) {
        
        if (ttl < 1) { 
            TreeParent newChild = new TreeParent("", 0);
            node.addChild(newChild);
            return;
        }
        --ttl;
        
        if (reverseMode) {
            List<Dependency>  deps = depAnalyzer.getReverseDependencies(node.getScriptName());
            if (deps == null) {
                return;
            }
            for (Dependency dep : deps) {
                TreeParent newChild = new TreeParent(dep.getScriptFile(), dep.getType());
                addDependencies(newChild, ttl);
                node.addChild(newChild);
            }
        } else {
            List<Dependency>  deps = depAnalyzer.getDependencies(node.getScriptName());
            if (deps == null) {
                return;
            }
            for (Dependency dep : deps) {
                TreeParent newChild = new TreeParent(dep.getDependeeFile(), dep.getType());
                addDependencies(newChild, ttl);
                node.addChild(newChild);
            }
        }
       

    }

   
    public void removeResource(String filePath) {
        depAnalyzer.remove(filePath);

               
    }

    public void updateResource(String filePath) {
        depAnalyzer.refresh(filePath);

        
    }

    public void triggerTreeRefresh() {
        parent.setFocus();
        
    }



}