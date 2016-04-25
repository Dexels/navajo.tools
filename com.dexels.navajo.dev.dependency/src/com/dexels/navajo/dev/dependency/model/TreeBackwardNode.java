package com.dexels.navajo.dev.dependency.model;

import java.util.ArrayList;

public class TreeBackwardNode extends TreeParent {
    private static final String LABEL = "Backwards - caller";
    private ArrayList<TreeObject> children;
    
    public TreeBackwardNode() {
        super("", 0, false);
        children = new ArrayList<TreeObject>();

    }

    public void addChild(TreeObject child) {
        children.add(child);
        child.setParent(this);
    }

    public void removeChild(TreeObject child) {
        // If child has children of its own, remove those too
        if (child instanceof TreeBackwardNode) {
            TreeBackwardNode childparent = (TreeBackwardNode) child;
            for (TreeObject grandchild : childparent.getChildren()) {
                childparent.removeChild(grandchild);
            }
        }
        children.remove(child);
        child.setParent(null);
    }

    public TreeObject[] getChildren() {
        TreeObject[] array =  children.toArray(new TreeObject[children.size()]);
        return array;
        
    }

    public boolean hasChildren() {
        return children.size() > 0;
    }

    @Override
    public String getScriptName() {
        return LABEL;
    }
   

    
}
