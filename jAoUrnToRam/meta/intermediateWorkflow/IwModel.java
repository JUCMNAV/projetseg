/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.JavaView;
import iwToJavaInstantiator.WorkflowInstantiator;
import iwToRam.RamWorkspace;
import iwToStepView.StepView;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwModel#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.IwModel#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwModel()
 * @model
 * @generated
 */
public interface IwModel extends EObject {
	void linkSteps();
	void insertInputProcessingNodes();
	Set<IwWorkflow> getWorkflows();
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
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwModel_Name()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwConcern}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwConcern#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwModel_Concerns()
	 * @see intermediateWorkflow.IwConcern#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<IwConcern> getConcerns();
	List<StepView> toStepView(String imgFolderWindowsPath);
	Set<WorkflowInstantiator> jiToJavaInstantiator();
	String reactiveWorkflowSystemLocalVar();
	String reactiveWorkflowSystemType();
	void jpAppendLinkAndBind(JavaView javaView);
	void jpAppendMainMethod(JavaView javaView);
	void jpAppendImports(JavaView javaView);
	void jpAppendContent(JavaView javaView);
	JavaView jpToJavaProgram();
	void link(RamWorkspace ramWorkspace);
	void build();
	void toStepClassDiagram(RamWorkspace ramWorkspace);

} // IwModel
