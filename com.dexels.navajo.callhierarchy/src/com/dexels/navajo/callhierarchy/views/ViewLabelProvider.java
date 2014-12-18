package com.dexels.navajo.callhierarchy.views;

import java.io.InputStream;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.dexels.navajo.callhierarchy.dependency.Dependency;

class ViewLabelProvider extends LabelProvider {

    public static Display getDisplay() {
        Display display = Display.getCurrent();
        // may be null if outside the UI thread
        if (display == null)
            display = Display.getDefault();
        return display;
    }

    public String getText(Object obj) {
        return obj.toString();
    }

    public Image getImage(Object obj) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String imgName = null;
        if (obj instanceof TreeObject) {
            TreeObject treeObj = (TreeObject) obj;

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
}