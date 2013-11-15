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
 * A representation of the model object '<em><b>Contribution Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.ContributionContext#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ContributionContext#getGroups <em>Groups</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ContributionContext#getChanges <em>Changes</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ContributionContext#getParentContexts <em>Parent Contexts</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ContributionContext#getIncludedContexts <em>Included Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContext()
 * @model
 * @generated
 */
public interface ContributionContext extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getContributionContexts <em>Contribution Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContext_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getContributionContexts
	 * @model opposite="contributionContexts" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.ContributionContext#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.ContributionContextGroup}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ContributionContextGroup#getContribs <em>Contribs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContext_Groups()
	 * @see jucm_OneFileWorkaround.grl.ContributionContextGroup#getContribs
	 * @model opposite="contribs"
	 * @generated
	 */
	EList<ContributionContextGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.ContributionChange}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ContributionChange#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContext_Changes()
	 * @see jucm_OneFileWorkaround.grl.ContributionChange#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<ContributionChange> getChanges();

	/**
	 * Returns the value of the '<em><b>Parent Contexts</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.ContributionContext}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ContributionContext#getIncludedContexts <em>Included Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Contexts</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContext_ParentContexts()
	 * @see jucm_OneFileWorkaround.grl.ContributionContext#getIncludedContexts
	 * @model opposite="includedContexts"
	 * @generated
	 */
	EList<ContributionContext> getParentContexts();

	/**
	 * Returns the value of the '<em><b>Included Contexts</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.ContributionContext}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ContributionContext#getParentContexts <em>Parent Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Contexts</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContext_IncludedContexts()
	 * @see jucm_OneFileWorkaround.grl.ContributionContext#getParentContexts
	 * @model opposite="parentContexts"
	 * @generated
	 */
	EList<ContributionContext> getIncludedContexts();

} // ContributionContext
