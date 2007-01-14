/*
 * Created on 25.02.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import org.eclipse.draw2d.IFigure;

import com.site.UCMScenarioViewer.figures.ConditionFigure;
import com.site.UCMScenarioViewer.model.Condition;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConditionEditPart extends AbstractModelElementEditPart {

	/**
	 * 
	 */
	public ConditionEditPart() {
		super();
	}

	/**
	 * @param model
	 */
	public ConditionEditPart(Object model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		return  new ConditionFigure();
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		((ConditionFigure)getFigure()).setPolygon( ((Condition)getModelElement()).getExpression());
	}
}
