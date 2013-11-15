/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl.kpimodel;

import jucm_OneFileWorkaround.grl.IntentionalElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.Indicator#getKpiModelLinksDest <em>Kpi Model Links Dest</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.Indicator#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getIndicator()
 * @model
 * @generated
 */
public interface Indicator extends IntentionalElement {
	/**
	 * Returns the value of the '<em><b>Kpi Model Links Dest</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.kpimodel.KPIModelLink}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.KPIModelLink#getIndDest <em>Ind Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi Model Links Dest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Model Links Dest</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getIndicator_KpiModelLinksDest()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KPIModelLink#getIndDest
	 * @model opposite="indDest"
	 * @generated
	 */
	EList<KPIModelLink> getKpiModelLinksDest();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup#getIndicators <em>Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getIndicator_Groups()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.IndicatorGroup#getIndicators
	 * @model opposite="indicators"
	 * @generated
	 */
	EList<IndicatorGroup> getGroups();

} // Indicator
