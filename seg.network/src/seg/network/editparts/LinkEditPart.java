/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.editparts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;

import seg.network.editpolicy.LinkEditPolicy;
import seg.network.editpolicy.LinkEndpointEditPolicy;
import seg.network.editpolicy.LinkSelectionHandlesEditPolicy;
import seg.network.model.network.Link;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LinkEditPart extends AbstractConnectionEditPart  {
	
	public LinkEditPart(Link link) {
		super();
		setModel(link);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		installEditPolicy( EditPolicy.CONNECTION_ENDPOINTS_ROLE, new LinkEndpointEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_BENDPOINTS_ROLE, new LinkSelectionHandlesEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_ROLE, new LinkEditPolicy());
	}

}
