package com.dexels.navajo.dev.dependency.views;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.swt.SWT;

import com.dexels.navajo.dependency.Dependency;



public class TreeObject implements IAdaptable {


    private String scriptName = "";
    private String filePath;
    private TreeParent parent;
    private int type;

    public TreeObject(String filePath, int type) {

        this.filePath = filePath;
        this.type = type;
        if (!filePath.equals(scriptName)) {
            scriptName = getScriptFromFilename(filePath);
        }

    }

    /** 
     * Returns the script part from a full filepath. Supports scripts + workflows
     */
    public static String getScriptFromFilename(String filename) {
        String scriptFilePath = null;
        String script = null;
        if (filename.indexOf("workflows") > 0) {
            scriptFilePath = filename.split("workflows")[1];
            // For clarity reasons, we actually include the 'workflows' part
            scriptFilePath = "workflows" + scriptFilePath;
            script = scriptFilePath.substring(0, scriptFilePath.indexOf("."));
        } else {
            scriptFilePath = filename.split("scripts")[1];
            script = scriptFilePath.substring(1, scriptFilePath.indexOf("."));
        }
        
        // Replace win32 slashes to be consistent with Navajo script slashes        
        return script.replace("\\", "/");
        
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

    @SuppressWarnings("rawtypes")
    public Object getAdapter(Class key) {
        return null;
    }
    
    public boolean isEmptyTreeObject() {
        return filePath.equals("");
    }

    public String getDependencyTypeString() {
        String result;
        
        switch (type) {
        case Dependency.NAVAJO_DEPENDENCY:
            result = "NavajoMap";
            break;
        case Dependency.INCLUDE_DEPENDENCY:
            result = "Include";
            break;
        case Dependency.METHOD_DEPENDENCY:
            result = "Method";
            break;
        case Dependency.WORKFLOW_DEPENDENCY:
            result = "Workflow";
            break;
        case Dependency.ENTITY_DEPENDENCY:
            result = "Entity";
            break;
        case Dependency.BROKEN_DEPENDENCY:
            result = "Broken";
            break;
        default:    
            result = "??";
            break;
        }
        
        return result;
    }

    public int getDependencyTextColor() {
        int result;
        
        switch (type) {
        case Dependency.BROKEN_DEPENDENCY:
            result = SWT.COLOR_RED;
            break;
        case Dependency.UNKNOWN_TYPE:
            result = SWT.COLOR_RED;
            break;
        default:
            result = SWT.COLOR_DARK_GRAY;
            break;
        }
        return result;
        
        
    }
}