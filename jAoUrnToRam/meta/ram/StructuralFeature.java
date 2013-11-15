/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.StructuralFeature#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeature extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see ram.RamPackage#getStructuralFeature_Static()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link ram.StructuralFeature#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // StructuralFeature
