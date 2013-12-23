/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.StructuralView#getClasses <em>Classes</em>}</li>
 *   <li>{@link ram.StructuralView#getAssociations <em>Associations</em>}</li>
 *   <li>{@link ram.StructuralView#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getStructuralView()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueTypes noTwoClassesWithSameName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueTypes='self.types->isUnique(name)' uniqueTypes$message='\'There may be only one type of the same type\'' noTwoClassesWithSameName='self.classes->isUnique(name)' noTwoClassesWithSameName$message='\'Name of a class has to be unique\''"
 * @generated
 */
public interface StructuralView extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ram.RamPackage#getStructuralView_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClasses();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see ram.RamPackage#getStructuralView_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link ram.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see ram.RamPackage#getStructuralView_Types()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Type> getTypes();

} // StructuralView
