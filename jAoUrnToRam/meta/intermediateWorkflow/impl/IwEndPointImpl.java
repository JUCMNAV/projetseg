/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwEndPoint;
import intermediateWorkflow.IwOutBinding;
import intermediateWorkflow.IwStep;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;
import iwToStepView.StepView;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwEndPointImpl#getOutBindings <em>Out Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwEndPointImpl extends IwNodeImpl implements IwEndPoint {
	/*********** Step View Transformation ***********************/
	@Override
	public String getImageName(){
		return "End16.gif";
	}
	
	@Override
	public void appendBindings(StepView stepView) {
		boolean isBindingsToStubFromOtherConcerPlaceholderAlreadyAppended = false;
		
		for(IwOutBinding outBinding : getOutBindings()){
			if(outBinding.isOutboundByAspectMarkerOrInDifferentConcern()) {
				if(isBindingsToStubFromOtherConcerPlaceholderAlreadyAppended==false) {
					outBinding.appendBindingToStubsFromOtherConcernsPlaceholder(stepView);
					isBindingsToStubFromOtherConcerPlaceholderAlreadyAppended = true;
				}
			}
			else {
				outBinding.appendBinding(stepView);
			}
		}
	}
	/*********** java to iw ***********************/
	@Override
	public NodeInstantiationStrategy createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this,"EndNode");
	}
	
	/**************************************************/
	@Override
	public void explore(IwStep currentStep) {
		setStep(currentStep);
	
		for(IwOutBinding outBinding : getOutBindings()) {
			outBinding.explore(currentStep);
		}
	}
	
	/**
	 * The cached value of the '{@link #getOutBindings() <em>Out Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<IwOutBinding> outBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwEndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwOutBinding> getOutBindings() {
		if (outBindings == null) {
			outBindings = new EObjectWithInverseResolvingEList<IwOutBinding>(IwOutBinding.class, this, IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS, IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT);
		}
		return outBindings;
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
			case IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutBindings()).basicAdd(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS:
				return ((InternalEList<?>)getOutBindings()).basicRemove(otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS:
				return getOutBindings();
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
			case IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS:
				getOutBindings().clear();
				getOutBindings().addAll((Collection<? extends IwOutBinding>)newValue);
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
			case IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS:
				getOutBindings().clear();
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
			case IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS:
				return outBindings != null && !outBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IwEndPointImpl
