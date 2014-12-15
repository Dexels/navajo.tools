package com.dexels.navajo.callhierarchy.views;

import java.util.ArrayList;
import java.util.Set;

import com.dexels.navajo.callhierarchy.model.DependencyAnalyzer;

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
