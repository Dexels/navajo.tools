package com.dexels.navajo.dev.dependency.decorator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import com.dexels.navajo.dev.dependency.Activator;
import com.dexels.navajo.dev.dependency.model.EclipseDependencyAnalyzer;

public class NavajoLightweightDecorator implements ILightweightLabelDecorator {
    private EclipseDependencyAnalyzer depAnalyzer;


    public NavajoLightweightDecorator() {
        depAnalyzer = EclipseDependencyAnalyzer.getInstance();
    }

    private String getScriptFromFilename(String filename) {
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

    @Override
    public void decorate(Object element, IDecoration decoration) {
        if (element instanceof IFile) {
            IFile file = (IFile) element;
            String filePath = file.getLocation().toString();
            if ((filePath.contains("scripts") || filePath.contains("workflows")) && filePath.contains(".xml")) {
                if (depAnalyzer.containsBrokenDependencies(getScriptFromFilename(filePath))) {
                    decoration.addOverlay(Activator.getImageDescriptor("icons/broken.gif"), IDecoration.TOP_RIGHT);
                }

            }
        }

    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void addListener(ILabelProviderListener listener) {
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
       
    }

}
