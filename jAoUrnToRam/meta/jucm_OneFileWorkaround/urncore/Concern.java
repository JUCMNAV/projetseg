/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Concern#getUrndefinition <em>Urndefinition</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Concern#getSpecDiagrams <em>Spec Diagrams</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Concern#getElements <em>Elements</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.Concern#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends URNmodelElement {
	void build();
	void link();
	jucm_OneFileWorkaround.urn.URNspec urnSpec(); 
	intermediateWorkflow.IwConcern iwConcern();
	/**
	 * Returns the value of the '<em><b>Urndefinition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNdefinition#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urndefinition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urndefinition</em>' container reference.
	 * @see #setUrndefinition(URNdefinition)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getConcern_Urndefinition()
	 * @see jucm_OneFileWorkaround.urncore.URNdefinition#getConcerns
	 * @model opposite="concerns" required="true"
	 * @generated
	 */
	URNdefinition getUrndefinition();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Concern#getUrndefinition <em>Urndefinition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urndefinition</em>' container reference.
	 * @see #getUrndefinition()
	 * @generated
	 */
	void setUrndefinition(URNdefinition value);

	/**
	 * Returns the value of the '<em><b>Spec Diagrams</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.IURNDiagram}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Diagrams</em>' reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getConcern_SpecDiagrams()
	 * @see jucm_OneFileWorkaround.urncore.IURNDiagram#getConcern
	 * @model opposite="concern"
	 * @generated
	 */
	EList<IURNDiagram> getSpecDiagrams();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.URNmodelElement}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNmodelElement#getInconcern <em>Inconcern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getConcern_Elements()
	 * @see jucm_OneFileWorkaround.urncore.URNmodelElement#getInconcern
	 * @model opposite="inconcern"
	 * @generated
	 */
	EList<URNmodelElement> getElements();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Condition#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getConcern_Condition()
	 * @see jucm_OneFileWorkaround.urncore.Condition#getConcern
	 * @model opposite="concern" containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.Concern#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Concern
