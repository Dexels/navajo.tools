package com.dexels.navajo.dev.dependency.views;

import java.io.InputStream;

import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.dexels.navajo.dependency.Dependency;
import com.dexels.navajo.dev.dependency.model.TreeObject;
import com.dexels.navajo.dev.dependency.model.TreeParent;

class ViewLabelProvider extends StyledCellLabelProvider {
    
    Image navajoDep;
    Image includeDep;
    Image methodDep;
    Image workflowDep;
    Image entityDep;
    Image brokenDep;
    Image tipiDep;
    Image unknownDep;
    
    public ViewLabelProvider() {
        
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("icons/navajoDep.gif");
        navajoDep = new Image(Display.getCurrent(), input);
        
        input = classLoader.getResourceAsStream("icons/includeDep.gif");
        includeDep = new Image(Display.getCurrent(), input);
        
        input = classLoader.getResourceAsStream("icons/methodDep.gif");
        methodDep = new Image(Display.getCurrent(), input);
        
        input = classLoader.getResourceAsStream("icons/workflowDep.gif");
        workflowDep = new Image(Display.getCurrent(), input);
        
        input = classLoader.getResourceAsStream("icons/entityDep.gif");
        entityDep = new Image(Display.getCurrent(), input);
        
        input = classLoader.getResourceAsStream("icons/brokenDep.gif");
        brokenDep = new Image(Display.getCurrent(), input);
        
        input = classLoader.getResourceAsStream("icons/tipiDef.gif");
        tipiDep = new Image(Display.getCurrent(), input);
        
        input = classLoader.getResourceAsStream("icons/unknownDep.gif");
        unknownDep = new Image(Display.getCurrent(), input);
        
    }

    public Image getImage(Object element) {
        Image res = navajoDep;
        if (element instanceof TreeObject) {
            TreeObject treeObj = (TreeObject) element;

            if (treeObj.isBroken()) {
                return brokenDep;
            }
            
            switch (treeObj.getType()) {
            case Dependency.INCLUDE_DEPENDENCY:
                res = includeDep;
                break;
            case Dependency.METHOD_DEPENDENCY:
                res = methodDep;
                break;
            case Dependency.WORKFLOW_DEPENDENCY:
                res = workflowDep;
                break;
            case Dependency.ENTITY_DEPENDENCY:
                res = entityDep;
                break;
            case Dependency.TIPI_DEPENDENCY:
                res = tipiDep;
                break;
            case Dependency.UNKNOWN_TYPE:
                res = unknownDep;
                break;
            }
            

        }
        return res;
    }
    
    @Override
    public void dispose() {        
        navajoDep.dispose();
        includeDep.dispose();
        methodDep.dispose();
        workflowDep.dispose();
        entityDep.dispose();
        brokenDep.dispose();
        super.dispose();
    }

    @Override
    public void update(ViewerCell cell) {
        Object node = cell.getElement();
        if (node instanceof TreeParent) {
            TreeObject obj = (TreeObject) node;

            String objectString = obj.toString();
            cell.setText(objectString);

            if (obj.getType() != Dependency.UNKNOWN_TYPE) {
                String dependencyType = obj.getDependencyTypeString();
                String seperator = " - ";
                int dependencyTextColor = obj.getDependencyTextColor();
                String fullObjectString = objectString;
                if (obj.getLinenr() > 0) {
                    fullObjectString += " (line " + obj.getLinenr() + ")";
                }
                cell.setText(fullObjectString + seperator + dependencyType);

                // The '(line x) - ' part is always gray
                StyleRange stylerange1 = new StyleRange(objectString.length(), (fullObjectString.length() - objectString.length()) +  seperator.length(), Display.getCurrent()
                        .getSystemColor(SWT.COLOR_DARK_GRAY), null);

                // The dependency string can be overriden - e.g. red for broken
                StyleRange stylerange2 = new StyleRange(fullObjectString.length() + seperator.length(),
                        dependencyType.length(), Display.getCurrent().getSystemColor(dependencyTextColor), null);
                StyleRange[] range = { stylerange1, stylerange2 };
                cell.setStyleRanges(range);
            }

            cell.setImage(getImage(cell.getElement()));

        }

        super.update(cell);
    }
    
   

}