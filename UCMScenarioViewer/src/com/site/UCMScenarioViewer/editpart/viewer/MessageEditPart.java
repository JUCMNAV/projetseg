/*
 * Created on 24.02.2005
 *
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;

import com.site.UCMScenarioViewer.figures.MessageFigure;
import com.site.UCMScenarioViewer.model.AbstractModelElement;
import com.site.UCMScenarioViewer.utils.DefaultFigureSize;
import com.site.UCMScenarioViewer.utils.Properties;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MessageEditPart extends AbstractConnectionEditPart implements PropertyChangeListener {

	/**
	 * 
	 */
	public MessageEditPart() {
		super();
	}
	
	public MessageEditPart(Object model) {
		super();
		setModel(model);
	}

	public void activate(){
		if (isActive())
			return;
		super.activate();
		getModelElement().addPropertyChangeListener(this);
	}
	
	public void deactivate(){
		if (!isActive())
			return;
		super.deactivate();
		getModelElement().removePropertyChangeListener(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {

	}
	
	public AbstractModelElement getModelElement() {
		return (AbstractModelElement) getModel();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		Connection connx = new MessageFigure(DefaultFigureSize.MESSAGE_THICKNESS);
		return connx;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		((MessageFigure)getFigure()).setLabel(getModelElement().getLabel());
		if (getSource() == getTarget())
			((MessageFigure)getFigure()).setBendingPoints();
	}
	
	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Properties.ID_REFRESH_SOURCE)) {
			refreshSourceAnchor();
			refreshVisuals();
		}
		else if (evt.getPropertyName().equals(Properties.ID_REFRESH_TARGET)) {
			refreshTargetAnchor();
			refreshVisuals();
		}
	}

}
