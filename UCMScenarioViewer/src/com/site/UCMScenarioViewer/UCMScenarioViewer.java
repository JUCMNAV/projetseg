/*
 * Created on 3-Feb-2005
 *
 */
package com.site.UCMScenarioViewer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.draw2d.parts.Thumbnail;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.commands.ActionHandler;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.site.UCMScenarioViewer.actions.SetFontAction;
import com.site.UCMScenarioViewer.actions.UCMScenarioViewerContextMenuProvider;
import com.site.UCMScenarioViewer.dnd.MSCTransferDropTargetListener;
import com.site.UCMScenarioViewer.factory.GraphicalPartFactory;
import com.site.UCMScenarioViewer.factory.TreePartFactory;
import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.parser.EMFParserInitializer;

/**
 * @author oboyk022
 *  
 */
public class UCMScenarioViewer extends GraphicalEditor {

    protected static Font applicationFont;
    protected static Font largerApplicationFont;
    
    public static Font getApplicationFont() {
        if (applicationFont == null) {
            applicationFont = new Font(null, "", 12, org.eclipse.swt.SWT.CANCEL);
        }
        return applicationFont;
    }
    public static Font getLargerApplicationFont() {
        if (largerApplicationFont == null) {
            largerApplicationFont = new Font(null, "", 16, org.eclipse.swt.SWT.CANCEL);
        }
        return largerApplicationFont;
    }
    public static void setApplicationFont(FontData newFont) 
    {
        if (applicationFont!=null)
        	if (!applicationFont.isDisposed())
        		applicationFont.dispose();
        applicationFont = new Font(null, newFont.getName(), newFont.getHeight(), newFont.getStyle());

        if (largerApplicationFont!=null)
        	if(!largerApplicationFont.isDisposed())
        		largerApplicationFont.dispose();
        largerApplicationFont = new Font(null, newFont.getName(), newFont.getHeight()+4, newFont.getStyle());
        
    }
    
	/**
	 * 
	 * Outline implementation class. Supports two views: tree view and outline view.
	 *
	 */
	class OutlinePage extends ContentOutlinePage implements IAdaptable {
		private PageBook pageBook;

		private Control outline;

		private Canvas overview;

		private IAction showOutlineAction, showOverviewAction;

		static final int ID_OUTLINE = 0;

		static final int ID_OVERVIEW = 1;

		private Thumbnail thumbnail;

		private DisposeListener disposeListener;

		public OutlinePage(EditPartViewer viewer) {
			super(viewer);
		}

		public Object getAdapter(Class type) {
			if (type == ZoomManager.class)
				return getGraphicalViewer().getProperty(
						ZoomManager.class.toString());
			return null;
		}

		public void init(IPageSite pageSite) {
			super.init(pageSite);
		}

		/**
		 * Adds buttons and button handlers, initializes drag and drop support. 
		 * 
		 */
		protected void configureOutlineViewer() {
			getViewer().setEditDomain(getEditDomain());
			getViewer().setEditPartFactory(new TreePartFactory());
			((TreeViewer) getViewer())
					.addDropTargetListener(new MSCTransferDropTargetListener(
							getViewer()));
			IToolBarManager tbm = getSite().getActionBars().getToolBarManager();
			showOutlineAction = new Action() {
				public void run() {
					// tree view
					showPage(ID_OUTLINE);
				}
			};
			showOutlineAction.setImageDescriptor(ImageDescriptor
					.createFromFile(UCMScenarioViewerPlugin.class,
							"model/icons/outline.gif")); //$NON-NLS-1$
			tbm.add(showOutlineAction);
			showOverviewAction = new Action() {
				public void run() {
					// outline view
					showPage(ID_OVERVIEW);
				}
			};
			showOverviewAction.setImageDescriptor(ImageDescriptor
					.createFromFile(UCMScenarioViewerPlugin.class,
							"model/icons/overview.gif")); //$NON-NLS-1$
			tbm.add(showOverviewAction);
			showPage(ID_OUTLINE);
		}

		/**
		 * Checks which view to display - outline or tree, and displays it.
		 * @param id parameter indicating which view to display, passed when an
		 * appropriate button is pressed in the workbench
		 */
		protected void showPage(int id) {
			if (id == ID_OUTLINE) {
				showOutlineAction.setChecked(true);
				showOverviewAction.setChecked(false);
				pageBook.showPage(outline);
				if (thumbnail != null)
					thumbnail.setVisible(false);
			} else if (id == ID_OVERVIEW) {
				if (thumbnail == null)
					initializeOverview();
				showOutlineAction.setChecked(false);
				showOverviewAction.setChecked(true);
				pageBook.showPage(overview);
				thumbnail.setVisible(true);
			}
		}

		protected void initializeOverview() {
			LightweightSystem lws = new LightweightSystem(overview);
			RootEditPart rep = getGraphicalViewer().getRootEditPart();
			if (rep instanceof ScalableFreeformRootEditPart) {
				ScalableFreeformRootEditPart root = (ScalableFreeformRootEditPart) rep;
				thumbnail = new ScrollableThumbnail((Viewport) root.getFigure());
				thumbnail.setBorder(new MarginBorder(3));
				thumbnail.setSource(root
						.getLayer(LayerConstants.PRINTABLE_LAYERS));
				lws.setContents(thumbnail);
				disposeListener = new DisposeListener() {
					public void widgetDisposed(DisposeEvent e) {
						if (thumbnail != null) {
							thumbnail.deactivate();
							thumbnail = null;
						}
					}
				};
				getEditor().addDisposeListener(disposeListener);
			}
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.part.IPage#createControl(org.eclipse.swt.widgets.Composite)
		 */
		public void createControl(Composite parent) {
			pageBook = new PageBook(parent, SWT.NONE);
			outline = getViewer().createControl(pageBook);
			overview = new Canvas(pageBook, SWT.NONE);
			pageBook.showPage(outline);
			configureOutlineViewer();
			hookOutlineViewer();
			initializeOutlineViewer();
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.part.IPage#dispose()
		 */
		public void dispose() {
			unhookOutlineViewer();
			if (thumbnail != null) {
				thumbnail.deactivate();
				thumbnail = null;
			}
			super.dispose();
			UCMScenarioViewer.this.outlinePage = null;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.part.IPage#getControl()
		 */
		public Control getControl() {
			return pageBook;
		}

		/**
		 * Synchronizes the selection between the main viewer and the outline views.
		 */
		protected void hookOutlineViewer() {
			getSelectionSynchronizer().addViewer(getViewer());
		}

		/**
		 * Passes the model from parser to the viewer
		 */
		protected void initializeOutlineViewer() {
			setContents(getMSCDiagram());
		}

		/**
		 * Sets the model for the viewer.
		 * @param contents
		 */
		public void setContents(Object contents) {
			getViewer().setContents(contents);
		}

		/**
		 * Removes selection synchronization, removes listeners. Usually called 
		 * when outline page is being closed.
		 */
		protected void unhookOutlineViewer() {
			getSelectionSynchronizer().removeViewer(getViewer());
			if (disposeListener != null && getEditor() != null
					&& !getEditor().isDisposed())
				getEditor().removeDisposeListener(disposeListener);
		}

	}

	private OutlinePage outlinePage;

	private ScenarioGroup diagram = new ScenarioGroup();

	private boolean savePreviouslyNeeded = false;
	
	private boolean isSaveAllowed=true;

	/**
	 *  Default constructor.
	 */
	public UCMScenarioViewer() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	protected void closeUCMViewer(boolean save) { // add save boolean
		getSite().getPage().closeEditor(UCMScenarioViewer.this, save);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doSave(IProgressMonitor progressMonitor) {
		if (!isSaveAllowed()) {
			isSaveAllowed=performSaveAs();
			return; 
		}

		try {
			editorSaving = true;
			saveProperties();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			createOutputStream(out);
			IFile file = ((IFileEditorInput) getEditorInput()).getFile();
			file.setContents(new ByteArrayInputStream(out.toByteArray()), true,
					false, progressMonitor);
			out.close();
			getCommandStack().markSaveLocation();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			editorSaving = false;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.CommandStackListener#commandStackChanged(java.util.EventObject)
	 */
	public void commandStackChanged(EventObject event) {
		if (isDirty()) {
			if (!savePreviouslyNeeded()) {
				setSavePreviouslyNeeded(true);
				firePropertyChange(IEditorPart.PROP_DIRTY);
			}
		} else {
			setSavePreviouslyNeeded(false);
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
		super.commandStackChanged(event);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSaveAs()
	 */
	public void doSaveAs() {
		performSaveAs();
	}

	/**
	 * Performs the 'save as' operation: gets the dialogue, creates the file, saves it.
	 * @return true if no errors occured, false otherwise.
	 */
	protected boolean performSaveAs() {
		SaveAsDialog dialog = new SaveAsDialog(getSite().getWorkbenchWindow()
				.getShell());
		
		IFile origfile = ((IFileEditorInput) getEditorInput()).getFile();
		String ext = origfile.getFileExtension();
		if ("jucmscenarios".equalsIgnoreCase(ext)) {
			dialog.setOriginalName(origfile.getFullPath().removeFileExtension().addFileExtension("scenarios").lastSegment());
		}
		else 
			dialog.setOriginalFile(origfile);
		
		dialog.open();
		IPath path = dialog.getResult();

		if (path == null)
			return false;

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IFile file = workspace.getRoot().getFile(path);

		if (!file.exists()) {
			WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
				public void execute(final IProgressMonitor monitor) {
					saveProperties();
					try {
						ByteArrayOutputStream out = new ByteArrayOutputStream();
						createOutputStream(out);
						file.create(
								new ByteArrayInputStream(out.toByteArray()),
								true, monitor);
						out.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			try {
				new ProgressMonitorDialog(getSite().getWorkbenchWindow()
						.getShell()).run(false, true, op);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			superSetInput(new FileEditorInput(file));
			getCommandStack().markSaveLocation();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	
	/**
	 * Creates output stream for 'save' operation.
	 * @param os 
	 * @throws IOException
	 */
	protected void createOutputStream(OutputStream os) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(getMSCDiagram());
		out.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISaveablePart#isDirty()
	 */
	public boolean isDirty() {
		return isSaveOnCloseNeeded();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	public boolean isSaveAllowed() {
		return isSaveAllowed;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#configureGraphicalViewer()
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		ScrollingGraphicalViewer viewer = (ScrollingGraphicalViewer) getGraphicalViewer();

		ScalableFreeformRootEditPart root = new ScalableFreeformRootEditPart();

		List zoomLevels = new ArrayList(3);
		zoomLevels.add(ZoomManager.FIT_ALL);
		zoomLevels.add(ZoomManager.FIT_WIDTH);
		zoomLevels.add(ZoomManager.FIT_HEIGHT);
		root.getZoomManager().setZoomLevelContributions(zoomLevels);

		
		IAction zoomIn = new ZoomInAction(root.getZoomManager());
		IAction zoomOut = new ZoomOutAction(root.getZoomManager());
		getActionRegistry().registerAction(zoomIn);
		getActionRegistry().registerAction(zoomOut);
		IHandlerService handler = (IHandlerService)	getSite().getService(IHandlerService.class);
		handler.activateHandler(zoomIn.getActionDefinitionId(), new ActionHandler(zoomIn));
		handler.activateHandler(zoomOut.getActionDefinitionId(), new ActionHandler(zoomOut));
		// Allows zooming with the mouse wheel while holding down CTRL
		// getSite().getKeyBindingService().registerAction(zoomIn);
		// getSite().getKeyBindingService().registerAction(zoomOut);

		viewer.setRootEditPart(root);

		viewer.setEditPartFactory(new GraphicalPartFactory());
		ContextMenuProvider provider = new UCMScenarioViewerContextMenuProvider(viewer, getActionRegistry());
		viewer.setContextMenu(provider);
		getSite().registerContextMenu("com.site.UCMViewer.editor.contextmenu",
				provider, viewer);

		loadProperties();

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class type) {
		if (type == IContentOutlinePage.class) {
			outlinePage = new OutlinePage(new TreeViewer());
			return outlinePage;
		}
		if (type == ZoomManager.class)
			return getGraphicalViewer().getProperty(
					ZoomManager.class.toString());

		return super.getAdapter(type);
	}

	/**
	 * Gets the viewer's model
	 * @return  model object
	 */
	public ScenarioGroup getMSCDiagram() {
		return diagram;
	}

	/**
	 * @param event
	 */
	protected void handleActivationChanged(Event event) {
		IAction copy = null;
		if (event.type == SWT.Deactivate)
			copy = getActionRegistry().getAction(ActionFactory.COPY.getId());
		if (getEditorSite().getActionBars().getGlobalActionHandler(
				ActionFactory.COPY.getId()) != copy) {
			getEditorSite().getActionBars().setGlobalActionHandler(
					ActionFactory.COPY.getId(), copy);
			getEditorSite().getActionBars().updateActionBars();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#initializeGraphicalViewer()
	 */
	protected void initializeGraphicalViewer() {
		getGraphicalViewer().setContents(getMSCDiagram());
	}

	/**
	 * Gets the canvas for figures
	 * @return graphical viewer's canvas
	 */
	protected FigureCanvas getEditor() {
		return (FigureCanvas) getGraphicalViewer().getControl();
	}

	/**
	 * Loads the models's current zoom level
	 */
	protected void loadProperties() {
		// Zoom
		ZoomManager manager = (ZoomManager) getGraphicalViewer().getProperty(
				ZoomManager.class.toString());
		if (manager != null && getMSCDiagram().getSelectedScenario()!=null)
			if (getMSCDiagram().getSelectedScenario() != null)
				manager.setZoom(getMSCDiagram().getSelectedScenario().getZoom());
	}

	/**
	 * Saves the current zoom level in the model.
	 */
	protected void saveProperties() {
		ZoomManager manager = (ZoomManager) getGraphicalViewer().getProperty(
				ZoomManager.class.toString());
		if (manager != null)
			getMSCDiagram().getSelectedScenario().setZoom(manager.getZoom());
	}

	private boolean savePreviouslyNeeded() {
		return savePreviouslyNeeded;
	}

	private void setSavePreviouslyNeeded(boolean value) {
		savePreviouslyNeeded = value;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isSaveOnCloseNeeded()
	 */
	public boolean isSaveOnCloseNeeded() {
		return getCommandStack().isDirty();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
	public void setInput(IEditorInput input) {
		superSetInput(input);
		isSaveAllowed=true;
		IFile file = ((IFileEditorInput) input).getFile();
		try {
			setPartName(file.getName());
			InputStream is = file.getContents(false);
			ObjectInputStream ois = new ObjectInputStream(is);
			setMSCDiagram((ScenarioGroup) ois.readObject());
			ois.close();
		} catch (Exception e) {
			try {
			setMSCDiagram(EMFParserInitializer.parseMscModel(new File(file.getRawLocation().toOSString())));
			isSaveAllowed=false;
			} catch (Exception ex) {
				//This is just an example. All exceptions caught here.
				e.printStackTrace();
			}
		}

		if (!editorSaving) {
			if (getGraphicalViewer() != null) {
				getGraphicalViewer().setContents(getMSCDiagram());
				loadProperties();
			}
			if (outlinePage != null) {
				outlinePage.setContents(getMSCDiagram());
			}
		}
	}

	/**
	 * Sets the model for UCM Scenario Viewer
	 * @param diagram
	 */
	public void setMSCDiagram(ScenarioGroup diagram) {
		this.diagram = diagram;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setSite(org.eclipse.ui.IWorkbenchPartSite)
	 */
	protected void setSite(IWorkbenchPartSite site) {
		super.setSite(site);
	}

	private boolean editorSaving = false;

	private ResourceTracker resourceListener = new ResourceTracker();

	//	 This class listens to changes to the file system in the workspace, and
	//	 makes changes accordingly.
	//	 1) An open, saved file gets deleted -> close the editor
	//	 2) An open file gets renamed or moved -> change the editor's input
	// accordingly
	class ResourceTracker implements IResourceChangeListener,
			IResourceDeltaVisitor {
		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			try {
				if (delta != null)
					delta.accept(this);
			} catch (CoreException exception) {
				// What should be done here?
			}
		}

		/* (non-Javadoc)
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) {
			if (delta == null
					|| !delta.getResource().equals(
							((FileEditorInput) getEditorInput()).getFile()))
				return true;

			if (delta.getKind() == IResourceDelta.REMOVED) {
				Display display = getSite().getShell().getDisplay();
				if ((IResourceDelta.MOVED_TO & delta.getFlags()) == 0) {
					// NOTE: The case where an open, unsaved file is deleted is
					// being handled by the
					// PartListener added to the Workbench in the initialize()
					// method.
					display.asyncExec(new Runnable() {
						public void run() {
							if (!isDirty())
								closeUCMViewer(false);
						}
					});
				} else { // else if it was moved or renamed
					final IFile newFile = ResourcesPlugin.getWorkspace()
							.getRoot().getFile(delta.getMovedToPath());
					display.asyncExec(new Runnable() {
						public void run() {
							superSetInput(new FileEditorInput(newFile));
						}
					});
				}
			} else if (delta.getKind() == IResourceDelta.CHANGED) {
				if (!editorSaving) {
					// the file was overwritten somehow (could have been
					// replaced by another
					// version in the respository)
					final IFile newFile = ResourcesPlugin.getWorkspace()
							.getRoot().getFile(delta.getFullPath());
					Display display = getSite().getShell().getDisplay();
					display.asyncExec(new Runnable() {
						public void run() {
							setInput(new FileEditorInput(newFile));
							getCommandStack().flush();
						}
					});
				}
			}
			return false;
		}
	}

	/**
	 * Sets the input to this editor
	 * @param input
	 */
	protected void superSetInput(IEditorInput input) {
		// The workspace never changes for an editor. So, removing and re-adding
		// the resourceListener is not necessary. But it is being done here for the
		// sake of proper implementation. Plus, the resourceListener needs to be
		// added to the workspace the first time around.
		if (getEditorInput() != null) {
			IFile file = ((FileEditorInput) getEditorInput()).getFile();
			file.getWorkspace().removeResourceChangeListener(resourceListener);
		}

		super.setInput(input);

		if (getEditorInput() != null) {
			IFile file = ((FileEditorInput) getEditorInput()).getFile();
			file.getWorkspace().addResourceChangeListener(resourceListener);
			setPartName(file.getName());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#createActions()
	 */
	protected void createActions() {
		super.createActions();
		getActionRegistry().registerAction(new SetFontAction(this));
	}
}

