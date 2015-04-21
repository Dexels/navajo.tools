package com.dexels.navajo.dev.dependency.preferences;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * A field editor to edit directory paths.
 */
public class IProjectEditor extends StringButtonFieldEditor {
    /**
     * The special label text for directory chooser, or <code>null if none.
     */
    private String dirChooserLabelText;

    /**
     * Creates a new path field editor
     */
    protected IProjectEditor() {
    }

    /**
     * Creates a path field editor.
     * 
     * @param name
     *            the name of the preference this field editor works on
     * @param labelText
     *            the label text of the field editor
     * @param dirChooserLabelText
     *            the label text displayed for the directory chooser
     * @param parent
     *            the parent of the field editor's control
     */
    public IProjectEditor(String name, String labelText, String dirChooserLabelText, Composite parent) {
        init(name, labelText);
        this.dirChooserLabelText = dirChooserLabelText;
        createControl(parent);
    }

    protected String[] parseString(String stringList) {
        StringTokenizer st = new StringTokenizer(stringList, File.pathSeparator);
        List<String> v = new ArrayList<String>();
        while (st.hasMoreElements()) {
            v.add((String) st.nextElement());
        }
        return (String[]) v.toArray(new String[v.size()]);
    }

    @Override
    protected String changePressed() {
        ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), new WorkbenchLabelProvider());
        dialog.setTitle(dirChooserLabelText);
        
        IProject[] allProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

        dialog.setElements(allProjects);
        
        int result = dialog.open();
        if (result == Window.OK) {
            Object[] projects =  dialog.getResult();
            if (projects.length > 0) {
                return ((IProject) projects[0]).getName();
            }
        }
        return null;
    }
}