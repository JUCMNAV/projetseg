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
 */
public class StartEndMessage extends DoElement {

    private static final long serialVersionUID = 1L;

	public StartEndMessage() {
		super();
	}

	public StartEndMessage(String id, String name, LifeLine owner) {
		super(id, name, owner);
	}
	
	private static Image DOELEM_ICON_START_END_MSG = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_START_END_MSG));  //$NON-NLS-1$

	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getIconImage()
	 */
	public Image getIconImage() {
		return DOELEM_ICON_START_END_MSG;
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
			int labelX = getLabel().getTextBounds().width; 
			int dimX = 2*DefaultFigureSize.TEXT_PADDING;
			if (labelX <= maxX/2) {
					dimX += labelX;
			}
			else {
				dimX += maxX/2;
			}
			dimX *= 2;
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
			dimY = getLabel().getTextBounds().height * 2;
			setHeight(dimY);
		}
		return getHeight();
	}
}
