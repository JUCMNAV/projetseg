/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.AttributeMapping#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ram.AttributeMapping#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getAttributeMapping()
 * @model
 * @generated
 */
public interface AttributeMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' reference.
	 * @see #setFromElement(Attribute)
	 * @see ram.RamPackage#getAttributeMapping_FromElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getFromElement();

	/**
	 * Sets the value of the '{@link ram.AttributeMapping#getFromElement <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' reference.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(Attribute value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(Attribute)
	 * @see ram.RamPackage#getAttributeMapping_ToElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getToElement();

	/**
	 * Sets the value of the '{@link ram.AttributeMapping#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(Attribute value);

} // AttributeMapping
