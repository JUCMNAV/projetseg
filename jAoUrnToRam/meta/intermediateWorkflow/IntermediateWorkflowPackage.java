/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see intermediateWorkflow.IntermediateWorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediateWorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intermediateWorkflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///intermediateWorkflow.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intermediateWorkflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateWorkflowPackage eINSTANCE = intermediateWorkflow.impl.IntermediateWorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwModelImpl <em>Iw Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwModelImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwModel()
	 * @generated
	 */
	int IW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_MODEL__CONCERNS = 1;

	/**
	 * The number of structural features of the '<em>Iw Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwConcernImpl <em>Iw Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwConcernImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwConcern()
	 * @generated
	 */
	int IW_CONCERN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CONCERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CONCERN__WORKFLOWS = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CONCERN__STEPS = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CONCERN__MODEL = 3;

	/**
	 * The number of structural features of the '<em>Iw Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CONCERN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwStepImpl <em>Iw Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwStepImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwStep()
	 * @generated
	 */
	int IW_STEP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STEP__NODES = 1;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STEP__CONCERN = 2;

	/**
	 * The feature id for the '<em><b>Outbound Stubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STEP__OUTBOUND_STUBS = 3;

	/**
	 * The number of structural features of the '<em>Iw Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STEP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwWorkflowImpl <em>Iw Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwWorkflowImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwWorkflow()
	 * @generated
	 */
	int IW_WORKFLOW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WORKFLOW__NODES = 1;

	/**
	 * The feature id for the '<em><b>Start Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WORKFLOW__START_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WORKFLOW__CONCERN = 3;

	/**
	 * The number of structural features of the '<em>Iw Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WORKFLOW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwNodeImpl <em>Iw Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwNodeImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwNode()
	 * @generated
	 */
	int IW_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE__SUCCS = 1;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE__PREDS = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE__STEP = 3;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE__WORKFLOW = 4;

	/**
	 * The number of structural features of the '<em>Iw Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwNodeConnectionImpl <em>Iw Node Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwNodeConnectionImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwNodeConnection()
	 * @generated
	 */
	int IW_NODE_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Condition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__CONDITION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__TARGET = 2;

	/**
	 * The feature id for the '<em><b>In Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__IN_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Stub Entry Index As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING = 4;

	/**
	 * The feature id for the '<em><b>Out Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__OUT_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Stub Exit Index As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING = 6;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION__TRIGGER = 7;

	/**
	 * The number of structural features of the '<em>Iw Node Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_NODE_CONNECTION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwInputImpl <em>Iw Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwInputImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwInput()
	 * @generated
	 */
	int IW_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_INPUT__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_INPUT__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_INPUT__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_INPUT__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_INPUT__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The number of structural features of the '<em>Iw Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_INPUT_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwCustomizableNodeImpl <em>Iw Customizable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwCustomizableNodeImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwCustomizableNode()
	 * @generated
	 */
	int IW_CUSTOMIZABLE_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CUSTOMIZABLE_NODE__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CUSTOMIZABLE_NODE__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CUSTOMIZABLE_NODE__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CUSTOMIZABLE_NODE__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CUSTOMIZABLE_NODE__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Customizable Node Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iw Customizable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_CUSTOMIZABLE_NODE_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwOutputImpl <em>Iw Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwOutputImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwOutput()
	 * @generated
	 */
	int IW_OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUTPUT__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUTPUT__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUTPUT__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUTPUT__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUTPUT__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The number of structural features of the '<em>Iw Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUTPUT_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwStartPointImpl <em>Iw Start Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwStartPointImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwStartPoint()
	 * @generated
	 */
	int IW_START_POINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Start Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT__START_POINT_TYPE = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT__IN_BINDINGS = IW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iw Start Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_START_POINT_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwEndPointImpl <em>Iw End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwEndPointImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwEndPoint()
	 * @generated
	 */
	int IW_END_POINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_END_POINT__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_END_POINT__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_END_POINT__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_END_POINT__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_END_POINT__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Out Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_END_POINT__OUT_BINDINGS = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iw End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_END_POINT_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwOrForkImpl <em>Iw Or Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwOrForkImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwOrFork()
	 * @generated
	 */
	int IW_OR_FORK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OR_FORK__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OR_FORK__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OR_FORK__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OR_FORK__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OR_FORK__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The number of structural features of the '<em>Iw Or Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OR_FORK_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwAndForkImpl <em>Iw And Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwAndForkImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwAndFork()
	 * @generated
	 */
	int IW_AND_FORK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_FORK__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_FORK__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_FORK__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_FORK__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_FORK__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The number of structural features of the '<em>Iw And Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_FORK_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwAndJoinImpl <em>Iw And Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwAndJoinImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwAndJoin()
	 * @generated
	 */
	int IW_AND_JOIN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_JOIN__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_JOIN__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_JOIN__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_JOIN__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_JOIN__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The number of structural features of the '<em>Iw And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_AND_JOIN_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwWaitingPlaceImpl <em>Iw Waiting Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwWaitingPlaceImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwWaitingPlace()
	 * @generated
	 */
	int IW_WAITING_PLACE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WAITING_PLACE__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WAITING_PLACE__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WAITING_PLACE__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WAITING_PLACE__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WAITING_PLACE__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WAITING_PLACE__TRANSIENT = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iw Waiting Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_WAITING_PLACE_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwStubImpl <em>Iw Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwStubImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwStub()
	 * @generated
	 */
	int IW_STUB = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__NAME = IW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Succs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__SUCCS = IW_NODE__SUCCS;

	/**
	 * The feature id for the '<em><b>Preds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__PREDS = IW_NODE__PREDS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__STEP = IW_NODE__STEP;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__WORKFLOW = IW_NODE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Stub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__STUB_TYPE = IW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugin Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__PLUGIN_BINDINGS = IW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outbound In Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB__OUTBOUND_IN_STEPS = IW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iw Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_STUB_FEATURE_COUNT = IW_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwPluginBindingImpl <em>Iw Plugin Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwPluginBindingImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwPluginBinding()
	 * @generated
	 */
	int IW_PLUGIN_BINDING = 16;

	/**
	 * The feature id for the '<em><b>In Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_PLUGIN_BINDING__IN_BINDINGS = 0;

	/**
	 * The feature id for the '<em><b>Out Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_PLUGIN_BINDING__OUT_BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Stub</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_PLUGIN_BINDING__STUB = 2;

	/**
	 * The number of structural features of the '<em>Iw Plugin Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_PLUGIN_BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwInBindingImpl <em>Iw In Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwInBindingImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwInBinding()
	 * @generated
	 */
	int IW_IN_BINDING = 17;

	/**
	 * The feature id for the '<em><b>Disjunctive Stub Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Plugin Start Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_IN_BINDING__PLUGIN_START_POINT = 1;

	/**
	 * The feature id for the '<em><b>Plugin Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_IN_BINDING__PLUGIN_BINDING = 2;

	/**
	 * The number of structural features of the '<em>Iw In Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_IN_BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link intermediateWorkflow.impl.IwOutBindingImpl <em>Iw Out Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateWorkflow.impl.IwOutBindingImpl
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwOutBinding()
	 * @generated
	 */
	int IW_OUT_BINDING = 18;

	/**
	 * The feature id for the '<em><b>Stub Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUT_BINDING__STUB_EXIT = 0;

	/**
	 * The feature id for the '<em><b>Plugin End Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUT_BINDING__PLUGIN_END_POINT = 1;

	/**
	 * The feature id for the '<em><b>Plugin Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUT_BINDING__PLUGIN_BINDING = 2;

	/**
	 * The number of structural features of the '<em>Iw Out Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IW_OUT_BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getString()
	 * @generated
	 */
	int STRING = 19;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 20;

	/**
	 * The meta object id for the '<em>Kermeta Special Types Alias </em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#get_KermetaSpecialTypesAlias_()
	 * @generated
	 */
	int _KERMETA_SPECIAL_TYPES_ALIAS_ = 21;


	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwModel <em>Iw Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Model</em>'.
	 * @see intermediateWorkflow.IwModel
	 * @generated
	 */
	EClass getIwModel();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediateWorkflow.IwModel#getName()
	 * @see #getIwModel()
	 * @generated
	 */
	EAttribute getIwModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwModel#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see intermediateWorkflow.IwModel#getConcerns()
	 * @see #getIwModel()
	 * @generated
	 */
	EReference getIwModel_Concerns();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwConcern <em>Iw Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Concern</em>'.
	 * @see intermediateWorkflow.IwConcern
	 * @generated
	 */
	EClass getIwConcern();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwConcern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediateWorkflow.IwConcern#getName()
	 * @see #getIwConcern()
	 * @generated
	 */
	EAttribute getIwConcern_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwConcern#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflows</em>'.
	 * @see intermediateWorkflow.IwConcern#getWorkflows()
	 * @see #getIwConcern()
	 * @generated
	 */
	EReference getIwConcern_Workflows();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwConcern#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see intermediateWorkflow.IwConcern#getSteps()
	 * @see #getIwConcern()
	 * @generated
	 */
	EReference getIwConcern_Steps();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwConcern#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see intermediateWorkflow.IwConcern#getModel()
	 * @see #getIwConcern()
	 * @generated
	 */
	EReference getIwConcern_Model();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwStep <em>Iw Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Step</em>'.
	 * @see intermediateWorkflow.IwStep
	 * @generated
	 */
	EClass getIwStep();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediateWorkflow.IwStep#getName()
	 * @see #getIwStep()
	 * @generated
	 */
	EAttribute getIwStep_Name();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwStep#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see intermediateWorkflow.IwStep#getNodes()
	 * @see #getIwStep()
	 * @generated
	 */
	EReference getIwStep_Nodes();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwStep#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Concern</em>'.
	 * @see intermediateWorkflow.IwStep#getConcern()
	 * @see #getIwStep()
	 * @generated
	 */
	EReference getIwStep_Concern();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwStep#getOutboundStubs <em>Outbound Stubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound Stubs</em>'.
	 * @see intermediateWorkflow.IwStep#getOutboundStubs()
	 * @see #getIwStep()
	 * @generated
	 */
	EReference getIwStep_OutboundStubs();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwWorkflow <em>Iw Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Workflow</em>'.
	 * @see intermediateWorkflow.IwWorkflow
	 * @generated
	 */
	EClass getIwWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwWorkflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediateWorkflow.IwWorkflow#getName()
	 * @see #getIwWorkflow()
	 * @generated
	 */
	EAttribute getIwWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwWorkflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see intermediateWorkflow.IwWorkflow#getNodes()
	 * @see #getIwWorkflow()
	 * @generated
	 */
	EReference getIwWorkflow_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwWorkflow#getStartPoints <em>Start Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start Points</em>'.
	 * @see intermediateWorkflow.IwWorkflow#getStartPoints()
	 * @see #getIwWorkflow()
	 * @generated
	 */
	EReference getIwWorkflow_StartPoints();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwWorkflow#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Concern</em>'.
	 * @see intermediateWorkflow.IwWorkflow#getConcern()
	 * @see #getIwWorkflow()
	 * @generated
	 */
	EReference getIwWorkflow_Concern();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwNode <em>Iw Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Node</em>'.
	 * @see intermediateWorkflow.IwNode
	 * @generated
	 */
	EClass getIwNode();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediateWorkflow.IwNode#getName()
	 * @see #getIwNode()
	 * @generated
	 */
	EAttribute getIwNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwNode#getSuccs <em>Succs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Succs</em>'.
	 * @see intermediateWorkflow.IwNode#getSuccs()
	 * @see #getIwNode()
	 * @generated
	 */
	EReference getIwNode_Succs();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwNode#getPreds <em>Preds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preds</em>'.
	 * @see intermediateWorkflow.IwNode#getPreds()
	 * @see #getIwNode()
	 * @generated
	 */
	EReference getIwNode_Preds();

	/**
	 * Returns the meta object for the reference '{@link intermediateWorkflow.IwNode#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see intermediateWorkflow.IwNode#getStep()
	 * @see #getIwNode()
	 * @generated
	 */
	EReference getIwNode_Step();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwNode#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Workflow</em>'.
	 * @see intermediateWorkflow.IwNode#getWorkflow()
	 * @see #getIwNode()
	 * @generated
	 */
	EReference getIwNode_Workflow();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwNodeConnection <em>Iw Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Node Connection</em>'.
	 * @see intermediateWorkflow.IwNodeConnection
	 * @generated
	 */
	EClass getIwNodeConnection();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwNodeConnection#getConditionName <em>Condition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Name</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getConditionName()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EAttribute getIwNodeConnection_ConditionName();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwNodeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getSource()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EReference getIwNodeConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link intermediateWorkflow.IwNodeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getTarget()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EReference getIwNodeConnection_Target();

	/**
	 * Returns the meta object for the reference '{@link intermediateWorkflow.IwNodeConnection#getInBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Binding</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getInBinding()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EReference getIwNodeConnection_InBinding();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwNodeConnection#getStubEntryIndexAsString <em>Stub Entry Index As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stub Entry Index As String</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getStubEntryIndexAsString()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EAttribute getIwNodeConnection_StubEntryIndexAsString();

	/**
	 * Returns the meta object for the reference '{@link intermediateWorkflow.IwNodeConnection#getOutBinding <em>Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Binding</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getOutBinding()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EReference getIwNodeConnection_OutBinding();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwNodeConnection#getStubExitIndexAsString <em>Stub Exit Index As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stub Exit Index As String</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getStubExitIndexAsString()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EAttribute getIwNodeConnection_StubExitIndexAsString();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwNodeConnection#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see intermediateWorkflow.IwNodeConnection#getTrigger()
	 * @see #getIwNodeConnection()
	 * @generated
	 */
	EAttribute getIwNodeConnection_Trigger();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwInput <em>Iw Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Input</em>'.
	 * @see intermediateWorkflow.IwInput
	 * @generated
	 */
	EClass getIwInput();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwCustomizableNode <em>Iw Customizable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Customizable Node</em>'.
	 * @see intermediateWorkflow.IwCustomizableNode
	 * @generated
	 */
	EClass getIwCustomizableNode();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwCustomizableNode#getCustomizableNodeRefId <em>Customizable Node Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customizable Node Ref Id</em>'.
	 * @see intermediateWorkflow.IwCustomizableNode#getCustomizableNodeRefId()
	 * @see #getIwCustomizableNode()
	 * @generated
	 */
	EAttribute getIwCustomizableNode_CustomizableNodeRefId();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwOutput <em>Iw Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Output</em>'.
	 * @see intermediateWorkflow.IwOutput
	 * @generated
	 */
	EClass getIwOutput();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwStartPoint <em>Iw Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Start Point</em>'.
	 * @see intermediateWorkflow.IwStartPoint
	 * @generated
	 */
	EClass getIwStartPoint();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwStartPoint#getStartPointType <em>Start Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point Type</em>'.
	 * @see intermediateWorkflow.IwStartPoint#getStartPointType()
	 * @see #getIwStartPoint()
	 * @generated
	 */
	EAttribute getIwStartPoint_StartPointType();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwStartPoint#getInBindings <em>In Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Bindings</em>'.
	 * @see intermediateWorkflow.IwStartPoint#getInBindings()
	 * @see #getIwStartPoint()
	 * @generated
	 */
	EReference getIwStartPoint_InBindings();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwEndPoint <em>Iw End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw End Point</em>'.
	 * @see intermediateWorkflow.IwEndPoint
	 * @generated
	 */
	EClass getIwEndPoint();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwEndPoint#getOutBindings <em>Out Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Bindings</em>'.
	 * @see intermediateWorkflow.IwEndPoint#getOutBindings()
	 * @see #getIwEndPoint()
	 * @generated
	 */
	EReference getIwEndPoint_OutBindings();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwOrFork <em>Iw Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Or Fork</em>'.
	 * @see intermediateWorkflow.IwOrFork
	 * @generated
	 */
	EClass getIwOrFork();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwAndFork <em>Iw And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw And Fork</em>'.
	 * @see intermediateWorkflow.IwAndFork
	 * @generated
	 */
	EClass getIwAndFork();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwAndJoin <em>Iw And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw And Join</em>'.
	 * @see intermediateWorkflow.IwAndJoin
	 * @generated
	 */
	EClass getIwAndJoin();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwWaitingPlace <em>Iw Waiting Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Waiting Place</em>'.
	 * @see intermediateWorkflow.IwWaitingPlace
	 * @generated
	 */
	EClass getIwWaitingPlace();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwWaitingPlace#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see intermediateWorkflow.IwWaitingPlace#getTransient()
	 * @see #getIwWaitingPlace()
	 * @generated
	 */
	EAttribute getIwWaitingPlace_Transient();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwStub <em>Iw Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Stub</em>'.
	 * @see intermediateWorkflow.IwStub
	 * @generated
	 */
	EClass getIwStub();

	/**
	 * Returns the meta object for the attribute '{@link intermediateWorkflow.IwStub#getStubType <em>Stub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stub Type</em>'.
	 * @see intermediateWorkflow.IwStub#getStubType()
	 * @see #getIwStub()
	 * @generated
	 */
	EAttribute getIwStub_StubType();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwStub#getPluginBindings <em>Plugin Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin Bindings</em>'.
	 * @see intermediateWorkflow.IwStub#getPluginBindings()
	 * @see #getIwStub()
	 * @generated
	 */
	EReference getIwStub_PluginBindings();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwStub#getOutboundInSteps <em>Outbound In Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound In Steps</em>'.
	 * @see intermediateWorkflow.IwStub#getOutboundInSteps()
	 * @see #getIwStub()
	 * @generated
	 */
	EReference getIwStub_OutboundInSteps();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwPluginBinding <em>Iw Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Plugin Binding</em>'.
	 * @see intermediateWorkflow.IwPluginBinding
	 * @generated
	 */
	EClass getIwPluginBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwPluginBinding#getInBindings <em>In Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Bindings</em>'.
	 * @see intermediateWorkflow.IwPluginBinding#getInBindings()
	 * @see #getIwPluginBinding()
	 * @generated
	 */
	EReference getIwPluginBinding_InBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateWorkflow.IwPluginBinding#getOutBindings <em>Out Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Bindings</em>'.
	 * @see intermediateWorkflow.IwPluginBinding#getOutBindings()
	 * @see #getIwPluginBinding()
	 * @generated
	 */
	EReference getIwPluginBinding_OutBindings();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwPluginBinding#getStub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stub</em>'.
	 * @see intermediateWorkflow.IwPluginBinding#getStub()
	 * @see #getIwPluginBinding()
	 * @generated
	 */
	EReference getIwPluginBinding_Stub();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwInBinding <em>Iw In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw In Binding</em>'.
	 * @see intermediateWorkflow.IwInBinding
	 * @generated
	 */
	EClass getIwInBinding();

	/**
	 * Returns the meta object for the reference list '{@link intermediateWorkflow.IwInBinding#getDisjunctiveStubEntries <em>Disjunctive Stub Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjunctive Stub Entries</em>'.
	 * @see intermediateWorkflow.IwInBinding#getDisjunctiveStubEntries()
	 * @see #getIwInBinding()
	 * @generated
	 */
	EReference getIwInBinding_DisjunctiveStubEntries();

	/**
	 * Returns the meta object for the reference '{@link intermediateWorkflow.IwInBinding#getPluginStartPoint <em>Plugin Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugin Start Point</em>'.
	 * @see intermediateWorkflow.IwInBinding#getPluginStartPoint()
	 * @see #getIwInBinding()
	 * @generated
	 */
	EReference getIwInBinding_PluginStartPoint();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwInBinding#getPluginBinding <em>Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Plugin Binding</em>'.
	 * @see intermediateWorkflow.IwInBinding#getPluginBinding()
	 * @see #getIwInBinding()
	 * @generated
	 */
	EReference getIwInBinding_PluginBinding();

	/**
	 * Returns the meta object for class '{@link intermediateWorkflow.IwOutBinding <em>Iw Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iw Out Binding</em>'.
	 * @see intermediateWorkflow.IwOutBinding
	 * @generated
	 */
	EClass getIwOutBinding();

	/**
	 * Returns the meta object for the reference '{@link intermediateWorkflow.IwOutBinding#getStubExit <em>Stub Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stub Exit</em>'.
	 * @see intermediateWorkflow.IwOutBinding#getStubExit()
	 * @see #getIwOutBinding()
	 * @generated
	 */
	EReference getIwOutBinding_StubExit();

	/**
	 * Returns the meta object for the reference '{@link intermediateWorkflow.IwOutBinding#getPluginEndPoint <em>Plugin End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugin End Point</em>'.
	 * @see intermediateWorkflow.IwOutBinding#getPluginEndPoint()
	 * @see #getIwOutBinding()
	 * @generated
	 */
	EReference getIwOutBinding_PluginEndPoint();

	/**
	 * Returns the meta object for the container reference '{@link intermediateWorkflow.IwOutBinding#getPluginBinding <em>Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Plugin Binding</em>'.
	 * @see intermediateWorkflow.IwOutBinding#getPluginBinding()
	 * @see #getIwOutBinding()
	 * @generated
	 */
	EReference getIwOutBinding_PluginBinding();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Kermeta Special Types Alias </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kermeta Special Types Alias </em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType get_KermetaSpecialTypesAlias_();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateWorkflowFactory getIntermediateWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwModelImpl <em>Iw Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwModelImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwModel()
		 * @generated
		 */
		EClass IW_MODEL = eINSTANCE.getIwModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_MODEL__NAME = eINSTANCE.getIwModel_Name();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_MODEL__CONCERNS = eINSTANCE.getIwModel_Concerns();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwConcernImpl <em>Iw Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwConcernImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwConcern()
		 * @generated
		 */
		EClass IW_CONCERN = eINSTANCE.getIwConcern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_CONCERN__NAME = eINSTANCE.getIwConcern_Name();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_CONCERN__WORKFLOWS = eINSTANCE.getIwConcern_Workflows();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_CONCERN__STEPS = eINSTANCE.getIwConcern_Steps();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_CONCERN__MODEL = eINSTANCE.getIwConcern_Model();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwStepImpl <em>Iw Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwStepImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwStep()
		 * @generated
		 */
		EClass IW_STEP = eINSTANCE.getIwStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_STEP__NAME = eINSTANCE.getIwStep_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_STEP__NODES = eINSTANCE.getIwStep_Nodes();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_STEP__CONCERN = eINSTANCE.getIwStep_Concern();

		/**
		 * The meta object literal for the '<em><b>Outbound Stubs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_STEP__OUTBOUND_STUBS = eINSTANCE.getIwStep_OutboundStubs();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwWorkflowImpl <em>Iw Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwWorkflowImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwWorkflow()
		 * @generated
		 */
		EClass IW_WORKFLOW = eINSTANCE.getIwWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_WORKFLOW__NAME = eINSTANCE.getIwWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_WORKFLOW__NODES = eINSTANCE.getIwWorkflow_Nodes();

		/**
		 * The meta object literal for the '<em><b>Start Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_WORKFLOW__START_POINTS = eINSTANCE.getIwWorkflow_StartPoints();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_WORKFLOW__CONCERN = eINSTANCE.getIwWorkflow_Concern();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwNodeImpl <em>Iw Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwNodeImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwNode()
		 * @generated
		 */
		EClass IW_NODE = eINSTANCE.getIwNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_NODE__NAME = eINSTANCE.getIwNode_Name();

		/**
		 * The meta object literal for the '<em><b>Succs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE__SUCCS = eINSTANCE.getIwNode_Succs();

		/**
		 * The meta object literal for the '<em><b>Preds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE__PREDS = eINSTANCE.getIwNode_Preds();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE__STEP = eINSTANCE.getIwNode_Step();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE__WORKFLOW = eINSTANCE.getIwNode_Workflow();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwNodeConnectionImpl <em>Iw Node Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwNodeConnectionImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwNodeConnection()
		 * @generated
		 */
		EClass IW_NODE_CONNECTION = eINSTANCE.getIwNodeConnection();

		/**
		 * The meta object literal for the '<em><b>Condition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_NODE_CONNECTION__CONDITION_NAME = eINSTANCE.getIwNodeConnection_ConditionName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE_CONNECTION__SOURCE = eINSTANCE.getIwNodeConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE_CONNECTION__TARGET = eINSTANCE.getIwNodeConnection_Target();

		/**
		 * The meta object literal for the '<em><b>In Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE_CONNECTION__IN_BINDING = eINSTANCE.getIwNodeConnection_InBinding();

		/**
		 * The meta object literal for the '<em><b>Stub Entry Index As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING = eINSTANCE.getIwNodeConnection_StubEntryIndexAsString();

		/**
		 * The meta object literal for the '<em><b>Out Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_NODE_CONNECTION__OUT_BINDING = eINSTANCE.getIwNodeConnection_OutBinding();

		/**
		 * The meta object literal for the '<em><b>Stub Exit Index As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING = eINSTANCE.getIwNodeConnection_StubExitIndexAsString();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_NODE_CONNECTION__TRIGGER = eINSTANCE.getIwNodeConnection_Trigger();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwInputImpl <em>Iw Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwInputImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwInput()
		 * @generated
		 */
		EClass IW_INPUT = eINSTANCE.getIwInput();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwCustomizableNodeImpl <em>Iw Customizable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwCustomizableNodeImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwCustomizableNode()
		 * @generated
		 */
		EClass IW_CUSTOMIZABLE_NODE = eINSTANCE.getIwCustomizableNode();

		/**
		 * The meta object literal for the '<em><b>Customizable Node Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID = eINSTANCE.getIwCustomizableNode_CustomizableNodeRefId();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwOutputImpl <em>Iw Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwOutputImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwOutput()
		 * @generated
		 */
		EClass IW_OUTPUT = eINSTANCE.getIwOutput();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwStartPointImpl <em>Iw Start Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwStartPointImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwStartPoint()
		 * @generated
		 */
		EClass IW_START_POINT = eINSTANCE.getIwStartPoint();

		/**
		 * The meta object literal for the '<em><b>Start Point Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_START_POINT__START_POINT_TYPE = eINSTANCE.getIwStartPoint_StartPointType();

		/**
		 * The meta object literal for the '<em><b>In Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_START_POINT__IN_BINDINGS = eINSTANCE.getIwStartPoint_InBindings();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwEndPointImpl <em>Iw End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwEndPointImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwEndPoint()
		 * @generated
		 */
		EClass IW_END_POINT = eINSTANCE.getIwEndPoint();

		/**
		 * The meta object literal for the '<em><b>Out Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_END_POINT__OUT_BINDINGS = eINSTANCE.getIwEndPoint_OutBindings();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwOrForkImpl <em>Iw Or Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwOrForkImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwOrFork()
		 * @generated
		 */
		EClass IW_OR_FORK = eINSTANCE.getIwOrFork();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwAndForkImpl <em>Iw And Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwAndForkImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwAndFork()
		 * @generated
		 */
		EClass IW_AND_FORK = eINSTANCE.getIwAndFork();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwAndJoinImpl <em>Iw And Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwAndJoinImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwAndJoin()
		 * @generated
		 */
		EClass IW_AND_JOIN = eINSTANCE.getIwAndJoin();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwWaitingPlaceImpl <em>Iw Waiting Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwWaitingPlaceImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwWaitingPlace()
		 * @generated
		 */
		EClass IW_WAITING_PLACE = eINSTANCE.getIwWaitingPlace();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_WAITING_PLACE__TRANSIENT = eINSTANCE.getIwWaitingPlace_Transient();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwStubImpl <em>Iw Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwStubImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwStub()
		 * @generated
		 */
		EClass IW_STUB = eINSTANCE.getIwStub();

		/**
		 * The meta object literal for the '<em><b>Stub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IW_STUB__STUB_TYPE = eINSTANCE.getIwStub_StubType();

		/**
		 * The meta object literal for the '<em><b>Plugin Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_STUB__PLUGIN_BINDINGS = eINSTANCE.getIwStub_PluginBindings();

		/**
		 * The meta object literal for the '<em><b>Outbound In Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_STUB__OUTBOUND_IN_STEPS = eINSTANCE.getIwStub_OutboundInSteps();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwPluginBindingImpl <em>Iw Plugin Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwPluginBindingImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwPluginBinding()
		 * @generated
		 */
		EClass IW_PLUGIN_BINDING = eINSTANCE.getIwPluginBinding();

		/**
		 * The meta object literal for the '<em><b>In Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_PLUGIN_BINDING__IN_BINDINGS = eINSTANCE.getIwPluginBinding_InBindings();

		/**
		 * The meta object literal for the '<em><b>Out Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_PLUGIN_BINDING__OUT_BINDINGS = eINSTANCE.getIwPluginBinding_OutBindings();

		/**
		 * The meta object literal for the '<em><b>Stub</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_PLUGIN_BINDING__STUB = eINSTANCE.getIwPluginBinding_Stub();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwInBindingImpl <em>Iw In Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwInBindingImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwInBinding()
		 * @generated
		 */
		EClass IW_IN_BINDING = eINSTANCE.getIwInBinding();

		/**
		 * The meta object literal for the '<em><b>Disjunctive Stub Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES = eINSTANCE.getIwInBinding_DisjunctiveStubEntries();

		/**
		 * The meta object literal for the '<em><b>Plugin Start Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_IN_BINDING__PLUGIN_START_POINT = eINSTANCE.getIwInBinding_PluginStartPoint();

		/**
		 * The meta object literal for the '<em><b>Plugin Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_IN_BINDING__PLUGIN_BINDING = eINSTANCE.getIwInBinding_PluginBinding();

		/**
		 * The meta object literal for the '{@link intermediateWorkflow.impl.IwOutBindingImpl <em>Iw Out Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateWorkflow.impl.IwOutBindingImpl
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getIwOutBinding()
		 * @generated
		 */
		EClass IW_OUT_BINDING = eINSTANCE.getIwOutBinding();

		/**
		 * The meta object literal for the '<em><b>Stub Exit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_OUT_BINDING__STUB_EXIT = eINSTANCE.getIwOutBinding_StubExit();

		/**
		 * The meta object literal for the '<em><b>Plugin End Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_OUT_BINDING__PLUGIN_END_POINT = eINSTANCE.getIwOutBinding_PluginEndPoint();

		/**
		 * The meta object literal for the '<em><b>Plugin Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IW_OUT_BINDING__PLUGIN_BINDING = eINSTANCE.getIwOutBinding_PluginBinding();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Kermeta Special Types Alias </em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see intermediateWorkflow.impl.IntermediateWorkflowPackageImpl#get_KermetaSpecialTypesAlias_()
		 * @generated
		 */
		EDataType _KERMETA_SPECIAL_TYPES_ALIAS_ = eINSTANCE.get_KermetaSpecialTypesAlias_();

	}

} //IntermediateWorkflowPackage
