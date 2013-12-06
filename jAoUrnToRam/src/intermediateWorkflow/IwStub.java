/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToStepView.StepView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iw Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link intermediateWorkflow.IwStub#getStubType <em>Stub Type</em>}</li>
 *   <li>{@link intermediateWorkflow.IwStub#getPluginBindings <em>Plugin Bindings</em>}</li>
 *   <li>{@link intermediateWorkflow.IwStub#getOutboundInSteps <em>Outbound In Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStub()
 * @model
 * @generated
 */
public interface IwStub extends IwNode {
	/*********** Step View Transformation ***********************/
	void appendStub(StepView stepView);
	void appendStubExit(StepView stepView);
	Integer numOfStubEntries();
	Integer numOfStubExits();
	void appendStubPorts(StepView stepView, String prefix, Integer maxIndex);
	boolean isExplicitlyBoundAccrosConcerns();
	void appendAccrosConcernBindings(StepView stepView);
	/*********** iw to java ***********************/
	NodeInstantiationStrategy createStrategy();
	/**********************************************/
	IwPluginBinding getStaticPluginBinding();
	IwWorkflow getStaticPlugin();
	boolean isAspectMarker();
	String getInputProcessingNodeAction();
	void explore(IwStep currentStep);
	boolean isStaticPluginInSameStep();
	/**
	 * Returns the value of the '<em><b>Stub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stub Type</em>' attribute.
	 * @see #setStubType(String)
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStub_StubType()
	 * @model dataType="intermediateWorkflow.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getStubType();

	/**
	 * Sets the value of the '{@link intermediateWorkflow.IwStub#getStubType <em>Stub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub Type</em>' attribute.
	 * @see #getStubType()
	 * @generated
	 */
	void setStubType(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwPluginBinding}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwPluginBinding#getStub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Bindings</em>' containment reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStub_PluginBindings()
	 * @see intermediateWorkflow.IwPluginBinding#getStub
	 * @model opposite="stub" containment="true"
	 * @generated
	 */
	EList<IwPluginBinding> getPluginBindings();

	/**
	 * Returns the value of the '<em><b>Outbound In Steps</b></em>' reference list.
	 * The list contents are of type {@link intermediateWorkflow.IwStep}.
	 * It is bidirectional and its opposite is '{@link intermediateWorkflow.IwStep#getOutboundStubs <em>Outbound Stubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound In Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound In Steps</em>' reference list.
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#getIwStub_OutboundInSteps()
	 * @see intermediateWorkflow.IwStep#getOutboundStubs
	 * @model opposite="outboundStubs"
	 * @generated
	 */
	EList<IwStep> getOutboundInSteps();void appendStubEntry(StepView stepView);
	
	
	
	
	
	

} // IwStub
