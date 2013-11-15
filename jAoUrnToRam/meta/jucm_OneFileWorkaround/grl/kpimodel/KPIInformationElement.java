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
 * A representation of the model object '<em><b>KPI Information Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.KPIInformationElement#getRefs <em>Refs</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.KPIInformationElement#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.grl.kpimodel.KPIInformationElement#getKpiModelLinksSrc <em>Kpi Model Links Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getKPIInformationElement()
 * @model
 * @generated
 */
public interface KPIInformationElement extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.kpimodel.KPIInformationElementRef}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.KPIInformationElementRef#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getKPIInformationElement_Refs()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KPIInformationElementRef#getDef
	 * @model opposite="def"
	 * @generated
	 */
	EList<KPIInformationElementRef> getRefs();

	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.GRLspec#getKpiInformationElements <em>Kpi Information Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getKPIInformationElement_Grlspec()
	 * @see jucm_OneFileWorkaround.grl.GRLspec#getKpiInformationElements
	 * @model opposite="kpiInformationElements" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.grl.kpimodel.KPIInformationElement#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Kpi Model Links Src</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.grl.kpimodel.KPIModelLink}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.grl.kpimodel.KPIModelLink#getKpiInformationElementSrc <em>Kpi Information Element Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi Model Links Src</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Model Links Src</em>' reference list.
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KpimodelPackage#getKPIInformationElement_KpiModelLinksSrc()
	 * @see jucm_OneFileWorkaround.grl.kpimodel.KPIModelLink#getKpiInformationElementSrc
	 * @model opposite="kpiInformationElementSrc"
	 * @generated
	 */
	EList<KPIModelLink> getKpiModelLinksSrc();

} // KPIInformationElement
