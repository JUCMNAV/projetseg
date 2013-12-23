/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.util;

import intermediateWorkflow.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see intermediateWorkflow.IntermediateWorkflowPackage
 * @generated
 */
public class IntermediateWorkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateWorkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateWorkflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntermediateWorkflowPackage.eINSTANCE;
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
	protected IntermediateWorkflowSwitch<Adapter> modelSwitch =
		new IntermediateWorkflowSwitch<Adapter>() {
			@Override
			public Adapter caseIwModel(IwModel object) {
				return createIwModelAdapter();
			}
			@Override
			public Adapter caseIwConcern(IwConcern object) {
				return createIwConcernAdapter();
			}
			@Override
			public Adapter caseIwStep(IwStep object) {
				return createIwStepAdapter();
			}
			@Override
			public Adapter caseIwWorkflow(IwWorkflow object) {
				return createIwWorkflowAdapter();
			}
			@Override
			public Adapter caseIwNode(IwNode object) {
				return createIwNodeAdapter();
			}
			@Override
			public Adapter caseIwNodeConnection(IwNodeConnection object) {
				return createIwNodeConnectionAdapter();
			}
			@Override
			public Adapter caseIwInput(IwInput object) {
				return createIwInputAdapter();
			}
			@Override
			public Adapter caseIwCustomizableNode(IwCustomizableNode object) {
				return createIwCustomizableNodeAdapter();
			}
			@Override
			public Adapter caseIwOutput(IwOutput object) {
				return createIwOutputAdapter();
			}
			@Override
			public Adapter caseIwStartPoint(IwStartPoint object) {
				return createIwStartPointAdapter();
			}
			@Override
			public Adapter caseIwEndPoint(IwEndPoint object) {
				return createIwEndPointAdapter();
			}
			@Override
			public Adapter caseIwOrFork(IwOrFork object) {
				return createIwOrForkAdapter();
			}
			@Override
			public Adapter caseIwAndFork(IwAndFork object) {
				return createIwAndForkAdapter();
			}
			@Override
			public Adapter caseIwAndJoin(IwAndJoin object) {
				return createIwAndJoinAdapter();
			}
			@Override
			public Adapter caseIwWaitingPlace(IwWaitingPlace object) {
				return createIwWaitingPlaceAdapter();
			}
			@Override
			public Adapter caseIwStub(IwStub object) {
				return createIwStubAdapter();
			}
			@Override
			public Adapter caseIwPluginBinding(IwPluginBinding object) {
				return createIwPluginBindingAdapter();
			}
			@Override
			public Adapter caseIwInBinding(IwInBinding object) {
				return createIwInBindingAdapter();
			}
			@Override
			public Adapter caseIwOutBinding(IwOutBinding object) {
				return createIwOutBindingAdapter();
			}
			@Override
			public Adapter caseIwTimer(IwTimer object) {
				return createIwTimerAdapter();
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
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwModel <em>Iw Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwModel
	 * @generated
	 */
	public Adapter createIwModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwConcern <em>Iw Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwConcern
	 * @generated
	 */
	public Adapter createIwConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwStep <em>Iw Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwStep
	 * @generated
	 */
	public Adapter createIwStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwWorkflow <em>Iw Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwWorkflow
	 * @generated
	 */
	public Adapter createIwWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwNode <em>Iw Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwNode
	 * @generated
	 */
	public Adapter createIwNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwNodeConnection <em>Iw Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwNodeConnection
	 * @generated
	 */
	public Adapter createIwNodeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwInput <em>Iw Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwInput
	 * @generated
	 */
	public Adapter createIwInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwCustomizableNode <em>Iw Customizable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwCustomizableNode
	 * @generated
	 */
	public Adapter createIwCustomizableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwOutput <em>Iw Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwOutput
	 * @generated
	 */
	public Adapter createIwOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwStartPoint <em>Iw Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwStartPoint
	 * @generated
	 */
	public Adapter createIwStartPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwEndPoint <em>Iw End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwEndPoint
	 * @generated
	 */
	public Adapter createIwEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwOrFork <em>Iw Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwOrFork
	 * @generated
	 */
	public Adapter createIwOrForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwAndFork <em>Iw And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwAndFork
	 * @generated
	 */
	public Adapter createIwAndForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwAndJoin <em>Iw And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwAndJoin
	 * @generated
	 */
	public Adapter createIwAndJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwWaitingPlace <em>Iw Waiting Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwWaitingPlace
	 * @generated
	 */
	public Adapter createIwWaitingPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwStub <em>Iw Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwStub
	 * @generated
	 */
	public Adapter createIwStubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwPluginBinding <em>Iw Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwPluginBinding
	 * @generated
	 */
	public Adapter createIwPluginBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwInBinding <em>Iw In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwInBinding
	 * @generated
	 */
	public Adapter createIwInBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwOutBinding <em>Iw Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwOutBinding
	 * @generated
	 */
	public Adapter createIwOutBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateWorkflow.IwTimer <em>Iw Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateWorkflow.IwTimer
	 * @generated
	 */
	public Adapter createIwTimerAdapter() {
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

} //IntermediateWorkflowAdapterFactory
