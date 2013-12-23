/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwEndPoint;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwOutBinding;
import intermediateWorkflow.IwPluginBinding;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwStub;
import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Out Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwOutBindingImpl#getStubExit <em>Stub Exit</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwOutBindingImpl#getPluginEndPoint <em>Plugin End Point</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwOutBindingImpl#getPluginBinding <em>Plugin Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwOutBindingImpl extends EObjectImpl implements IwOutBinding {
	/*********** Step View Transformation ***********************/
	@Override
	public void appendBinding(StepView stepView) {
		stepView.append("    ");
		stepView.append(stepView.dotEscape(getPluginEndPoint().getId()));
		stepView.append("->");
		stepView.append(getStubExit().getSourcePortDotEscaped(stepView));
		stepView.appendLine("[style=dashed,arrowhead=onormal]");
	}
	@Override
	public void appendBindingToStubsFromOtherConcernsPlaceholder(StepView stepView) {
		stepView.append("    ");
		stepView.append(stepView.dotEscape(getPluginEndPoint().getId()));
		stepView.append("->");
		stepView.appendStubsFromOtherConcernsPlaceholder();
		stepView.appendLine("[style=dashed,arrowhead=onormal]");
	}
	/*********** java to iw ***********************/
	@Override
	public void jiAppendBindStatement(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_3Params(
			getStub().jiMemberName(),
			"addOutBinding",
			getPluginBinding().jiLocalVarName(),
			getPluginEndPoint().getWorkflow().jiBindMethod_PluginParamName() + "." + getPluginEndPoint().jiMemberName(),
			"\"" + Integer.toString(getStubExit().getStubExitIndex()) + "\"" //stubExit.stubExitIndex.toQuotedString
		);
	}
	/**********************************************/
	public void explore(IwStep currentStep){
		if(isOutboundByAspectMarkerOrInDifferentConcern()==false) {
			currentStep.getOutboundStubs().add(getPluginBinding().getStub());
			getStubExit().getTarget().step_DeepFirstSearch(currentStep);
		}
	}
	
	/**
	 * The cached value of the '{@link #getStubExit() <em>Stub Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubExit()
	 * @generated
	 * @ordered
	 */
	protected IwNodeConnection stubExit;

	/**
	 * The cached value of the '{@link #getPluginEndPoint() <em>Plugin End Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginEndPoint()
	 * @generated
	 * @ordered
	 */
	protected IwEndPoint pluginEndPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwOutBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_OUT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwNodeConnection getStubExit() {
		if (stubExit != null && stubExit.eIsProxy()) {
			InternalEObject oldStubExit = (InternalEObject)stubExit;
			stubExit = (IwNodeConnection)eResolveProxy(oldStubExit);
			if (stubExit != oldStubExit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT, oldStubExit, stubExit));
			}
		}
		return stubExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwNodeConnection basicGetStubExit() {
		return stubExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStubExit(IwNodeConnection newStubExit, NotificationChain msgs) {
		IwNodeConnection oldStubExit = stubExit;
		stubExit = newStubExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT, oldStubExit, newStubExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStubExit(IwNodeConnection newStubExit) {
		if (newStubExit != stubExit) {
			NotificationChain msgs = null;
			if (stubExit != null)
				msgs = ((InternalEObject)stubExit).eInverseRemove(this, IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING, IwNodeConnection.class, msgs);
			if (newStubExit != null)
				msgs = ((InternalEObject)newStubExit).eInverseAdd(this, IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING, IwNodeConnection.class, msgs);
			msgs = basicSetStubExit(newStubExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT, newStubExit, newStubExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwEndPoint getPluginEndPoint() {
		if (pluginEndPoint != null && pluginEndPoint.eIsProxy()) {
			InternalEObject oldPluginEndPoint = (InternalEObject)pluginEndPoint;
			pluginEndPoint = (IwEndPoint)eResolveProxy(oldPluginEndPoint);
			if (pluginEndPoint != oldPluginEndPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT, oldPluginEndPoint, pluginEndPoint));
			}
		}
		return pluginEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwEndPoint basicGetPluginEndPoint() {
		return pluginEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPluginEndPoint(IwEndPoint newPluginEndPoint, NotificationChain msgs) {
		IwEndPoint oldPluginEndPoint = pluginEndPoint;
		pluginEndPoint = newPluginEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT, oldPluginEndPoint, newPluginEndPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginEndPoint(IwEndPoint newPluginEndPoint) {
		if (newPluginEndPoint != pluginEndPoint) {
			NotificationChain msgs = null;
			if (pluginEndPoint != null)
				msgs = ((InternalEObject)pluginEndPoint).eInverseRemove(this, IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS, IwEndPoint.class, msgs);
			if (newPluginEndPoint != null)
				msgs = ((InternalEObject)newPluginEndPoint).eInverseAdd(this, IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS, IwEndPoint.class, msgs);
			msgs = basicSetPluginEndPoint(newPluginEndPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT, newPluginEndPoint, newPluginEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwPluginBinding getPluginBinding() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING) return null;
		return (IwPluginBinding)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPluginBinding(IwPluginBinding newPluginBinding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPluginBinding, IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginBinding(IwPluginBinding newPluginBinding) {
		if (newPluginBinding != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING && newPluginBinding != null)) {
			if (EcoreUtil.isAncestor(this, newPluginBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPluginBinding != null)
				msgs = ((InternalEObject)newPluginBinding).eInverseAdd(this, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS, IwPluginBinding.class, msgs);
			msgs = basicSetPluginBinding(newPluginBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING, newPluginBinding, newPluginBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT:
				if (stubExit != null)
					msgs = ((InternalEObject)stubExit).eInverseRemove(this, IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING, IwNodeConnection.class, msgs);
				return basicSetStubExit((IwNodeConnection)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT:
				if (pluginEndPoint != null)
					msgs = ((InternalEObject)pluginEndPoint).eInverseRemove(this, IntermediateWorkflowPackage.IW_END_POINT__OUT_BINDINGS, IwEndPoint.class, msgs);
				return basicSetPluginEndPoint((IwEndPoint)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING:
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
			case IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT:
				return basicSetStubExit(null, msgs);
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT:
				return basicSetPluginEndPoint(null, msgs);
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING:
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
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_PLUGIN_BINDING__OUT_BINDINGS, IwPluginBinding.class, msgs);
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
			case IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT:
				if (resolve) return getStubExit();
				return basicGetStubExit();
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT:
				if (resolve) return getPluginEndPoint();
				return basicGetPluginEndPoint();
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING:
				return getPluginBinding();
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
			case IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT:
				setStubExit((IwNodeConnection)newValue);
				return;
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT:
				setPluginEndPoint((IwEndPoint)newValue);
				return;
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING:
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
			case IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT:
				setStubExit((IwNodeConnection)null);
				return;
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT:
				setPluginEndPoint((IwEndPoint)null);
				return;
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT:
				return stubExit != null;
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_END_POINT:
				return pluginEndPoint != null;
			case IntermediateWorkflowPackage.IW_OUT_BINDING__PLUGIN_BINDING:
				return getPluginBinding() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean isOutboundByAspectMarkerOrInDifferentConcern() {
		return getPluginBinding().getStub().isAspectMarker() ||
			   getPluginEndPoint().getConcern() != getPluginBinding().getStub().getConcern();
	}

	@Override
	public IwStub getStub() {
		return getPluginBinding().getStub();
	}

} //IwOutBindingImpl
