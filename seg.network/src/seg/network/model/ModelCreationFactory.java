/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.model;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gef.requests.CreationFactory;

import seg.network.model.network.Link;
import seg.network.model.network.NetworkFactory;
import seg.network.model.network.NetworkPackage;
import seg.network.model.network.Node;
import seg.network.model.network.Responsability;


/**
 * This class implements the CreationFactory used by the CreationTool. It in turn
 * uses the EMF-generated factories to create the model instances
 * @author ddean
 *
 */
public class ModelCreationFactory implements CreationFactory {
	private Class targetClass;
	
	public ModelCreationFactory( Class targetClass ) {
		this.targetClass = targetClass;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.requests.CreationFactory#getNewObject()
	 */
	public Object getNewObject() {
		Map registry = EPackage.Registry.INSTANCE;
		String workflowURI = NetworkPackage.eNS_URI;
		NetworkPackage workflowPackage =
		(NetworkPackage) registry.get(workflowURI);
		NetworkFactory factory = workflowPackage.getNetworkFactory();
			
		Object		result = null;
			
		if( targetClass.equals( Node.class ) ) {
			result = factory.createNode();
		}
		else if (targetClass.equals(Link.class)){
			result = factory.createLink();
		}
		else if(targetClass.equals(Responsability.class)){
			result = factory.createResponsability();
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.requests.CreationFactory#getObjectType()
	 */
	public Object getObjectType() {
		return targetClass;
	}
}
