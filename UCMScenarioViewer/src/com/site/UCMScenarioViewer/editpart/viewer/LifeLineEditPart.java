/*
 * Created on 13-Feb-2005
 *
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;

import com.site.UCMScenarioViewer.figures.LifeLineAnchor;
import com.site.UCMScenarioViewer.figures.LifeLineFigure;
import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Message;

/**
 * @author oboyk022
 *
 */
public class LifeLineEditPart extends AbstractModelElementEditPart 
	implements NodeEditPart {

	/**
	 * 
	 */
	public LifeLineEditPart() {
		super();
	}

	/**
	 * @param model
	 */
	public LifeLineEditPart(Object model) {
		super(model);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		LifeLineFigure fig = new LifeLineFigure();
		return fig;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		LifeLineFigure fig = (LifeLineFigure)getFigure();
		LifeLine l = (LifeLine) getModelElement();
		fig.setLocation(l.getInitialLocation());
		fig.setSize(l.getXdimension(), l.getLifeLineYdimesion());
		fig.setFont(l.getFont());
		fig.setTextAndStyle(getModelElement().getName(), l.getYdimension());
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.NodeEditPart#getSourceConnectionAnchor(org.eclipse.gef.ConnectionEditPart)
	 */
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return getConnectionAnchor(connection);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.NodeEditPart#getSourceConnectionAnchor(org.eclipse.gef.Request)
	 */
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.NodeEditPart#getTargetConnectionAnchor(org.eclipse.gef.ConnectionEditPart)
	 */
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		if (connection.getSource() == connection.getTarget())
			return getSelfTargetConnectionAnchor(connection);
		return getConnectionAnchor(connection);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.NodeEditPart#getTargetConnectionAnchor(org.eclipse.gef.Request)
	 */
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return null;
	}
	
	private ConnectionAnchor getConnectionAnchor(ConnectionEditPart connection) {
		return new LifeLineAnchor(getFigure(), new Point(getFigure().getBounds().x + 
				getModelElement().getXdimension()/2, 
				((Message) connection.getModel()).getInitialLocation().y));
	}
	
	private ConnectionAnchor getSelfTargetConnectionAnchor(ConnectionEditPart connection) {
		return new LifeLineAnchor(getFigure(), new Point(getFigure().getBounds().x + 
				getModelElement().getXdimension()/2, 
				((Message) connection.getModel()).getInitialLocation().y + 
				((Message)connection.getModel()).getYdimension()));		
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#getModelSourceConnections()
	 */
	protected List getModelSourceConnections() {
		return ((LifeLine)getModel()).getSourceConnections();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#getModelTargetConnections()
	 */
	protected List getModelTargetConnections() {
		return ((LifeLine)getModel()).getTargetConnections();
	}
	
}
