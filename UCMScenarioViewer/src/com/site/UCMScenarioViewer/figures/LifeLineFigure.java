/*
 * Created on 13-Feb-2005
 *
 */
package com.site.UCMScenarioViewer.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import com.site.UCMScenarioViewer.utils.DefaultFigureSize;

/**
 * @author oboyk022
 *
 */
public class LifeLineFigure extends Figure {

	private Label label = new Label();
	private Polygon headL = new Polygon();
	private Polygon tailL = new Polygon();
	private int headY;

	/**
	 * Default constructor.
	 */
	public LifeLineFigure() {
		super();
		add(tailL);
		add(headL);
		add(label);
	}
	
	public void setTextAndStyle(String name, int headY) {
		remove(headL);
		remove(tailL);
		remove(label);
		
		this.headY = headY;
		Rectangle r = getBounds();

		label.setText(name);
		label.setBounds(new Rectangle(r.x, r.y, r.width, headY));		
		label.setFont(getFont());

		headL = new Polygon();
		headL.addPoint(new Point(r.x, r.y));
		headL.addPoint(new Point(r.right(), r.y));
		headL.addPoint(new Point(r.right(), r.y + headY));
		headL.addPoint(new Point(r.x, r.y + headY));
		headL.setLineWidth(4);
		
		tailL = new Polygon();
		tailL.addPoint(new Point(r.x + r.width/4, r.bottom() - DefaultFigureSize.LIFELINE_TAIL_HEIGHT));
		tailL.addPoint(new Point(r.right() - r.width/4, r.bottom() - DefaultFigureSize.LIFELINE_TAIL_HEIGHT));
		tailL.addPoint(new Point(r.right() - r.width/4, r.bottom() - 1));
		tailL.addPoint(new Point(r.x + r.width/4, r.bottom() - 1));
		tailL.setFill(true);
		tailL.setBackgroundColor(ColorConstants.gray);
		
		add(tailL);
		add(headL);
		add(label);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.IFigure#paint(org.eclipse.draw2d.Graphics)
	 */
	public void paint(Graphics graphics) {
		graphics.drawLine(getBounds().x+getBounds().width/2,
				getBounds().y+headY,
				getBounds().x+getBounds().width/2,
				getBounds().bottom());
		super.paint(graphics);
	}
	
}
