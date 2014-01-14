/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import java.util.List;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwWaitingPlace;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WaitingplaceNodeInstantiatorStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;
import iwToStepView.StepView;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucm.map.NodeConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Waiting Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwWaitingPlaceImpl#getTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwWaitingPlaceImpl extends IwNodeImpl implements IwWaitingPlace {
	
	@Override
	public void linkTriggerPath(IwNodeConnection iwPred, IwNode iwTarget) {
		addPred(iwPred);
		
		IwNodeConnection iwSucc = IntermediateWorkflowFactory.eINSTANCE.createIwNodeConnection();
		iwSucc.setLabel("trigger");
		iwSucc.setTarget(iwTarget);
		addSucc(iwSucc);
	}
	
	@Override
	public String getInputProcessingNodeAction() {
		return "continue";
	}
	
	@Override
	public NodeInstantiationStrategy createStrategy() {
		//return new WorkflowNodeInstantiationStrategy(this, "ConditionalSynchronizationNode");
		return new WaitingplaceNodeInstantiatorStrategy(this, "ConditionalSynchronizationNode", getTransient());
	}
	
	@Override
	public String getImageName(){
		return "Wait16.gif";
	}
	
	//protected boolean visited = false;
	
	/*protected boolean stepViewVisit = false;
	@Override
	public boolean getStepViewVisit() {
		return stepViewVisit;
	}
	@Override
	public void setStepViewVisit(boolean stepViewVisit) {
		this.stepViewVisit = stepViewVisit;
	}*/

	/*protected IwNode getNextNodeToExplore(){
		IwNode nextNode = null;
		IwNodeConnection nextSucc = null;
		
		if(!visited) {
			nextSucc = getSucc(0);
			nextNode = nextSucc.getTarget();
			visited = true;
		}
		else {
			nextSucc = getSucc(1);
			nextNode = nextSucc.getTarget();
		}
		return nextNode;
	}*/
	
	/*@Override
	public void step_DeepFirstSearch(IwStep currentStep) {
		IwNode nextNode = getNextNodeToExplore();
		nextNode.explore(currentStep);
	}*/
	
	/*@Override
	public void appendFirstVerticesFromNextStep(StepView stepView) {
	}*/
	
	/*@Override
	public void appendEdges(StepView stepView) {
	}*/
	
	/*@Override
	public void appendVertex_NextStep(StepView stepView) {
	}*/
	
	/*@Override
	public boolean isFromCurrentStep(StepView stepView) {
		return false;
	}*/
	
	/*protected IwNodeConnection chooseSucc(){
		IwNodeConnection succ = null;
		if(!stepViewVisit){
			succ = getSucc(0);
			stepViewVisit = true;
		}
		else {
			succ = getSucc(1);
		}
		return succ;
	}*/
	
	/*@Override
	public String getTargetPortDotEscaped(StepView stepView, Integer stubEntryIndex) {
		IwNodeConnection succ = chooseSucc();
		String result = succ.getTargetPortDotEscaped(stepView);
		return result;
	}*/
	
	/*@Override
	public IwNodeConnection getSecondSucc() {
		return this.getSucc(1);
	}*/
	
	/**
	 * The default value of the '{@link #getTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRANSIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected Boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwWaitingPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_WAITING_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(Boolean newTransient) {
		Boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_WAITING_PLACE__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_WAITING_PLACE__TRANSIENT:
				return getTransient();
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
			case IntermediateWorkflowPackage.IW_WAITING_PLACE__TRANSIENT:
				setTransient((Boolean)newValue);
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
			case IntermediateWorkflowPackage.IW_WAITING_PLACE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
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
			case IntermediateWorkflowPackage.IW_WAITING_PLACE__TRANSIENT:
				return TRANSIENT_EDEFAULT == null ? transient_ != null : !TRANSIENT_EDEFAULT.equals(transient_);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (transient: ");
		result.append(transient_);
		result.append(')');
		return result.toString();
	}

} //IwWaitingPlaceImpl
