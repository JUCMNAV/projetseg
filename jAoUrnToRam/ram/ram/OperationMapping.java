/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.OperationMapping#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link ram.OperationMapping#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ram.OperationMapping#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getOperationMapping()
 * @model
 * @generated
 */
public interface OperationMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link ram.ParameterMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' containment reference list.
	 * @see ram.RamPackage#getOperationMapping_ParameterMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

	/**
	 * Returns the value of the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' reference.
	 * @see #setFromElement(Operation)
	 * @see ram.RamPackage#getOperationMapping_FromElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getFromElement();

	/**
	 * Sets the value of the '{@link ram.OperationMapping#getFromElement <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' reference.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(Operation value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(Operation)
	 * @see ram.RamPackage#getOperationMapping_ToElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getToElement();

	/**
	 * Sets the value of the '{@link ram.OperationMapping#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(Operation value);

} // OperationMapping
