/*
 * Created on 2005-02-07
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.editpolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import seg.network.edit.commands.DeleteNodeCommand;
import seg.network.model.network.Network;
import seg.network.model.network.Node;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class NetworkComponentEditPolicy extends ComponentEditPolicy {

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ComponentEditPolicy#createDeleteCommand(org.eclipse.gef.requests.GroupRequest)
	 */
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		Object parent = getHost().getParent().getModel();
		Object node = getHost().getModel();
		if(parent instanceof Network && node instanceof Node){
			DeleteNodeCommand command = new DeleteNodeCommand();
			command.setNetwork((Network)parent);
			command.setToDelete((Node)node);
			return command;
		}
		return super.createDeleteCommand(deleteRequest);
	}
}
