/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.performance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.performance.ExternalOperation#getDemands <em>Demands</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.performance.PerformancePackage#getExternalOperation()
 * @model
 * @generated
 */
public interface ExternalOperation extends ActiveResource {
	/**
	 * Returns the value of the '<em><b>Demands</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.performance.Demand}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.performance.Demand#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demands</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.performance.PerformancePackage#getExternalOperation_Demands()
	 * @see jucm_OneFileWorkaround.ucm.performance.Demand#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	EList<Demand> getDemands();

} // ExternalOperation
