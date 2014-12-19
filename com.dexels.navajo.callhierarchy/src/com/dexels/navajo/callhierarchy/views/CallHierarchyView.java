package com.dexels.navajo.callhierarchy.views;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

public class CallHierarchyView extends ViewPart implements ISelectionListener {

    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = "com.dexels.navajo.callhierarchy.views.CallHierarchyView";

    private ViewContentProvider viewProvider;
    private TreeViewer viewer;
    private DrillDownAdapter drillDownAdapter;
    private Action reverseCallTree;
    private Action doubleClickAction;
    private MyResourceChangeReporter resourceListener;

    /*
     * The content provider class is responsible for providing objects to the
     * view. It can wrap existing objects in adapters or simply return objects
     * as-is. These objects may be sensitive to the current input of the view,
     * or ignore it and always show the same content (like Task List, for
     * example).
     */

    class NameSorter extends ViewerSorter {
    }

    /**
     * The constructor.
     */
    public CallHierarchyView() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        window.getSelectionService().addSelectionListener(this);

        // Register to get notifications of changed files
        resourceListener = new MyResourceChangeReporter();
        ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceListener, IResourceChangeEvent.POST_CHANGE);
        
        // Register to get notifications of opened files
        window.getPartService().addPartListener(resourceListener);
    }

    public void dispose() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        window.getSelectionService().removeSelectionListener(this);
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceListener);
        window.getPartService().removePartListener(resourceListener);
    }

    /**
     * This is a callback that will allow us to create the viewer and initialize
     * it.
     */
    public void createPartControl(Composite parent) {

        viewProvider = new ViewContentProvider(getViewSite());
        viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        drillDownAdapter = new DrillDownAdapter(viewer);
        viewer.setLabelProvider(new ViewLabelProvider());
        viewer.setContentProvider(viewProvider);
        viewer.setSorter(new NameSorter());
        viewer.setInput(getViewSite());

        // Create the help context id for the viewer's control
        PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "com.dexels.navajo.callhierarchy.viewer");
        makeActions();
        hookContextMenu();
        hookDoubleClickAction();
        contributeToActionBars();
    }

    private void hookContextMenu() {
        MenuManager menuMgr = new MenuManager("#PopupMenu");
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            public void menuAboutToShow(IMenuManager manager) {
                CallHierarchyView.this.fillContextMenu(manager);
            }
        });
        Menu menu = menuMgr.createContextMenu(viewer.getControl());
        viewer.getControl().setMenu(menu);
        getSite().registerContextMenu(menuMgr, viewer);
    }

    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(IMenuManager manager) {
        manager.add(reverseCallTree);
        manager.add(new Separator());
    }

    private void fillContextMenu(IMenuManager manager) {
        manager.add(reverseCallTree);
        manager.add(new Separator());
        drillDownAdapter.addNavigationActions(manager);
        // Other plug-ins can contribute there actions here
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    private void fillLocalToolBar(IToolBarManager manager) {
        manager.add(reverseCallTree);
        manager.add(new Separator());
        drillDownAdapter.addNavigationActions(manager);
    }

    private void makeActions() {
        reverseCallTree = new Action() {
            public void run() {
                viewProvider.setReverseMode(!viewProvider.isReverseMode());
                TreeObject o = viewProvider.getRoot();
                updateRoot(new TreeParent(o.getFilePath(), 0));                
            }
        };
        reverseCallTree.setText("Reverse call hierarchy");
        reverseCallTree.setToolTipText("Reverse call hierarchy");
        reverseCallTree.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

       

        doubleClickAction = new Action() {
            public void run() {
                ISelection selection = viewer.getSelection();
                Object obj = ((IStructuredSelection) selection).getFirstElement();

                if (obj instanceof TreeObject) {
                    TreeObject treeObj = (TreeObject) obj;
                    File fileToOpen = new File(treeObj.getFilePath());
                    if (fileToOpen.exists() && fileToOpen.isFile()) {
                        IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
                        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

                        try {
                            IDE.openEditorOnFileStore(page, fileStore);
                        } catch (PartInitException e) {
                            // Put your exception handler here if you wish to
                        }
                    }

                }

            }
        };
    }

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                doubleClickAction.run();
            }
        });
    }

//    private void showMessage(String message) {
//        MessageDialog.openInformation(viewer.getControl().getShell(), "Sample View", message);
//    }

    /**
     * Passing the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    @Override
    public void selectionChanged(IWorkbenchPart sourcepart, ISelection selection) {
        if (sourcepart != CallHierarchyView.this && selection instanceof IStructuredSelection) {
            // doSomething(();
            Object selectedObject = ((IStructuredSelection) selection).getFirstElement();

            if (selectedObject instanceof IFile) {
                String filePath = ((IFile) selectedObject).getLocation().toString();
                if (!filePath.contains("scripts") && !filePath.contains("workflows") ) {
                    // only interested in scripts
                    return;
                }
                updateRoot(new TreeParent(filePath, 0));
               
            }
        }
    }

    
    
    private void updateRoot(TreeParent treeParent) {
        viewProvider.setRoot(treeParent);
        viewer.refresh();
        viewer.expandToLevel(2);
    }



    class MyResourceChangeReporter implements IResourceChangeListener,IPartListener {

        @Override
        public void resourceChanged(IResourceChangeEvent e) {
            IResourceDelta delta = e.getDelta();
            delta.getAffectedChildren();
            System.out.println("CHANGE");
        }

        @Override
        public void partActivated(IWorkbenchPart arg0) {
        }

        @Override
        public void partBroughtToTop(IWorkbenchPart arg0) {            
        }

        @Override
        public void partClosed(IWorkbenchPart arg0) {            
        }

        @Override
        public void partDeactivated(IWorkbenchPart arg0) {            
        }

        @Override
        public void partOpened(IWorkbenchPart e) {
            if (e instanceof IEditorPart) {
//                EditorPart editor = (EditorPart) e;
//                System.out.println(editor);
//                editor.getEditorInput().get
               
            }
            System.out.println("opened");
            
        }

    }

}