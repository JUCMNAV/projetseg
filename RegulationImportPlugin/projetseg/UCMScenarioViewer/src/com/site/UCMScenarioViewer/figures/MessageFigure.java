/*
 * Created on 24.02.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.figures;

import java.util.ArrayList;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RelativeBendpoint;
import org.eclipse.draw2d.geometry.Dimension;

/**
 * @author Sasha
 *
 */
public class MessageFigure extends PolylineConnection {

	private Label label = new Label();
	private PolygonDecoration arrow;
	
	/**
	 * Default constructor.
	 */
	public MessageFigure() {
		super();
	}
	
	public MessageFigure(int lineWidth) {
		setConnectionRouter(new BendpointConnectionRouter());
		
		arrow = new PolygonDecoration();
		arrow.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		arrow.setScale(12,4.5);

		setLineWidth(lineWidth);
		setTargetDecoration(arrow);
		add(label);
	}
	
	public void setLabel(Label label) {
		if (!getChildren().isEmpty())
			remove(this.label);
		//removeAll();
		
		this.label = label;
		
		ConnectionEndpointLocator locator = new ConnectionEndpointLocator(this, false);
		locator.setVDistance(-3);

		add(label,locator);		
	}
	
	public void setBendingPoints() {
		ArrayList bendpoints = new ArrayList(); 
		RelativeBendpoint p1 = new RelativeBendpoint(this), p2 = new RelativeBendpoint(this);
		p1.setWeight(0); p2.setWeight(0);
		p1.setRelativeDimensions(new Dimension(-3*label.getTextBounds().height, 0), new Dimension(0,0));
		p2.setRelativeDimensions(new Dimension(-3*label.getTextBounds().height, 3*label.getTextBounds().height),
				new Dimension(0,0));
		bendpoints.add(p1); bendpoints.add(p2);
		setRoutingConstraint(bendpoints);
	}

}
