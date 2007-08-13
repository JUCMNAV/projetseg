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
		int rx=r.x;
		int ry=r.y;
		int rw=r.width;
		int rh=r.height;
		
		label.setText(name);
		label.setFont(getFont());
		int labelWidth = label.getTextBounds().width;

		setBounds(new Rectangle(rx + rw/2 - 3*rh/2 - 1 , ry, labelWidth + 2*DefaultFigureSize.TEXT_PADDING + 3*rh/2 + 1, rh));
		r = getBounds();
		
		label.setBounds(new Rectangle(r.x + 3*rh/2 + 1 + DefaultFigureSize.TEXT_PADDING, ry, labelWidth + DefaultFigureSize.TEXT_PADDING, rh));

		line = new Polyline();
		line.addPoint(new Point(r.x + 3*rh/8, r.y + rh/2));
		line.addPoint(new Point(r.x + 3*rh/2, r.y + rh/2));

		fig = new Polygon();
		fig.addPoint(new Point(r.x, r.y));
		fig.addPoint(new Point(r.x + 3*rh/4, r.bottom()));
		fig.addPoint(new Point(r.x, r.bottom()));
		fig.addPoint(new Point(r.x + 3*rh/4, r.y));
		fig.setLineWidth(3);
		
		add(line);
		add(fig);
		add(label);
	}
	
}
