/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwInBinding;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStartPoint;
import intermediateWorkflow.IwStep;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.SkipNodeInstantiationStrategy;
import iwToJavaInstantiator.StartupNodeInstantiationStrategy;
import iwToStepView.StepView;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Start Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwStartPointImpl#getStartPointType <em>Start Point Type</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwStartPointImpl#getInBindings <em>In Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwStartPointImpl extends IwNodeImpl implements IwStartPoint {
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName(){
		if(getStartPointType().equals("global")) 
			return "GlobalStartPoint24.gif";
		else {
			if(getStartPointType().equals("local")) 
				return "LocalStartPoint16.gif";
			else
				return "";
		}
	}
	@Override
	public void appendVertex(StepView stepView) {
		if(isBound()==false) 
			super.appendVertex(stepView);
	}
	@Override
	public void appendEdges(StepView stepView) {
		if(isBound()==false) 
			super.appendEdges(stepView);
	}
	
	@Override
	public void appendBindings(StepView stepView) {
		boolean isBindingsToStubFromOtherConcerPlaceholderAlreadyAppended = false;
		
		for(IwInBinding inBinding : getInBindings()){
			if(inBinding.isInboundByAspectMarkerOrInDifferentConcern()) {
				if(isBindingsToStubFromOtherConcerPlaceholderAlreadyAppended==false) {
					inBinding.appendBindingToStubsFromOtherConcernsPlaceholder(stepView);
					isBindingsToStubFromOtherConcerPlaceholderAlreadyAppended = true;
				}
			}
			else {
				inBinding.appendBinding(stepView);
			}
		}
	}
	
	/*********** iw to java ***********************/
	@Override
	public NodeInstantiationStrategy  createStrategy() {
		if(isBound()) {
			return new SkipNodeInstantiationStrategy(null);
		} else {
			return new StartupNodeInstantiationStrategy(this);
		}
	}
	
	/**********************************************/
	
	@Override
	public IwNode getTarget() {
		Iterator<IwNode> x = getTargets().iterator();
		return x.next();
	}

	@Override
	public boolean isBound() {
		return startPointType.equals("bound");
	}

	@Override
	public boolean isLocal() {
		return startPointType.equals("local");
	}
	
	public void linkStep(){
		if(isBoundFromSameConcernOnce()==false) {
			IwStep startupStep = createStep(true);
			step_DeepFirstSearch(startupStep);
		}
	}
	
	public boolean isBoundFromSameConcernOnce(){
		for(IwInBinding inBinding :  getInBindings()){
			if(inBinding.isInboundByAspectMarkerOrInDifferentConcern()==false)
				return true;
		}
		return false;
	}
	
	/**
	 * The default value of the '{@link #getStartPointType() <em>Start Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPointType()
	 * @generated
	 * @ordered
	 */
	protected static final String START_POINT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPointType() <em>Start Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPointType()
	 * @generated
	 * @ordered
	 */
	protected String startPointType = START_POINT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInBindings() <em>In Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<IwInBinding> inBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwStartPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_START_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartPointType() {
		return startPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPointType(String newStartPointType) {
		String oldStartPointType = startPointType;
		startPointType = newStartPointType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_START_POINT__START_POINT_TYPE, oldStartPointType, startPointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwInBinding> getInBindings() {
		if (inBindings == null) {
			inBindings = new EObjectWithInverseResolvingEList<IwInBinding>(IwInBinding.class, this, IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS, IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT);
		}
		return inBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInBindings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS:
				return ((InternalEList<?>)getInBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_START_POINT__START_POINT_TYPE:
				return getStartPointType();
			case IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS:
				return getInBindings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_START_POINT__START_POINT_TYPE:
				setStartPointType((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS:
				getInBindings().clear();
				getInBindings().addAll((Collection<? extends IwInBinding>)newValue);
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
			case IntermediateWorkflowPackage.IW_START_POINT__START_POINT_TYPE:
				setStartPointType(START_POINT_TYPE_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS:
				getInBindings().clear();
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
			case IntermediateWorkflowPackage.IW_START_POINT__START_POINT_TYPE:
				return START_POINT_TYPE_EDEFAULT == null ? startPointType != null : !START_POINT_TYPE_EDEFAULT.equals(startPointType);
			case IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS:
				return inBindings != null && !inBindings.isEmpty();
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
		result.append(" (startPointType: ");
		result.append(startPointType);
		result.append(')');
		return result.toString();
	}

	

} //IwStartPointImpl
