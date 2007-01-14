/*
 * Created on 25.02.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import org.eclipse.draw2d.IFigure;

import com.site.UCMScenarioViewer.figures.ITimerFigure;
import com.site.UCMScenarioViewer.figures.ResetTimerFigure;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ResetTimerEditPart extends AbstractModelElementEditPart {

	/**
	 * 
	 */
	public ResetTimerEditPart() {
		super();
	}

	/**
	 * @param model
	 */
	public ResetTimerEditPart(Object model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		return new ResetTimerFigure();
	}
	
	public ITimerFigure getTimerFigure() {
		return (ITimerFigure) getFigure();
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		getTimerFigure().setPolylines(getModelElement().getName());
	}
}
