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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Class#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link ram.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ram.Class#isPartial <em>Partial</em>}</li>
 *   <li>{@link ram.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ram.Class#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notSelfSuperType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot notSelfSuperType='not self.superTypes->includes(self)' notSelfSuperType$message='\'A class may not be it\\\'s own supertype\''"
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Association Ends</b></em>' containment reference list.
	 * The list contents are of type {@link ram.AssociationEnd}.
	 * It is bidirectional and its opposite is '{@link ram.AssociationEnd#getMyClass <em>My Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Ends</em>' containment reference list.
	 * @see ram.RamPackage#getClass_AssociationEnds()
	 * @see ram.AssociationEnd#getMyClass
	 * @model opposite="myClass" containment="true"
	 * @generated
	 */
	EList<AssociationEnd> getAssociationEnds();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ram.RamPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Partial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial</em>' attribute.
	 * @see #setPartial(boolean)
	 * @see ram.RamPackage#getClass_Partial()
	 * @model default="false"
	 * @generated
	 */
	boolean isPartial();

	/**
	 * Sets the value of the '{@link ram.Class#isPartial <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial</em>' attribute.
	 * @see #isPartial()
	 * @generated
	 */
	void setPartial(boolean value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see ram.RamPackage#getClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link ram.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link ram.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see ram.RamPackage#getClass_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<Classifier> getSuperTypes();

} // Class
