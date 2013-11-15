/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urn;

import jucm_OneFileWorkaround.urncore.Metadata;
import jucm_OneFileWorkaround.urncore.URNmodelElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UR Nlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNlink#getType <em>Type</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNlink#getUrnspec <em>Urnspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNlink#getFromElem <em>From Elem</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNlink#getToElem <em>To Elem</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.urn.URNlink#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNlink()
 * @model
 * @generated
 */
public interface URNlink extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNlink_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNlink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Urnspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urn.URNspec#getUrnLinks <em>Urn Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urnspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urnspec</em>' container reference.
	 * @see #setUrnspec(URNspec)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNlink_Urnspec()
	 * @see jucm_OneFileWorkaround.urn.URNspec#getUrnLinks
	 * @model opposite="urnLinks" required="true"
	 * @generated
	 */
	URNspec getUrnspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNlink#getUrnspec <em>Urnspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urnspec</em>' container reference.
	 * @see #getUrnspec()
	 * @generated
	 */
	void setUrnspec(URNspec value);

	/**
	 * Returns the value of the '<em><b>From Elem</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNmodelElement#getFromLinks <em>From Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Elem</em>' reference.
	 * @see #setFromElem(URNmodelElement)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNlink_FromElem()
	 * @see jucm_OneFileWorkaround.urncore.URNmodelElement#getFromLinks
	 * @model opposite="fromLinks" required="true"
	 * @generated
	 */
	URNmodelElement getFromElem();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNlink#getFromElem <em>From Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Elem</em>' reference.
	 * @see #getFromElem()
	 * @generated
	 */
	void setFromElem(URNmodelElement value);

	/**
	 * Returns the value of the '<em><b>To Elem</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.URNmodelElement#getToLinks <em>To Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Elem</em>' reference.
	 * @see #setToElem(URNmodelElement)
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNlink_ToElem()
	 * @see jucm_OneFileWorkaround.urncore.URNmodelElement#getToLinks
	 * @model opposite="toLinks" required="true"
	 * @generated
	 */
	URNmodelElement getToElem();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.urn.URNlink#getToElem <em>To Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Elem</em>' reference.
	 * @see #getToElem()
	 * @generated
	 */
	void setToElem(URNmodelElement value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.urncore.Metadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.urn.UrnPackage#getURNlink_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // URNlink
