/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl.kpimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.QualitativeMappings#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getQualitativeMappings()
 * @model
 * @generated
 */
public interface QualitativeMappings extends KPIConversion {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.kpimodel.QualitativeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getQualitativeMappings_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualitativeMapping> getMapping();

} // QualitativeMappings
