/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.performance;

import jucm_OneFileWorkaround.urncore.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.performance.PassiveResource#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.performance.PerformancePackage#getPassiveResource()
 * @model
 * @generated
 */
public interface PassiveResource extends GeneralResource {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Component#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see jucm_OneFileWorkaround.ucm.performance.PerformancePackage#getPassiveResource_Component()
	 * @see jucm_OneFileWorkaround.urncore.Component#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.performance.PassiveResource#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // PassiveResource
