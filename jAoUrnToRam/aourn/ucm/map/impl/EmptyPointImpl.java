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
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwTimer;
import intermediateWorkflow.IwWaitingPlace;

import org.eclipse.emf.ecore.EClass;

import ucm.map.Connect;
import ucm.map.EmptyPoint;
import ucm.map.MapPackage;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.WaitingPlace;
import urncore.IURNConnection;
import urncore.IURNNode;

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
	
	/*private PathNode previousNode() {
		return (PathNode)getPred().get(0);
	}
	
	private PathNode nextNode() {
		return (PathNode)getPred().get(0);
	}*/
	/*public Connect getConnect() {
		NodeConnection succ = getSucc(1);
		if(succ instanceof Connect) {
			return (Connect)succ;
		} else {
			return null;
		}
	}*/
	
	@Override
	public void link(){
		for(IURNConnection edge : getSucc()){
			IURNNode succNode = edge.getTarget();
			
			if(succNode instanceof Connect){
				Connect connectNode = (Connect)succNode;
				
				NodeConnection pred = getFirstPred();
				NodeConnection succ = getFirstSucc();
				
				connectNode.linkTriggerPath(pred, succ);
				
				/*Connect connectNode = (Connect)node;
				
				WaitingPlace waitingPlace = connectNode.getWaitingPlace();
				IwWaitingPlace iwWaitingPlace = waitingPlace.getIwWaitingPlace();
				
				NodeConnection pred = this.getFirstPred();
				IwNodeConnection iwPred = pred.getIwNodeConnection();
				
				List<IwNodeConnection> iwWaitingPlacePreds = iwWaitingPlace.getPreds();
				iwWaitingPlacePreds.add(iwPred);
				
				IwNodeConnection iwSucc = IntermediateWorkflowFactory.eINSTANCE.createIwNodeConnection();
				
				NodeConnection succ = this.getFirstSucc();
				PathNode target = (PathNode)succ.getTarget();
				IwNode iwTarget = target.getIwEquivalentNode();
				
				iwSucc.setTarget(iwTarget);
				iwWaitingPlace.addSucc(iwSucc);*/
				
				/////////
				//NodeConnection pred = getFirstPred();
				//NodeConnection succ = getFirstSucc();
				//waitingPlace.linkTriggerPath(pred, succ);
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
