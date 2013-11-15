/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwInBinding;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwPluginBinding;
import intermediateWorkflow.IwStartPoint;
import intermediateWorkflow.IwStub;
import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw In Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwInBindingImpl#getDisjunctiveStubEntries <em>Disjunctive Stub Entries</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwInBindingImpl#getPluginStartPoint <em>Plugin Start Point</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwInBindingImpl#getPluginBinding <em>Plugin Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwInBindingImpl extends EObjectImpl implements IwInBinding {
	/*********** Step View Transformation ***********************/
	@Override
	public void appendBinding(StepView stepView) {
		stepView.append("    ");
		stepView.append(getAnyOfTheDisjunctiveStubEntries().getTargetPortDotEscaped(stepView));
		stepView.append("->");
		stepView.append(getPluginStartPointTargetPortDotEscaped(stepView));
		stepView.appendLine("[style=dashed,arrowhead=onormal]");
	}
	@Override
	public void appendBindingToStubsFromOtherConcernsPlaceholder(StepView stepView) {
		stepView.append("    ");
		stepView.appendStubsFromOtherConcernsPlaceholder();
		stepView.append("->");
		stepView.append(getPluginStartPointTargetPortDotEscaped(stepView));
		stepView.appendLine("[style=dashed,arrowhead=onormal]");
	}
	@Override
	public String getPluginStartPointTargetPortDotEscaped(StepView stepView) {
		return getPluginStartPoint().getSuccs().get(0).getTargetPortDotEscaped(stepView);
	}
	/*********** iw to java instantiator ***********************/
	
	@Override
	public void jiAppendBindStatement(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_3Params(
			getStub().jiMemberName(),
			"addInBinding",
			getPluginBinding().jiLocalVarName(),
			"\"" + Integer.toString(getStubEntryIndex()) + "\"", //stubEntryIndex.toQuotedString
			getPluginStartPoint().getWorkflow().jiBindMethod_PluginParamName() + "." + getPluginStartPoint().getTarget().jiMemberName()
		);
	}
	
	/************************************************************/
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES:
				return disjunctiveStubEntries != null && !disjunctiveStubEntries.isEmpty();
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT:
				return pluginStartPoint != null;
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING:
				return getPluginBinding() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean isInboundByAspectMarkerOrInDifferentConcern() {
		return getPluginBinding().getStub().isAspectMarker() ||
				getPluginStartPoint().getConcern() != getPluginBinding().getStub().getConcern();
	}

	@Override
	public IwStub getStub() {
		return getPluginBinding().getStub();
	}

	@Override
	public int getStubEntryIndex() {
		return Integer.parseInt(getAnyOfTheDisjunctiveStubEntries().getStubEntryIndexAsString());
	}

	@Override
	public IwNodeConnection getAnyOfTheDisjunctiveStubEntries() {
		return this.disjunctiveStubEntries.get(0);
	}

	
	/**
	 * The cached value of the '{@link #getDisjunctiveStubEntries() <em>Disjunctive Stub Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjunctiveStubEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<IwNodeConnection> disjunctiveStubEntries;

	/**
	 * The cached value of the '{@link #getPluginStartPoint() <em>Plugin Start Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginStartPoint()
	 * @generated
	 * @ordered
	 */
	protected IwStartPoint pluginStartPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwInBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_IN_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IwNodeConnection> getDisjunctiveStubEntries() {
		if (disjunctiveStubEntries == null) {
			disjunctiveStubEntries = new EObjectWithInverseResolvingEList<IwNodeConnection>(IwNodeConnection.class, this, IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES, IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING);
		}
		return disjunctiveStubEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStartPoint getPluginStartPoint() {
		if (pluginStartPoint != null && pluginStartPoint.eIsProxy()) {
			InternalEObject oldPluginStartPoint = (InternalEObject)pluginStartPoint;
			pluginStartPoint = (IwStartPoint)eResolveProxy(oldPluginStartPoint);
			if (pluginStartPoint != oldPluginStartPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT, oldPluginStartPoint, pluginStartPoint));
			}
		}
		return pluginStartPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStartPoint basicGetPluginStartPoint() {
		return pluginStartPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPluginStartPoint(IwStartPoint newPluginStartPoint, NotificationChain msgs) {
		IwStartPoint oldPluginStartPoint = pluginStartPoint;
		pluginStartPoint = newPluginStartPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT, oldPluginStartPoint, newPluginStartPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginStartPoint(IwStartPoint newPluginStartPoint) {
		if (newPluginStartPoint != pluginStartPoint) {
			NotificationChain msgs = null;
			if (pluginStartPoint != null)
				msgs = ((InternalEObject)pluginStartPoint).eInverseRemove(this, IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS, IwStartPoint.class, msgs);
			if (newPluginStartPoint != null)
				msgs = ((InternalEObject)newPluginStartPoint).eInverseAdd(this, IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS, IwStartPoint.class, msgs);
			msgs = basicSetPluginStartPoint(newPluginStartPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT, newPluginStartPoint, newPluginStartPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwPluginBinding getPluginBinding() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING) return null;
		return (IwPluginBinding)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPluginBinding(IwPluginBinding newPluginBinding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPluginBinding, IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginBinding(IwPluginBinding newPluginBinding) {
		if (newPluginBinding != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING && newPluginBinding != null)) {
			if (EcoreUtil.isAncestor(this, newPluginBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPluginBinding != null)
				msgs = ((InternalEObject)newPluginBinding).eInverseAdd(this, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS, IwPluginBinding.class, msgs);
			msgs = basicSetPluginBinding(newPluginBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING, newPluginBinding, newPluginBinding));
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
			case IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisjunctiveStubEntries()).basicAdd(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT:
				if (pluginStartPoint != null)
					msgs = ((InternalEObject)pluginStartPoint).eInverseRemove(this, IntermediateWorkflowPackage.IW_START_POINT__IN_BINDINGS, IwStartPoint.class, msgs);
				return basicSetPluginStartPoint((IwStartPoint)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPluginBinding((IwPluginBinding)otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES:
				return ((InternalEList<?>)getDisjunctiveStubEntries()).basicRemove(otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT:
				return basicSetPluginStartPoint(null, msgs);
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING:
				return basicSetPluginBinding(null, msgs);
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
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__IN_BINDINGS, IwPluginBinding.class, msgs);
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
			case IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES:
				return getDisjunctiveStubEntries();
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT:
				if (resolve) return getPluginStartPoint();
				return basicGetPluginStartPoint();
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING:
				return getPluginBinding();
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
			case IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES:
				getDisjunctiveStubEntries().clear();
				getDisjunctiveStubEntries().addAll((Collection<? extends IwNodeConnection>)newValue);
				return;
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT:
				setPluginStartPoint((IwStartPoint)newValue);
				return;
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING:
				setPluginBinding((IwPluginBinding)newValue);
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
			case IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES:
				getDisjunctiveStubEntries().clear();
				return;
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_START_POINT:
				setPluginStartPoint((IwStartPoint)null);
				return;
			case IntermediateWorkflowPackage.IW_IN_BINDING__PLUGIN_BINDING:
				setPluginBinding((IwPluginBinding)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
} //IwInBindingImpl
