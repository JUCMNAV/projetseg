/*
 * Created on 05.02.2005
 */
package com.site.UCMScenarioViewer.editpart.tree;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import com.site.UCMScenarioViewer.commands.SwitchScenarioCommand;
import com.site.UCMScenarioViewer.model.AbstractModelElement;
import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.ScenarioGroup;

/**
 * Generic edit part for all model elements in the tree outline viewer.
 * 
 * @author Sasha
 *
 */
public class ModelElementTreeEditPart extends AbstractTreeEditPart {

	/**
	 * @param model
	 */
	public ModelElementTreeEditPart(Object model) {
		super(model);
	}

	/**
	 * Default constructor.
	 */
	public ModelElementTreeEditPart() {
		super();
	}

	/**
	 * Casts the model element object.
	 * @return model element of this edit part.
	 */
	public AbstractModelElement getModelElement() {
		return (AbstractModelElement) getModel();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	protected List getModelChildren() {
		return getModelElement().getTreeChildren();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals(){
		if (getWidget() instanceof Tree)
			return;
		Image image = getModelElement().getIcon();
		TreeItem item = (TreeItem)getWidget();
		if (image != null)
			image.setBackground(item.getParent().getBackground());
		setWidgetImage(image);
		if (getModelElement().getName() != null)
			setWidgetText(getModelElement().getName());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPart#setSelected(int)
	 */
	public void setSelected(int value) {
		if (value == EditPart.SELECTED_PRIMARY && !(getModelElement() instanceof ScenarioGroup)) {
			Scenario sc = getSelectedScenario();
			(new SwitchScenarioCommand((ScenarioGroup)sc.getParent(), sc.getNumber())).execute();
		}
		super.setSelected(value);
	}
	
	/**
	 * Checks if the selected element belongs to a scenario.
	 * @return scenario to which element belongs to.
	 */
	private Scenario getSelectedScenario() {
		AbstractModelElement element = getModelElement();
		while (!(element instanceof Scenario))
			element = element.getParent();
		return (Scenario)element;
	}
}
