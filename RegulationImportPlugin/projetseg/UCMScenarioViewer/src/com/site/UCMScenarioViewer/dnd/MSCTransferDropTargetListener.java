/*
 * Created on 05.03.2005
 */
package com.site.UCMScenarioViewer.dnd;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreationFactory;

/**
 * Reacts to changes in the view upon dropping a target in tree outline viewer
 * by triggering the execution of an appropriate command.
 * 
 * @see com.site.UCMScenarioViewer.commands.ReorderLifeLinesCommand
 */
public class MSCTransferDropTargetListener extends
		TemplateTransferDropTargetListener {

	/**
	 * @param viewer
	 */
	public MSCTransferDropTargetListener(EditPartViewer viewer) {
		super(viewer);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.dnd.TemplateTransferDropTargetListener#getFactory(java.lang.Object)
	 */
	protected CreationFactory getFactory(Object template) {
		return new DataElementFactory(template);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener#createTargetRequest()
	 */
	protected Request createTargetRequest() {
		// TODO Auto-generated method stub
		return super.createTargetRequest();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener#handleDragOperationChanged()
	 */
	protected void handleDragOperationChanged() {
		// TODO Auto-generated method stub
		super.handleDragOperationChanged();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener#handleDragOver()
	 */
	protected void handleDragOver() {
		// TODO Auto-generated method stub
		super.handleDragOver();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener#handleDrop()
	 */
	protected void handleDrop() {
		// TODO Auto-generated method stub
		super.handleDrop();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener#updateTargetRequest()
	 */
	protected void updateTargetRequest() {
		// TODO Auto-generated method stub
		super.updateTargetRequest();
	}
}
