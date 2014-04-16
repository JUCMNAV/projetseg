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
import intermediateWorkflow.IwConcern;
import intermediateWorkflow.IwEndPoint;
import intermediateWorkflow.IwInBinding;
import intermediateWorkflow.IwInput;
import intermediateWorkflow.IwModel;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwOutBinding;
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
 * An implementation of the model object '<em><b>Iw Node Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getConditionName <em>Condition Name</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getInBinding <em>In Binding</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getStubEntryIndexAsString <em>Stub Entry Index As String</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getOutBinding <em>Out Binding</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getStubExitIndexAsString <em>Stub Exit Index As String</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link intermediateWorkflow.impl.IwNodeConnectionImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IwNodeConnectionImpl extends EObjectImpl implements IwNodeConnection {
	
	@Override
	public boolean hasTriggerLabel() {
		if(hasLabel()) {
			return label.equals("trigger");
		}
		return false;
	}
	
	@Override
	public boolean hasLabel(){
		return label != null && !label.equals("");
	}
	
	/*********** Step View Transformation ***********************/
	@Override
	public void appendNodeConnection(StepView stepView) {
		/*if(isSourceEndPoint())
			return;*/
		
		stepView.append("        ");
		stepView.append(getSourcePortDotEscaped(stepView));
		stepView.append("->");
		stepView.append(getTargetPortDotEscaped(stepView));

		if(hasLabel()) {
			appendLabel(stepView);
		}
		else if(hasCondition()){
			appendCondition(stepView);
		}
	}
	
	@Override
	public void appendTimerSucc(StepView stepView) {
		stepView.append("        ");
		stepView.append(getSourcePortDotEscaped(stepView));
		
		stepView.append("->");
	
		stepView.append(getTargetPortDotEscaped(stepView));
		
		if(hasCondition()){
			appendCondition(stepView);
		}
	}
	
	@Override 
	public void appendTimeoutpathSucc(StepView stepView){
		stepView.append("        ");
		stepView.append(getSourcePortDotEscaped(stepView));
		
		stepView.append("->");
	
		stepView.append(getTargetPortDotEscaped(stepView));

		if(hasLabel()) {
			appendLabel(stepView);
		}
	}
	
	@Override
	public boolean isSourceEndPoint() {
		return getSource().getClass() == IwEndPointImpl.class;
	}
	
	@Override
	public boolean isFromCurrentStep(StepView stepView) {
		return getStep()==stepView.getStep();
	}
	
	@Override
	public void appendLabel(StepView stepView) {
		stepView.append("[label=<<table border=\"0\" cellborder=\"0\" cellpadding=\"0\" cellspacing=\"0\">");
		//stepView.append("[label=<<table border=\"0\" cellborder=\"0\" cellpadding=\"0\" cellspacing=\"0\"");
		//stepView.append(" bgcolor=\""+stepView.getCustomizableClassColor()+"\">");
		stepView.append("<tr><td>");
		stepView.append(getLabel());
		stepView.append("</td></tr></table>>]");
	}
	
	@Override
	public void appendCondition(StepView stepView) {
		stepView.append("[label=<<table border=\"0\" cellborder=\"0\" cellpadding=\"0\" cellspacing=\"0\"");
		stepView.append(" bgcolor=\""+stepView.getCustomizableClassColor()+"\">");
		stepView.append("<tr><td>");
		stepView.append(getConditionName());
		stepView.append("</td></tr></table>>]");
	}
	
	@Override
	public String getSourcePortDotEscaped(StepView stepView) {
		String result = getSource().getId();
		result = stepView.dotEscape(result);
		if(getStubExitIndex() != null) //if(stubExitIndex.isVoid==false)
			result = result+":out"+getStubExitIndex().toString();
				 
		return result;
	}
	
	/*public boolean isTargetWaitingPlace(){
		boolean result = false;
		if(getTarget() instanceof IwWaitingPlace){
			result = true;
		}
		return result;
	}*/
	
	public IwNodeConnection getNextNodeConnection(int index){
		List<IwNodeConnection> succs = getTarget().getSuccs();
		IwNodeConnection next = succs.get(index);
		
		return next;
	}
	
	@Override
	public String getTargetPortDotEscaped(StepView stepView) {
		IwNode target = getTarget();
		Integer stubEntryIndex = getStubEntryIndex();
		
		String result = target.getTargetPortDotEscaped(stepView, stubEntryIndex);
		return result;
	}
	
	@Override
	public boolean isTargetAnAspectMarker() {
		boolean result = false;
		
		if(getTarget() instanceof IwStub){
			IwStub targetAsStub = (IwStub) getTarget();
			if(targetAsStub.isAspectMarker()) {
				result = true;
			}
		}
		return result;
	}
	
	/*********** iw to java instantiator ***********************/
	@Override
	public void jiAppendAddNextNodeStatements(WorkflowInstantiator workflowInstantiator) {
		if(hasLabel()) {
			jiAppendAddNextNodeStatementWithLabel(workflowInstantiator);
		} 
		else if(hasCondition()) {
			jiAppendAddNextNodeStatementWithCondition(workflowInstantiator);
		}
		else {
			jiAppendAddNextNodeStatementWithoutCondition(workflowInstantiator);
		}
	}
	
	//*********************************************************
	//LinkWithCondition
	//*********************************************************/
	@Override
	public void jiAppendAddNextNodeStatementWithCondition(WorkflowInstantiator workflowInstantiator) {
		if(hasStubEntryIndex()) {
			jiAppendAddNextNodeStatement_OrForkToStub(workflowInstantiator);
		} 
		else {
			jiAppendAddNextNodeStatement_OrForkToNode(workflowInstantiator);
		}
	}
	
	@Override
	public void jiAppendAddNextNodeStatement_OrForkToNode(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_2Params(
			getSource().jiMemberName(),
			jiAddNextNodeMethodName(),
			quote(getConditionName()),
			getTarget().jiMemberName()
		);
	}
	
	@Override
	public void jiAppendAddNextNodeStatement_OrForkToStub(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_3Params(
			getSource().jiMemberName(),
			jiAddNextNodeMethodName(),
			quote(getConditionName()),
			getTarget().jiMemberName(),
			quote(getStubEntryIndex())
		);
	}
	
	//*********************************************************
	//LinkWithoutCondition
	//*********************************************************/
	@Override
	public void jiAppendAddNextNodeStatementWithoutCondition(WorkflowInstantiator workflowInstantiator) {
		if(hasStubExitIndex() && hasStubEntryIndex()) {
			jiAppendAddNextNodeStatement_StubToStub(workflowInstantiator);
		} 
		else {
			if(hasStubEntryIndex()) {
				jiAppendAddNextNodeStatement_NodeToStub(workflowInstantiator);
			} else {
				if(hasStubExitIndex()) {
					jiAppendAddNextNodeStatement_StubToNode(workflowInstantiator);
				} else {
					jiAppendAddNextNodeStatement_NodeToNode(workflowInstantiator);
				}
			}
		}
	}
	
	@Override
	public void jiAppendAddNextNodeStatement_NodeToNode(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_1Param(
			getSource().jiMemberName(),
			jiAddNextNodeMethodName(),
			getTarget().jiMemberName()
		);
	}
	
	@Override
	public void jiAppendAddNextNodeStatement_WaitingPlaceToNode(WorkflowInstantiator workflowInstantiator, String inPathName) {
		workflowInstantiator.appendMethodInvocationOn_2Params(
				getSource().jiMemberName(),
				jiAddNextNodeMethodName(),
				getTarget().jiMemberName(),
				quote(inPathName)
		);
	}	
	
	@Override
	public void jiAppendAddNextNodeStatementWithLabel(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_2Params(
				getSource().jiMemberName(),
				jiAddNextNodeMethodName(),
				getTarget().jiMemberName(),
				quote(getLabel())
		);
	}	
	
	@Override
	public void jiAppendAddNextNodeStatementWithOutPathAndLabel(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_2Params(
				getSource().jiMemberName(),
				jiAddNextNodeMethodName(),
				quote(getLabel()),
				getTarget().jiMemberName()
		);
	}	
	
	@Override
	public void jiAppendAddNextNodeStatement_NodeToStub(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_2Params(
			getSource().jiMemberName(),
			jiAddNextNodeMethodName(),
			getTarget().jiMemberName(),
			quote(getStubEntryIndex())
		);
	}
	
	@Override
	public void jiAppendAddNextNodeStatement_StubToNode(WorkflowInstantiator workflowInstantiator) {
		IwStub iwStub = (IwStub)getSource();
		if(iwStub.isSynchStub() || iwStub.isBlockingStub()) {
			workflowInstantiator.appendMethodInvocationOn_3Params(
					getSource().jiMemberName(),
					jiAddNextNodeWithThresholdMethodName(),
					quote("_OUT"+getStubExitIndex()),
					getTarget().jiMemberName(),
					getThreshold()
			);
		}
		else {
			workflowInstantiator.appendMethodInvocationOn_2Params(
					getSource().jiMemberName(),
					jiAddNextNodeMethodName(),
					quote(getStubExitIndex()),
					getTarget().jiMemberName()
					);
		}
	}
	
	@Override
	public void jiAppendAddNextNodeStatement_StubToStub(WorkflowInstantiator workflowInstantiator) {
		workflowInstantiator.appendMethodInvocationOn_3Params(
			getSource().jiMemberName(),
			jiAddNextNodeMethodName(),
			quote(getStubExitIndex()),
			target.jiMemberName(),
			quote(getStubEntryIndex())
		);
	}
	
	
	@Override
	public String jiAddNextNodeMethodName() {
		return "addNextNode";
	}
	
	@Override
	public String jiAddNextNodeWithThresholdMethodName() {
		return "addNextNodeWithThreshold";
	}
	
	@Override
	public String quote(Object toQuote) {
		return "\""+toQuote.toString()+"\"";
	}
	
	/******************************************************************/
	
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (conditionName: ");
		result.append(conditionName);
		result.append(", stubEntryIndexAsString: ");
		result.append(stubEntryIndexAsString);
		result.append(", stubExitIndexAsString: ");
		result.append(stubExitIndexAsString);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(')');
		return result.toString();
	}

	@Override
	public Integer getStubEntryIndex() {
		if(stubEntryIndexAsString == null) 
			return null;
		else
			return Integer.parseInt(stubEntryIndexAsString);
	}

	@Override
	public Integer getStubExitIndex() {
		if(stubExitIndexAsString == null) 
			return null;
		else
			return Integer.parseInt(stubExitIndexAsString);
	}

	@Override
	public Boolean hasCondition() {
		//conditionName.isVoid==false
		return getConditionName() != null;
	}

	@Override
	public boolean hasStubExitIndex() {
		// stubExitIndex.isVoid==false
		return getStubExitIndex() != null;
	}

	@Override
	public boolean hasStubEntryIndex() {
		return getStubEntryIndex() != null;
	}

	@Override
	public void delete() {
		//source =  null;
		setSource(null);
		setTarget(null);
		setInBinding(null);
		setOutBinding(null);
	}

	@Override
	public IwStep getStep() {
		if(getOutBinding() ==  null) 
			return getSource().getStep(); //Source is not a stub
		else {
			if(getOutBinding().getPluginEndPoint().getConcern()==getTarget().getConcern()) 
				return getOutBinding().getPluginEndPoint().getStep(); //At least one plugin is in the same concern 
			else
				return getSource().getStep(); //All plugins are in a different concern
		}
	}

	@Override
	public IwConcern getConcern() {
		return getSource().getConcern();
	}

	@Override
	public IwModel getModel() {
		return getSource().model();
	}

	@Override
	public String getConditionNameWithSourcePrefix() {
		return getSource().getName()+"_" + conditionName;
	}

	@Override
	public void setStubEntryIndex(Integer index) {
		if(index == null) 
			stubEntryIndexAsString = null;
		else
			stubEntryIndexAsString = index.toString();
	}

	@Override
	public void setStubExitIndex(Integer index) {
		if(index == null)
			stubExitIndexAsString = null;
		else
			stubExitIndexAsString = index.toString();
	}

	@Override
	public void insertInputProcessingNode(IwInput input) {
		IwNode nextNode = getTarget();
		String nextNodeInputProcessingAction = nextNode.getInputProcessingNodeAction();
		
		if(nextNodeInputProcessingAction.equals("continue")){
			//action==continue implies that there is a single succ
			// first successors dont go towards trigger path
			IwNodeConnection nextNodeSucc = nextNode.getSucc(0);
			nextNodeSucc.insertInputProcessingNode(input);
		}
		else {
			if(nextNodeInputProcessingAction.equals("insert")) {
				buildInputProcessingNode(input);
				linkInputProcessingNodePred(input);
				linkInputProcessingNodeSucc(input);
				delete();
			}
		}
	}

	@Override
	public void buildInputProcessingNode(IwInput input) {
		input.setIwInputProcessingNode(IntermediateWorkflowFactory.eINSTANCE.createIwCustomizableNode());
		input.getIwInputProcessingNode().setName("Process"+input.getName());
		input.getIwInputProcessingNode().setWorkflow(input.getWorkflow());
	}
	
	@Override
	public void linkInputProcessingNodePred(IwInput input) {
		IwNodeConnection pred = IntermediateWorkflowFactory.eINSTANCE.createIwNodeConnection();
		pred.setSource(getSource());
		pred.setTarget(input.getIwInputProcessingNode());
		pred.setOutBinding(getOutBinding());
		pred.setStubExitIndex(getStubExitIndex());
	}

	@Override
	public void linkInputProcessingNodeSucc(IwInput input) {
		IwNodeConnection succ= IntermediateWorkflowFactory.eINSTANCE.createIwNodeConnection();
		succ.setSource(input.getIwInputProcessingNode());
		succ.setTarget(getTarget());
		succ.setInBinding(getInBinding());
		succ.setStubEntryIndex(getStubEntryIndex());
	}
	
	/**
	 * The default value of the '{@link #getConditionName() <em>Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionName() <em>Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionName()
	 * @generated
	 * @ordered
	 */
	protected String conditionName = CONDITION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IwNode target;

	/**
	 * The cached value of the '{@link #getInBinding() <em>In Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBinding()
	 * @generated
	 * @ordered
	 */
	protected IwInBinding inBinding;

	/**
	 * The default value of the '{@link #getStubEntryIndexAsString() <em>Stub Entry Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubEntryIndexAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String STUB_ENTRY_INDEX_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStubEntryIndexAsString() <em>Stub Entry Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubEntryIndexAsString()
	 * @generated
	 * @ordered
	 */
	protected String stubEntryIndexAsString = STUB_ENTRY_INDEX_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutBinding() <em>Out Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBinding()
	 * @generated
	 * @ordered
	 */
	protected IwOutBinding outBinding;

	/**
	 * The default value of the '{@link #getStubExitIndexAsString() <em>Stub Exit Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubExitIndexAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String STUB_EXIT_INDEX_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStubExitIndexAsString() <em>Stub Exit Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubExitIndexAsString()
	 * @generated
	 * @ordered
	 */
	protected String stubExitIndexAsString = STUB_EXIT_INDEX_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Boolean trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected String threshold = THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwNodeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_NODE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionName() {
		return conditionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionName(String newConditionName) {
		String oldConditionName = conditionName;
		conditionName = newConditionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__CONDITION_NAME, oldConditionName, conditionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwNode getSource() {
		if (eContainerFeatureID() != IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE) return null;
		return (IwNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(IwNode newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IwNode newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, IntermediateWorkflowPackage.IW_NODE__SUCCS, IwNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IwNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(IwNode newTarget, NotificationChain msgs) {
		IwNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IwNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, IntermediateWorkflowPackage.IW_NODE__PREDS, IwNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, IntermediateWorkflowPackage.IW_NODE__PREDS, IwNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwInBinding getInBinding() {
		if (inBinding != null && inBinding.eIsProxy()) {
			InternalEObject oldInBinding = (InternalEObject)inBinding;
			inBinding = (IwInBinding)eResolveProxy(oldInBinding);
			if (inBinding != oldInBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING, oldInBinding, inBinding));
			}
		}
		return inBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwInBinding basicGetInBinding() {
		return inBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInBinding(IwInBinding newInBinding, NotificationChain msgs) {
		IwInBinding oldInBinding = inBinding;
		inBinding = newInBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING, oldInBinding, newInBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBinding(IwInBinding newInBinding) {
		if (newInBinding != inBinding) {
			NotificationChain msgs = null;
			if (inBinding != null)
				msgs = ((InternalEObject)inBinding).eInverseRemove(this, IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES, IwInBinding.class, msgs);
			if (newInBinding != null)
				msgs = ((InternalEObject)newInBinding).eInverseAdd(this, IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES, IwInBinding.class, msgs);
			msgs = basicSetInBinding(newInBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING, newInBinding, newInBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStubEntryIndexAsString() {
		return stubEntryIndexAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStubEntryIndexAsString(String newStubEntryIndexAsString) {
		String oldStubEntryIndexAsString = stubEntryIndexAsString;
		stubEntryIndexAsString = newStubEntryIndexAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING, oldStubEntryIndexAsString, stubEntryIndexAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwOutBinding getOutBinding() {
		if (outBinding != null && outBinding.eIsProxy()) {
			InternalEObject oldOutBinding = (InternalEObject)outBinding;
			outBinding = (IwOutBinding)eResolveProxy(oldOutBinding);
			if (outBinding != oldOutBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING, oldOutBinding, outBinding));
			}
		}
		return outBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwOutBinding basicGetOutBinding() {
		return outBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutBinding(IwOutBinding newOutBinding, NotificationChain msgs) {
		IwOutBinding oldOutBinding = outBinding;
		outBinding = newOutBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING, oldOutBinding, newOutBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutBinding(IwOutBinding newOutBinding) {
		if (newOutBinding != outBinding) {
			NotificationChain msgs = null;
			if (outBinding != null)
				msgs = ((InternalEObject)outBinding).eInverseRemove(this, IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT, IwOutBinding.class, msgs);
			if (newOutBinding != null)
				msgs = ((InternalEObject)newOutBinding).eInverseAdd(this, IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT, IwOutBinding.class, msgs);
			msgs = basicSetOutBinding(newOutBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING, newOutBinding, newOutBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStubExitIndexAsString() {
		return stubExitIndexAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStubExitIndexAsString(String newStubExitIndexAsString) {
		String oldStubExitIndexAsString = stubExitIndexAsString;
		stubExitIndexAsString = newStubExitIndexAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING, oldStubExitIndexAsString, stubExitIndexAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Boolean newTrigger) {
		Boolean oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(String newThreshold) {
		String oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateWorkflowPackage.IW_NODE_CONNECTION__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((IwNode)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, IntermediateWorkflowPackage.IW_NODE__PREDS, IwNode.class, msgs);
				return basicSetTarget((IwNode)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING:
				if (inBinding != null)
					msgs = ((InternalEObject)inBinding).eInverseRemove(this, IntermediateWorkflowPackage.IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES, IwInBinding.class, msgs);
				return basicSetInBinding((IwInBinding)otherEnd, msgs);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING:
				if (outBinding != null)
					msgs = ((InternalEObject)outBinding).eInverseRemove(this, IntermediateWorkflowPackage.IW_OUT_BINDING__STUB_EXIT, IwOutBinding.class, msgs);
				return basicSetOutBinding((IwOutBinding)otherEnd, msgs);
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
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE:
				return basicSetSource(null, msgs);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET:
				return basicSetTarget(null, msgs);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING:
				return basicSetInBinding(null, msgs);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING:
				return basicSetOutBinding(null, msgs);
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
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE:
				return eInternalContainer().eInverseRemove(this, IntermediateWorkflowPackage.IW_NODE__SUCCS, IwNode.class, msgs);
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
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__CONDITION_NAME:
				return getConditionName();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE:
				return getSource();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING:
				if (resolve) return getInBinding();
				return basicGetInBinding();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING:
				return getStubEntryIndexAsString();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING:
				if (resolve) return getOutBinding();
				return basicGetOutBinding();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING:
				return getStubExitIndexAsString();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TRIGGER:
				return getTrigger();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__LABEL:
				return getLabel();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__THRESHOLD:
				return getThreshold();
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
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__CONDITION_NAME:
				setConditionName((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE:
				setSource((IwNode)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET:
				setTarget((IwNode)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING:
				setInBinding((IwInBinding)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING:
				setStubEntryIndexAsString((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING:
				setOutBinding((IwOutBinding)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING:
				setStubExitIndexAsString((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TRIGGER:
				setTrigger((Boolean)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__LABEL:
				setLabel((String)newValue);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__THRESHOLD:
				setThreshold((String)newValue);
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
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__CONDITION_NAME:
				setConditionName(CONDITION_NAME_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE:
				setSource((IwNode)null);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET:
				setTarget((IwNode)null);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING:
				setInBinding((IwInBinding)null);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING:
				setStubEntryIndexAsString(STUB_ENTRY_INDEX_AS_STRING_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING:
				setOutBinding((IwOutBinding)null);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING:
				setStubExitIndexAsString(STUB_EXIT_INDEX_AS_STRING_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
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
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__CONDITION_NAME:
				return CONDITION_NAME_EDEFAULT == null ? conditionName != null : !CONDITION_NAME_EDEFAULT.equals(conditionName);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__SOURCE:
				return getSource() != null;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TARGET:
				return target != null;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__IN_BINDING:
				return inBinding != null;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING:
				return STUB_ENTRY_INDEX_AS_STRING_EDEFAULT == null ? stubEntryIndexAsString != null : !STUB_ENTRY_INDEX_AS_STRING_EDEFAULT.equals(stubEntryIndexAsString);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__OUT_BINDING:
				return outBinding != null;
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING:
				return STUB_EXIT_INDEX_AS_STRING_EDEFAULT == null ? stubExitIndexAsString != null : !STUB_EXIT_INDEX_AS_STRING_EDEFAULT.equals(stubExitIndexAsString);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION__THRESHOLD:
				return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	

} //IwNodeConnectionImpl
