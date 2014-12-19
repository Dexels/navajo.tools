package com.dexels.navajo.callhierarchy.views;


import java.io.InputStream;

import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.dexels.navajo.callhierarchy.dependency.Dependency;

class ViewLabelProvider extends StyledCellLabelProvider {
    FontRegistry registry = new FontRegistry();

    public static Display getDisplay() {
        Display display = Display.getCurrent();
        // may be null if outside the UI thread
        if (display == null)
            display = Display.getDefault();
        return display;
    }

    public Image getImage(Object element) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String imgName = null;
        if (element instanceof TreeObject) {
            TreeObject treeObj = (TreeObject) element;

            imgName = "icons/navajoDep.gif";
            if (treeObj.getType() == Dependency.INCLUDE_DEPENDENCY) {
                imgName = "icons/includeDep.gif";
            } else if (treeObj.getType() == Dependency.METHOD_DEPENDENCY) {
                imgName = "icons/methodDep.gif";
            }
        }
        InputStream input = classLoader.getResourceAsStream(imgName);
        return new Image(getDisplay(), input);
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
                cell.setText(objectString + seperator + dependencyType);

                // The ' - ' part is always gray
                StyleRange stylerange1 = new StyleRange(objectString.length(), seperator.length(), Display.getCurrent()
                        .getSystemColor(SWT.COLOR_DARK_GRAY), null);

                // The dependency string can be overriden - e.g. red for broken
                StyleRange stylerange2 = new StyleRange(objectString.length() + seperator.length(),
                        dependencyType.length(), Display.getCurrent().getSystemColor(dependencyTextColor), null);
                StyleRange[] range = { stylerange1, stylerange2 };
                cell.setStyleRanges(range);
            }

            cell.setImage(getImage(cell.getElement()));
        }

        super.update(cell);
    }

    
   

}