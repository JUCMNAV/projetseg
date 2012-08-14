/*
 * Created on 02.03.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import org.eclipse.draw2d.IFigure;

import com.site.UCMScenarioViewer.figures.TimeoutFigure;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TimeoutEditPart extends ResetTimerEditPart {

	/**
	 * 
	 */
	public TimeoutEditPart() {
		super();
	}

	/**
	 * @param model
	 */
	public TimeoutEditPart(Object model) {
		super(model);
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		return new TimeoutFigure();
	}
}
