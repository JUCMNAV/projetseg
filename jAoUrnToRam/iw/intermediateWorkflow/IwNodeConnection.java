/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;

import java.util.LinkedHashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Node Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getConditionName <em>Condition Name</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getSource <em>Source</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getInBinding <em>In Binding</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getStubEntryIndexAsString <em>Stub Entry Index As String</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getOutBinding <em>Out Binding</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getStubExitIndexAsString <em>Stub Exit Index As String</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getLabel <em>Label</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNodeConnection#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection()
 * @model
 * @generated
 */
public interface IwNodeConnection extends EObject {
	/*********** Step View Transformation ***********************/
	void appendNodeConnection(StepView stepView);
	boolean isFromCurrentStep(StepView stepView);
	void appendCondition(StepView stepView);
	String getSourcePortDotEscaped(StepView stepView);
	String getTargetPortDotEscaped(StepView stepView);
	boolean isTargetAnAspectMarker();
	/*********** iw to java instantiator ***********************/
	void jiAppendAddNextNodeStatements(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatementWithCondition(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatement_OrForkToNode(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatement_OrForkToStub(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatementWithoutCondition(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatement_NodeToNode(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatement_NodeToStub(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatement_StubToNode(WorkflowInstantiator workflowInstantiator);
	void jiAppendAddNextNodeStatement_StubToStub(WorkflowInstantiator workflowInstantiator);
	String jiAddNextNodeMethodName();
	String quote(Object toQuote);
	/***********************************************************/
	
	Integer getStubEntryIndex();
	void setStubEntryIndex(Integer index);
	Integer getStubExitIndex();
	void setStubExitIndex(Integer index);
	Boolean hasCondition();
	boolean hasStubExitIndex();
	boolean hasStubEntryIndex();
	void delete();
	IwStep getStep();
	IwConcern getConcern();
	IwModel getModel();
	String getConditionNameWithSourcePrefix();
	void insertInputProcessingNode(IwInput input);
	void  buildInputProcessingNode(IwInput input);
	void linkInputProcessingNodePred(IwInput input);
	void linkInputProcessingNodeSucc(IwInput input);
	/**
	 * Returns the value of the '<em><b>Condition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Name</em>' attribute.
	 * @see #setConditionName(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_ConditionName()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getConditionName();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getConditionName <em>Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Name</em>' attribute.
	 * @see #getConditionName()
	 * @generated
	 */
	void setConditionName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNode#getSuccs <em>Succs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(IwNode)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_Source()
	 * @see intermediateWorkflow.IwNode#getSuccs
	 * @model opposite="succs" transient="false"
	 * @generated
	 */
	IwNode getSource();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IwNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNode#getPreds <em>Preds</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IwNode)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_Target()
	 * @see intermediateWorkflow.IwNode#getPreds
	 * @model opposite="preds"
	 * @generated
	 */
	IwNode getTarget();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IwNode value);

	/**
	 * Returns the value of the '<em><b>In Binding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwInBinding#getDisjunctiveStubEntries <em>Disjunctive Stub Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Binding</em>' reference.
	 * @see #setInBinding(IwInBinding)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_InBinding()
	 * @see intermediateWorkflow.IwInBinding#getDisjunctiveStubEntries
	 * @model opposite="disjunctiveStubEntries"
	 * @generated
	 */
	IwInBinding getInBinding();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getInBinding <em>In Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Binding</em>' reference.
	 * @see #getInBinding()
	 * @generated
	 */
	void setInBinding(IwInBinding value);

	/**
	 * Returns the value of the '<em><b>Stub Entry Index As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stub Entry Index As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stub Entry Index As String</em>' attribute.
	 * @see #setStubEntryIndexAsString(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_StubEntryIndexAsString()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getStubEntryIndexAsString();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getStubEntryIndexAsString <em>Stub Entry Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub Entry Index As String</em>' attribute.
	 * @see #getStubEntryIndexAsString()
	 * @generated
	 */
	void setStubEntryIndexAsString(String value);

	/**
	 * Returns the value of the '<em><b>Out Binding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwOutBinding#getStubExit <em>Stub Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Binding</em>' reference.
	 * @see #setOutBinding(IwOutBinding)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_OutBinding()
	 * @see intermediateWorkflow.IwOutBinding#getStubExit
	 * @model opposite="stubExit"
	 * @generated
	 */
	IwOutBinding getOutBinding();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getOutBinding <em>Out Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Binding</em>' reference.
	 * @see #getOutBinding()
	 * @generated
	 */
	void setOutBinding(IwOutBinding value);

	/**
	 * Returns the value of the '<em><b>Stub Exit Index As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stub Exit Index As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stub Exit Index As String</em>' attribute.
	 * @see #setStubExitIndexAsString(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_StubExitIndexAsString()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getStubExitIndexAsString();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getStubExitIndexAsString <em>Stub Exit Index As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub Exit Index As String</em>' attribute.
	 * @see #getStubExitIndexAsString()
	 * @generated
	 */
	void setStubExitIndexAsString(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(Boolean)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_Trigger()
	 * @model dataType="intermediateWorkflow.Boolean"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	Boolean getTrigger();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Boolean value);
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_Label()
	 * @model dataType="intermediateWorkflow.String"
	 * @generated
	 */
	String getLabel();
	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNodeConnection_Threshold()
	 * @model
	 * @generated
	 */
	String getThreshold();
	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNodeConnection#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(String value);
	boolean isSourceEndPoint();
	boolean hasLabel();
	//void appendConnectionWithLabel(StepView stepView, String label);
	boolean hasTriggerLabel();
	void jiAppendAddNextNodeStatement_WaitingPlaceToNode(
			WorkflowInstantiator workflowInstantiator, String inPathName);
	
	void jiAppendAddNextNodeStatementWithLabel(
			WorkflowInstantiator workflowInstantiator);
	void appendLabel(StepView stepView);
	void jiAppendAddNextNodeStatementWithOutPathAndLabel(
			WorkflowInstantiator workflowInstantiator);
	void appendTimerSucc(StepView stepView);
	void appendTimeoutpathSucc(StepView stepView);
	String jiAddNextNodeWithThresholdMethodName();



} // IwNodeConnection
