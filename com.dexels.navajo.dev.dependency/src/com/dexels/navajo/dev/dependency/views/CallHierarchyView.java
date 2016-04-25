package com.dexels.navajo.dev.dependency.views;

import java.io.File;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.*;
import org.eclipse.ui.texteditor.ITextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import com.dexels.navajo.dev.dependency.Activator;
import com.dexels.navajo.dev.dependency.decorator.NavajoLightweightDecorator;
import com.dexels.navajo.dev.dependency.model.TreeObject;
import com.dexels.navajo.dev.dependency.model.TreeParent;
import com.dexels.navajo.dev.dependency.preferences.NavajoDependencyPreferences;

public class CallHierarchyView extends ViewPart implements ISelectionListener {
    private final static Logger logger = LoggerFactory.getLogger(CallHierarchyView.class);

    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = "com.dexels.navajo.dev.dependency.views.CallHierarchyView";

    private ViewContentProvider viewProvider;
    private TreeViewer viewer;
    private Action callerHierarchy;
    private Action doubleClickAction;
    private Action cancelAction;
    private MyResourceChangeReporter resourceListener;

    private Action rebuildAction;
    private Action calleeHierarchy;

    /*
     * The content provider class is responsible for providing objects to the
     * view. It can wrap existing objects in adapters or simply return objects
     * as-is. These objects may be sensitive to the current input of the view,
     * or ignore it and always show the same content (like Task List, for
     * example).
     */

    class NameSorter extends ViewerSorter {
        @Override
        public int compare(Viewer viewer, Object e1, Object e2) {
            TreeParent o1 = (TreeParent) e1;
            TreeParent o2 = (TreeParent) e2;
            Integer l1  = o1.getLinenr();
            Integer l2  = o2.getLinenr();
            return l1.compareTo(l2);
        } 
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

        // Add Navajo Decorator
        try {
            PlatformUI.getWorkbench().getDecoratorManager()
                    .setEnabled("com.dexels.navajo.dev.dependency.decorator", true);
        } catch (CoreException e) {
            logger.warn("CoreException in enabling Navajo Decorator", e);
        }
    }

    public void dispose() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        window.getSelectionService().removeSelectionListener(this);
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceListener);
        window.getPartService().removePartListener(resourceListener);

        // remove Navajo Decorator
        try {
            PlatformUI.getWorkbench().getDecoratorManager()
                    .setEnabled("com.dexels.navajo.dev.dependency.decorator", false);
        } catch (CoreException e) {
            logger.warn("CoreException in removing Navajo Decorator", e);
        }
    }

    /**
     * This is a callback that will allow us to create the viewer and initialize
     * it.
     */
    public void createPartControl(Composite parent) {

        viewProvider = new ViewContentProvider(getViewSite(), this);
        viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        viewer.setLabelProvider(new ViewLabelProvider());
        viewer.setContentProvider(viewProvider);
        viewer.setSorter(new NameSorter());
        viewer.setInput(getViewSite());

        // Create the help context id for the viewer's control
        PlatformUI.getWorkbench().getHelpSystem()
                .setHelp(viewer.getControl(), "com.dexels.navajo.dev.dependency.viewer");
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
        manager.add(callerHierarchy);
        manager.add(calleeHierarchy);
        manager.add(new Separator());
    }

    private void fillContextMenu(IMenuManager manager) {

        manager.add(new Separator());
        // drillDownAdapter.addNavigationActions(manager);
        // Other plug-ins can contribute there actions here
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    private void fillLocalToolBar(IToolBarManager manager) {
        manager.add(callerHierarchy);
        manager.add(calleeHierarchy);
        manager.add(rebuildAction);
        // manager.add(cancelAction);
        manager.add(new Separator());
        // drillDownAdapter.addNavigationActions(manager);
    }

    private void makeActions() {
        callerHierarchy = new Action() {
            public void run() {
                viewProvider.setReverseMode(true);
                callerHierarchy.setChecked(true);
                calleeHierarchy.setChecked(false);
                updateRoot((TreeParent) viewProvider.getRoot());
            }
        };
        callerHierarchy.setText("Show Caller Hierarchy");
        callerHierarchy.setToolTipText("Show Caller Hierarchy");
        callerHierarchy.setImageDescriptor(Activator.getImageDescriptor("icons/callers.gif"));
        callerHierarchy.setChecked(true);

        calleeHierarchy = new Action() {
            public void run() {
                viewProvider.setReverseMode(false);
                callerHierarchy.setChecked(false);
                calleeHierarchy.setChecked(true);
                updateRoot((TreeParent) viewProvider.getRoot());
            }
        };
        calleeHierarchy.setText("Show Callee Hierarchy");
        calleeHierarchy.setToolTipText("Show Callee Hierarchy");
        calleeHierarchy.setImageDescriptor(Activator.getImageDescriptor("icons/callees.gif"));
        calleeHierarchy.setChecked(false);

        rebuildAction = new Action() {
            public void run() {
                rebuild();
            }
        };
        rebuildAction.setText("Rebuild dependency tree");
        rebuildAction.setToolTipText("Rebuild dependency tree");
        rebuildAction.setImageDescriptor(Activator.getImageDescriptor("icons/refresh.gif"));

        cancelAction = new Action() {
            public void run() {
                cancelJob();
            }
        };
        cancelAction.setText("Cancel current search");
        cancelAction.setToolTipText("Cancel current search");
        cancelAction.setImageDescriptor(Activator.getImageDescriptor("icons/cancel.gif"));

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
                            if (viewProvider.isReverseMode()) {
                            	goToLine(treeObj.getLinenr());
                            }
                        } catch (PartInitException e) {
                            logger.warn("PartInitException in opening file {}", fileToOpen, e);

                        }
                    }
                }
            }
        };
    }
    
	private void goToLine(int lineNumber) {
		if (lineNumber <= 0) {
			// no line info
			return;
		}
		try {
			IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

			if (editorPart instanceof MultiPageEditorPart) {
				MultiPageEditorPart meditor = (MultiPageEditorPart) editorPart;
				IDocument test = (IDocument) meditor.getAdapter(IDocument.class);
				IRegion lineInfo = null;
				try {
					lineInfo = test.getLineInformation(lineNumber - 1);
				} catch (BadLocationException e) {
				    logger.warn("BadLocationException on getting lineinfo in MultiPageEditorPart", e);
				}
				
				ISelection sel = new TextSelection(lineInfo.getOffset(), 0);
				meditor.getEditorSite().getSelectionProvider().setSelection(sel);
			} else if ((editorPart instanceof ITextEditor)) {
				ITextEditor editor = (ITextEditor) editorPart;
				IDocument document = editor.getDocumentProvider().getDocument(editor.getEditorInput());
				if (document != null) {
					IRegion lineInfo = null;
					try {
						lineInfo = document.getLineInformation(lineNumber - 1);
					} catch (BadLocationException e) {
					    logger.warn("BadLocationException on getting lineinfo in ITextEditor", e);
					}
					if (lineInfo != null) {
						editor.selectAndReveal(lineInfo.getOffset(), 0);
					} else {
					    logger.info("Null lineInfo - ignoring");
					}
				}
			} else {
			    logger.info("Unsupported editor {} - cannot highlight linenumber", editorPart.getClass().getName() );
				// Unsupported editor
				return;
			}

		} catch (Exception e) {
			logger.warn("Exception in setting line number {}", lineNumber, e);
		}

	}

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                doubleClickAction.run();
            }
        });
    }

    @Override
    public void selectionChanged(IWorkbenchPart sourcepart, ISelection selection) {
        if (sourcepart != CallHierarchyView.this && selection instanceof IStructuredSelection) {
            Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
            List<IProject> allProjects = NavajoDependencyPreferences.getInstance().getAllProjects();
            
            if (selectedObject instanceof IFile) {
                // Check if this file is within one of our projects
                for (IProject p : allProjects) {
                    IPath path = ((IFile) selectedObject).getProjectRelativePath();
                    if (!path.toOSString().contains("xml")) {
                        return;
                    }

                    if (p.exists(path)) {
                        String filePath = ((IFile) selectedObject).getLocation().toOSString();
                        if (viewProvider.getRoot() == null || !viewProvider.getRoot().getFilePath().equals(filePath)) {
                            updateRoot(new TreeParent(filePath, 0));
                            
                        }
                        return;
                    }
                }
            } else if (selectedObject instanceof IFolder) {
                updateRoot(viewProvider.getAbsoluteRoot());
            }
        }
    }

    protected void updateRoot(final TreeParent treeParent) {
        viewProvider.setRoot(treeParent);
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                if (viewer != null && !viewer.getControl().isDisposed()) {
                    viewer.refresh();
                    viewer.refresh(getViewSite());
                    viewer.expandToLevel(2);
                }

                // If the NavajoDecorator is enabled, then trigger update
                IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getDecoratorManager();
                if (decoratorManager != null) {
                    decoratorManager.update("com.dexels.navajo.dev.dependency.decorator");
                }
            }

        });

    }

    private void rebuild() {
        TreeParent root = (TreeParent) viewProvider.getRoot();
        viewProvider.rebuild();
        resetNavajoDependencyDecorator();
        updateRoot(root);
    }

    private void cancelJob() {
        viewProvider.cancelJob();
    }

    class MyResourceChangeReporter implements IResourceChangeListener, IPartListener {

        @Override
        public void resourceChanged(final IResourceChangeEvent event) {
            // Check if any of the change event are a project I am interested in. If so, 
            // handle the update using a DeltaUpdater in a separate job.
            
            List<IProject> allProjects = NavajoDependencyPreferences.getInstance().getAllProjects();
            IResourceDelta delta = event.getDelta();
            for (final IProject p : allProjects) {
                final IResourceDelta projectDelta = delta.findMember(p.getFullPath());
                if (projectDelta == null) {
                    continue;
                }
                
                Job changeJob = new Job("Updating dependencies for " + p.getName()) {

                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        try {
                            projectDelta.accept(new DeltaUpdater());
                        } catch (CoreException e) {
                            logger.warn("CoreException in calculating changed dependencies for {}", p.getName(), e);
                        }
                        return Status.OK_STATUS;
                    }
                };
                changeJob.setPriority(Job.SHORT);
                changeJob.schedule();
                
            }
           
          
        }

        @Override
        public void partActivated(IWorkbenchPart e) {
            if (e instanceof IEditorPart) {
                updateRootFromWorkbench(e);

            }
        }

        @Override
        public void partBroughtToTop(IWorkbenchPart e) {

            if (e instanceof IEditorPart) {
                updateRootFromWorkbench(e);
            }
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
                updateRootFromWorkbench(e);
            }

        }

        private void updateRootFromWorkbench(IWorkbenchPart e) {
            IEditorInput input = ((IEditorPart) e).getEditorInput();
            if (viewProvider == null) {
                viewProvider = new ViewContentProvider(getViewSite(), CallHierarchyView.this);
                viewer.setContentProvider(viewProvider);
            }
            if (input instanceof FileEditorInput) {
                FileEditorInput fileInput = (FileEditorInput) input;

                List<IProject> allProjects = NavajoDependencyPreferences.getInstance().getAllProjects();
                if (allProjects.size() == 0) {
                    updateRoot(new TreeParent("Please set your Navajo Dependency Preferences!", 0));
                    return;
                }

                IPath path = fileInput.getFile().getProjectRelativePath();
                if (!path.toOSString().contains("xml")) {
                    return;
                }
                String filePath = fileInput.getFile().getLocation().toOSString();
                // Check if this file is within one of our projects
                for (IProject p : allProjects) {
                    if (p.exists(path)) {
                        if (viewProvider.getRoot() == null || viewProvider.getRoot().getFilePath() == null
                                || !viewProvider.getRoot().getFilePath().equals(filePath)) {
                            updateRoot(new TreeParent(filePath, 0));
                        }
                        return;
                    }
                }
                updateRoot(viewProvider.getAbsoluteRoot());
            }
        }
    }

    class DeltaUpdater implements IResourceDeltaVisitor {
        public boolean visit(IResourceDelta delta) {
            if (delta.getResource() instanceof IProject) {
                for (IResourceDelta child : delta.getAffectedChildren()) {
                    visit(child, (IProject) delta.getResource());
                }
            }
            return true;
           
        }
        
        private boolean visit(IResourceDelta delta, IProject project) {
            IResource res = delta.getResource();
            if (res instanceof IFolder) {
                for (IResourceDelta child : delta.getAffectedChildren()) {
                    visit(child, project);
                }
                return true;
            }
            

            String filePath = res.getLocation().toFile().getAbsolutePath();

            switch (delta.getKind()) {
            case IResourceDelta.ADDED:
                viewProvider.updateResource(filePath, project);
                refreshRoot();
                break;
            case IResourceDelta.REMOVED:
                viewProvider.removeResource(filePath, project);
                refreshRoot();
                break;
            case IResourceDelta.CHANGED:
                viewProvider.updateResource(filePath, project);
                refreshRoot();
                break;
            }
            return true;
            
        }

        private void refreshRoot() {

            resetNavajoDependencyDecorator();

            TreeObject o = viewProvider.getRoot();
            if (o != null) {
                updateRoot(new TreeParent(o.getFilePath(), 0));
            }
        }

    }

    @Override
    public void setFocus() {

    }

    private IBaseLabelProvider getNavajoDependencyDecorator() {
        IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getDecoratorManager();
        if (decoratorManager != null) {
            return decoratorManager.getBaseLabelProvider("com.dexels.navajo.dev.dependency.decorator");
        }
        return null;
    }

    protected void resetNavajoDependencyDecorator() {
        // If the NavajoDecorator is enabled, then reset cache
        IBaseLabelProvider dec = getNavajoDependencyDecorator();
        if (dec != null) {
            ((NavajoLightweightDecorator) dec).resetCache();
        }
    }

}
