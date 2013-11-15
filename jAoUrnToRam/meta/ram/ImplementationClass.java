/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.ImplementationClass#getInstanceClassName <em>Instance Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getImplementationClass()
 * @model
 * @generated
 */
public interface ImplementationClass extends Classifier {
	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see ram.RamPackage#getImplementationClass_InstanceClassName()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link ram.ImplementationClass#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

} // ImplementationClass
