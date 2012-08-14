/*
 * Created on 05.03.2005
 */
package com.site.UCMScenarioViewer.editpart.tree;

import org.eclipse.gef.EditPolicy;

import com.site.UCMScenarioViewer.editpolicies.ReorderLifeLinesEditPolicy;

/**
 * Edit part for the lifeLine in the tree outline viewer.
 *
 * @author Sasha
 *
 */
public class LifeLineTreeEditPart extends ModelElementTreeEditPart {

	/**
	 * @param model
	 */
	public LifeLineTreeEditPart(Object model) {
		super(model);
	}

	/**
	 * Default constructor.
	 */
	public LifeLineTreeEditPart() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ReorderLifeLinesEditPolicy());
	}
}
