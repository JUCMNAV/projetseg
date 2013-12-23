/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowInstantiator;
import iwToStepView.StepView;

import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ram.Class;
import ram.RamFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwNode#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNode#getSuccs <em>Succs</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNode#getPreds <em>Preds</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNode#getStep <em>Step</em>}</li>
 *   <li>{@link intermediateWorkflow.IwNode#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNode()
 * @model abstract="true"
 * @generated
 */
public interface IwNode extends EObject {
	/*********** iw to ram ***********************/
	String INPUT_DATA_SUFFIX();
	String OUTPUT_DATA_SUFFIX();
	void build();
	void link();
	RamFactory getRamFactory();
	void setRamFactory(RamFactory ramFactory);
	/********************************************/
	
	IwConcern getConcern();
	Set<IwNode> getTargets();
	Set<IwNode> sources();
	IwModel model();
	void insertInputProcessingNode();
	String getInputProcessingNodeAction();
	void step_DeepFirstSearch(IwStep currentStep);
	void explore(IwStep currentStep);
	boolean isPartOfStep(IwStep currentStep);
	boolean isUnexplored();
	IwStep createStep(boolean isStartupStep);
	
	
	/*********** Step View Transformation ***********************/
	void appendVertex(StepView stepView);
	void appendVertexContent(StepView stepView);
	void appendNodeTitleRow(StepView stepView);
	void appendVertex_NextStep(StepView stepView);
	void appendEdges(StepView stepView);
	void appendFirstVerticesFromNextStep(StepView stepView);
	List<IwNodeConnection> getNodeConnectionFromCurrentStep(StepView stepView);
	void appendBindings(StepView stepView);
	String getId();
	boolean isFromCurrentStep(StepView stepView);
	int getMinWidth();
	boolean getIsCustomizable();
	String getImageName();
	
	/*********** iw to java instantiator ***********************/
	String jiMemberName();
	NodeInstantiationStrategy strategy();
	void setStrategy(NodeInstantiationStrategy strategy);
	NodeInstantiationStrategy createStrategy();
	void jiAppendBuildStatement(WorkflowInstantiator workflowInstantiator);
	void jiAppendLinkNodesToNextNodesStatement(WorkflowInstantiator workflowInstantiator);
	void jiAppendLinkNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator);
	void jiAppendLinkStartNodesToWorkflowStatement(WorkflowInstantiator workflowInstantiator);
	
	
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
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNode_Name()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Succs</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwNodeConnection}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNodeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succs</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNode_Succs()
	 * @see intermediateWorkflow.IwNodeConnection#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<IwNodeConnection> getSuccs();

	/**
	 * Returns the value of the '<em><b>Preds</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwNodeConnection}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwNodeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preds</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNode_Preds()
	 * @see intermediateWorkflow.IwNodeConnection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<IwNodeConnection> getPreds();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwStep#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(IwStep)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNode_Step()
	 * @see intermediateWorkflow.IwStep#getNodes
	 * @model opposite="nodes"
	 * @generated
	 */
	IwStep getStep();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNode#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(IwStep value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwWorkflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' container reference.
	 * @see #setWorkflow(IwWorkflow)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwNode_Workflow()
	 * @see intermediateWorkflow.IwWorkflow#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	IwWorkflow getWorkflow();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwNode#getWorkflow <em>Workflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' container reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(IwWorkflow value);
	void addSucc(IwNodeConnection succ);
	IwNodeConnection getFirstSucc();
	
	
	
	
	

} // IwNode
