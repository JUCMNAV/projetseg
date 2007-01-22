/*
 * Created on 15-May-2005
 */
package com.site.UCMScenarioViewer.model;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Image;

import com.site.UCMScenarioViewer.utils.DefaultFigureSize;
import com.site.UCMScenarioViewer.utils.Helper;



/**
 * Implementation of MSC action model elements
 */
public class Action extends DoElement {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
	 * Default constructor.
	 */
	public Action() {
		super();
	}

	/**
	 * Constructor
	 * @param id - action's id
	 * @param name - action's name
	 * @param owner - parent model element
	 */
	public Action(String id, String name, LifeLine owner) {
		super(id, name, owner);
	}
		
	/**
	 * <code>Image</code> Icon for action model element
	 * Comment for <code>DOELEM_ICON_ACTION</code>
	 */
	private static Image DOELEM_ICON_ACTION = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_ACTION));  //$NON-NLS-1$

	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getIconImage()
	 */
	public Image getIconImage() {
		return DOELEM_ICON_ACTION;
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
			// Width has not been set, so it needs to be calculated and set
			int maxX = getMaxLabel().getTextBounds().width;
			//int standardX = getStandardLabel().getTextBounds().width;
			int labelX = getLabel().getTextBounds().width; 
			int dimX = 2*DefaultFigureSize.TEXT_PADDING;
			if (labelX + dimX > getYdimension()) {
				if (maxX < labelX)
					dimX += maxX;
				else
					dimX += labelX;
			}
			else
				dimX = getYdimension();
			setWidth(dimX);
		}
		return getWidth();
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getYdimension()
	 */
	public int getYdimension() {
		if (getHeight() < 0) {
			// Height has not been set, hence calculate and set it.
			int dimY = 0;
			// Height = Height of the label's text + padding from the top and bottom.
			dimY = getLabel().getTextBounds().height + 2*DefaultFigureSize.ACTION_PADDING;
			setHeight(dimY);
		}
		return getHeight();
	}
}
