/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see intermediateWorkflow.IntermediateWorkflowPackage
 * @generated
 */
public interface IntermediateWorkflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateWorkflowFactory eINSTANCE = intermediateWorkflow.impl.IntermediateWorkflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Iw Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Model</em>'.
	 * @generated
	 */
	IwModel createIwModel();

	/**
	 * Returns a new object of class '<em>Iw Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Concern</em>'.
	 * @generated
	 */
	IwConcern createIwConcern();

	/**
	 * Returns a new object of class '<em>Iw Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Step</em>'.
	 * @generated
	 */
	IwStep createIwStep();

	/**
	 * Returns a new object of class '<em>Iw Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Workflow</em>'.
	 * @generated
	 */
	IwWorkflow createIwWorkflow();

	/**
	 * Returns a new object of class '<em>Iw Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Node Connection</em>'.
	 * @generated
	 */
	IwNodeConnection createIwNodeConnection();

	/**
	 * Returns a new object of class '<em>Iw Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Input</em>'.
	 * @generated
	 */
	IwInput createIwInput();

	/**
	 * Returns a new object of class '<em>Iw Customizable Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Customizable Node</em>'.
	 * @generated
	 */
	IwCustomizableNode createIwCustomizableNode();

	/**
	 * Returns a new object of class '<em>Iw Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Output</em>'.
	 * @generated
	 */
	IwOutput createIwOutput();

	/**
	 * Returns a new object of class '<em>Iw Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Start Point</em>'.
	 * @generated
	 */
	IwStartPoint createIwStartPoint();

	/**
	 * Returns a new object of class '<em>Iw End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw End Point</em>'.
	 * @generated
	 */
	IwEndPoint createIwEndPoint();

	/**
	 * Returns a new object of class '<em>Iw Or Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Or Fork</em>'.
	 * @generated
	 */
	IwOrFork createIwOrFork();

	/**
	 * Returns a new object of class '<em>Iw And Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw And Fork</em>'.
	 * @generated
	 */
	IwAndFork createIwAndFork();

	/**
	 * Returns a new object of class '<em>Iw And Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw And Join</em>'.
	 * @generated
	 */
	IwAndJoin createIwAndJoin();

	/**
	 * Returns a new object of class '<em>Iw Waiting Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Waiting Place</em>'.
	 * @generated
	 */
	IwWaitingPlace createIwWaitingPlace();

	/**
	 * Returns a new object of class '<em>Iw Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Stub</em>'.
	 * @generated
	 */
	IwStub createIwStub();

	/**
	 * Returns a new object of class '<em>Iw Plugin Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Plugin Binding</em>'.
	 * @generated
	 */
	IwPluginBinding createIwPluginBinding();

	/**
	 * Returns a new object of class '<em>Iw In Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw In Binding</em>'.
	 * @generated
	 */
	IwInBinding createIwInBinding();

	/**
	 * Returns a new object of class '<em>Iw Out Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iw Out Binding</em>'.
	 * @generated
	 */
	IwOutBinding createIwOutBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntermediateWorkflowPackage getIntermediateWorkflowPackage();

} //IntermediateWorkflowFactory
