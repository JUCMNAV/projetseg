/*
 * Created on 02.03.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import org.eclipse.draw2d.IFigure;

import com.site.UCMScenarioViewer.figures.StartEndFigure;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StartEndEditPart extends AbstractModelElementEditPart {

	/**
	 * 
	 */
	public StartEndEditPart() {
		super();
	}

	/**
	 * @param model
	 */
	public StartEndEditPart(Object model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		return new StartEndFigure();
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		((StartEndFigure)getFigure()).setStartEndMsg(getModelElement().getName());
	}
}
