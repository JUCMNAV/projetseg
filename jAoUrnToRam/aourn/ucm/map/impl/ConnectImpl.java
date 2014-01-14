/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map.impl;

import java.util.List;

import intermediateWorkflow.IntermediateWorkflowFactory;
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
		WaitingPlace waitingPlace = getWaitingPlace();
		
		if(waitingPlace != null)
			waitingPlace.linkTriggerPath(pred, succ);
	}
	
	/*@Override
	public void link(){
		WaitingPlace waitingPlace = getWaitingPlace();
		if(waitingPlace != null){
			waitingPlace.linkTriggerPath();
			
			
			/*IwWaitingPlace iwWaitingPlace = waitingPlace.getIwWaitingPlace();
			IwNodeConnection iwPred = getIwNodConnection();
			
			List<IwNodeConnection> iwWaitingPlacePreds = iwWaitingPlace.getPreds();
			iwWaitingPlacePreds.add(iwPred);
			
			IwNodeConnection iwSucc = IntermediateWorkflowFactory.eINSTANCE.createIwNodeConnection();
			
			PathNode target = nextNode();
			IwNode iwTarget = target.getIwEquivalentNode();
			
			iwSucc.setTarget(iwTarget);
			iwWaitingPlace.addSucc(iwSucc);
		} else {
			super.link();
		}
	}*/
	
	/*private PathNode nextNode(){
		NodeConnection succ = getFirstSucc();
		PathNode target = (PathNode)succ.getTarget();
		
		return target;
	}
	
	private IwNodeConnection getIwNodConnection(){
		NodeConnection pred = getFirstPred();
		IwNodeConnection iwPred = pred.getIwNodeConnection();
		
		return iwPred;
	}*/
	
	
	@Override
	public WaitingPlace getWaitingPlace() {
		IURNConnection firstSucc = getFirstSucc();
		IURNNode target = firstSucc.getTarget();
		
		WaitingPlace waitingPlace = null;
		if(target instanceof WaitingPlace){
			waitingPlace = (WaitingPlace)target;
		}
		return waitingPlace;
	}
	
	@Override
	public Timer getTimer() {
		IURNConnection firstSucc = this.getFirstSucc();
		IURNNode target = firstSucc.getTarget();
		
		Timer timer = null;
		if(target instanceof Timer){
			timer = (Timer)target;
		}
		return timer;
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
