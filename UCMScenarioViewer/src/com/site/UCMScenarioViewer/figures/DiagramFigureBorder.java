/*
 * Created on 14.02.2005
 *
 */
package com.site.UCMScenarioViewer.figures;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author Sasha
 *
 */
public class DiagramFigureBorder extends AbstractBorder {

	protected static Insets insets;
	//private String name;
	private Label label = new Label();

	/**
	 * Default constructor.
	 */
	public DiagramFigureBorder() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Border#getInsets(org.eclipse.draw2d.IFigure)
	 */
	public Insets getInsets(IFigure figure) {
		return insets;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Border#paint(org.eclipse.draw2d.IFigure, org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
	 */
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		Rectangle r = figure.getBounds().getCropped(insets);
		label.setSize(r.width, label.getTextBounds().height);
		label.setLocation(new Point(r.x,r.y));
		label.paint(graphics);
	}
	
	public void setLabel(Label label) {
		this.label = label;
		insets = new Insets(label.getBounds().height + 2, 1, 1, 1 );
	}

}
