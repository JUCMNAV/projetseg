/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.AssociationEnd#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link ram.AssociationEnd#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link ram.AssociationEnd#getMyClass <em>My Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getAssociationEnd()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueName='self.myClass.associationEnds->select(associationEnd : AssociationEnd | associationEnd.name <> null and associationEnd.name <> \'\')->isUnique(name)' uniqueName$message='\'AssociationEnds of a class must be unique\''"
 * @generated
 */
public interface AssociationEnd extends Property {
	/**
	 * Returns the value of the '<em><b>Navigable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable</em>' attribute.
	 * @see #setNavigable(boolean)
	 * @see ram.RamPackage#getAssociationEnd_Navigable()
	 * @model default="true"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * Sets the value of the '{@link ram.AssociationEnd#isNavigable <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable</em>' attribute.
	 * @see #isNavigable()
	 * @generated
	 */
	void setNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>Assoc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ram.Association#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc</em>' reference.
	 * @see #setAssoc(Association)
	 * @see ram.RamPackage#getAssociationEnd_Assoc()
	 * @see ram.Association#getEnds
	 * @model opposite="ends" required="true"
	 * @generated
	 */
	Association getAssoc();

	/**
	 * Sets the value of the '{@link ram.AssociationEnd#getAssoc <em>Assoc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assoc</em>' reference.
	 * @see #getAssoc()
	 * @generated
	 */
	void setAssoc(Association value);

	/**
	 * Returns the value of the '<em><b>My Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ram.Class#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Class</em>' container reference.
	 * @see #setMyClass(ram.Class)
	 * @see ram.RamPackage#getAssociationEnd_MyClass()
	 * @see ram.Class#getAssociationEnds
	 * @model opposite="associationEnds" required="true" transient="false"
	 * @generated
	 */
	ram.Class getMyClass();

	/**
	 * Sets the value of the '{@link ram.AssociationEnd#getMyClass <em>My Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Class</em>' container reference.
	 * @see #getMyClass()
	 * @generated
	 */
	void setMyClass(ram.Class value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.assoc.ends->select(end : AssociationEnd | end <> self)->at(1).myClass'"
	 * @generated
	 */
	Type getType();

} // AssociationEnd
