/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import seg.network.model.network.Component;
import seg.network.model.network.EndPoint;
import seg.network.model.network.Link;
import seg.network.model.network.Network;
import seg.network.model.network.Node;
import seg.network.model.network.Responsibility;
import seg.network.model.network.StartPoint;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GraphicalEditPartFactory implements EditPartFactory {
	
	private int count=0;

	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if(model instanceof Network)
			return new NetworkEditPart((Network)model);
		else if(model instanceof Component){
			return new ComponentEditPart((Component)model);
		}
		else if(model instanceof StartPoint){
			return new StartPointEditPart((StartPoint)model);
		}
		else if(model instanceof EndPoint){
			return new EndPointEditPart((EndPoint)model);
		}
		else if(model instanceof Responsibility){
			return new ResponsibilityEditPart((Responsibility)model);
		}
		else if(model instanceof Node) {
			NetworkNodeEditPart tmp = new NetworkNodeEditPart((Node)model);
			((Node)model).setId(""+count++);
			return tmp;
		}
		else if (model instanceof Link)
			return new LinkEditPart((Link)model);
		else
			return null;
//		return null;
	}

}
