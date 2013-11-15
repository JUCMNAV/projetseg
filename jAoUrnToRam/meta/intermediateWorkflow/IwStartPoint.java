/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Start Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwStartPoint#getStartPointType <em>Start Point Type</em>}</li>
 *   <li>{@link intermediateWorkflow.IwStartPoint#getInBindings <em>In Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStartPoint()
 * @model
 * @generated
 */
public interface IwStartPoint extends IwNode {
	IwNode getTarget();
	boolean isBound();
	boolean isLocal();
	void linkStep();
	boolean isBoundFromSameConcernOnce();
	/**
	 * Returns the value of the '<em><b>Start Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point Type</em>' attribute.
	 * @see #setStartPointType(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStartPoint_StartPointType()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getStartPointType();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwStartPoint#getStartPointType <em>Start Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point Type</em>' attribute.
	 * @see #getStartPointType()
	 * @generated
	 */
	void setStartPointType(String value);

	/**
	 * Returns the value of the '<em><b>In Bindings</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwInBinding}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwInBinding#getPluginStartPoint <em>Plugin Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Bindings</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStartPoint_InBindings()
	 * @see intermediateWorkflow.IwInBinding#getPluginStartPoint
	 * @model opposite="pluginStartPoint"
	 * @generated
	 */
	EList<IwInBinding> getInBindings();

} // IwStartPoint
