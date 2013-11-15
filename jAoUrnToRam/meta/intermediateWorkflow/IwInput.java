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
 * A representation of the model object '<em><b>Iw Input</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwInput()
 * @model
 * @generated
 */
public interface IwInput extends IwNode {
	IwCustomizableNode getIwInputProcessingNode();
	void setIwInputProcessingNode(IwCustomizableNode iwInputProcessingNode);
	void explore(IwStep currentStep);
	
	ram.Class getRamInputData();
	void setRamInputData(ram.Class ramInputData);
} // IwInput
