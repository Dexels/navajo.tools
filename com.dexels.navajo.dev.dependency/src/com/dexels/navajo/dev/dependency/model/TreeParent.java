package com.dexels.navajo.dev.dependency.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TreeParent extends TreeObject {
    private ArrayList<TreeObject> children;
    
    public TreeParent(String filePath, int type) {
        super(filePath, type, false);
        children = new ArrayList<TreeObject>();

    }
    
    public TreeParent(String filePath, int type, boolean isBroken) {
        super(filePath, type, isBroken);
        children = new ArrayList<TreeObject>();

    }

    public void addChild(TreeObject child) {
        children.add(child);
        child.setParent(this);
    }

    public void removeChild(TreeObject child) {
        // If child has children of its own, remove those too
        if (child instanceof TreeParent) {
            TreeParent childparent = (TreeParent) child;
            for (TreeObject grandchild : childparent.getChildren()) {
                childparent.removeChild(grandchild);
            }
        }
        children.remove(child);
        child.setParent(null);
    }

    public TreeObject[] getChildren() {
        
       // List<TreeObject> children.toArray(new TreeObject[children.size()]);
        TreeObject[] array =  children.toArray(new TreeObject[children.size()]);
        
        return array;
        
    }

    public boolean hasChildren() {
        return children.size() > 0;
    }
   

    
}
