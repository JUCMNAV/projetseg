/*
 * Created on 25.02.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import org.eclipse.draw2d.IFigure;

import com.site.UCMScenarioViewer.figures.SetTimerFigure;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SetTimerEditPart extends ResetTimerEditPart {

	/**
	 * 
	 */
	public SetTimerEditPart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param model
	 */
	public SetTimerEditPart(Object model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		return new SetTimerFigure();
	}
	
}
