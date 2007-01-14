/*
 * Created on 02.03.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.figures;

import org.eclipse.draw2d.PolygonDecoration;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TimeoutFigure extends ResetTimerFigure implements ITimerFigure{

	/**
	 * Default constructor.
	 */
	public TimeoutFigure() {
		super();
	}
	
	

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.figures.ResetTimerFigure#setPolylines(java.lang.String)
	 */
	public void setPolylines(String name) {
		super.setPolylines(name);

		PolygonDecoration arrow;
		
		arrow = new PolygonDecoration();
		arrow.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		arrow.setScale(12,4.5);

		arrow.setLocation(getLineSegment().getEnd());		
		add(arrow);
	}
}
