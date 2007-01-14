/*
 * Created on Feb 1, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.model;

import java.util.Collections;
import java.util.List;

/**
 * @author oboyk022
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class DoElement extends SequenceElement {
	
	private LifeLine owner;

	public DoElement() {}
	
	/**
	 * @param id
	 * @param name
	 */
	public DoElement(String id, String name, LifeLine owner) {
		super(id, name);
		this.owner = owner;
		owner.addChild(this);
	}
		
	public void setOwner(LifeLine owner) {
		this.owner = owner;
		owner.addChild(this);
	}
	
	public LifeLine getOwner() {
		return owner;
	}

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getChildren()
	 */
	public List getChildren() {
		return Collections.EMPTY_LIST;
	}

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getXdimension()
	 */
/*	public int getXdimension() {
		if (getWidth() < 0) {
			int maxX = getMaxLabel().getTextBounds().width;
			int standardX = getStandardLabel().getTextBounds().width;
			int labelX = getLabel().getTextBounds().width; 
			int dimX = 2*DefaultFigureSize.TEXT_PADDING;
			if (type == DoType.ACTION || type == DoType.START_END_ACTION) {
				if (labelX + dimX > getYdimension()) {
					if (maxX < labelX)
						dimX += maxX;
					else
						dimX += labelX;
				}
				else
					dimX = getYdimension();
			}
			else if (type == DoType.RESET_TIMER || type == DoType.SET_TIMER
					|| type == DoType.TIME_OUT) {
				if (labelX + 2*getYdimension() <= maxX/2) {
					dimX += labelX + 2*getYdimension();
				}
				else {
					dimX += maxX/2;
				}
				dimX *= 2;
			}
			else if (type == DoType.START_END_MSG) {
				if (labelX + getYdimension() <= maxX/2) {
						dimX += labelX + getYdimension();
				}
				else {
					dimX += maxX/2;
				}
				dimX *= 2;
			}
			else if (type == DoType.CONDITION) {
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
			}
			setWidth(dimX);
		}
		return getWidth();
	}
*/	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getYdimension()
	 */
/*	public int getYdimension() {
		if (getHeight() < 0) {
			int dimY = 0;
			if (type == DoType.ACTION || type == DoType.START_END_ACTION) {
				dimY = getLabel().getTextBounds().height + 2*DefaultFigureSize.ACTION_PADDING;
			}
			else if (type == DoType.RESET_TIMER || type == DoType.SET_TIMER
					|| type == DoType.TIME_OUT) {
				dimY = getLabel().getTextBounds().height * 2;
			}
			else if (type == DoType.START_END_MSG)
				dimY = getLabel().getTextBounds().height * 3;
			else if (type == DoType.CONDITION) {
				dimY = getLabel().getTextBounds().height + 2*DefaultFigureSize.CONDITION_PADDING;
			}
			setHeight(dimY);
		}
		return getHeight();
	}
*/	
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getInitialLocation()
	 */
/*	public Point getInitialLocation() {
		Point loc = super.getInitialLocation();
		Point ownerLoc = getOwner().getInitialLocation();
		if (type == DoType.CONDITION || type == DoType.ACTION) {
			loc.x = ownerLoc.x + getOwner().getXdimension()/2 + 1 - getXdimension()/2;
		}
		else {
			loc.x = ownerLoc.x + getOwner().getXdimension()/2 + 1 - getXdimension()/2;
		}
		//loc.y += ownerLoc.y + getOwner().getYdimension() - DefaultFigureSize.DIAGAM_PADDING_Y + 1;
		return loc;
	}
*/	
	/**
	 * assigns a particular icon to a certain DoElement
	 * 
	 * @see com.site.UCMScenarioViewer.Helper
	 * 
	 * @return
	 */
/*	public Image getIconImage() {
		
		Image icon = DOELEM_ICON_DEFAULT;
        switch( this.getType() ){
        case DoType.ACTION:				icon = DOELEM_ICON_ACTION; break;
        case DoType.START_END_MSG:		icon = DOELEM_ICON_START_END_MSG; break;
        case DoType.START_END_ACTION:	icon = DOELEM_ICON_START_END_ACTION; break;
        case DoType.SET_TIMER:			icon = DOELEM_ICON_SET_TIMER; break;
        case DoType.RESET_TIMER:		icon = DOELEM_ICON_RESET_TIMER; break;
        case DoType.TIME_OUT:			icon = DOELEM_ICON_TIME_OUT; break;
        case DoType.CONDITION: 			icon = DOELEM_ICON_CONDITION; break;
		}
        return icon;
    }
	
	private static Image DOELEM_ICON_ACTION = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_ACTION));  //$NON-NLS-1$
	private static Image DOELEM_ICON_START_END_MSG = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_START_END_MSG));  //$NON-NLS-1$
	private static Image DOELEM_ICON_START_END_ACTION = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_START_END_ACTION));  //$NON-NLS-1$
	private static Image DOELEM_ICON_SET_TIMER = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_SET_TIMER));  //$NON-NLS-1$
	private static Image DOELEM_ICON_RESET_TIMER = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_RESET_TIMER));  //$NON-NLS-1$
	private static Image DOELEM_ICON_TIME_OUT = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_TIME_OUT));  //$NON-NLS-1$
	private static Image DOELEM_ICON_CONDITION = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_CONDITION));  //$NON-NLS-1$
	private static Image DOELEM_ICON_DEFAULT = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_DEFAULT));  //$NON-NLS-1$
*/	
}
