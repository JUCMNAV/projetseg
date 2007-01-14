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
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import com.site.UCMScenarioViewer.utils.DefaultFigureSize;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SetTimerFigure extends Figure implements ITimerFigure {
	
	private Label label = new Label();
	private Polyline line = new Polyline();
	private Polygon fig = new Polygon();

	/**
	 * Default constructor.
	 */
	public SetTimerFigure() {
		super();
		add(label);
		add(line);
		add(fig);
	}
	
	public void setPolylines(String name) {
		removeAll();
		
		Rectangle r = getBounds();
		setBounds(new Rectangle(r.x, r.y, r.width/2, r.height));
		r = getBounds();

		label.setFont(getFont());
		label.setText(name);
		int labelY = label.getTextBounds().height;
		label.setBounds(new Rectangle(r.x + DefaultFigureSize.TEXT_PADDING, 
				r.y, r.width - 2*r.height - DefaultFigureSize.TEXT_PADDING, r.height));

		line = new Polyline();
		line.addPoint(new Point(r.right() -  3*(2*r.height)/4, r.y + r.height/2));
		line.addPoint(new Point(r.right(), r.y + r.height/2));

		fig = new Polygon();
		fig.addPoint(new Point(r.right() - 2*r.height, r.y));
		fig.addPoint(new Point(r.right() - r.height, r.bottom()));
		fig.addPoint(new Point(r.right() - 2*r.height, r.bottom()));
		fig.addPoint(new Point(r.right() - r.height, r.y));
		fig.setLineWidth(3);
		
		add(line);
		add(fig);
		add(label);
	}
	
}
