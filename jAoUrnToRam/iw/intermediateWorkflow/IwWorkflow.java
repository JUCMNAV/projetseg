/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.JavaView;
import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwWorkflow#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.IwWorkflow#getNodes <em>Nodes</em>}</li>
 *   <li>{@link intermediateWorkflow.IwWorkflow#getStartPoints <em>Start Points</em>}</li>
 *   <li>{@link intermediateWorkflow.IwWorkflow#getConcern <em>Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwWorkflow()
 * @model
 * @generated
 */
public interface IwWorkflow extends EObject {
	void linkSteps(IwConcern concern);
	 IwModel getModel();
	 Set<IwWorkflow> getPlugins();
	 Set<IwStub> getStubs();
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwWorkflow_Name()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwWorkflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwNode}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNode#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwWorkflow_Nodes()
	 * @see intermediateWorkflow.IwNode#getWorkflow
	 * @model opposite="workflow" containment="true" required="true"
	 * @generated
	 */
	EList<IwNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Start Points</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwStartPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Points</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwWorkflow_StartPoints()
	 * @model required="true"
	 * @generated
	 */
	EList<IwStartPoint> getStartPoints();

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwConcern#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' container reference.
	 * @see #setConcern(IwConcern)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwWorkflow_Concern()
	 * @see intermediateWorkflow.IwConcern#getWorkflows
	 * @model opposite="workflows" transient="false"
	 * @generated
	 */
	IwConcern getConcern();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwWorkflow#getConcern <em>Concern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern</em>' container reference.
	 * @see #getConcern()
	 * @generated
	 */
	/*********** Step View Transformation ***********************/
	void setConcern(IwConcern value);
	void appendStepViewPre(StepView stepView);
	void appendStepViewPost(StepView stepView);
	void appendWorkflow_DifferentConcern(StepView stepView);
	List<IwStartPoint> boundStartPoints();
	List<IwEndPoint> boundEndPoints();
	List<IwEndPoint> endPoints();
	void enforceBoundStartPointTop_BoundEndPointDown(StepView stepView);
	/*********** Step View Transformation ***********************/
	
	/*********** Iw to Java Instantiator ***********************/
	String jiCustomizedClassSubPackage(); 
	String jiBindMethodParam();
	String jiBindMethod_PluginParamName();
	String jiWorkspacePath();
	WorkflowInstantiator jiToWorkflowInstantiator();
	void jiAppendContent(WorkflowInstantiator workflowInstantiator);
	void jiAppendImports(WorkflowInstantiator workflowInstantiator);
	void jiAppendBuildStatements(WorkflowInstantiator workflowInstantiator);
	void jiAppendLinkMethod(WorkflowInstantiator workflowInstantiator);
	void jiAppendLinkNodesToNextNodesMethod(WorkflowInstantiator workflowInstantiator);
	void jiAppendLinkNodesToWorkflowMethod(WorkflowInstantiator workflowInstantiator);
	void jiAppendLinkStartNodesToWorkflowMethod(WorkflowInstantiator workflowInstantiator);
	void jiAppendBindMethod(WorkflowInstantiator workflowInstantiator);
	/*********** Step View Transformation ***********************/
	String jiSUBPACKAGE();
	String jiWORKFLOW_INSTANTIATOR_BASE_CLASS();
	String jiPackageName();
	String workflowInstantiatorName();
	String workflowInstantiatorFullyQualifiedName();
	String workflowMemberName();
	String jpLocalVar();
	/*********** iw to java ***********************/
	void jpAppendAddWorkflow(JavaView javaView);
	void jpAppendBind(JavaView javaView);
	void jpAppendLink(JavaView javaView);
	void jpAppendBuild(JavaView javaView);
	void jpAppendImport(JavaView javaView);

} // IwWorkflow
