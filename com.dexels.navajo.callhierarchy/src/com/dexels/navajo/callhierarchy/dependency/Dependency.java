package com.dexels.navajo.callhierarchy.dependency;

import java.io.File;

public class Dependency {
    public static int INCLUDE_DEPENDENCY = 1;
    public static int NAVAJO_DEPENDENCY = 2;
    public static int METHOD_DEPENDENCY = 3;
    public static int ENTITY_DEPENDENCY = 4;
    
    private int type;
    private String scriptFile;
    private String dependeeFile;
    
    public Dependency(String scriptFile, String dependeeFile, int type) {
        this.scriptFile = scriptFile;
        this.dependeeFile = dependeeFile;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getScriptFile() {
        return scriptFile;
    }

    public void setScriptFile(String scriptFile) {
        this.scriptFile = scriptFile;
    }

    public String getDependeeFile() {
        return dependeeFile;
    }

    public void setDependeeFile(String dependeeFile) {
        this.dependeeFile = dependeeFile;
    }

   public String getScript() {
       String scriptFileRel = scriptFile.split("scripts" + File.separator)[1];
       return scriptFileRel.substring(0, scriptFileRel.indexOf('.'));
   }
   
   public String getDependee() {
       String scriptFileRel = dependeeFile.split("scripts" + File.separator)[1];
       return scriptFileRel.substring(0, scriptFileRel.indexOf('.'));
   }

   @Override
    public String toString() {
        return getScript() + " - " + getDependee();
    }

}
