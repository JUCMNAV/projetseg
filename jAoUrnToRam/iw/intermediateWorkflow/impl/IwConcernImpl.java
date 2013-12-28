/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwConcern;
import intermediateWorkflow.IwModel;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwWorkflow;
import iwToRam.RamWorkspace;

import java.util.Collection;
import java.util.List;

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
 * An implementation of the model object '<em><b>Iw Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwConcernImpl#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwConcernImpl#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwConcernImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwConcernImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwConcernImpl extends EObjectImpl implements IwConcern {
	
	/******iw to ram************/
	@Override
	public void build() {
		//steps.each{step|step.build}
		for(IwStep step : getSteps()){
			step.build();
		}
	}
	
	@Override
	public void link(RamWorkspace ramWorkspace) {
		for(IwStep step : getSteps()){
			step.link(ramWorkspace);
		}
	}
	/*************************/
	
	public void linkSteps() {
		for(IwWorkflow workflow : getWorkflows()){
			workflow.linkSteps(this);
		}
	}
	
	@Override
	public void insertInputProcessingNodes() {
		//cannot use foreach loop because of concurrent modification exception
		for(int i=0; i < getWorkflows().size(); i++){
			IwWorkflow workflow = getWorkflows().get(i);
			workflow.insertInputProcessingNodes();
		}
	}
	
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkflows() <em>Workflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflows()
	 * @generated
	 * @ordered
	 */
	protected EList<IwWorkflow> workflows;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<IwStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_CONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_CONCERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwWorkflow> getWorkflows() {
		if (workflows == null) {
			workflows = new EObjectContainmentWithInverseEList<IwWorkflow>(IwWorkflow.class, this, IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS, IntermediateWorkflowPackage.IW_WORKFLOW__CONCERN);
		}
		return workflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<IwStep>(IwStep.class, this, IntermediateWorkflowPackage.IW_CONCERN__STEPS, IntermediateWorkflowPackage.IW_STEP__CONCERN);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwModel getModel() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_CONCERN__MODEL) return null;
		return (IwModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(IwModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, IntermediateWorkflowPackage.IW_CONCERN__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(IwModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_CONCERN__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, IntermediateWorkflowPackage.IW_MODEL__CONCERNS, IwModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_CONCERN__MODEL, newModel, newModel));
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
			case IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkflows()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_CONCERN__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_CONCERN__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((IwModel)otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS:
				return ((InternalEList<?>)getWorkflows()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_CONCERN__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_CONCERN__MODEL:
				return basicSetModel(null, msgs);
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
			case IntermediateWorkflowPackage.IW_CONCERN__MODEL:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_MODEL__CONCERNS, IwModel.class, msgs);
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
			case IntermediateWorkflowPackage.IW_CONCERN__NAME:
				return getName();
			case IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS:
				return getWorkflows();
			case IntermediateWorkflowPackage.IW_CONCERN__STEPS:
				return getSteps();
			case IntermediateWorkflowPackage.IW_CONCERN__MODEL:
				return getModel();
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
			case IntermediateWorkflowPackage.IW_CONCERN__NAME:
				setName((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS:
				getWorkflows().clear();
				getWorkflows().addAll((Collection<? extends IwWorkflow>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_CONCERN__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends IwStep>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_CONCERN__MODEL:
				setModel((IwModel)newValue);
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
			case IntermediateWorkflowPackage.IW_CONCERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS:
				getWorkflows().clear();
				return;
			case IntermediateWorkflowPackage.IW_CONCERN__STEPS:
				getSteps().clear();
				return;
			case IntermediateWorkflowPackage.IW_CONCERN__MODEL:
				setModel((IwModel)null);
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
			case IntermediateWorkflowPackage.IW_CONCERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediateWorkflowPackage.IW_CONCERN__WORKFLOWS:
				return workflows != null && !workflows.isEmpty();
			case IntermediateWorkflowPackage.IW_CONCERN__STEPS:
				return steps != null && !steps.isEmpty();
			case IntermediateWorkflowPackage.IW_CONCERN__MODEL:
				return getModel() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IwConcernImpl
