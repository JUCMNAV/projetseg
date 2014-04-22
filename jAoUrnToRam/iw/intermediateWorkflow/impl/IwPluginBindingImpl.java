/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwInBinding;
import intermediateWorkflow.IwOutBinding;
import intermediateWorkflow.IwPluginBinding;
import intermediateWorkflow.IwStub;
import intermediateWorkflow.IwWorkflow;
import iwToJavaInstantiator.WorkflowInstantiator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Plugin Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwPluginBindingImpl#getInBindings <em>In Bindings</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwPluginBindingImpl#getOutBindings <em>Out Bindings</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwPluginBindingImpl#getStub <em>Stub</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwPluginBindingImpl#getConditionLabel <em>Condition Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwPluginBindingImpl extends EObjectImpl implements IwPluginBinding {
	
	@Override
	public String jiLocalVarName() {
		//return "l_"+getStub().getName() + "_PluginBinding";
		return getStub().getName() + getPlugin().jiBindMethod_PluginParamName().substring(1) + "_PluginBinding";
	}
	
	@Override
	public String jiLocalVarName(String entryIndex) {
		return entryIndex + "_" + getStub().getName() + "_PluginBinding";
		//return (localVarName++).toString() + "_" +getStub().getName() + "_PluginBinding";
	}
	
	@Override
	public void jiAppendBindStatement(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendNextLine();
		workflowInstantiator.appendLocalVarConstructor_1Param(
			"Binding",
			jiLocalVarName(),
			getPlugin().jiBindMethod_PluginParamName() + "." + getPlugin().workflowMemberName()
		);
		workflowInstantiator.appendMethodInvocationOn_1Param(getStub().jiMemberName(),"addBinding",jiLocalVarName());
		
		//inBindings.each{inBinding|inBinding.jiAppendBindStatement(workflowInstantiator)}
		for(IwInBinding inBinding : getInBindings()){
			inBinding.jiAppendBindStatement(workflowInstantiator);
		}
		
		//outBindings.each{outBinding|outBinding.jiAppendBindStatement(workflowInstantiator)}
		for(IwOutBinding outBinding : getOutBindings()){
			outBinding.jiAppendBindStatement(workflowInstantiator);
		}
	}
	
	/**
	 * The cached value of the '{@link #getInBindings() <em>In Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<IwInBinding> inBindings;

	/**
	 * The cached value of the '{@link #getOutBindings() <em>Out Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<IwOutBinding> outBindings;

	/**
	 * The default value of the '{@link #getConditionLabel() <em>Condition Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionLabel() <em>Condition Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionLabel()
	 * @generated
	 * @ordered
	 */
	protected String conditionLabel = CONDITION_LABEL_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwPluginBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_PLUGIN_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwInBinding> getInBindings() {
		if (inBindings == null) {
			inBindings = new EObjectContainmentWithInverseEList<IwInBinding>(IwInBinding.class, this, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS, IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING);
		}
		return inBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwOutBinding> getOutBindings() {
		if (outBindings == null) {
			outBindings = new EObjectContainmentWithInverseEList<IwOutBinding>(IwOutBinding.class, this, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS, IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING);
		}
		return outBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStub getStub() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB) return null;
		return (IwStub)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStub(IwStub newStub, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStub, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStub(IwStub newStub) {
		if (newStub != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB && newStub != null)) {
			if (EcoreUtil.isAncestor(this, newStub))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStub != null)
				msgs = ((InternalEObject)newStub).eInverseAdd(this, IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS, IwStub.class, msgs);
			msgs = basicSetStub(newStub, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB, newStub, newStub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionLabel() {
		return conditionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionLabel(String newConditionLabel) {
		String oldConditionLabel = conditionLabel;
		conditionLabel = newConditionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__CONDITION_LABEL, oldConditionLabel, conditionLabel));
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
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInBindings()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutBindings()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStub((IwStub)otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS:
				return ((InternalEList<?>)getInBindings()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS:
				return ((InternalEList<?>)getOutBindings()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB:
				return basicSetStub(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_STUB__PLUGIN_BINDINGS, IwStub.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS:
				return getInBindings();
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS:
				return getOutBindings();
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB:
				return getStub();
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__CONDITION_LABEL:
				return getConditionLabel();
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
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS:
				getInBindings().clear();
				getInBindings().addAll((Collection<? extends IwInBinding>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS:
				getOutBindings().clear();
				getOutBindings().addAll((Collection<? extends IwOutBinding>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB:
				setStub((IwStub)newValue);
				return;
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__CONDITION_LABEL:
				setConditionLabel((String)newValue);
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
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS:
				getInBindings().clear();
				return;
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS:
				getOutBindings().clear();
				return;
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB:
				setStub((IwStub)null);
				return;
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__CONDITION_LABEL:
				setConditionLabel(CONDITION_LABEL_EDEFAULT);
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
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS:
				return inBindings != null && !inBindings.isEmpty();
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS:
				return outBindings != null && !outBindings.isEmpty();
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__STUB:
				return getStub() != null;
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING__CONDITION_LABEL:
				return CONDITION_LABEL_EDEFAULT == null ? conditionLabel != null : !CONDITION_LABEL_EDEFAULT.equals(conditionLabel);
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
		result.append(" (conditionLabel: ");
		result.append(conditionLabel);
		result.append(')');
		return result.toString();
	}

	@Override
	public IwWorkflow getPlugin() {
		if(getInBindings().isEmpty()==false) {
			return getInBindings().get(0).getPluginStartPoint().getWorkflow();
		} else {
			//Some aspect marker are only bound by an outBinding
			return getOutBindings().get(0).getPluginEndPoint().getWorkflow();
		}
	}

} //IwPluginBindingImpl
