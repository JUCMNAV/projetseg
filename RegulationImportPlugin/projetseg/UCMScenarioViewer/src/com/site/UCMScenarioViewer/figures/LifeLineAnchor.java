/*
 * Created on 04.03.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYAnchor;
import org.eclipse.draw2d.geometry.Point;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LifeLineAnchor extends XYAnchor {

	private IFigure owner;
	
	public LifeLineAnchor(IFigure f, Point p) {
		super(p);
		owner = f;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.ConnectionAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
	 */
	public Point getLocation(Point reference) {
		Point p = super.getLocation(reference).getCopy();
		owner.translateToAbsolute(p);
		return p;
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.ConnectionAnchor#getReferencePoint()
	 */
	public Point getReferencePoint() {
		return getLocation(null);
	}
}
