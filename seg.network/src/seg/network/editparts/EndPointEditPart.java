/*
 * Created on 2005-02-15
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

import seg.network.figures.EndPointFigure;
import seg.network.model.network.EndPoint;
import seg.network.model.network.Node;

/**
 * Created 2005-02-15
 * 
 * @author Etienne Tremblay
 */
public class EndPointEditPart extends NetworkNodeEditPart {

	/**
	 * @param model
	 */
	public EndPointEditPart(Node model) {
		super(model);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		EndPointFigure figure = new EndPointFigure();
		return figure;
	}
	
	private EndPoint getEndPoint(){
		return (EndPoint)getModel();
	}
	
	private EndPointFigure getEndPointFigure(){
		return (EndPointFigure)getFigure();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		Point location = new Point(getEndPoint().getX(), getEndPoint().getY());  // The position of the current figure
		Dimension size = new Dimension(-1, -1);
		Rectangle bounds = new Rectangle(location, size);
		figure.setBounds(bounds);
		figure.validate(); // Make the label recenter itself.
		// notify parent container of changed position & location
		// if this line is removed, the XYLayoutManager used by the parent container 
		// (the Figure of the ShapesDiagramEditPart), will not know the bounds of this figure
		// and will not draw it correctly.
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure, bounds);
	}

}
