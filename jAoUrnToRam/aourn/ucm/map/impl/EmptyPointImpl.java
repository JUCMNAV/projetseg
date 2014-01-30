/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map.impl;

import org.eclipse.emf.ecore.EClass;
import ucm.map.Connect;
import ucm.map.EmptyPoint;
import ucm.map.MapPackage;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmptyPointImpl extends PathNodeImpl implements EmptyPoint {
		
	@Override
	public void link(){
		for(NodeConnection aSucc : succAsNodeConnection()){
			
			PathNode neighbourNode = aSucc.targetAsPathNode();
			if(neighbourNode == null) continue;
			
			if(neighbourNode.isConnect()){
				Connect connect = (Connect)neighbourNode;
				
				NodeConnection pred = getFirstPred();
				NodeConnection succ = getFirstSucc();
			
				connect.linkTriggerPath(pred, succ);
			}
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapPackage.Literals.EMPTY_POINT;
	}

} //EmptyPointImpl
