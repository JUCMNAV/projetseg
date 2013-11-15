/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.performance.util;

import jucm_OneFileWorkaround.ucm.performance.*;

import jucm_OneFileWorkaround.urncore.UCMmodelElement;
import jucm_OneFileWorkaround.urncore.URNmodelElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see jucm_OneFileWorkaround.ucm.performance.PerformancePackage
 * @generated
 */
public class PerformanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerformancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceSwitch() {
		if (modelPackage == null) {
			modelPackage = PerformancePackage.eINSTANCE;
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
			case PerformancePackage.WORKLOAD: {
				Workload workload = (Workload)theEObject;
				T result = caseWorkload(workload);
				if (result == null) result = caseUCMmodelElement(workload);
				if (result == null) result = caseURNmodelElement(workload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.GENERAL_RESOURCE: {
				GeneralResource generalResource = (GeneralResource)theEObject;
				T result = caseGeneralResource(generalResource);
				if (result == null) result = caseUCMmodelElement(generalResource);
				if (result == null) result = caseURNmodelElement(generalResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.ACTIVE_RESOURCE: {
				ActiveResource activeResource = (ActiveResource)theEObject;
				T result = caseActiveResource(activeResource);
				if (result == null) result = caseGeneralResource(activeResource);
				if (result == null) result = caseUCMmodelElement(activeResource);
				if (result == null) result = caseURNmodelElement(activeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.PASSIVE_RESOURCE: {
				PassiveResource passiveResource = (PassiveResource)theEObject;
				T result = casePassiveResource(passiveResource);
				if (result == null) result = caseGeneralResource(passiveResource);
				if (result == null) result = caseUCMmodelElement(passiveResource);
				if (result == null) result = caseURNmodelElement(passiveResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.EXTERNAL_OPERATION: {
				ExternalOperation externalOperation = (ExternalOperation)theEObject;
				T result = caseExternalOperation(externalOperation);
				if (result == null) result = caseActiveResource(externalOperation);
				if (result == null) result = caseGeneralResource(externalOperation);
				if (result == null) result = caseUCMmodelElement(externalOperation);
				if (result == null) result = caseURNmodelElement(externalOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.PROCESSING_RESOURCE: {
				ProcessingResource processingResource = (ProcessingResource)theEObject;
				T result = caseProcessingResource(processingResource);
				if (result == null) result = caseActiveResource(processingResource);
				if (result == null) result = caseGeneralResource(processingResource);
				if (result == null) result = caseUCMmodelElement(processingResource);
				if (result == null) result = caseURNmodelElement(processingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.DEMAND: {
				Demand demand = (Demand)theEObject;
				T result = caseDemand(demand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkload(Workload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResource(GeneralResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveResource(ActiveResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveResource(PassiveResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalOperation(ExternalOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResource(ProcessingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemand(Demand object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>UC Mmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Mmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCMmodelElement(UCMmodelElement object) {
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

} //PerformanceSwitch
