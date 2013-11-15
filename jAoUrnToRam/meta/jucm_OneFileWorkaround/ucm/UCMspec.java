/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm;

import jucm_OneFileWorkaround.ucm.performance.GeneralResource;

import jucm_OneFileWorkaround.ucm.scenario.EnumerationType;
import jucm_OneFileWorkaround.ucm.scenario.ScenarioGroup;
import jucm_OneFileWorkaround.ucm.scenario.Variable;

import jucm_OneFileWorkaround.urn.URNspec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Mspec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.UCMspec#getUrnspec <em>Urnspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.UCMspec#getResources <em>Resources</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.UCMspec#getScenarioGroups <em>Scenario Groups</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.UCMspec#getVariables <em>Variables</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.UCMspec#getEnumerationTypes <em>Enumeration Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.UcmPackage#getUCMspec()
 * @model
 * @generated
 */
public interface UCMspec extends EObject {
	/**
	 * Returns the value of the '<em><b>Urnspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urn.URNspec#getUcmspec <em>Ucmspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urnspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urnspec</em>' container reference.
	 * @see #setUrnspec(URNspec)
	 * @see jucm_OneFileWorkaround.ucm.UcmPackage#getUCMspec_Urnspec()
	 * @see jucm_OneFileWorkaround.urn.URNspec#getUcmspec
	 * @model opposite="ucmspec" required="true"
	 * @generated
	 */
	URNspec getUrnspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.UCMspec#getUrnspec <em>Urnspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urnspec</em>' container reference.
	 * @see #getUrnspec()
	 * @generated
	 */
	void setUrnspec(URNspec value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.performance.GeneralResource}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.performance.GeneralResource#getUcmspec <em>Ucmspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.ucm.UcmPackage#getUCMspec_Resources()
	 * @see jucm_OneFileWorkaround.ucm.performance.GeneralResource#getUcmspec
	 * @model opposite="ucmspec" containment="true"
	 * @generated
	 */
	EList<GeneralResource> getResources();

	/**
	 * Returns the value of the '<em><b>Scenario Groups</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.scenario.ScenarioGroup}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.scenario.ScenarioGroup#getUcmspec <em>Ucmspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Groups</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.ucm.UcmPackage#getUCMspec_ScenarioGroups()
	 * @see jucm_OneFileWorkaround.ucm.scenario.ScenarioGroup#getUcmspec
	 * @model opposite="ucmspec" containment="true"
	 * @generated
	 */
	EList<ScenarioGroup> getScenarioGroups();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.scenario.Variable}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.scenario.Variable#getUcmspec <em>Ucmspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.ucm.UcmPackage#getUCMspec_Variables()
	 * @see jucm_OneFileWorkaround.ucm.scenario.Variable#getUcmspec
	 * @model opposite="ucmspec" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Enumeration Types</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.scenario.EnumerationType}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.scenario.EnumerationType#getUcmspec <em>Ucmspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Types</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.ucm.UcmPackage#getUCMspec_EnumerationTypes()
	 * @see jucm_OneFileWorkaround.ucm.scenario.EnumerationType#getUcmspec
	 * @model opposite="ucmspec" containment="true"
	 * @generated
	 */
	EList<EnumerationType> getEnumerationTypes();

} // UCMspec
