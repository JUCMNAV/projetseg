/*
 * Created on Feb 1, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.model;

import java.util.Collections;
import java.util.List;

import org.eclipse.swt.graphics.Image;

/**
 * @author oboyk022
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SequenceElement extends AbstractModelElement {
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SequenceElement() {}
	
	/**
	 * @param id
	 * @param name
	 */
	public SequenceElement(String id, String name) {
		super(id, name);
	}
	
	public List getChildren() {
		return Collections.EMPTY_LIST;
	}
	
	public boolean isVisible() {
		return ((Scenario)getParent()).isVisible();
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getXdimension()
	 */
	public int getXdimension() {
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getYdimension()
	 */
	public int getYdimension() {
		return 1;
	}
	
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getNumber()
	 */
	public int getNumber() {
		return getParent().getNumber() + number;
	}
		
	protected int getYcoordinate() {
		if (getY() < 0) {
			int coordinateY = getYSpacing()/*DefaultFigureSize.SPACING_Y*/;
			if (number == 0) {
				coordinateY += /*DefaultFigureSize.DIAGAM_PADDING_Y*/ getParent().getYcoordinate();
			}
			else {
				SequenceElement element = (SequenceElement)getParent().children.get(number-1);
				coordinateY += element.getYcoordinate() + element.getYdimension();
			}
			setY(coordinateY);
		}
		return getY();
	}
	
	/** 
	 * dummy method for implementing inherited abstract method from AbstractModelElement
	 * 
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getIconImage()
	 */
	public Image getIconImage() {
		return null;
	}
}
