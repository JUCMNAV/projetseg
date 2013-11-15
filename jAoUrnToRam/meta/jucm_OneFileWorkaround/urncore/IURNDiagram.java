/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IURN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getUrndefinition <em>Urndefinition</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getContRefs <em>Cont Refs</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getConnections <em>Connections</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getConcern <em>Concern</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNDiagram()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IURNDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Urndefinition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNdefinition#getSpecDiagrams <em>Spec Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urndefinition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urndefinition</em>' container reference.
	 * @see #setUrndefinition(URNdefinition)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNDiagram_Urndefinition()
	 * @see jucm_OneFileWorkaround.urncore.URNdefinition#getSpecDiagrams
	 * @model opposite="specDiagrams" required="true"
	 * @generated
	 */
	URNdefinition getUrndefinition();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getUrndefinition <em>Urndefinition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urndefinition</em>' container reference.
	 * @see #getUrndefinition()
	 * @generated
	 */
	void setUrndefinition(URNdefinition value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.IURNNode}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNDiagram_Nodes()
	 * @see jucm_OneFileWorkaround.urncore.IURNNode#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<IURNNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Cont Refs</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.IURNContainerRef}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNContainerRef#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cont Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont Refs</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNDiagram_ContRefs()
	 * @see jucm_OneFileWorkaround.urncore.IURNContainerRef#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<IURNContainerRef> getContRefs();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.IURNConnection}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNConnection#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNDiagram_Connections()
	 * @see jucm_OneFileWorkaround.urncore.IURNConnection#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<IURNConnection> getConnections();

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Concern#getSpecDiagrams <em>Spec Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' reference.
	 * @see #setConcern(Concern)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNDiagram_Concern()
	 * @see jucm_OneFileWorkaround.urncore.Concern#getSpecDiagrams
	 * @model opposite="specDiagrams"
	 * @generated
	 */
	Concern getConcern();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getConcern <em>Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern</em>' reference.
	 * @see #getConcern()
	 * @generated
	 */
	void setConcern(Concern value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.Comment}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Comment#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNDiagram_Comments()
	 * @see jucm_OneFileWorkaround.urncore.Comment#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // IURNDiagram
