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
 * A representation of the model object '<em><b>Transition Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.TransitionSubstitution#getFrom <em>From</em>}</li>
 *   <li>{@link ram.TransitionSubstitution#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getTransitionSubstitution()
 * @model
 * @generated
 */
public interface TransitionSubstitution extends Substitution {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Transition)
	 * @see ram.RamPackage#getTransitionSubstitution_From()
	 * @model required="true"
	 * @generated
	 */
	Transition getFrom();

	/**
	 * Sets the value of the '{@link ram.TransitionSubstitution#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Transition value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link ram.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see ram.RamPackage#getTransitionSubstitution_To()
	 * @model required="true"
	 * @generated
	 */
	EList<Transition> getTo();

} // TransitionSubstitution
