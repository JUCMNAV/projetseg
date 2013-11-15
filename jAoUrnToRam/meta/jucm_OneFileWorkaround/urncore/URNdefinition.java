/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore;

import jucm_OneFileWorkaround.urn.URNspec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UR Ndefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urncore.URNdefinition#getUrnspec <em>Urnspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.URNdefinition#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.URNdefinition#getSpecDiagrams <em>Spec Diagrams</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.URNdefinition#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.URNdefinition#getComponents <em>Components</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.URNdefinition#getComponentTypes <em>Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getURNdefinition()
 * @model
 * @generated
 */
public interface URNdefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Urnspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urn.URNspec#getUrndef <em>Urndef</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urnspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urnspec</em>' container reference.
	 * @see #setUrnspec(URNspec)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getURNdefinition_Urnspec()
	 * @see jucm_OneFileWorkaround.urn.URNspec#getUrndef
	 * @model opposite="urndef" required="true"
	 * @generated
	 */
	URNspec getUrnspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.URNdefinition#getUrnspec <em>Urnspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urnspec</em>' container reference.
	 * @see #getUrnspec()
	 * @generated
	 */
	void setUrnspec(URNspec value);

	/**
	 * Returns the value of the '<em><b>Responsibilities</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.Responsibility}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Responsibility#getUrndefinition <em>Urndefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibilities</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getURNdefinition_Responsibilities()
	 * @see jucm_OneFileWorkaround.urncore.Responsibility#getUrndefinition
	 * @model opposite="urndefinition" containment="true"
	 * @generated
	 */
	EList<Responsibility> getResponsibilities();

	/**
	 * Returns the value of the '<em><b>Spec Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.IURNDiagram}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getUrndefinition <em>Urndefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Diagrams</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getURNdefinition_SpecDiagrams()
	 * @see jucm_OneFileWorkaround.urncore.IURNDiagram#getUrndefinition
	 * @model opposite="urndefinition" containment="true"
	 * @generated
	 */
	EList<IURNDiagram> getSpecDiagrams();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.Concern}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Concern#getUrndefinition <em>Urndefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getURNdefinition_Concerns()
	 * @see jucm_OneFileWorkaround.urncore.Concern#getUrndefinition
	 * @model opposite="urndefinition" containment="true"
	 * @generated
	 */
	EList<Concern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.Component}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Component#getUrndefinition <em>Urndefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getURNdefinition_Components()
	 * @see jucm_OneFileWorkaround.urncore.Component#getUrndefinition
	 * @model opposite="urndefinition" containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Component Types</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.ComponentType}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.ComponentType#getUrndefinition <em>Urndefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Types</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getURNdefinition_ComponentTypes()
	 * @see jucm_OneFileWorkaround.urncore.ComponentType#getUrndefinition
	 * @model opposite="urndefinition" containment="true"
	 * @generated
	 */
	EList<ComponentType> getComponentTypes();

} // URNdefinition
