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
 * A representation of the model object '<em><b>Contribution Context Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.ContributionContextGroup#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.ContributionContextGroup#getContribs <em>Contribs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContextGroup()
 * @model
 * @generated
 */
public interface ContributionContextGroup extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getContributionGroups <em>Contribution Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContextGroup_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getContributionGroups
	 * @model opposite="contributionGroups" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.ContributionContextGroup#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Contribs</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.ContributionContext}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.ContributionContext#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribs</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionContextGroup_Contribs()
	 * @see jucm_OneFileWorkaround.grl.ContributionContext#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<ContributionContext> getContribs();

} // ContributionContextGroup
