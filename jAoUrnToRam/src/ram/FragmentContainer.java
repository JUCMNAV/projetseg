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
 * A representation of the model object '<em><b>Fragment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.FragmentContainer#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getFragmentContainer()
 * @model abstract="true"
 * @generated
 */
public interface FragmentContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link ram.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link ram.InteractionFragment#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see ram.RamPackage#getFragmentContainer_Fragments()
	 * @see ram.InteractionFragment#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragments();

} // FragmentContainer
