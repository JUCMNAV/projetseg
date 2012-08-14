/*
 * Created on 31.01.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import com.site.UCMScenarioViewer.utils.Helper;
import com.site.UCMScenarioViewer.utils.Properties;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ScenarioGroup extends AbstractModelElement {
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int selectedScenario = 0;
	protected static IPropertyDescriptor[] descriptors  = new IPropertyDescriptor[]{
        new PropertyDescriptor(Properties.ID_SWITCH_SCENARIO, "Switch Scenario"),
    };

	public ScenarioGroup() {}
	
	public ScenarioGroup(String id, String name) {
		super(id,name);
	}
	
	public void setScenarios(ArrayList scenarios) {
		this.children = scenarios;
	}
	
	public void addChild(Object scenario) {
		if (scenario instanceof Scenario) {
			super.addChild(scenario);
			((Scenario)scenario).setNumber(children.size()-1);
			((Scenario)scenario).setParent(this);
		}
	}
	
	public void setSelectedScenario(int scenarioNumber) {
		if (children != null && children.size() > scenarioNumber &&
				this.selectedScenario != scenarioNumber) {
			this.selectedScenario = scenarioNumber;
			firePropertyChange(Properties.ID_SWITCH_SCENARIO, null, new Integer(scenarioNumber));
		}
	}
	
	public Scenario getSelectedScenario() {
		if (children == null || children.size() == 0)
			return null;
		return (Scenario) children.get(selectedScenario);
	}
	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getParent()
	 */
	public AbstractModelElement getParent() {
		return null;
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
		return 0;
	}
		
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getNumber()
	 */
	public int getNumber() {
		return 0;
	}
	
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return descriptors;
	}

	
	/* (non-Javadoc)
	 * @see com.site.UCMViewer.model.AbstractModelElement#getViewChildren()
	 */
	public List getViewChildren() {
		if (!getChildren().isEmpty()) {
			ArrayList list = new ArrayList();
			list.add(getSelectedScenario());
			return list;
		}
		return Collections.EMPTY_LIST;
	}
	
	/**
	 * assigns an icon to this ScenarioGroup in the Outline View of Eclipse IDE
	 * 
	 * @see com.site.UCMScenarioViewer.utils.Helper
	 * 
	 * @return  image of an icon
	 */
	public Image getIconImage() {
		return SCEN_GROUP_ICON;
	}
	
	private static Image SCEN_GROUP_ICON = new Image(null,	
			SequenceElement.class.getResourceAsStream(Helper.ICON_OUTLINE_DEFAULT));  //$NON-NLS-1$
		
}
