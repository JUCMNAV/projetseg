/*
 * Created on 31.01.2005
 */
package com.site.UCMScenarioViewer.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import com.site.UCMScenarioViewer.utils.DefaultFigureSize;
import com.site.UCMScenarioViewer.utils.Properties;

/**
 * Root model class; containts basic functionality shared by all model elements.
 * 
 * @author Sasha
 *
 */
public abstract class AbstractModelElement implements Serializable, IPropertySource {
	
	/**
	 * Eement's Id
	 * Comment for <code>id</code>
	 */
	private String id;
	
	/**
	 * Element's Name
	 * Comment for <code>name</code>
	 */
	private String name;
	  
	/**
	 * Element's Font for its corresponding figure
	 * Comment for <code>font</code>
	 */
	protected String font = "";
	 
	/**
	 * Font size
	 * Comment for <code>fontSize</code>
	 */
	protected int fontSize = 12;
	 
	/**
	 * Font Style
	 * Comment for <code>fontStyle</code>
	 */
	protected int fontStyle = org.eclipse.swt.SWT.CANCEL;
	 
	/**
	 * Parent of this element
	 * Comment for <code>parent</code>
	 */
	private AbstractModelElement parent = null;
	 
	/**
	 * X coordinate of element's figure
	 * Comment for <code>x</code>
	 */
	private int x = -1;
	 
	/**
	 * Y coordinate of element's figure
	 * Comment for <code>y</code>
	 */
	private int y = -1;
	 
	/**
	 * Width of element's figure
	 * Comment for <code>width</code>
	 */
	private int width = -1;
	 
	/**
	 * Height of element's figure
	 * Comment for <code>height</code>
	 */
	private int height = -1;
	 
	/**
	 * All of element's children (visible and invisible)
	 * Comment for <code>children</code>
	 */
	protected ArrayList children;
	 
	/**
	 * Number of the element - number of lifeline or 
	 * number of an element in a sequence
	 * Comment for <code>number</code>
	 */
	protected int number;  
	
	/**
	 * Default constructor.
	 */
	public AbstractModelElement() {}
	
	/**
	 * Constructor
	 * @param id - element's <code>id</code> Id 
	 * @param name - element's <code>name</code> Name
	 */
	public AbstractModelElement(String id, String name) {
		this.id = id;
		this.name = name;
		children = new ArrayList();
	}
	
	/**
	 * Gets the Id of the model element
	 * @return an id of the element
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Gets the Name of the element
	 * @return element's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the draw2d label for this element - the figure for name of the
	 * element
	 * @return element's draw2d label for its name 
	 */
	public Label getLabel() {
		Label label = new Label(getName());
		label.setFont(getFont());
		return label;
	}
	
	/**
	 * Creates a Draw2D label with this model element's font, and the text from
	 * <code>String</code> DefaultFigureSize.STANDARD_COMPARING_STRING
	 * @see com.site.UCMScenarioViewer.utils.DefaultFigureSize.#STANDARD_COMPARING_STRING
	 * @return a draw2d label for element's name
	 */
	protected final Label getStandardLabel() {
		Label standard = new Label(DefaultFigureSize.STANDARD_COMPARING_STRING);
		standard.setFont(getFont());
		return standard;
	}
	
	/**
	 * Obtains the largest <code>org.eclipse.draw2d.Label</code> label figure possible
	 * @see #getStandardLabel
	 * @return the largest possible label
	 */
	protected final Label getMaxLabel() {
		Label max = new Label(DefaultFigureSize.MAXIMUM_COMPARING_STRING);
		max.setFont(getFont());
		return max;
	}

	
	/**
	 * Obtains the list of all children for this element
	 * @return <code>List</code> of element's children
	 */
	protected List getChildren() {
		if (children == null)
			return Collections.EMPTY_LIST;
		return children;
	}
	
	/**
	 * Obtains the list of children for this element that must be drawn in 
	 * the tree viewer
	 * @return <code>List<code> of children
	 */
	public List getTreeChildren() {
		return getChildren();
	}
	
	/**
	 * Obtains the list of children for this element that must be drawn in
	 * the main viewer
	 * @return <code>List</code> of children
	 */
	public List getViewChildren() {
		return getChildren();
	}
	
	/**
	 * Adds a child to this element
	 * @param child element to be added
	 */
	public void addChild(Object child) {
		if (children == null) {
			children = new ArrayList();
		}
		children.add(child);
	}
	
	/**
	 * Obtains the parent model element of this element
	 * @return the parent model element
	 */
	public AbstractModelElement getParent() {
		return parent;
	}
	
	/**
	 * Sets up the parent model element for this element
	 * @param parent an element that must become the parent of this element
	 */
	public void setParent(AbstractModelElement parent) {
		this.parent = parent;
	}
	
	/**
	 * Sets element's number @see number
	 * @param number an <code>int</code> that will be assigned to a number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * Obtains element's number
	 * @return <code>int</code> number of the element
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Obtains the coordinates of elemnt's figure 
	 * @return <code>org.eclipse.draw2d.Point</code> for the element's figure - 
	 * the coordibates of element's figure
	 */
	public Point getInitialLocation() {
		return new Point(getXcoordinate(), getYcoordinate());
	}
	
	/**
	 * Set's the x coordinate of element's figure
	 * @param x <code>int</code> number
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Sets the y coordinate of element's figure
	 * @param y <code>int</code> number
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Sets the width of element's figure
	 * @param width <code>int</code> number
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Sets the height of element's figure
	 * @param height <code>int</code> number
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Obtains the x coordinate of element's figure
	 * @return <code>int</code> number
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Obtains the y coordinate of element's figure
	 * @return <code>int</code> number
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Obtains the width of element's figure
	 * @return <code>int</code> number
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Obtains the height of element's figure
	 * @return <code>int</code> number
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Calculates the x coordinate of element's figure. Usually calculates
	 * sets the x coordinate and then returns it in most of the subclasses 
	 * @return <code>int</code> number
	 */
	protected int getXcoordinate() {
		return getX();
	}
	
	/**
	 * Calculates the y coordinate of element's figure. Usually calculates
	 * sets the y coordinate and then returns it in most of the subclasses 
	 * @return <code>int</code> number
	 */
	protected int getYcoordinate() {
		return getY();
	}

	/**
	 * Calculates the width of element's figure. Usually calculates
	 * sets the width and then returns it in most of the subclasses 
	 * @return <code>int</code> number
	 */
	abstract public int getXdimension();
	
	/**
	 * Calculates the height of element's figure. Usually calculates
	 * sets the height and then returns it in most of the subclasses 
	 * @return <code>int</code> number
	 */
	abstract public int getYdimension();

	/**
	 * Obtains element's icon for the tree viewer only in our case.
	 * @return <code>Image</code> icon
	 */
	public Image getIcon() {
		return getIconImage();
	}

	/**
	 * Obtains an element's respective icon. Since each element has its own
	 * icon the method must be implemented inside each element's class
	 * @return <code>org.eclipse.swt.graphics.Image</code> icon
	 */
	abstract public Image getIconImage();
			
	/**
	 * Invalidates coordinates of an element and all of its children.
	 */
	protected void invalidateCoordinates() {
		x = -1;
		y = -1;
		Iterator i = getChildren().iterator();
		while (i.hasNext())
			((AbstractModelElement)i.next()).invalidateCoordinates();
	}
	
	/**
	 * Invalidates coordinates and dimensions of an element and all of its children.
	 */
	protected void invalidateDimensions() {
		width = -1;
		height = -1;
		x = -1;
		y = -1;
		Iterator i = getChildren().iterator();
		while (i.hasNext())
			((AbstractModelElement)i.next()).invalidateDimensions();
	}
	
	/**
	 * Propagates refresh event from model to controller (edit parts).
	 */
	protected void fireRefreshEvent() {
		firePropertyChange(Properties.ID_REFRESH, null, null);
		// Event needs to be forwarded to all elements visible in the main viewer
		Iterator i = getViewChildren().iterator();
		while (i.hasNext())
			((AbstractModelElement)i.next()).fireRefreshEvent();
	}
	
	/**
	 * Obtains the font for this element based on font style, size and type 
	 * (i.e.New Roman) that are stored in the object
	 * @return <code>org.eclipse.swt.graphics.Font</code> font of element's
	 * label for its name
	 */
	public Font getFont() {
		return new Font(null, font, fontSize, fontStyle);
	}
	
	/**
	 * Listeners for model changes and support for firing of events
	 * Comment for <code>listeners</code>
	 */
	protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
	
	/**
	 * Descriptors of the listeners
	 * Comment for <code>descriptors</code>
	 */
	protected static final IPropertyDescriptor[] descriptors = new IPropertyDescriptor[]{
        new PropertyDescriptor(Properties.ID_REFRESH, "Refresh Part"),
    };


	/**
	 * Adds a listener to element
	 * @param l <code>java.beans.PropertyChangeListner</code> listener to add
	 */
	public void addPropertyChangeListener(PropertyChangeListener l){
		listeners.addPropertyChangeListener(l);
	}

	/**
	 * Removes the listener from the element
	 * @param l <code>java.beans.PropertyChangeListner</code> listener to remove
	 */
	public void removePropertyChangeListener(PropertyChangeListener l){
		listeners.removePropertyChangeListener(l);
	}

	/**
	 * Fires an event to the corresponding to this element edit part. The edit part
	 * will receive the event and update old value to a new value. The value to
	 * update is specified by the event Id.
	 * @param prop - event Id
	 * @param old - the old value
	 * @param newValue - the new value
	 */
	protected void firePropertyChange(String prop, Object old, Object newValue){
		listeners.firePropertyChange(prop, old, newValue);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue(){
		return this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors(){
		return descriptors;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object id) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object id) {
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
	}
	
	/**
	 * Changes this element's and its childrens' font parameters.
	 * 
	 * @param name - new font's name/type
	 * @param size - new font's size
	 * @param style - new font's style (bold/italic/regular
	 */
	protected void applyFont(String name, int size, int style) {
		font = name;
		fontSize = size;
		fontStyle = style;
		Iterator i = getChildren().iterator();
		while (i.hasNext())
			((AbstractModelElement)i.next()).applyFont(name, size, style);
		
	}
	
	/**
	 * Obtains the spacing between elements on the diagram along Y-axis
	 * @return <code>int</code> number
	 */
	protected int getYSpacing() {
		// The spacing = Doubled height of the text of largest label possible
		return (int) 2 * getMaxLabel().getTextBounds().height;
	}
}
