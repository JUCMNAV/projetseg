/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.util;

import intermediateWorkflow.*;

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
 * @see intermediateWorkflow.IntermediateWorkflowPackage
 * @generated
 */
public class IntermediateWorkflowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntermediateWorkflowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateWorkflowSwitch() {
		if (modelPackage == null) {
			modelPackage = IntermediateWorkflowPackage.eINSTANCE;
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
			case IntermediateWorkflowPackage.IW_MODEL: {
				IwModel iwModel = (IwModel)theEObject;
				T result = caseIwModel(iwModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_CONCERN: {
				IwConcern iwConcern = (IwConcern)theEObject;
				T result = caseIwConcern(iwConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_STEP: {
				IwStep iwStep = (IwStep)theEObject;
				T result = caseIwStep(iwStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_WORKFLOW: {
				IwWorkflow iwWorkflow = (IwWorkflow)theEObject;
				T result = caseIwWorkflow(iwWorkflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_NODE: {
				IwNode iwNode = (IwNode)theEObject;
				T result = caseIwNode(iwNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION: {
				IwNodeConnection iwNodeConnection = (IwNodeConnection)theEObject;
				T result = caseIwNodeConnection(iwNodeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_INPUT: {
				IwInput iwInput = (IwInput)theEObject;
				T result = caseIwInput(iwInput);
				if (result == null) result = caseIwNode(iwInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_CUSTOMIZABLE_NODE: {
				IwCustomizableNode iwCustomizableNode = (IwCustomizableNode)theEObject;
				T result = caseIwCustomizableNode(iwCustomizableNode);
				if (result == null) result = caseIwNode(iwCustomizableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_OUTPUT: {
				IwOutput iwOutput = (IwOutput)theEObject;
				T result = caseIwOutput(iwOutput);
				if (result == null) result = caseIwNode(iwOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_START_POINT: {
				IwStartPoint iwStartPoint = (IwStartPoint)theEObject;
				T result = caseIwStartPoint(iwStartPoint);
				if (result == null) result = caseIwNode(iwStartPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_END_POINT: {
				IwEndPoint iwEndPoint = (IwEndPoint)theEObject;
				T result = caseIwEndPoint(iwEndPoint);
				if (result == null) result = caseIwNode(iwEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_OR_FORK: {
				IwOrFork iwOrFork = (IwOrFork)theEObject;
				T result = caseIwOrFork(iwOrFork);
				if (result == null) result = caseIwNode(iwOrFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_AND_FORK: {
				IwAndFork iwAndFork = (IwAndFork)theEObject;
				T result = caseIwAndFork(iwAndFork);
				if (result == null) result = caseIwNode(iwAndFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_AND_JOIN: {
				IwAndJoin iwAndJoin = (IwAndJoin)theEObject;
				T result = caseIwAndJoin(iwAndJoin);
				if (result == null) result = caseIwNode(iwAndJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_WAITING_PLACE: {
				IwWaitingPlace iwWaitingPlace = (IwWaitingPlace)theEObject;
				T result = caseIwWaitingPlace(iwWaitingPlace);
				if (result == null) result = caseIwNode(iwWaitingPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_STUB: {
				IwStub iwStub = (IwStub)theEObject;
				T result = caseIwStub(iwStub);
				if (result == null) result = caseIwNode(iwStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING: {
				IwPluginBinding iwPluginBinding = (IwPluginBinding)theEObject;
				T result = caseIwPluginBinding(iwPluginBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_IN_BINDING: {
				IwInBinding iwInBinding = (IwInBinding)theEObject;
				T result = caseIwInBinding(iwInBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_OUT_BINDING: {
				IwOutBinding iwOutBinding = (IwOutBinding)theEObject;
				T result = caseIwOutBinding(iwOutBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntermediateWorkflowPackage.IW_TIMER: {
				IwTimer iwTimer = (IwTimer)theEObject;
				T result = caseIwTimer(iwTimer);
				if (result == null) result = caseIwWaitingPlace(iwTimer);
				if (result == null) result = caseIwNode(iwTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwModel(IwModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwConcern(IwConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwStep(IwStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwWorkflow(IwWorkflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwNode(IwNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Node Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwNodeConnection(IwNodeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwInput(IwInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Customizable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Customizable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwCustomizableNode(IwCustomizableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwOutput(IwOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Start Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwStartPoint(IwStartPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwEndPoint(IwEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Or Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Or Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwOrFork(IwOrFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw And Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw And Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwAndFork(IwAndFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw And Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw And Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwAndJoin(IwAndJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Waiting Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Waiting Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwWaitingPlace(IwWaitingPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwStub(IwStub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Plugin Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Plugin Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwPluginBinding(IwPluginBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw In Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw In Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwInBinding(IwInBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Out Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Out Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwOutBinding(IwOutBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iw Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iw Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIwTimer(IwTimer object) {
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

} //IntermediateWorkflowSwitch
