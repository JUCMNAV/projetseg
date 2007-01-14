/*
 * Created on 15-May-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.model;

import org.eclipse.swt.graphics.Image;

import com.site.UCMScenarioViewer.utils.Helper;

/**
 * @author oboyk022
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TimeOut extends SetTimer {

	/**
	 * 
	 */
	public TimeOut() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param owner
	 */
	public TimeOut(String id, String name, LifeLine owner) {
		super(id, name, owner);
	}
	
	private static Image DOELEM_ICON_TIME_OUT = new Image(null, DoElement.class.getResourceAsStream(Helper.ICON_OUTLINE_TIME_OUT));  //$NON-NLS-1$

	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getIconImage()
	 */
	public Image getIconImage() {
		return DOELEM_ICON_TIME_OUT;
	}
}
