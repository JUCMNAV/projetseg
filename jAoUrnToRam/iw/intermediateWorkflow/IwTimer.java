/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwTimer()
 * @model
 * @generated
 */
public interface IwTimer extends IwWaitingPlace {

	boolean hasTimeoutPath();
	boolean hasTriggerPath();
} // IwTimer
