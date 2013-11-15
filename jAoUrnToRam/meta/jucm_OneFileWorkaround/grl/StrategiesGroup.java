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
 * A representation of the model object '<em><b>Strategies Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.StrategiesGroup#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.StrategiesGroup#getGrlspec <em>Grlspec</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getStrategiesGroup()
 * @model
 * @generated
 */
public interface StrategiesGroup extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.EvaluationStrategy}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.EvaluationStrategy#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getStrategiesGroup_Strategies()
	 * @see jucm_OneFileWorkaround.grl.EvaluationStrategy#getGroup
	 * @model opposite="group"
	 * @generated
	 */
	EList<EvaluationStrategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.GrlPackage#getStrategiesGroup_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getGroups
	 * @model opposite="groups" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.StrategiesGroup#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

} // StrategiesGroup
