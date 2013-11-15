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
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.InteractionFragment#getCovered <em>Covered</em>}</li>
 *   <li>{@link ram.InteractionFragment#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getInteractionFragment()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validCoveredMultiplicity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validCoveredMultiplicity='if not self.oclIsTypeOf(CombinedFragment) and covered->notEmpty() then covered->size() = 1 else true endif' validCoveredMultiplicity$message='\'InteractionFragment may only have one Lifeline it covers (except CombinedFragment)\''"
 * @generated
 */
public interface InteractionFragment extends EObject {
	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link ram.Lifeline}.
	 * It is bidirectional and its opposite is '{@link ram.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see ram.RamPackage#getInteractionFragment_Covered()
	 * @see ram.Lifeline#getCoveredBy
	 * @model opposite="coveredBy" required="true" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getCovered();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ram.FragmentContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(FragmentContainer)
	 * @see ram.RamPackage#getInteractionFragment_Container()
	 * @see ram.FragmentContainer#getFragments
	 * @model opposite="fragments" required="true" transient="false" ordered="false"
	 * @generated
	 */
	FragmentContainer getContainer();

	/**
	 * Sets the value of the '{@link ram.InteractionFragment#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(FragmentContainer value);

} // InteractionFragment
