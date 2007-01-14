/*
 * Created on 06.02.2005
 *
 */
package com.site.UCMScenarioViewer.editpart.viewer;

import java.beans.PropertyChangeEvent;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;

import com.site.UCMScenarioViewer.utils.Properties;

/**
 * @author Sasha
 *
 */
public class ScenarioGroupEditPart extends AbstractModelElementEditPart {

	private FreeformLayout layout = new FreeformLayout();

	/**
	 * 
	 */
	public ScenarioGroupEditPart() {
		super();
	}
	
	public ScenarioGroupEditPart(Object model) {
		super();
		setModel(model);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		Figure f = new FreeformLayer();
		f.setLayoutManager(layout);
		f.setBorder(new MarginBorder(5));
		return f;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {

	}
	
	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Properties.ID_SWITCH_SCENARIO))
			refresh();
		else
			super.propertyChange(evt);
	}
}
