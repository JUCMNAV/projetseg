/*
 * Created on 15-May-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.model;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Image;

import com.site.UCMScenarioViewer.utils.DefaultFigureSize;
import com.site.UCMScenarioViewer.utils.Helper;

/**
 * @author oboyk022
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Condition extends DoElement {

	private String expression = ""; 
	
	/**
	 * 
	 */
	public Condition() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param owner
	 */
	public Condition(String id, String name, LifeLine owner) {
		super(id, name, owner);
	}
	
	public Condition(String id, String name, LifeLine owner,
			String expression) {
		super(id, name, owner);
		setExpression(expression);
	}
	
	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	public String getExpression() {
		return this.expression;
	}

	private static Image DOELEM_ICON_CONDITION = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_CONDITION));  //$NON-NLS-1$

	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getIconImage()
	 */
	public Image getIconImage() {
		return DOELEM_ICON_CONDITION;
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getInitialLocation()
	 */
	public Point getInitialLocation() {
		Point loc = super.getInitialLocation();
		Point ownerLoc = getOwner().getInitialLocation();
		loc.x = ownerLoc.x + getOwner().getXdimension()/2 + 1 - getXdimension()/2;
		return loc;
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getXdimension()
	 */
	public int getXdimension() {
		if (getWidth() < 0) {
			int maxX = getMaxLabel().getTextBounds().width;
			int standardX = getStandardLabel().getTextBounds().width;
			int labelX = getLabel().getTextBounds().width; 
			int dimX = 2*DefaultFigureSize.TEXT_PADDING;
			if (standardX < labelX) {
				if (maxX < labelX)
					dimX += maxX;
				else
					dimX += labelX;
			}
			else {
				if (labelX < 3*getYdimension()/2)
					dimX += 3*getYdimension()/2;
				else 
					dimX += labelX;
			}
			setWidth(dimX);
		}
		return getWidth();
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getYdimension()
	 */
	public int getYdimension() {
		if (getHeight() < 0) {
			int dimY = 0;
			dimY = getLabel().getTextBounds().height + 2*DefaultFigureSize.CONDITION_PADDING;
			setHeight(dimY);
		}
		return getHeight();
	}
}
