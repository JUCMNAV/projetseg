/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map.impl;

import java.util.List;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IwAndFork;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwWaitingPlace;
import intermediateWorkflow.IwNodeConnection;
import org.eclipse.emf.ecore.EClass;

import ucm.map.Connect;
import ucm.map.MapPackage;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.Timer;
import ucm.map.WaitingPlace;
import urncore.IURNConnection;
import urncore.IURNNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConnectImpl extends PathNodeImpl implements Connect {
	
	@Override
	public void linkTriggerPath(NodeConnection pred, NodeConnection succ) {
		PathNode nextNode = getNext(0);
		
		if(nextNode == null) return;
		
		if(nextNode instanceof  WaitingPlace) {
			WaitingPlace waitingPlace = (WaitingPlace)nextNode;
			waitingPlace.linkTriggerPath(pred, succ);
		} 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapPackage.Literals.CONNECT;
	}

} //ConnectImpl
