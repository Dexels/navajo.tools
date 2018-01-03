package com.dexels.navajo.dev.dependency.model;

import java.io.File;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.swt.SWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dexels.navajo.dependency.Dependency;

public class TreeObject implements IAdaptable {
    private final static Logger logger = LoggerFactory.getLogger(TreeObject.class);
    private final static String[] extensions = {".xml", ".scala", ".java"};

    // By default, the direction is determined by the viewprovider
    private Boolean backwardNode = null;
    private Boolean forwardNode = null;
	private String scriptName = "";
	private String filePath;
	private TreeParent parent;
	private int type;
	private int linenr;
	private boolean isBroken;
	
	public TreeObject(String filePath, int type, boolean isBroken) {

		this.filePath = filePath;
		this.isBroken = isBroken;
		
		this.type = type;
		if (!filePath.equals(scriptName)) {
		    for (String ext : extensions) {
		        if (filePath.endsWith(ext)) {
		            scriptName = getScriptFromFilename(filePath);
		            break;
		        }
		    }	
		}
	}

	/**
	 * Returns the script part from a full file path
	 */
    public static String getScriptFromFilename(String filename) {
        String scriptFilePath = null;
        String script = null;
        
        try {
            if (filename.indexOf("workflows") > 0) {
                scriptFilePath = filename.split("workflows")[1];
            } else if (filename.indexOf("tipi") > 0) {
                scriptFilePath = filename.split("tipi")[1];
            } else if (filename.indexOf("article") > 0) {
                scriptFilePath = filename.split("article")[1];
            } else if (filename.indexOf("scripts") > 0) {
                scriptFilePath = filename.split("scripts")[1];
            } else if (filename.endsWith("tasks.xml")) {
                // Tasks file as a bit special, since they don't have their own
                // directory really. Hence we simulate this
                String pattern = Pattern.quote(File.separator);
                String[] filenameParts = filename.split(pattern);
                String tenant = filenameParts[filenameParts.length - 3];
                scriptFilePath = File.separator + tenant + File.separator + "tasks.xml";

            } else {
                return "";
            }
        }catch (Exception e) {
            logger.error("Exception on retrieving scriptname from filename {}: {} ", filename, e);
            return "";
        }
       
        try {
            script = scriptFilePath.substring(1, scriptFilePath.indexOf("."));
        } catch (Exception e) {
            System.out.println("Error on removing extension on " + scriptFilePath + " - " + e.getMessage());
            script = scriptFilePath.substring(1);
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

	@SuppressWarnings({ "rawtypes"})
	public Object getAdapter(Class key) {
		return null;
	}

	public boolean isEmptyTreeObject() {
		return filePath.equals("");
	}

	public int getLinenr() {
		return linenr;
	}

	public void setLinenr(int linenr) {
		this.linenr = linenr;
	}

	public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public String getDependencyTypeString() {
		String result;
		String brokenString = "";
		if (isBroken) {
		    brokenString = "Broken ";
		}
		
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
		case Dependency.TIPI_DEPENDENCY:
            result = "Tipi";
            break;
		case Dependency.JAVA_DEPENDENCY:
            result = "Java";
            break;
		case Dependency.ARTICLE_DEPENDENCY:
            result = "Article";
            break;
		case Dependency.TASK_DEPENDENCY:
            result = "Task";
            break;
		default:
			result = "??";
			break;
		}

		return brokenString + result;
	}

    public int getDependencyTextColor() {
        int result;
        if (isBroken) {
            return SWT.COLOR_RED;
        }

        switch (type) {
        case Dependency.UNKNOWN_TYPE:
            result = SWT.COLOR_RED;
            break;
        default:
            result = SWT.COLOR_DARK_GRAY;
            break;
        }
        return result;
    }
    
    public boolean isBackwardNode() {
        if (backwardNode != null) {
            return backwardNode;
        }
        if (this instanceof TreeBackwardNode) {
            backwardNode = true;
            return true;
        }
        if (this.getParent() == null) {
            backwardNode = false;
            return false;
        }
        backwardNode = this.getParent().isBackwardNode();
        return backwardNode;
    }
    public boolean isForwardNode() {
        if (forwardNode != null) {
            return forwardNode;
        }
        if (this instanceof TreeForwardNode) {
            forwardNode = true;
            return true;
        }
        if (this.getParent() == null) {
            forwardNode = false;
            return false;
        }
        forwardNode = this.getParent().isForwardNode();
        return forwardNode;
    }
}
