/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package grl.kpimodel.util;

import grl.GRLLinkableElement;
import grl.GRLNode;
import grl.IntentionalElement;

import grl.kpimodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import urncore.GRLmodelElement;
import urncore.IURNConnection;
import urncore.IURNNode;
import urncore.URNmodelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see grl.kpimodel.KpimodelPackage
 * @generated
 */
public class KpimodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KpimodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpimodelSwitch() {
		if (modelPackage == null) {
			modelPackage = KpimodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KpimodelPackage.INDICATOR_GROUP: {
				IndicatorGroup indicatorGroup = (IndicatorGroup)theEObject;
				T result = caseIndicatorGroup(indicatorGroup);
				if (result == null) result = caseGRLmodelElement(indicatorGroup);
				if (result == null) result = caseURNmodelElement(indicatorGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.INDICATOR: {
				Indicator indicator = (Indicator)theEObject;
				T result = caseIndicator(indicator);
				if (result == null) result = caseIntentionalElement(indicator);
				if (result == null) result = caseGRLLinkableElement(indicator);
				if (result == null) result = caseGRLmodelElement(indicator);
				if (result == null) result = caseURNmodelElement(indicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_INFORMATION_ELEMENT: {
				KPIInformationElement kpiInformationElement = (KPIInformationElement)theEObject;
				T result = caseKPIInformationElement(kpiInformationElement);
				if (result == null) result = caseGRLmodelElement(kpiInformationElement);
				if (result == null) result = caseURNmodelElement(kpiInformationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_INFORMATION_ELEMENT_REF: {
				KPIInformationElementRef kpiInformationElementRef = (KPIInformationElementRef)theEObject;
				T result = caseKPIInformationElementRef(kpiInformationElementRef);
				if (result == null) result = caseGRLNode(kpiInformationElementRef);
				if (result == null) result = caseGRLmodelElement(kpiInformationElementRef);
				if (result == null) result = caseIURNNode(kpiInformationElementRef);
				if (result == null) result = caseURNmodelElement(kpiInformationElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_MODEL_LINK: {
				KPIModelLink kpiModelLink = (KPIModelLink)theEObject;
				T result = caseKPIModelLink(kpiModelLink);
				if (result == null) result = caseGRLmodelElement(kpiModelLink);
				if (result == null) result = caseURNmodelElement(kpiModelLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_MODEL_LINK_REF: {
				KPIModelLinkRef kpiModelLinkRef = (KPIModelLinkRef)theEObject;
				T result = caseKPIModelLinkRef(kpiModelLinkRef);
				if (result == null) result = caseIURNConnection(kpiModelLinkRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_EVAL_VALUE_SET: {
				KPIEvalValueSet kpiEvalValueSet = (KPIEvalValueSet)theEObject;
				T result = caseKPIEvalValueSet(kpiEvalValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_INFORMATION_CONFIG: {
				KPIInformationConfig kpiInformationConfig = (KPIInformationConfig)theEObject;
				T result = caseKPIInformationConfig(kpiInformationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_NEW_EVAL_VALUE: {
				KPINewEvalValue kpiNewEvalValue = (KPINewEvalValue)theEObject;
				T result = caseKPINewEvalValue(kpiNewEvalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.KPI_CONVERSION: {
				KPIConversion kpiConversion = (KPIConversion)theEObject;
				T result = caseKPIConversion(kpiConversion);
				if (result == null) result = caseGRLmodelElement(kpiConversion);
				if (result == null) result = caseURNmodelElement(kpiConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.QUALITATIVE_MAPPINGS: {
				QualitativeMappings qualitativeMappings = (QualitativeMappings)theEObject;
				T result = caseQualitativeMappings(qualitativeMappings);
				if (result == null) result = caseKPIConversion(qualitativeMappings);
				if (result == null) result = caseGRLmodelElement(qualitativeMappings);
				if (result == null) result = caseURNmodelElement(qualitativeMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpimodelPackage.QUALITATIVE_MAPPING: {
				QualitativeMapping qualitativeMapping = (QualitativeMapping)theEObject;
				T result = caseQualitativeMapping(qualitativeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indicator Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indicator Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndicatorGroup(IndicatorGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndicator(Indicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Information Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Information Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIInformationElement(KPIInformationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Information Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Information Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIInformationElementRef(KPIInformationElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Model Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Model Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIModelLink(KPIModelLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Model Link Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Model Link Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIModelLinkRef(KPIModelLinkRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Eval Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Eval Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIEvalValueSet(KPIEvalValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Information Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Information Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIInformationConfig(KPIInformationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI New Eval Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI New Eval Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPINewEvalValue(KPINewEvalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIConversion(KPIConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeMappings(QualitativeMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeMapping(QualitativeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURNmodelElement(URNmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Lmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Lmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLmodelElement(GRLmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLLinkableElement(GRLLinkableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionalElement(IntentionalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNNode(IURNNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLNode(GRLNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNConnection(IURNConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //KpimodelSwitch
