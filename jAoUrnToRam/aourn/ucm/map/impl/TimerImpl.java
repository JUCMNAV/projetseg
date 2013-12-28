/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map.impl;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwTimer;
import intermediateWorkflow.IwWaitingPlace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucm.map.MapPackage;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.Timer;
import ucm.map.WaitKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ucm.map.impl.TimerImpl#getTimeoutPath <em>Timeout Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerImpl extends WaitingPlaceImpl implements Timer {
	
	//private IwTimer iwTimer;
	
	@Override
	public void buildIwNodeTemplate() {
		/*iwTimer = IntermediateWorkflowFactory.eINSTANCE.createIwTimer();
		iwTimer.setName(nameOrPrefixId("Timer"));
		iwTimer.setTransient(getWaitType().equals(WaitKind.TRANSIENT));
		addIwEquivalentNodeAfterOutIn(iwTimer);*/
		
		iwWaitingPlace = IntermediateWorkflowFactory.eINSTANCE.createIwTimer();
		iwWaitingPlace.setName(nameOrPrefixId("Timer"));
		iwWaitingPlace.setTransient(getWaitType().equals(WaitKind.TRANSIENT));
		//addIwEquivalentNodeAfterOutIn(iwWaitingPlace);
		addIwEquivalentNodeBeforeOutIn(iwWaitingPlace);
		
		/*if(getSucc().size() == 2){
			//NodeConnection timerSucc = getSucc(0);
			NodeConnection timeoutSucc = getSucc(1);
			//PathNode timeOuthPathFirstNode = (PathNode)timeoutPath.getTarget();
			
			((IwTimer)iwWaitingPlace).setTimeoutSucc(timeoutSucc);
		}*/	
	}
	
	private NodeConnection nonTimeoutPathSucc(){
		return getSucc(0);
	}
	
	private NodeConnection timeoutPathSucc(){
		return getSucc(1);
	}
	
	@Override
	public void invokeLinkOnSuccs() {
		if(hasTimeoutPath()) {
			
			NodeConnection nonTimeoutPathSucc = nonTimeoutPathSucc();
			nonTimeoutPathSucc.linkTimerSource();
			
			NodeConnection timeoutPathSucc = timeoutPathSucc();
			timeoutPathSucc.link();
		}
		else {
			super.invokeLinkOnSuccs();
		}
	}
	
	@Override
	public void link() {
		if(hasTimeoutPath()) {
			linkUcmMap();
			
			//warning: linkInternal must be called after invokeLinkOnSuccs()
			
			if(iwHasNodes()) 
				invokeLinkOnSuccs();
			
			linkInternal();
		}
		else {
			super.link();
		}
	}
	
	/*@Override
	public IwNode iwGetExitNode(NodeConnection nodeConnection) {
		return _iwNodes.get(0); //because timer should preced the implicit processing node
	}*/
	
	@Override
	public void buildIwInputNode() {
		if(hasTimeoutPath()) {
			iwInput = IntermediateWorkflowFactory.eINSTANCE.createIwInput();
			iwInput.setName(getName() + "Input");
			_iwNodes.add(iwInput);
		}
		else {
			super.buildIwInputNode();
		}
	}
	
	/*@Override
	public void invokeBuildOnNodeConnections() {
		for(NodeConnection nodeConnection: succAsNodeConnection()){
			//nodeConnection.build();
		}
	}*/
	
	/*@Override
	public void linkInternal() {
		IwNodeConnection connection = IntermediateWorkflowFactory.eINSTANCE.createIwNodeConnection();
		
		connection.setSource(_iwNodes.get(1)); //add implicit input node
		connection.setTarget(_iwNodes.get(0)); //add timer
	}*/
	
	@Override
	public boolean hasTimeoutPath(){
		return getSucc().size() == 2;
	}
	
	/*@Override
	public IwWaitingPlace getIwTimer() {
		return iwTimer;
	}*/
	
	
	/**
	 * The cached value of the '{@link #getTimeoutPath() <em>Timeout Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutPath()
	 * @generated
	 * @ordered
	 */
	protected NodeConnection timeoutPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapPackage.Literals.TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeConnection getTimeoutPath() {
		if (timeoutPath != null && timeoutPath.eIsProxy()) {
			InternalEObject oldTimeoutPath = (InternalEObject)timeoutPath;
			timeoutPath = (NodeConnection)eResolveProxy(oldTimeoutPath);
			if (timeoutPath != oldTimeoutPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapPackage.TIMER__TIMEOUT_PATH, oldTimeoutPath, timeoutPath));
			}
		}
		return timeoutPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeConnection basicGetTimeoutPath() {
		return timeoutPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutPath(NodeConnection newTimeoutPath) {
		NodeConnection oldTimeoutPath = timeoutPath;
		timeoutPath = newTimeoutPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.TIMER__TIMEOUT_PATH, oldTimeoutPath, timeoutPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapPackage.TIMER__TIMEOUT_PATH:
				if (resolve) return getTimeoutPath();
				return basicGetTimeoutPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MapPackage.TIMER__TIMEOUT_PATH:
				setTimeoutPath((NodeConnection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MapPackage.TIMER__TIMEOUT_PATH:
				setTimeoutPath((NodeConnection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MapPackage.TIMER__TIMEOUT_PATH:
				return timeoutPath != null;
		}
		return super.eIsSet(featureID);
	}

} //TimerImpl
