package seg.network.editors;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.requests.SimpleFactory;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.jface.util.TransferDropTargetListener;
import org.eclipse.ui.IEditorInput;

import seg.network.NetworkPaletteRoot;
import seg.network.editparts.GraphicalEditPartFactory;
import seg.network.model.network.Link;
import seg.network.model.network.Network;
import seg.network.model.network.NetworkFactory;
import seg.network.model.network.Node;

/**
 * An example showing how to create a multi-page editor.
 * This example has 3 pages:
 * <ul>
 * <li>page 0 contains a nested text editor.
 * <li>page 1 allows you to change the font used in page 2
 * <li>page 2 shows the words in page 0 in sorted order
 * </ul>
 */
public class NetworkEditor extends GraphicalEditorWithFlyoutPalette {
	
	private PaletteRoot paletteRoot;

	/**
	 * This is the root of the editor's model.
	 * 
	 */
	private Network network;

	/** Create a new ShapesEditor instance. This is called by the Workspace. */
	public NetworkEditor() {
		NetworkFactory factory = NetworkFactory.eINSTANCE;

		network = factory.createNetwork();
		setEditDomain(new DefaultEditDomain(this));
	}

	/**
	 * Configure the graphical viewer before it receives contents.
	 * <p>This is the place to choose an appropriate RootEditPart and EditPartFactory
	 * for your editor. The RootEditPart determines the behavior of the editor's "work-area".
	 * For example, GEF includes zoomable and scrollable root edit parts. The EditPartFactory
	 * maps model elements to edit parts (controllers).</p>
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#configureGraphicalViewer()
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setRootEditPart(new ScalableRootEditPart());
		viewer.setEditPartFactory(new GraphicalEditPartFactory());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doSave(IProgressMonitor monitor) {
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSaveAs()
	 */
	public void doSaveAs() {
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class type) {
		return super.getAdapter(type);
	}

	private Network getModel() {
		return network;
	}

	/**
	 * Set up the editor's inital content (after creation).
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#initializeGraphicalViewer()
	 */
	protected void initializeGraphicalViewer() {
		GraphicalViewer graphicalViewer = getGraphicalViewer();
		graphicalViewer.setContents(getModel()); // set the contents of this editor
//		 listen for dropped parts
		graphicalViewer.addDropTargetListener(createTransferDropTargetListener());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isDirty()
	 */
	public boolean isDirty() {
		return getCommandStack().isDirty();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	/**
     * Returns the default <code>PaletteRoot</code> for this editor and all
     * its pages.
     * @return the default <code>PaletteRoot</code>
     */
    protected PaletteRoot getPaletteRoot()
    {
        if (null == paletteRoot)
        {
            // create root
            paletteRoot = new NetworkPaletteRoot();
        }
        return paletteRoot;
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#createPaletteViewerProvider()
     */
    protected PaletteViewerProvider createPaletteViewerProvider() {
    	return new PaletteViewerProvider(getEditDomain()) {
    		protected void configurePaletteViewer(PaletteViewer viewer) {
    			super.configurePaletteViewer(viewer);
    			// create a drag source listener for this palette viewer
    			// together with an appropriate transfer drop target listener, this will enable
    			// model element creation by dragging a CombinatedTemplateCreationEntries 
    			// from the palette into the editor
    			// @see ShapesEditor#createTransferDropTargetListener()
    			viewer.addDragSourceListener(new TemplateTransferDragSourceListener(viewer));
    		}
    	};
    }
    
    /**
     * Create a transfer drop target listener. When using a CombinedTemplateCreationEntry
     * tool in the palette, this will enable model element creation by dragging from the palette.
     * @see #createPaletteViewerProvider()
     */
    private TransferDropTargetListener createTransferDropTargetListener() {
    	return new TemplateTransferDropTargetListener(getGraphicalViewer()) {
    		protected CreationFactory getFactory(Object template) {
    			return new SimpleFactory((Class) template);
    		}
    	};
    }


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		
		NetworkFactory factory = NetworkFactory.eINSTANCE;
		
		network = factory.createNetwork();
		
		Node node1 = factory.createNode();
		Node node2 = factory.createNode();
		
		Link link = factory.createLink();
		
		node1.setId("1");
		node2.setId("2");
		node2.setX(100);

		network.getNodes().add(node1);
		network.getNodes().add(node2);
		
//		link.setNetwork(network);
//		network.getLinks().add(link);
//		node2.getUpstreamLinks().add(link);
//		node1.getDownstreamLinks().add(link);
		
		setPartName("Network editor");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPalettePreferences()
	 */
	protected FlyoutPreferences getPalettePreferences() {
		return NetworkPaletteRoot.createPalettePreferences();
	}
}
