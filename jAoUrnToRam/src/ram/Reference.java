/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Reference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Property, TemporaryProperty {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ObjectType)
	 * @see ram.RamPackage#getReference_Type()
	 * @model required="true"
	 * @generated
	 */
	ObjectType getType();

	/**
	 * Sets the value of the '{@link ram.Reference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ObjectType value);

} // Reference
