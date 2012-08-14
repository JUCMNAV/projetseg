/*
 * Created on 24.02.2005
 */
package com.site.UCMScenarioViewer.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;

/**
 * @author Sasha
 *
 */
public class ActionFigure extends Figure {

	private Label label = new Label();
	
	/**
	 * Default constructor.
	 */
	public ActionFigure() {
		super();
	}
	
	public ActionFigure(String name) {
		label = new Label(name);
		label.setFont(getFont());
		setOpaque(true);
		LineBorder border = new LineBorder();
		border.setWidth(2);
		setBorder(border);
		add(label);
	}	

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.IFigure#paint(org.eclipse.draw2d.Graphics)
	 */
	public void paint(Graphics graphics) {
		label.setBounds(getBounds()); 
		super.paint(graphics);
	}
}
