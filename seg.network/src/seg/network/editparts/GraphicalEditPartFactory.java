/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import seg.network.model.network.Link;
import seg.network.model.network.Network;
import seg.network.model.network.Node;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GraphicalEditPartFactory implements EditPartFactory {

	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if(model instanceof Network)
			return new NetworkEditPart((Network)model);
		else if(model instanceof Node)
			return new NetworkNodeEditPart((Node)model);
		else if (model instanceof Link)
			return new LinkEditPart((Link)model);
		return null;
	}

}
