/*
 * Created on 2005-02-15
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * Created 2005-02-15
 * 
 * @author Etienne Tremblay
 */
public class EndPointFigure extends NodeFigure {

	/**
	 * 
	 */
	public EndPointFigure() {
		super();
		// TODO Auto-generated constructor stub
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
		return new Dimension(20, 20);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
	 */
	public void paintFigure(Graphics g) {
		Rectangle r = getBounds().getCopy();
		Point c = r.getCenter();
		g.setBackgroundColor(new Color(null, 0, 0, 0));
		g.setLineWidth(2);
		g.drawLine(r.x, c.y, r.x+20, c.y);
		g.setLineWidth(5);
		g.drawLine(r.x+17, r.y, r.x+17, r.y+20);
	}
}
