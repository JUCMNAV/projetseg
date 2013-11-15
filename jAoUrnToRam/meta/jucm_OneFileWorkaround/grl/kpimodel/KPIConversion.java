/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl.kpimodel;

import jucm_OneFileWorkaround.grl.GRLspec;

import jucm_OneFileWorkaround.urncore.GRLmodelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.KPIConversion#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.KPIConversion#getGrlspec <em>Grlspec</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getKPIConversion()
 * @model abstract="true"
 * @generated
 */
public interface KPIConversion extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Kpi Eval Value Set</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.kpimodel.KPIEvalValueSet}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.KPIEvalValueSet#getKpiConv <em>Kpi Conv</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi Eval Value Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Eval Value Set</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getKPIConversion_KpiEvalValueSet()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KPIEvalValueSet#getKpiConv
	 * @model opposite="kpiConv"
	 * @generated
	 */
	EList<KPIEvalValueSet> getKpiEvalValueSet();

	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getKPIConversion <em>KPI Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getKPIConversion_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getKPIConversion
	 * @model opposite="KPIConversion" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.kpimodel.KPIConversion#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

} // KPIConversion
