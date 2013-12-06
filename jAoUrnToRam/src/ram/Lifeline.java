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
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link ram.Lifeline#getLocalProperties <em>Local Properties</em>}</li>
 *   <li>{@link ram.Lifeline#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(TypedElement)
	 * @see ram.RamPackage#getLifeline_Represents()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypedElement getRepresents();

	/**
	 * Sets the value of the '{@link ram.Lifeline#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(TypedElement value);

	/**
	 * Returns the value of the '<em><b>Local Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ram.TemporaryProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Properties</em>' containment reference list.
	 * @see ram.RamPackage#getLifeline_LocalProperties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TemporaryProperty> getLocalProperties();

	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link ram.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link ram.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see ram.RamPackage#getLifeline_CoveredBy()
	 * @see ram.InteractionFragment#getCovered
	 * @model opposite="covered" required="true" ordered="false"
	 * @generated
	 */
	EList<InteractionFragment> getCoveredBy();

} // Lifeline
