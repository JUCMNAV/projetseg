/*
 * Created on 06.02.2005
 *
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

import com.site.UCMScenarioViewer.figures.DiagramFigurePane;

/**
 * @author Sasha
 *
 */
public class ScenarioEditPart extends AbstractModelElementEditPart {

	/**
	 * 
	 */
	public ScenarioEditPart() {
		super();
	}
	
	public ScenarioEditPart(Object model) {
		super(model);
	}
	
	protected DiagramFigurePane getDiagramFigurePane() {
		return (DiagramFigurePane)getFigure();
	}
	
	public IFigure getContentPane() {
		return getDiagramFigurePane().getContentsPane();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		return new DiagramFigurePane();
	}

	protected void refreshVisuals() {
		Point loc = new Point();
		Dimension size= new Dimension(getModelElement().getXdimension(), getModelElement().getYdimension());
		Rectangle r = new Rectangle(loc ,size);
		getDiagramFigurePane().setLabel(getModelElement().getLabel());

		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			r);
	}
}
