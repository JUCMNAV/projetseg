/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.editpolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import seg.network.edit.commands.LinkDeleteCommand;
import seg.network.model.network.Link;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LinkEditPolicy extends ConnectionEditPolicy {

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConnectionEditPolicy#getDeleteCommand(org.eclipse.gef.requests.GroupRequest)
	 */
	protected Command getDeleteCommand(GroupRequest request) {
		LinkDeleteCommand c = new LinkDeleteCommand();
		c.setLink((Link)getHost().getModel());
		return c;
	}

}
