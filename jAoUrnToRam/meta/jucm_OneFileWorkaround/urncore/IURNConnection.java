/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IURN Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNConnection#getSource <em>Source</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNConnection#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urncore.IURNConnection#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNConnection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IURNConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNNode#getSucc <em>Succ</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IURNNode)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNConnection_Source()
	 * @see jucm_OneFileWorkaround.urncore.IURNNode#getSucc
	 * @model opposite="succ" required="true"
	 * @generated
	 */
	IURNNode getSource();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.IURNConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IURNNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNNode#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IURNNode)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNConnection_Target()
	 * @see jucm_OneFileWorkaround.urncore.IURNNode#getPred
	 * @model opposite="pred" required="true"
	 * @generated
	 */
	IURNNode getTarget();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.IURNConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IURNNode value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.IURNDiagram#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(IURNDiagram)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNConnection_Diagram()
	 * @see jucm_OneFileWorkaround.urncore.IURNDiagram#getConnections
	 * @model opposite="connections" required="true"
	 * @generated
	 */
	IURNDiagram getDiagram();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.IURNConnection#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(IURNDiagram value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.ConnectionLabel#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(ConnectionLabel)
	 * @see jucm_OneFileWorkaround.urncore.UrncorePackage#getIURNConnection_Label()
	 * @see jucm_OneFileWorkaround.urncore.ConnectionLabel#getConnection
	 * @model opposite="connection" containment="true"
	 * @generated
	 */
	ConnectionLabel getLabel();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urncore.IURNConnection#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(ConnectionLabel value);

} // IURNConnection
