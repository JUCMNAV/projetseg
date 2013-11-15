/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.scenario;

import jucm_OneFileWorkaround.ucm.UCMspec;

import jucm_OneFileWorkaround.urncore.UCMmodelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.scenario.EnumerationType#getValues <em>Values</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.scenario.EnumerationType#getUcmspec <em>Ucmspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.scenario.EnumerationType#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.scenario.ScenarioPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends UCMmodelElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see jucm_OneFileWorkaround.ucm.scenario.ScenarioPackage#getEnumerationType_Values()
	 * @model
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.scenario.EnumerationType#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

	/**
	 * Returns the value of the '<em><b>Ucmspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.UCMspec#getEnumerationTypes <em>Enumeration Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ucmspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ucmspec</em>' container reference.
	 * @see #setUcmspec(UCMspec)
	 * @see jucm_OneFileWorkaround.ucm.scenario.ScenarioPackage#getEnumerationType_Ucmspec()
	 * @see jucm_OneFileWorkaround.ucm.UCMspec#getEnumerationTypes
	 * @model opposite="enumerationTypes" required="true"
	 * @generated
	 */
	UCMspec getUcmspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.scenario.EnumerationType#getUcmspec <em>Ucmspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ucmspec</em>' container reference.
	 * @see #getUcmspec()
	 * @generated
	 */
	void setUcmspec(UCMspec value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.scenario.Variable}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.scenario.Variable#getEnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.scenario.ScenarioPackage#getEnumerationType_Instances()
	 * @see jucm_OneFileWorkaround.ucm.scenario.Variable#getEnumerationType
	 * @model opposite="enumerationType"
	 * @generated
	 */
	EList<Variable> getInstances();

} // EnumerationType
