/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notVoid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot notVoid='not self.type.oclIsTypeOf(RVoid)' notVoid$message='\'The type of the parameter may not be void\''"
 * @generated
 */
public interface Parameter extends TypedElement, MappableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see ram.RamPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link ram.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Parameter
