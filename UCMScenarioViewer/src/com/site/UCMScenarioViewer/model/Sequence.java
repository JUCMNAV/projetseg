/*
 * Created on Feb 1, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.swt.graphics.Image;

import com.site.UCMScenarioViewer.utils.Helper;

/**
 * @author oboyk022
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Sequence extends AbstractModelElement {
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    public Sequence() {}
	
	/**
	 * @param id
	 * @param name
	 */
	public Sequence(String id, String name) {
		super(id, name);
	}
		
	public SequenceElement getSequenceElement(int i) {
		if (i<0 || i>=children.size())
			return null;
		return (SequenceElement) children.get(i);
	}
		
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#addChild(java.lang.Object)
	 */
	public void addChild(Object child) {
		if (child instanceof SequenceElement) {
			super.addChild(child);
			((SequenceElement)child).setNumber(children.size() - 1);
			((SequenceElement)child).setParent(this);
		}
	}
	
	public boolean isVisible() {
		return ((Scenario)getParent()).isVisible();
	}
	
	public int getSequenceElementNumber() {
		int number = 0;
		for (int i=0; i<children.size(); i++) {
			if (children.get(i) instanceof ParallelSequence) {
				number += ((ParallelSequence)children.get(i)).getSequenceElementNumber();
			}
			else {
				number++;
			}
		}
		return number;
	}

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getXdimension()
	 */
	public int getXdimension() {
		if (getWidth() < 0) {
			setWidth( getScenarioOwner().getLifeLinesSpan() );
/*			if (getParent() instanceof Scenario) {
				setWidth(((Scenario)getParent()).getLifeLinesSpan());
			}
			else {
				setWidth(((AbstractModelElement)getParent()).getXdimension());
			}
*/		}
		return getWidth();
	}

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getYdimension()
	 */
	public int getYdimension() {
		int dimY = getHeight();
		
		if (dimY >= 0)
			return dimY;
		
		dimY = getYSpacing()/*DefaultFigureSize.SPACING_Y*/;
		for (int i=0; i<children.size(); i++) {
			dimY+=getYSpacing()/*DefaultFigureSize.SPACING_Y*/ 
			+ ((AbstractModelElement)children.get(i)).getYdimension(); 
		}
		setHeight(dimY);
		return dimY;
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getNumber()
	 */
	public int getNumber() {
		return getParent().getNumber() + number;
	}
	
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getXcoordinate()
	 */
	protected int getXcoordinate() {
		int coordinate = getX(); 
		
		if (coordinate>=0)
			return coordinate;
		
		Scenario scenario = getScenarioOwner();
		LifeLine l = (LifeLine)scenario.getChildren().get(0);
		coordinate = l.getXcoordinate();

		setX(coordinate);
		return coordinate;
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getYcoordinate()
	 */
	protected int getYcoordinate() {
		int coordinate = getY(); 
		
		if (coordinate >= 0)
			return coordinate;
		
		if (getParent() instanceof Scenario) {
			Scenario scenario = (Scenario) getParent();
			LifeLine l = (LifeLine)scenario.getChildren().get(0);
			coordinate = l.getYcoordinate() + l.getYdimension();
		}
		else {
			ParallelSequence par = (ParallelSequence)getParent();
			if (number == 0) {
				coordinate = par.getYcoordinate();
			}
			else {
				Sequence seq = (Sequence) par.getTreeChildren().get(number-1);
				coordinate = seq.getYcoordinate() + seq.getYdimension();
			}
		}
		setY(coordinate);
		return coordinate;
	}
		
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getViewChildren()
	 */
	public List getViewChildren() {
		ArrayList list = new ArrayList();
		Iterator i = getChildren().iterator();
		while (i.hasNext()) {
			Object element = i.next();
			if (element instanceof ParallelSequence)
				list.add(element);
		}
		return list;
	}
	
	private Scenario getScenarioOwner() {
		AbstractModelElement element = getParent();
		while (!(element instanceof Scenario))
				element = element.getParent();
		return (Scenario) element;
	}
	
	/**
	 * assigns an icon to this Sequence in the Outline View of Eclipse IDE
	 * 
	 * @see com.site.UCMScenarioViewer.utils.Helper
	 * 
	 * @return  image of an icon
	 */
	public Image getIconImage() {
			return SEQ_ICON;
		}
	
	private static Image SEQ_ICON = new Image(null,	
			Sequence.class.getResourceAsStream(Helper.ICON_OUTLINE_SEQUENCE));  //$NON-NLS-1$

}
