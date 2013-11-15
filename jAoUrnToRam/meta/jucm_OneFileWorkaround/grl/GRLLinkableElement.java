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
 * A representation of the model object '<em><b>GRL Linkable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.GRLLinkableElement#getLinksDest <em>Links Dest</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.GRLLinkableElement#getLinksSrc <em>Links Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getGRLLinkableElement()
 * @model abstract="true"
 * @generated
 */
public interface GRLLinkableElement extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Links Dest</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.ElementLink}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ElementLink#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links Dest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links Dest</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getGRLLinkableElement_LinksDest()
	 * @see jucm_OneFileWorkaround.grl.ElementLink#getDest
	 * @model opposite="dest"
	 * @generated
	 */
	EList<ElementLink> getLinksDest();

	/**
	 * Returns the value of the '<em><b>Links Src</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.ElementLink}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ElementLink#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links Src</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links Src</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getGRLLinkableElement_LinksSrc()
	 * @see jucm_OneFileWorkaround.grl.ElementLink#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<ElementLink> getLinksSrc();

} // GRLLinkableElement
