/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import ram.Class;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Output</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwOutput()
 * @model
 * @generated
 */
public interface IwOutput extends IwNode {
	/*******iw to ram*******/
	ram.Class getRamOutput();
	void setRamOutput(Class ramOutput);
	ram.Class getRamOutputData();
	void setRamOutputData(Class ramOutputData);
	/*******iw to ram*******/
} // IwOutput
