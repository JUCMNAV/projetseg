/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class NodeFigure extends Ellipse {
	
	protected EllipseAnchor incomingAnchor;
	protected EllipseAnchor outgoingAnchor;
	protected Label label;
	protected XYLayout layout;

	public NodeFigure(){
		layout = new XYLayout();
		this.setLayoutManager(layout);
		
		incomingAnchor = new EllipseAnchor(this);
		outgoingAnchor = new EllipseAnchor(this);
		label = new Label(" ");
		add(label);
	}
	
	public void setId(String id){
		label.setText(id);
	}
	
	public void validate(){
		int loc = Math.max(label.getSize().width, label.getSize().height)/2 + 2;
		layout.setConstraint(label, new Rectangle(loc,loc,-1,-1));
		super.validate();
	}
	
	public EllipseAnchor getSourceConnectionAnchor(){
		return outgoingAnchor;
	}
	public EllipseAnchor getTargetConnectionAnchor(){
		return incomingAnchor;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.IFigure#getMinimumSize(int, int)
	 */
	public Dimension getMinimumSize(int wHint, int hHint) {
		return getPreferredSize();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.IFigure#getPreferredSize(int, int)
	 */
	public Dimension getPreferredSize(int wHint, int hHint) {
		int diam = Math.max(label.getSize().width, label.getSize().height) + 10;
		return new Dimension(diam, diam);
	}
}
