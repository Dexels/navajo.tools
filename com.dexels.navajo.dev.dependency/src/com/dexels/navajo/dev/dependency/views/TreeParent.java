package com.dexels.navajo.dev.dependency.views;

import java.util.ArrayList;

public class TreeParent extends TreeObject {
    private ArrayList<TreeObject> children;

    public TreeParent(String filePath, int type) {
        super(filePath, type);
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
        return (TreeObject[]) children.toArray(new TreeObject[children.size()]);
    }

    public boolean hasChildren() {
        return children.size() > 0;
    }
   
}
