/*
 * ReorderLifeLinesEditPolicy.java
 * 
 * Created on 05.03.2005
 */
package com.site.UCMScenarioViewer.editpolicies;

import org.eclipse.gef.Request;
import org.eclipse.gef.TreeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;

import com.site.UCMScenarioViewer.commands.ReorderLifeLinesCommand;
import com.site.UCMScenarioViewer.editpart.tree.LifeLineTreeEditPart;
import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Scenario;

/**
 * A drag and drop edit policy that is installed on <code>com.site.UCMScenarioViewer.editpart.tree.LifeLineTreeEditPart</code>
 * edit parts for the support of reordering life lines. This edit policy is in charge
 * for validation of the user request and creation of the 
 * @link com.site.UCMScenarioViewer.commands.ReorderLifeLinesCommand that 
 * reorders life lines after its execution
 * 
 * @author Sasha
 */
public class ReorderLifeLinesEditPolicy extends AbstractEditPolicy {

	/**
	 * Default constructor.
	 */
	public ReorderLifeLinesEditPolicy() {
		super();
	}
	
	/**
	 * Finds a model element for the widget at point <code>pt</code>. From the
	 * model element the <code>com.site.UCMScenarioViewer.model.AbstractModelElement.number</code>
	 * number is extracted and returned
	 * @param pt - draw3d point (coordinates of the mice)
	 * @return an index number -1 invalid, valid number >=0
	 */
	private int findIndexOfTreeItemAt(org.eclipse.draw2d.geometry.Point pt) {
		int index = -1;
		Object item = findTreeItemAt(pt).getData();	
		if (item != null && (item instanceof LifeLineTreeEditPart)) {
			if ( ((LifeLineTreeEditPart)item).getParent() == getHost().getParent() ) {
				index = ((LifeLineTreeEditPart)item).getModelElement().getNumber();
			}
		}
		return index;
	}

	/**
	 * Finds a <code>org.eclipse.swt.widgets.TreeItem</code> widget located at the point
	 * <code>pt</code>
	 * @param pt - a draw2d point (location of the mice
	 * @return a tree item widget for the passed draw2d point (coordinates on the screen
	 */
	private final TreeItem findTreeItemAt(org.eclipse.draw2d.geometry.Point pt) {
		return getTree().getItem(new Point(pt.x, pt.y));			
	}

	/**
	 * Obtains a <code>org.eclipse.swt.widgets.Tree</code> tree widget for
	 * the edit policy's host tree edit part.
	 * @return tree widget
	 */
	private Tree getTree() {
		Widget widget = ((TreeEditPart)getHost()).getWidget();
		if (widget instanceof Tree)
			return (Tree)widget;
		else
			return ((TreeItem)widget).getParent();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPolicy#getCommand(org.eclipse.gef.Request)
	 */
	public Command getCommand(Request request) {
		if (request instanceof ChangeBoundsRequest) {
			ChangeBoundsRequest req = (ChangeBoundsRequest) request;
			Scenario sc = (Scenario)getHost().getParent().getModel();
			int oldIndex = ((LifeLine)getHost().getModel()).getNumber();
			int newIndex = findIndexOfTreeItemAt(req.getLocation());
			return new ReorderLifeLinesCommand(sc, oldIndex, newIndex);
		}
		else if (!(request instanceof GroupRequest)) {
			System.out.println("Not a group request"); 
		}
		return super.getCommand(request);
	}
}
