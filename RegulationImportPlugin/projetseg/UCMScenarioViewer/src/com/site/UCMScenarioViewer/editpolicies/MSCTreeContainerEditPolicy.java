/*
 * Created on 06.03.2005
 */
package com.site.UCMScenarioViewer.editpolicies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.TreeContainerEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import com.site.UCMScenarioViewer.editpart.tree.LifeLineTreeEditPart;

/**
 * Locates target edit part. Used during dragging a life line in outline tree view.
 * 
 * @author Sasha
 */
public class MSCTreeContainerEditPolicy extends TreeContainerEditPolicy {

	/**
	 * Default constructor.
	 */
	public MSCTreeContainerEditPolicy() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.TreeContainerEditPolicy#getAddCommand(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	protected Command getAddCommand(ChangeBoundsRequest request) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.TreeContainerEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
	 */
	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.TreeContainerEditPolicy#getMoveChildrenCommand(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	protected Command getMoveChildrenCommand(ChangeBoundsRequest request) {
		return null;
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPolicy#getTargetEditPart(org.eclipse.gef.Request)
	 */
	public EditPart getTargetEditPart(Request req) {
		EditPart ep = super.getTargetEditPart(req);
		if (req instanceof ChangeBoundsRequest) {
			ChangeBoundsRequest r = (ChangeBoundsRequest) req;
			if ( !(r.getEditParts().get(0) instanceof LifeLineTreeEditPart) )
				return null;
			else {
				LifeLineTreeEditPart l = (LifeLineTreeEditPart) r.getEditParts().get(0);
				if (l.getParent() != ep) {
					return null;
				}
			}
		}
		return ep;
	}
}
