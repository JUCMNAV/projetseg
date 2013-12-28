/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToRam.RamWorkspace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwConcern#getName <em>Name</em>}</li>
 *   <li>{@link intermediateWorkflow.IwConcern#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link intermediateWorkflow.IwConcern#getSteps <em>Steps</em>}</li>
 *   <li>{@link intermediateWorkflow.IwConcern#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwConcern()
 * @model
 * @generated
 */
public interface IwConcern extends EObject {
	void linkSteps();
	
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
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwConcern_Name()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwConcern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwWorkflow}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwWorkflow#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwConcern_Workflows()
	 * @see intermediateWorkflow.IwWorkflow#getConcern
	 * @model opposite="concern" containment="true" required="true"
	 * @generated
	 */
	EList<IwWorkflow> getWorkflows();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwStep}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwStep#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwConcern_Steps()
	 * @see intermediateWorkflow.IwStep#getConcern
	 * @model opposite="concern" containment="true" required="true"
	 * @generated
	 */
	EList<IwStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwModel#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(IwModel)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwConcern_Model()
	 * @see intermediateWorkflow.IwModel#getConcerns
	 * @model opposite="concerns" transient="false"
	 * @generated
	 */
	IwModel getModel();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwConcern#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(IwModel value);

	void build();

	void link(RamWorkspace ramWorkspace);

	void insertInputProcessingNodes();

} // IwConcern
