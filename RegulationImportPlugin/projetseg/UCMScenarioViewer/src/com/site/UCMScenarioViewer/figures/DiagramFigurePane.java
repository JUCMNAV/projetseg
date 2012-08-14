/*
 * Created on 14.02.2005
 *
 */
package com.site.UCMScenarioViewer.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformViewport;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;

/**
 * @author Sasha
 *
 */
public class DiagramFigurePane extends Figure implements HandleBounds {
	
	private IFigure pane;

	/**
	 * Default constructor.
	 */
	public DiagramFigurePane() {
		setBorder(new DiagramFigureBorder());
		ScrollPane scrollpane = new ScrollPane();
		pane = new FreeformLayer();
		pane.setLayoutManager(new XYLayout());
		setLayoutManager(new StackLayout());
		add(scrollpane);
		scrollpane.setViewport(new FreeformViewport());
		scrollpane.setContents(pane);

		setOpaque(true);
	}

	public IFigure getContentsPane(){
		return pane;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.handles.HandleBounds#getHandleBounds()
	 */
	public Rectangle getHandleBounds() {
		return getBounds().getCropped(new Insets(20,10,1,1));
	}
	
	/**
	 * @see org.eclipse.draw2d.Figure#paintFigure(Graphics)
	 */
	protected void paintFigure(Graphics graphics) {
		Rectangle rect = getBounds().getCopy();
		rect.crop(new Insets(20,10,1,1));
		graphics.fillRectangle(rect);
	}
	
	public void setLabel(Label label) {
		((DiagramFigureBorder)getBorder()).setLabel(label);
	}

	protected boolean useLocalCoordinates(){return true;}

}
