/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package grl;

import grl.kpimodel.IndicatorGroup;
import grl.kpimodel.KPIConversion;
import grl.kpimodel.KPIInformationElement;
import grl.kpimodel.KPIModelLink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import urn.URNspec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GR Lspec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grl.GRLspec#getUrnspec <em>Urnspec</em>}</li>
 *   <li>{@link grl.GRLspec#getIntElements <em>Int Elements</em>}</li>
 *   <li>{@link grl.GRLspec#getActors <em>Actors</em>}</li>
 *   <li>{@link grl.GRLspec#getLinks <em>Links</em>}</li>
 *   <li>{@link grl.GRLspec#getGroups <em>Groups</em>}</li>
 *   <li>{@link grl.GRLspec#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link grl.GRLspec#getContributionGroups <em>Contribution Groups</em>}</li>
 *   <li>{@link grl.GRLspec#getContributionContexts <em>Contribution Contexts</em>}</li>
 *   <li>{@link grl.GRLspec#getKpiInformationElements <em>Kpi Information Elements</em>}</li>
 *   <li>{@link grl.GRLspec#getKpiModelLinks <em>Kpi Model Links</em>}</li>
 *   <li>{@link grl.GRLspec#getIndicatorGroup <em>Indicator Group</em>}</li>
 *   <li>{@link grl.GRLspec#getKPIConversion <em>KPI Conversion</em>}</li>
 * </ul>
 * </p>
 *
 * @see grl.GrlPackage#getGRLspec()
 * @model
 * @generated
 */
public interface GRLspec extends EObject {
	/**
	 * Returns the value of the '<em><b>Urnspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link urn.URNspec#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urnspec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urnspec</em>' container reference.
	 * @see #setUrnspec(URNspec)
	 * @see grl.GrlPackage#getGRLspec_Urnspec()
	 * @see urn.URNspec#getGrlspec
	 * @model opposite="grlspec" required="true"
	 * @generated
	 */
	URNspec getUrnspec();

	/**
	 * Sets the value of the '{@link grl.GRLspec#getUrnspec <em>Urnspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urnspec</em>' container reference.
	 * @see #getUrnspec()
	 * @generated
	 */
	void setUrnspec(URNspec value);

	/**
	 * Returns the value of the '<em><b>Int Elements</b></em>' containment reference list.
	 * The list contents are of type {@link grl.IntentionalElement}.
	 * It is bidirectional and its opposite is '{@link grl.IntentionalElement#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Elements</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_IntElements()
	 * @see grl.IntentionalElement#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<IntentionalElement> getIntElements();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link grl.Actor}.
	 * It is bidirectional and its opposite is '{@link grl.Actor#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_Actors()
	 * @see grl.Actor#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link grl.ElementLink}.
	 * It is bidirectional and its opposite is '{@link grl.ElementLink#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_Links()
	 * @see grl.ElementLink#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<ElementLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link grl.StrategiesGroup}.
	 * It is bidirectional and its opposite is '{@link grl.StrategiesGroup#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_Groups()
	 * @see grl.StrategiesGroup#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<StrategiesGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link grl.EvaluationStrategy}.
	 * It is bidirectional and its opposite is '{@link grl.EvaluationStrategy#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_Strategies()
	 * @see grl.EvaluationStrategy#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<EvaluationStrategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Contribution Groups</b></em>' containment reference list.
	 * The list contents are of type {@link grl.ContributionContextGroup}.
	 * It is bidirectional and its opposite is '{@link grl.ContributionContextGroup#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution Groups</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_ContributionGroups()
	 * @see grl.ContributionContextGroup#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<ContributionContextGroup> getContributionGroups();

	/**
	 * Returns the value of the '<em><b>Contribution Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link grl.ContributionContext}.
	 * It is bidirectional and its opposite is '{@link grl.ContributionContext#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution Contexts</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_ContributionContexts()
	 * @see grl.ContributionContext#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<ContributionContext> getContributionContexts();

	/**
	 * Returns the value of the '<em><b>Kpi Information Elements</b></em>' containment reference list.
	 * The list contents are of type {@link grl.kpimodel.KPIInformationElement}.
	 * It is bidirectional and its opposite is '{@link grl.kpimodel.KPIInformationElement#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi Information Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Information Elements</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_KpiInformationElements()
	 * @see grl.kpimodel.KPIInformationElement#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<KPIInformationElement> getKpiInformationElements();

	/**
	 * Returns the value of the '<em><b>Kpi Model Links</b></em>' containment reference list.
	 * The list contents are of type {@link grl.kpimodel.KPIModelLink}.
	 * It is bidirectional and its opposite is '{@link grl.kpimodel.KPIModelLink#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi Model Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Model Links</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_KpiModelLinks()
	 * @see grl.kpimodel.KPIModelLink#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<KPIModelLink> getKpiModelLinks();

	/**
	 * Returns the value of the '<em><b>Indicator Group</b></em>' containment reference list.
	 * The list contents are of type {@link grl.kpimodel.IndicatorGroup}.
	 * It is bidirectional and its opposite is '{@link grl.kpimodel.IndicatorGroup#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicator Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator Group</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_IndicatorGroup()
	 * @see grl.kpimodel.IndicatorGroup#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<IndicatorGroup> getIndicatorGroup();

	/**
	 * Returns the value of the '<em><b>KPI Conversion</b></em>' containment reference list.
	 * The list contents are of type {@link grl.kpimodel.KPIConversion}.
	 * It is bidirectional and its opposite is '{@link grl.kpimodel.KPIConversion#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KPI Conversion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KPI Conversion</em>' containment reference list.
	 * @see grl.GrlPackage#getGRLspec_KPIConversion()
	 * @see grl.kpimodel.KPIConversion#getGrlspec
	 * @model opposite="grlspec" containment="true"
	 * @generated
	 */
	EList<KPIConversion> getKPIConversion();

} // GRLspec
