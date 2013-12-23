/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucm.map.*;

import urncore.IURNConnection;
import urncore.IURNContainerRef;
import urncore.IURNDiagram;
import urncore.IURNNode;
import urncore.UCMmodelElement;
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
 * @see ucm.map.MapPackage
 * @generated
 */
public class MapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapSwitch() {
		if (modelPackage == null) {
			modelPackage = MapPackage.eINSTANCE;
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
			case MapPackage.AND_JOIN: {
				AndJoin andJoin = (AndJoin)theEObject;
				T result = caseAndJoin(andJoin);
				if (result == null) result = casePathNode(andJoin);
				if (result == null) result = caseUCMmodelElement(andJoin);
				if (result == null) result = caseIURNNode(andJoin);
				if (result == null) result = caseURNmodelElement(andJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.OUT_BINDING: {
				OutBinding outBinding = (OutBinding)theEObject;
				T result = caseOutBinding(outBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.IN_BINDING: {
				InBinding inBinding = (InBinding)theEObject;
				T result = caseInBinding(inBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.RESP_REF: {
				RespRef respRef = (RespRef)theEObject;
				T result = caseRespRef(respRef);
				if (result == null) result = casePathNode(respRef);
				if (result == null) result = caseUCMmodelElement(respRef);
				if (result == null) result = caseIURNNode(respRef);
				if (result == null) result = caseURNmodelElement(respRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.OR_JOIN: {
				OrJoin orJoin = (OrJoin)theEObject;
				T result = caseOrJoin(orJoin);
				if (result == null) result = casePathNode(orJoin);
				if (result == null) result = caseUCMmodelElement(orJoin);
				if (result == null) result = caseIURNNode(orJoin);
				if (result == null) result = caseURNmodelElement(orJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.OR_FORK: {
				OrFork orFork = (OrFork)theEObject;
				T result = caseOrFork(orFork);
				if (result == null) result = casePathNode(orFork);
				if (result == null) result = caseUCMmodelElement(orFork);
				if (result == null) result = caseIURNNode(orFork);
				if (result == null) result = caseURNmodelElement(orFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.CONNECT: {
				Connect connect = (Connect)theEObject;
				T result = caseConnect(connect);
				if (result == null) result = casePathNode(connect);
				if (result == null) result = caseUCMmodelElement(connect);
				if (result == null) result = caseIURNNode(connect);
				if (result == null) result = caseURNmodelElement(connect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.NODE_CONNECTION: {
				NodeConnection nodeConnection = (NodeConnection)theEObject;
				T result = caseNodeConnection(nodeConnection);
				if (result == null) result = caseIURNConnection(nodeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.WAITING_PLACE: {
				WaitingPlace waitingPlace = (WaitingPlace)theEObject;
				T result = caseWaitingPlace(waitingPlace);
				if (result == null) result = casePathNode(waitingPlace);
				if (result == null) result = caseUCMmodelElement(waitingPlace);
				if (result == null) result = caseIURNNode(waitingPlace);
				if (result == null) result = caseURNmodelElement(waitingPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.STUB: {
				Stub stub = (Stub)theEObject;
				T result = caseStub(stub);
				if (result == null) result = casePathNode(stub);
				if (result == null) result = caseUCMmodelElement(stub);
				if (result == null) result = caseIURNNode(stub);
				if (result == null) result = caseURNmodelElement(stub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.PATH_NODE: {
				PathNode pathNode = (PathNode)theEObject;
				T result = casePathNode(pathNode);
				if (result == null) result = caseUCMmodelElement(pathNode);
				if (result == null) result = caseIURNNode(pathNode);
				if (result == null) result = caseURNmodelElement(pathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.END_POINT: {
				EndPoint endPoint = (EndPoint)theEObject;
				T result = caseEndPoint(endPoint);
				if (result == null) result = casePathNode(endPoint);
				if (result == null) result = caseUCMmodelElement(endPoint);
				if (result == null) result = caseIURNNode(endPoint);
				if (result == null) result = caseURNmodelElement(endPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.START_POINT: {
				StartPoint startPoint = (StartPoint)theEObject;
				T result = caseStartPoint(startPoint);
				if (result == null) result = casePathNode(startPoint);
				if (result == null) result = caseUCMmodelElement(startPoint);
				if (result == null) result = caseIURNNode(startPoint);
				if (result == null) result = caseURNmodelElement(startPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.UC_MMAP: {
				UCMmap ucMmap = (UCMmap)theEObject;
				T result = caseUCMmap(ucMmap);
				if (result == null) result = caseUCMmodelElement(ucMmap);
				if (result == null) result = caseIURNDiagram(ucMmap);
				if (result == null) result = caseURNmodelElement(ucMmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.PLUGIN_BINDING: {
				PluginBinding pluginBinding = (PluginBinding)theEObject;
				T result = casePluginBinding(pluginBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.COMPONENT_REF: {
				ComponentRef componentRef = (ComponentRef)theEObject;
				T result = caseComponentRef(componentRef);
				if (result == null) result = caseUCMmodelElement(componentRef);
				if (result == null) result = caseIURNContainerRef(componentRef);
				if (result == null) result = caseURNmodelElement(componentRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.TIMER: {
				Timer timer = (Timer)theEObject;
				T result = caseTimer(timer);
				if (result == null) result = caseWaitingPlace(timer);
				if (result == null) result = casePathNode(timer);
				if (result == null) result = caseUCMmodelElement(timer);
				if (result == null) result = caseIURNNode(timer);
				if (result == null) result = caseURNmodelElement(timer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.AND_FORK: {
				AndFork andFork = (AndFork)theEObject;
				T result = caseAndFork(andFork);
				if (result == null) result = casePathNode(andFork);
				if (result == null) result = caseUCMmodelElement(andFork);
				if (result == null) result = caseIURNNode(andFork);
				if (result == null) result = caseURNmodelElement(andFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.EMPTY_POINT: {
				EmptyPoint emptyPoint = (EmptyPoint)theEObject;
				T result = caseEmptyPoint(emptyPoint);
				if (result == null) result = casePathNode(emptyPoint);
				if (result == null) result = caseUCMmodelElement(emptyPoint);
				if (result == null) result = caseIURNNode(emptyPoint);
				if (result == null) result = caseURNmodelElement(emptyPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.DIRECTION_ARROW: {
				DirectionArrow directionArrow = (DirectionArrow)theEObject;
				T result = caseDirectionArrow(directionArrow);
				if (result == null) result = casePathNode(directionArrow);
				if (result == null) result = caseUCMmodelElement(directionArrow);
				if (result == null) result = caseIURNNode(directionArrow);
				if (result == null) result = caseURNmodelElement(directionArrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.COMPONENT_BINDING: {
				ComponentBinding componentBinding = (ComponentBinding)theEObject;
				T result = caseComponentBinding(componentBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.ANYTHING: {
				Anything anything = (Anything)theEObject;
				T result = caseAnything(anything);
				if (result == null) result = casePathNode(anything);
				if (result == null) result = caseUCMmodelElement(anything);
				if (result == null) result = caseIURNNode(anything);
				if (result == null) result = caseURNmodelElement(anything);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.FAILURE_POINT: {
				FailurePoint failurePoint = (FailurePoint)theEObject;
				T result = caseFailurePoint(failurePoint);
				if (result == null) result = casePathNode(failurePoint);
				if (result == null) result = caseUCMmodelElement(failurePoint);
				if (result == null) result = caseIURNNode(failurePoint);
				if (result == null) result = caseURNmodelElement(failurePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapPackage.RESPONSIBILITY_BINDING: {
				ResponsibilityBinding responsibilityBinding = (ResponsibilityBinding)theEObject;
				T result = caseResponsibilityBinding(responsibilityBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndJoin(AndJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutBinding(OutBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInBinding(InBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resp Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resp Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespRef(RespRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrJoin(OrJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrFork(OrFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnect(Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeConnection(NodeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waiting Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waiting Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitingPlace(WaitingPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStub(Stub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathNode(PathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPoint(StartPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Mmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Mmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCMmap(UCMmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginBinding(PluginBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRef(ComponentRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimer(Timer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndFork(AndFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyPoint(EmptyPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionArrow(DirectionArrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentBinding(ComponentBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anything</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anything</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnything(Anything object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailurePoint(FailurePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsibility Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsibility Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibilityBinding(ResponsibilityBinding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IURN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNDiagram(IURNDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Container Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Container Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNContainerRef(IURNContainerRef object) {
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

} //MapSwitch
