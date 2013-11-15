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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jucm_OneFileWorkaround.ucm.performance.PerformancePackage
 * @generated
 */
public class PerformanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerformancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PerformancePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceSwitch<Adapter> modelSwitch =
		new PerformanceSwitch<Adapter>() {
			@Override
			public Adapter caseWorkload(Workload object) {
				return createWorkloadAdapter();
			}
			@Override
			public Adapter caseGeneralResource(GeneralResource object) {
				return createGeneralResourceAdapter();
			}
			@Override
			public Adapter caseActiveResource(ActiveResource object) {
				return createActiveResourceAdapter();
			}
			@Override
			public Adapter casePassiveResource(PassiveResource object) {
				return createPassiveResourceAdapter();
			}
			@Override
			public Adapter caseExternalOperation(ExternalOperation object) {
				return createExternalOperationAdapter();
			}
			@Override
			public Adapter caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			@Override
			public Adapter caseDemand(Demand object) {
				return createDemandAdapter();
			}
			@Override
			public Adapter caseURNmodelElement(URNmodelElement object) {
				return createURNmodelElementAdapter();
			}
			@Override
			public Adapter caseUCMmodelElement(UCMmodelElement object) {
				return createUCMmodelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.ucm.performance.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.ucm.performance.Workload
	 * @generated
	 */
	public Adapter createWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.ucm.performance.GeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.ucm.performance.GeneralResource
	 * @generated
	 */
	public Adapter createGeneralResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.ucm.performance.ActiveResource <em>Active Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.ucm.performance.ActiveResource
	 * @generated
	 */
	public Adapter createActiveResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.ucm.performance.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.ucm.performance.PassiveResource
	 * @generated
	 */
	public Adapter createPassiveResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.ucm.performance.ExternalOperation <em>External Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.ucm.performance.ExternalOperation
	 * @generated
	 */
	public Adapter createExternalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.ucm.performance.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.ucm.performance.ProcessingResource
	 * @generated
	 */
	public Adapter createProcessingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.ucm.performance.Demand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.ucm.performance.Demand
	 * @generated
	 */
	public Adapter createDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.URNmodelElement <em>UR Nmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.URNmodelElement
	 * @generated
	 */
	public Adapter createURNmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.UCMmodelElement <em>UC Mmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.UCMmodelElement
	 * @generated
	 */
	public Adapter createUCMmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PerformanceAdapterFactory
