/*
 * Created on 02.03.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.figures;


import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
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
public class StartEndFigure extends Figure {

	private Polyline msg = new Polyline();
	private Label label = new Label();
	private PolygonDecoration arrow = new PolygonDecoration();
	
	/**
	 * Default constructor.
	 */
	public StartEndFigure() {
		super();
		setDecoration();
		add(label);
		add(msg);
	}
	
	public void setStartEndMsg(String name) {
		removeAll();
		
		Rectangle r = getBounds();
		int rx=r.x;
		int ry=r.y;
		int rw=r.width;
		int rh=r.height;
		
		label.setText(name);
		label.setFont(getFont());
		int labelWidth = label.getTextBounds().width;

		setBounds(new Rectangle(rx + rw/2 - rh - 1 , ry, labelWidth + 2*DefaultFigureSize.TEXT_PADDING + rh + 1, rh));
		r = getBounds();
		
		label.setBounds(new Rectangle(r.x + rh + 1 + DefaultFigureSize.TEXT_PADDING, ry, labelWidth + DefaultFigureSize.TEXT_PADDING, rh));
		
		msg = new Polyline(); 
		msg.addPoint(new Point(r.x + r.height, r.y));
		msg.addPoint(new Point(r.x, r.y));
		msg.addPoint(new Point(r.x, r.bottom() - arrow.getSize().height/2 -1));
		msg.addPoint(new Point(r.x + r.height, r.bottom() - arrow.getSize().height/2 -1));
		msg.setLineWidth(DefaultFigureSize.MESSAGE_THICKNESS);
				
		arrow.setLocation(msg.getEnd());

		add(label);
		add(msg);
		add(arrow);
	}
	
	private void setDecoration() {
		arrow.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		arrow.setScale(12,4.5);
	}

}
