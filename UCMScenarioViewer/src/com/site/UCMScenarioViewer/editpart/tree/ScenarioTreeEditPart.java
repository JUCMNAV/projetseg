/*
 * Created on 05.03.2005
 */
package com.site.UCMScenarioViewer.editpart.tree;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.gef.EditPolicy;

import com.site.UCMScenarioViewer.editpolicies.MSCTreeContainerEditPolicy;
import com.site.UCMScenarioViewer.utils.Properties;


/**
 * Edit part for the scenario in the tree outline viewer.
 * 
 * @author Sasha
 *
 */
public class ScenarioTreeEditPart extends ModelElementTreeEditPart implements
		PropertyChangeListener {

	/**
	 * @param model
	 */
	public ScenarioTreeEditPart(Object model) {
		super(model);
	}

	/**
	 * Default constructor.
	 */
	public ScenarioTreeEditPart() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPart#activate()
	 */
	public void activate(){
		if (isActive())
			return;
		super.activate();
		getModelElement().addPropertyChangeListener(this);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPart#deactivate()
	 */
	public void deactivate(){
		if (!isActive())
			return;
		super.deactivate();
		getModelElement().removePropertyChangeListener(this);
	}

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Properties.ID_INSERT_LIFELINE))
			refresh();
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.TREE_CONTAINER_ROLE, new MSCTreeContainerEditPolicy());
	}
}
