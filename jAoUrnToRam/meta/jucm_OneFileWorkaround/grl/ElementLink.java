/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl;

import jucm_OneFileWorkaround.urncore.GRLmodelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.ElementLink#getRefs <em>Refs</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ElementLink#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ElementLink#getDest <em>Dest</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ElementLink#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getElementLink()
 * @model
 * @generated
 */
public interface ElementLink extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.LinkRef}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.LinkRef#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getElementLink_Refs()
	 * @see jucm_OneFileWorkaround.grl.LinkRef#getLink
	 * @model opposite="link"
	 * @generated
	 */
	EList<LinkRef> getRefs();

	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getElementLink_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getLinks
	 * @model opposite="links" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.ElementLink#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLLinkableElement#getLinksDest <em>Links Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(GRLLinkableElement)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getElementLink_Dest()
	 * @see jucm_OneFileWorkaround.grl.GRLLinkableElement#getLinksDest
	 * @model opposite="linksDest" required="true"
	 * @generated
	 */
	GRLLinkableElement getDest();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.ElementLink#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(GRLLinkableElement value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLLinkableElement#getLinksSrc <em>Links Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(GRLLinkableElement)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getElementLink_Src()
	 * @see jucm_OneFileWorkaround.grl.GRLLinkableElement#getLinksSrc
	 * @model opposite="linksSrc" required="true"
	 * @generated
	 */
	GRLLinkableElement getSrc();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.ElementLink#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(GRLLinkableElement value);

} // ElementLink
