package com.dexels.navajo.callhierarchy.views;

import java.io.File;

import org.eclipse.core.runtime.IAdaptable;

public class TreeObject implements IAdaptable {
    public static int TYPE_ROOT = 1;
    public static int TYPE_NAVAJO = 2;
    public static int TYPE_INCLUDE = 3;
    public static int TYPE_ENTITY = 4;

    private String scriptName = "";
    private String filePath;
    private TreeParent parent;
    private int type;

    public TreeObject(String filePath, int type) {

        this.filePath = filePath;
        this.type = type;
        if (!filePath.equals(scriptName)) {
            String scriptFilePath = filePath.split("scripts" + File.separator)[1];
            scriptName = scriptFilePath.substring(0, scriptFilePath.indexOf("."));
        }

    }

    public String getScriptName() {
        return scriptName;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getType() {
        return type;
    }

    public void setParent(TreeParent parent) {
        this.parent = parent;
    }

    public TreeParent getParent() {
        return parent;
    }

    public String toString() {
        return getScriptName();
    }

    public Object getAdapter(Class key) {
        return null;
    }
}