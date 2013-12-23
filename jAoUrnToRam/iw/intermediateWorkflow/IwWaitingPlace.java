/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Waiting Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwWaitingPlace#getTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwWaitingPlace()
 * @model
 * @generated
 */
public interface IwWaitingPlace extends IwNode {
	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(Boolean)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwWaitingPlace_Transient()
	 * @model dataType="intermediateWorkflow.Boolean"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	Boolean getTransient();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwWaitingPlace#getTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #getTransient()
	 * @generated
	 */
	void setTransient(Boolean value);

	boolean getStepViewVisit();

	void setStepViewVisit(boolean stepViewVisit);

} // IwWaitingPlace
