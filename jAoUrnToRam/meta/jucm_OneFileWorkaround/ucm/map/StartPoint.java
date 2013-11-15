/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;

import intermediateWorkflow.IwStartPoint;
import jucm_OneFileWorkaround.ucm.performance.Workload;

import jucm_OneFileWorkaround.ucm.scenario.ScenarioStartPoint;

import jucm_OneFileWorkaround.urncore.Condition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A start of path should have only one target hyperedge.  It may have a source when linked to a result by a 'connect'. The  triggering-event-list gives the set of events that initiate the  sequence of actions in a path. The precondition-list must be  satisfied in order for the scenario to start
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getWorkload <em>Workload</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.StartPoint#isLocal <em>Local</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getFailureKind <em>Failure Kind</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getInBindings <em>In Bindings</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getScenarioStartPoints <em>Scenario Start Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getStartPoint()
 * @model
 * @generated
 */
public interface StartPoint extends PathNode {
	
	IwStartPoint getIwStartPoint();;
	
	String iwStartPointType();
	
	boolean hasReplacementPointcutStubAsTarget();
	/**
	 * Returns the value of the '<em><b>Workload</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.performance.Workload#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' containment reference.
	 * @see #setWorkload(Workload)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getStartPoint_Workload()
	 * @see jucm_OneFileWorkaround.ucm.performance.Workload#getStartPoint
	 * @model opposite="startPoint" containment="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getWorkload <em>Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' containment reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getStartPoint_Local()
	 * @model default="false"
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.StartPoint#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Failure Kind</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link jucm_OneFileWorkaround.ucm.map.FailureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Kind</em>' attribute.
	 * @see jucm_OneFileWorkaround.ucm.map.FailureKind
	 * @see #setFailureKind(FailureKind)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getStartPoint_FailureKind()
	 * @model default="None"
	 * @generated
	 */
	FailureKind getFailureKind();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getFailureKind <em>Failure Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Kind</em>' attribute.
	 * @see jucm_OneFileWorkaround.ucm.map.FailureKind
	 * @see #getFailureKind()
	 * @generated
	 */
	void setFailureKind(FailureKind value);

	/**
	 * Returns the value of the '<em><b>In Bindings</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.map.InBinding}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.map.InBinding#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Bindings</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getStartPoint_InBindings()
	 * @see jucm_OneFileWorkaround.ucm.map.InBinding#getStartPoint
	 * @model opposite="startPoint"
	 * @generated
	 */
	EList<InBinding> getInBindings();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.urncore.Condition#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(Condition)
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getStartPoint_Precondition()
	 * @see jucm_OneFileWorkaround.urncore.Condition#getStartPoint
	 * @model opposite="startPoint" containment="true"
	 * @generated
	 */
	Condition getPrecondition();

	/**
	 * Sets the value of the '{@link jucm_OneFileWorkaround.ucm.map.StartPoint#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Scenario Start Points</b></em>' reference list.
	 * The list contents are of type {@link jucm_OneFileWorkaround.ucm.scenario.ScenarioStartPoint}.
	 * It is bidirectional and its opposite is '{@link jucm_OneFileWorkaround.ucm.scenario.ScenarioStartPoint#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Start Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Start Points</em>' reference list.
	 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getStartPoint_ScenarioStartPoints()
	 * @see jucm_OneFileWorkaround.ucm.scenario.ScenarioStartPoint#getStartPoint
	 * @model opposite="startPoint"
	 * @generated
	 */
	EList<ScenarioStartPoint> getScenarioStartPoints();

} // StartPoint
