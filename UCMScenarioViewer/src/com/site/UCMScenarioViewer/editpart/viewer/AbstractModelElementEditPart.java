/*
 * Created on 13.02.2005
 *
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.site.UCMScenarioViewer.model.AbstractModelElement;
import com.site.UCMScenarioViewer.utils.Properties;

/**
 * @author Sasha
 *
 */
public abstract class AbstractModelElementEditPart extends
		AbstractGraphicalEditPart implements PropertyChangeListener {

	/**
	 * Default constructor.
	 */
	public AbstractModelElementEditPart() {
		super();
	}
	
	public AbstractModelElementEditPart(Object model) {
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
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	abstract protected IFigure createFigure();

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
	}

	public int getPreferredX() {
		return ((AbstractModelElement)getModel()).getXdimension();
	}
	
	public int getPreferredY() {
		return ((AbstractModelElement)getModel()).getYdimension();
	}
	
	public String getName() {
		return ((AbstractModelElement)getModel()).getName();
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	protected List getModelChildren() {
		return getModelElement().getViewChildren();
	}
	
	public AbstractModelElement getModelElement() {
		return (AbstractModelElement) getModel();
	}
		
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		IFigure fig = getFigure();
		fig.setLocation(getModelElement().getInitialLocation());
		fig.setSize(getModelElement().getXdimension(), getModelElement().getYdimension());
		fig.setFont(getModelElement().getFont());
		super.refreshVisuals();
	}
		
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Properties.ID_REFRESH)) {
			refreshVisuals();
		}
	}
}
