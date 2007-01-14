/*
 * Checks if number of sequences passed is >= 2 
 * that is, should the OM catch the fact that there are less than two PARs 
 * passed to it and prevent it from being displayed (because there is a chance of parser
 * not parsing the file correctly), or should there be no check because the image must 
 * be displayed regardless, since the file parsed might already be incorrect?
 * 
 * Created on Feb 1, 2005
 *
 */
package com.site.UCMScenarioViewer.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.swt.graphics.Image;

import com.site.UCMScenarioViewer.utils.Helper;
import com.site.UCMScenarioViewer.utils.DefaultFigureSize;

/**
 * @author oboyk022
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ParallelSequence extends SequenceElement {
	
	public ParallelSequence() {}
	
	/**
	 * @param id
	 * @param name
	 */
	public ParallelSequence(String id, String name) {
		super(id, name);
	}
	
	public boolean addSequences(ArrayList sequences) {
		int i=0;
		for (; i<children.size() && children.get(i) instanceof Sequence; i++);
		if (i!=children.size() || i<2)
			return false;
		this.children = sequences;
		return true;
	}
	
	public void addChild(Object child) {
		if (child instanceof Sequence)
			addSequence((Sequence)child);
	}
	
	private void addSequence(Sequence sequence) {
		if (children == null) {
			children = new ArrayList();
		}
		children.add(sequence);
		sequence.setNumber(children.size()-1);
		sequence.setParent(this);
	}
	
	public Sequence getSequence(int i) {
		if (i<0 || i>=children.size())
			return null;
		return (Sequence) children.get(i);
	}
	
	public List getChildren() {
		return children;
	}
	
	public int getSequenceElementNumber() {
		int number = 0;
		for (int i=0; i<children.size(); i++) {
			number += ((Sequence)children.get(i)).getSequenceElementNumber();
		}
		return number;
	}

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getXdimension()
	 */
	public int getXdimension() {
		if (getWidth() < 0) {
			List childrenList = getViewChildren();
		
			int dimX = 2*getLabelWidth();
		
			if (childrenList.isEmpty()) {
				dimX += getParent().getXdimension();
			}
			else {
				int maxDim = 0;
				Iterator i = childrenList.iterator();
				while (i.hasNext()) {
					int currentDim = ((ParallelSequence)i.next()).getXdimension();
					if (currentDim > maxDim)
						maxDim = currentDim;
				}
				dimX += maxDim;
			}
			setWidth(dimX);
		}
		return getWidth();
	}
	
	public int getLabelWidth() {
		int maxX = getMaxLabel().getTextBounds().width;
		int labelX = getLabel().getTextBounds().width;
		int standardX = getStandardLabel().getTextBounds().width;
		if (labelX < standardX/2)
			return standardX/2 + 2*DefaultFigureSize.TEXT_PADDING;
		else if (labelX < maxX)
			return labelX + 2*DefaultFigureSize.TEXT_PADDING;
		else
			return maxX + 2*DefaultFigureSize.TEXT_PADDING;		
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getYdimension()
	 */
	public int getYdimension() {
		if (getHeight() < 0) {
			int dimY = 0;
			
			if (getChildren().isEmpty()) {
				setHeight(2*getLabel().getTextBounds().height);
				return getHeight();
			}
			
			Iterator i = getChildren().iterator();
			while (i.hasNext()) {
				Object element = i.next();
				if (element instanceof AbstractModelElement) {
					dimY += ((AbstractModelElement)element).getYdimension();
				}
			}
			setHeight(dimY);
		}
		return getHeight();
	}
	
	private int totalNumberOfSequenceElements() {
		int totalNumber = 0;
		for (int i=0; i<children.size(); i++) {
			Sequence s = (Sequence) children.get(i);
			totalNumber += s.children.size();
		}
		return totalNumber;
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getViewChildren()
	 */
	public List getViewChildren() {
		ArrayList list = new ArrayList();
		Iterator i = getChildren().iterator();
		while (i.hasNext()) {
			Object element = i.next();
			if (element instanceof Sequence) {
				Iterator j = ((Sequence)element).getViewChildren().iterator();
				while (j.hasNext()) {
					list.add(j.next());
				}
			}
		}
		return list;
	}
	
	public List getSplitPoints() {
		ArrayList list = new ArrayList();
		Iterator i = getChildren().iterator();
		i.next(); // start from second child always.
		while (i.hasNext()) {
			list.add(new Integer( ((Sequence)i.next()).getYcoordinate() - getYcoordinate()));
		}
		return list;
	}
	
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getXcoordinate()
	 */
	protected int getXcoordinate() {
		if (getX() < 0) {
			List nestedPars = getViewChildren();
			if (nestedPars.isEmpty()) {
				setX(getParent().getXcoordinate() - getLabelWidth());
			}
			else {
				Iterator i = nestedPars.iterator();
				int coordinateX = ((AbstractModelElement)i.next()).getXcoordinate();
				while (i.hasNext()) {
					int currentX = ((AbstractModelElement)i.next()).getXcoordinate();
					if (currentX < coordinateX)
						coordinateX = currentX;
				}
				setX(coordinateX - getLabelWidth());
			}
		}
		return getX();
	}

	/**
	 * assigns an icon to this ParallelSequence in the Outline View of Eclipse IDE
	 * 
	 * @see com.site.UCMScenarioViewer.utils.Helper
	 * 
	 * @return image of an icon
	 */
	public Image getIconImage() {
		return PAR_SEQ_ELEM_ICON;
	}
	
	private static Image PAR_SEQ_ELEM_ICON = new Image(null,	
			SequenceElement.class.getResourceAsStream(Helper.ICON_OUTLINE_PAR_SEQUENCE));  //$NON-NLS-1$
		
	
}
