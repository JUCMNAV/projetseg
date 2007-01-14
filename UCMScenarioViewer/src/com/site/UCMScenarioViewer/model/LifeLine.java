/*
 * Created on 31.01.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Image;

import com.site.UCMScenarioViewer.utils.DefaultFigureSize;
import com.site.UCMScenarioViewer.utils.Helper;
import com.site.UCMScenarioViewer.utils.Properties;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LifeLine extends AbstractModelElement {
	
	private ArrayList sourceConnections = new ArrayList();
	private ArrayList targetConnections = new ArrayList(); 
	
	public LifeLine() {}

	/**
	 * @param id
	 * @param name
	 */
	public LifeLine(String id, String name) {
		super(id, name);
	}
		
	public boolean isVisible() {
		return ((Scenario)getParent()).isVisible();
	}
	
	public int getXdimension() {
		if (getWidth()<0) {
			int labelX = getLabel().getTextBounds().width;
			int standardX = getStandardLabel().getTextBounds().width;
			int maxX = getMaxLabel().getTextBounds().width;
			int dimX = 2*DefaultFigureSize.TEXT_PADDING;
			if (labelX <= standardX) {
				setWidth(standardX + dimX);
			}
			else if (labelX > maxX) {
				setWidth(maxX + dimX);
			}
			else {
				setWidth(labelX + dimX);
			}
			setWidth(Math.max(getWidth(), getChildMaxXDimension()));
		}
		return getWidth();
	}
	
	private int getChildMaxXDimension() {
		int maxDimX = 0;
		for (int i=0; i<children.size(); i++) {
			int dimX = ((AbstractModelElement)children.get(i)).getXdimension();
			if ( maxDimX < dimX)
				maxDimX = dimX; 
		}
		return maxDimX;
	}
	
	public int getYdimension() {
		if (getHeight()<0)
			setHeight(getLabel().getTextBounds().height + 2*DefaultFigureSize.LIFELINE_PADDING);
		return getHeight();
	}
	
	public Point getInitialLocation() {
		return new Point(getXcoordinate(), getYcoordinate());
	}
	
	protected int getXcoordinate() {
		if (getX()<0) {
			int coordinate = 0;
			Scenario scenario = (Scenario) getParent();
			if (number != 0) {
				LifeLine prevLifeline = (LifeLine) ((ArrayList)scenario.children.get(Scenario.LIFELINES)).get(number - 1);
				coordinate += prevLifeline.getXcoordinate() + prevLifeline.getXdimension() + DefaultFigureSize.SPACING_X;
			}
			else {
				coordinate = (scenario.getXdimension() - scenario.getLifeLinesSpan())/2;
			}
			setX(coordinate);
		}
		return getX(); 
	}
	
	protected int getYcoordinate() {
		if (getY()<0)
			setY(getYSpacing());
		return getY();
	}
	
	public List getSourceConnections() {
		return sourceConnections;
	}
	
	public List getTargetConnections() {
		return targetConnections;
	}
	
	public void addSourceConncetion(Message m) {
		if (sourceConnections == null) {
			sourceConnections = new ArrayList();
		}
		sourceConnections.add(m);
	}
	
	public void addTargetConncetion(Message m) {
		if (targetConnections == null) {
			targetConnections = new ArrayList();
		}
		targetConnections.add(m);
	}
	
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getTreeChildren()
	 */
	public List getTreeChildren() {
		return Collections.EMPTY_LIST;
	}
	
	public int getLifeLineYdimesion() {
		if (getParent().children.get(Scenario.SEQUENCE) == null)
			return getYdimension() + DefaultFigureSize.LIFELINE_TAIL_HEIGHT;
		Sequence seq = (Sequence) getParent().children.get(Scenario.SEQUENCE);
		return seq.getYdimension() + getYdimension() + DefaultFigureSize.LIFELINE_TAIL_HEIGHT; 
	}
	
	

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#invalidateCoordinates()
	 */
	protected void invalidateCoordinates() {
		super.invalidateCoordinates();
		invalidateConnections();
	}

	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#invalidateDimensions()
	 */
	protected void invalidateDimensions() {
		super.invalidateDimensions();
		invalidateConnections();
	}
	
	private void invalidateConnections() {
		Iterator i = getSourceConnections().iterator();
		while (i.hasNext()) {
			((Message)i.next()).invalidateSource();
		}
		i = getTargetConnections().iterator();
		while (i.hasNext()) {
			((Message)i.next()).invalidateTarget();
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#fireRefreshEvent()
	 */
	protected void fireRefreshEvent() {
		super.fireRefreshEvent();
		Iterator i = getSourceConnections().iterator();
		while (i.hasNext()) {
			((Message)i.next()).firePropertyChange(Properties.ID_REFRESH_SOURCE, null, null);
		}
		i = getTargetConnections().iterator();
		while (i.hasNext()) {
			((Message)i.next()).firePropertyChange(Properties.ID_REFRESH_TARGET, null, null);
		}
	}
	/**
	 * assigns an icon to this LifeLine in the Outline View of Eclipse IDE
	 * @see Helper
	 */
	private static Image AND_ICON = new Image(null,	
			LifeLine.class.getResourceAsStream(Helper.ICON_OUTLINE_LIFELINE));  //$NON-NLS-1$

	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#getIconImage()
	 */
	public Image getIconImage() {
		return AND_ICON;
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMScenarioViewer.model.AbstractModelElement#applyFont(java.lang.String, int, int)
	 */
	protected void applyFont(String name, int size, int style) {
		super.applyFont(name, size, style);
		Iterator i = getSourceConnections().iterator();
		while (i.hasNext()) {
			((Message)i.next()).applyFont(name, size, style);
		}		
	}
}
