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
		setBounds(new Rectangle(r.x, r.y, r.width/2, r.height));
		r = getBounds();
		
		label.setText(name);
		label.setFont(getFont());
		label.setBounds(new Rectangle(r.x + DefaultFigureSize.TEXT_PADDING, 
				r.y, r.width - r.height - DefaultFigureSize.TEXT_PADDING, r.height));
		
		msg = new Polyline(); 
		msg.addPoint(new Point(r.right(), r.y));
		msg.addPoint(new Point(r.right() - r.height, r.y));
		msg.addPoint(new Point(r.right() - r.height, r.bottom() - arrow.getSize().height/2 -1));
		msg.addPoint(new Point(r.right(), r.bottom() - arrow.getSize().height/2 -1));
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
