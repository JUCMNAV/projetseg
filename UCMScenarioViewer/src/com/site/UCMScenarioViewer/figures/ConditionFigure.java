/*
 * Created on 25.02.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConditionFigure extends Figure {

	private Label label = new Label();
	private Polygon polygon = new Polygon();
	
	/**
	 * Default constructor.
	 */
	public ConditionFigure() {
		super();
		add(label);
		add(polygon);
	}
	
	public void setPolygon(String expression) {
		remove(label);
		remove(polygon);
		
		Rectangle r = getBounds();
		
		label.setText(expression);
		label.setBounds(r);
		label.setFont(getFont());
		
		polygon = new Polygon();
		polygon.addPoint(new Point(r.x, r.y + r.height/2));
		polygon.addPoint(new Point(r.x + r.height/3, r.y));
		polygon.addPoint(new Point(r.right() - 1 - r.height/3, r.y));
		polygon.addPoint(new Point(r.right() - 1, r.y + r.height/2));
		polygon.addPoint(new Point(r.right() - 1 - r.height/3, r.bottom() - 1 ));
		polygon.addPoint(new Point(r.x + r.height/3, r.bottom() - 1));
		polygon.setLineWidth(2);

		add(polygon);
		add(label);
		
	}
	
}
