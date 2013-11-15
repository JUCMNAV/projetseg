/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl;

import jucm_OneFileWorkaround.urncore.IURNConnection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.LinkRef#getLink <em>Link</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.LinkRef#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getLinkRef()
 * @model
 * @generated
 */
public interface LinkRef extends IURNConnection {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ElementLink#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(ElementLink)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getLinkRef_Link()
	 * @see jucm_OneFileWorkaround.grl.ElementLink#getRefs
	 * @model opposite="refs" required="true"
	 * @generated
	 */
	ElementLink getLink();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.LinkRef#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(ElementLink value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.LinkRefBendpoint}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.LinkRefBendpoint#getLinkref <em>Linkref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getLinkRef_Bendpoints()
	 * @see jucm_OneFileWorkaround.grl.LinkRefBendpoint#getLinkref
	 * @model opposite="linkref" containment="true"
	 * @generated
	 */
	EList<LinkRefBendpoint> getBendpoints();

} // LinkRef
