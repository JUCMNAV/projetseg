/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwAndFork;
import intermediateWorkflow.IwAndJoin;
import intermediateWorkflow.IwConcern;
import intermediateWorkflow.IwCustomizableNode;
import intermediateWorkflow.IwEndPoint;
import intermediateWorkflow.IwInBinding;
import intermediateWorkflow.IwInput;
import intermediateWorkflow.IwModel;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwOrFork;
import intermediateWorkflow.IwOutBinding;
import intermediateWorkflow.IwOutput;
import intermediateWorkflow.IwPluginBinding;
import intermediateWorkflow.IwStartPoint;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwStub;
import intermediateWorkflow.IwWaitingPlace;
import intermediateWorkflow.IwWorkflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateWorkflowPackageImpl extends EPackageImpl implements IntermediateWorkflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwConcernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwWorkflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwNodeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwCustomizableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwStartPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwOrForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwAndForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwAndJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwWaitingPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwStubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwPluginBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwInBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iwOutBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType _KermetaSpecialTypesAlias_EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see intermediateWorkflow.IntermediateWorkflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateWorkflowPackageImpl() {
		super(eNS_URI, IntermediateWorkflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IntermediateWorkflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediateWorkflowPackage init() {
		if (isInited) return (IntermediateWorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateWorkflowPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateWorkflowPackageImpl theIntermediateWorkflowPackage = (IntermediateWorkflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateWorkflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateWorkflowPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIntermediateWorkflowPackage.createPackageContents();

		// Initialize created meta-data
		theIntermediateWorkflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateWorkflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateWorkflowPackage.eNS_URI, theIntermediateWorkflowPackage);
		return theIntermediateWorkflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwModel() {
		return iwModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwModel_Name() {
		return (EAttribute)iwModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwModel_Concerns() {
		return (EReference)iwModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwConcern() {
		return iwConcernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwConcern_Name() {
		return (EAttribute)iwConcernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwConcern_Workflows() {
		return (EReference)iwConcernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwConcern_Steps() {
		return (EReference)iwConcernEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwConcern_Model() {
		return (EReference)iwConcernEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwStep() {
		return iwStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwStep_Name() {
		return (EAttribute)iwStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwStep_Nodes() {
		return (EReference)iwStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwStep_Concern() {
		return (EReference)iwStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwStep_OutboundStubs() {
		return (EReference)iwStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwWorkflow() {
		return iwWorkflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwWorkflow_Name() {
		return (EAttribute)iwWorkflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwWorkflow_Nodes() {
		return (EReference)iwWorkflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwWorkflow_StartPoints() {
		return (EReference)iwWorkflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwWorkflow_Concern() {
		return (EReference)iwWorkflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwNode() {
		return iwNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwNode_Name() {
		return (EAttribute)iwNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNode_Succs() {
		return (EReference)iwNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNode_Preds() {
		return (EReference)iwNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNode_Step() {
		return (EReference)iwNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNode_Workflow() {
		return (EReference)iwNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwNodeConnection() {
		return iwNodeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwNodeConnection_ConditionName() {
		return (EAttribute)iwNodeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNodeConnection_Source() {
		return (EReference)iwNodeConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNodeConnection_Target() {
		return (EReference)iwNodeConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNodeConnection_InBinding() {
		return (EReference)iwNodeConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwNodeConnection_StubEntryIndexAsString() {
		return (EAttribute)iwNodeConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwNodeConnection_OutBinding() {
		return (EReference)iwNodeConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwNodeConnection_StubExitIndexAsString() {
		return (EAttribute)iwNodeConnectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwNodeConnection_Trigger() {
		return (EAttribute)iwNodeConnectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwInput() {
		return iwInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwCustomizableNode() {
		return iwCustomizableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwCustomizableNode_CustomizableNodeRefId() {
		return (EAttribute)iwCustomizableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwOutput() {
		return iwOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwStartPoint() {
		return iwStartPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwStartPoint_StartPointType() {
		return (EAttribute)iwStartPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwStartPoint_InBindings() {
		return (EReference)iwStartPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwEndPoint() {
		return iwEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwEndPoint_OutBindings() {
		return (EReference)iwEndPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwOrFork() {
		return iwOrForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwAndFork() {
		return iwAndForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwAndJoin() {
		return iwAndJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwWaitingPlace() {
		return iwWaitingPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwWaitingPlace_Transient() {
		return (EAttribute)iwWaitingPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwStub() {
		return iwStubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIwStub_StubType() {
		return (EAttribute)iwStubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwStub_PluginBindings() {
		return (EReference)iwStubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwStub_OutboundInSteps() {
		return (EReference)iwStubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwPluginBinding() {
		return iwPluginBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwPluginBinding_InBindings() {
		return (EReference)iwPluginBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwPluginBinding_OutBindings() {
		return (EReference)iwPluginBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwPluginBinding_Stub() {
		return (EReference)iwPluginBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwInBinding() {
		return iwInBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwInBinding_DisjunctiveStubEntries() {
		return (EReference)iwInBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwInBinding_PluginStartPoint() {
		return (EReference)iwInBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwInBinding_PluginBinding() {
		return (EReference)iwInBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIwOutBinding() {
		return iwOutBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwOutBinding_StubExit() {
		return (EReference)iwOutBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwOutBinding_PluginEndPoint() {
		return (EReference)iwOutBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIwOutBinding_PluginBinding() {
		return (EReference)iwOutBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType get_KermetaSpecialTypesAlias_() {
		return _KermetaSpecialTypesAlias_EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateWorkflowFactory getIntermediateWorkflowFactory() {
		return (IntermediateWorkflowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iwModelEClass = createEClass(IW_MODEL);
		createEAttribute(iwModelEClass, IW_MODEL__NAME);
		createEReference(iwModelEClass, IW_MODEL__CONCERNS);

		iwConcernEClass = createEClass(IW_CONCERN);
		createEAttribute(iwConcernEClass, IW_CONCERN__NAME);
		createEReference(iwConcernEClass, IW_CONCERN__WORKFLOWS);
		createEReference(iwConcernEClass, IW_CONCERN__STEPS);
		createEReference(iwConcernEClass, IW_CONCERN__MODEL);

		iwStepEClass = createEClass(IW_STEP);
		createEAttribute(iwStepEClass, IW_STEP__NAME);
		createEReference(iwStepEClass, IW_STEP__NODES);
		createEReference(iwStepEClass, IW_STEP__CONCERN);
		createEReference(iwStepEClass, IW_STEP__OUTBOUND_STUBS);

		iwWorkflowEClass = createEClass(IW_WORKFLOW);
		createEAttribute(iwWorkflowEClass, IW_WORKFLOW__NAME);
		createEReference(iwWorkflowEClass, IW_WORKFLOW__NODES);
		createEReference(iwWorkflowEClass, IW_WORKFLOW__START_POINTS);
		createEReference(iwWorkflowEClass, IW_WORKFLOW__CONCERN);

		iwNodeEClass = createEClass(IW_NODE);
		createEAttribute(iwNodeEClass, IW_NODE__NAME);
		createEReference(iwNodeEClass, IW_NODE__SUCCS);
		createEReference(iwNodeEClass, IW_NODE__PREDS);
		createEReference(iwNodeEClass, IW_NODE__STEP);
		createEReference(iwNodeEClass, IW_NODE__WORKFLOW);

		iwNodeConnectionEClass = createEClass(IW_NODE_CONNECTION);
		createEAttribute(iwNodeConnectionEClass, IW_NODE_CONNECTION__CONDITION_NAME);
		createEReference(iwNodeConnectionEClass, IW_NODE_CONNECTION__SOURCE);
		createEReference(iwNodeConnectionEClass, IW_NODE_CONNECTION__TARGET);
		createEReference(iwNodeConnectionEClass, IW_NODE_CONNECTION__IN_BINDING);
		createEAttribute(iwNodeConnectionEClass, IW_NODE_CONNECTION__STUB_ENTRY_INDEX_AS_STRING);
		createEReference(iwNodeConnectionEClass, IW_NODE_CONNECTION__OUT_BINDING);
		createEAttribute(iwNodeConnectionEClass, IW_NODE_CONNECTION__STUB_EXIT_INDEX_AS_STRING);
		createEAttribute(iwNodeConnectionEClass, IW_NODE_CONNECTION__TRIGGER);

		iwInputEClass = createEClass(IW_INPUT);

		iwCustomizableNodeEClass = createEClass(IW_CUSTOMIZABLE_NODE);
		createEAttribute(iwCustomizableNodeEClass, IW_CUSTOMIZABLE_NODE__CUSTOMIZABLE_NODE_REF_ID);

		iwOutputEClass = createEClass(IW_OUTPUT);

		iwStartPointEClass = createEClass(IW_START_POINT);
		createEAttribute(iwStartPointEClass, IW_START_POINT__START_POINT_TYPE);
		createEReference(iwStartPointEClass, IW_START_POINT__IN_BINDINGS);

		iwEndPointEClass = createEClass(IW_END_POINT);
		createEReference(iwEndPointEClass, IW_END_POINT__OUT_BINDINGS);

		iwOrForkEClass = createEClass(IW_OR_FORK);

		iwAndForkEClass = createEClass(IW_AND_FORK);

		iwAndJoinEClass = createEClass(IW_AND_JOIN);

		iwWaitingPlaceEClass = createEClass(IW_WAITING_PLACE);
		createEAttribute(iwWaitingPlaceEClass, IW_WAITING_PLACE__TRANSIENT);

		iwStubEClass = createEClass(IW_STUB);
		createEAttribute(iwStubEClass, IW_STUB__STUB_TYPE);
		createEReference(iwStubEClass, IW_STUB__PLUGIN_BINDINGS);
		createEReference(iwStubEClass, IW_STUB__OUTBOUND_IN_STEPS);

		iwPluginBindingEClass = createEClass(IW_PLUGIN_BINDING);
		createEReference(iwPluginBindingEClass, IW_PLUGIN_BINDING__IN_BINDINGS);
		createEReference(iwPluginBindingEClass, IW_PLUGIN_BINDING__OUT_BINDINGS);
		createEReference(iwPluginBindingEClass, IW_PLUGIN_BINDING__STUB);

		iwInBindingEClass = createEClass(IW_IN_BINDING);
		createEReference(iwInBindingEClass, IW_IN_BINDING__DISJUNCTIVE_STUB_ENTRIES);
		createEReference(iwInBindingEClass, IW_IN_BINDING__PLUGIN_START_POINT);
		createEReference(iwInBindingEClass, IW_IN_BINDING__PLUGIN_BINDING);

		iwOutBindingEClass = createEClass(IW_OUT_BINDING);
		createEReference(iwOutBindingEClass, IW_OUT_BINDING__STUB_EXIT);
		createEReference(iwOutBindingEClass, IW_OUT_BINDING__PLUGIN_END_POINT);
		createEReference(iwOutBindingEClass, IW_OUT_BINDING__PLUGIN_BINDING);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		_KermetaSpecialTypesAlias_EDataType = createEDataType(_KERMETA_SPECIAL_TYPES_ALIAS_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iwInputEClass.getESuperTypes().add(this.getIwNode());
		iwCustomizableNodeEClass.getESuperTypes().add(this.getIwNode());
		iwOutputEClass.getESuperTypes().add(this.getIwNode());
		iwStartPointEClass.getESuperTypes().add(this.getIwNode());
		iwEndPointEClass.getESuperTypes().add(this.getIwNode());
		iwOrForkEClass.getESuperTypes().add(this.getIwNode());
		iwAndForkEClass.getESuperTypes().add(this.getIwNode());
		iwAndJoinEClass.getESuperTypes().add(this.getIwNode());
		iwWaitingPlaceEClass.getESuperTypes().add(this.getIwNode());
		iwStubEClass.getESuperTypes().add(this.getIwNode());

		// Initialize classes and features; add operations and parameters
		initEClass(iwModelEClass, IwModel.class, "IwModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwModel_Name(), this.getString(), "name", null, 0, 1, IwModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwModel_Concerns(), this.getIwConcern(), this.getIwConcern_Model(), "concerns", null, 0, -1, IwModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwConcernEClass, IwConcern.class, "IwConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwConcern_Name(), this.getString(), "name", null, 0, 1, IwConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwConcern_Workflows(), this.getIwWorkflow(), this.getIwWorkflow_Concern(), "workflows", null, 1, -1, IwConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwConcern_Steps(), this.getIwStep(), this.getIwStep_Concern(), "steps", null, 1, -1, IwConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwConcern_Model(), this.getIwModel(), this.getIwModel_Concerns(), "model", null, 0, 1, IwConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwStepEClass, IwStep.class, "IwStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwStep_Name(), this.getString(), "name", null, 0, 1, IwStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwStep_Nodes(), this.getIwNode(), this.getIwNode_Step(), "nodes", null, 1, -1, IwStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwStep_Concern(), this.getIwConcern(), this.getIwConcern_Steps(), "concern", null, 0, 1, IwStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwStep_OutboundStubs(), this.getIwStub(), this.getIwStub_OutboundInSteps(), "outboundStubs", null, 0, -1, IwStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwWorkflowEClass, IwWorkflow.class, "IwWorkflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwWorkflow_Name(), this.getString(), "name", null, 0, 1, IwWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwWorkflow_Nodes(), this.getIwNode(), this.getIwNode_Workflow(), "nodes", null, 1, -1, IwWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwWorkflow_StartPoints(), this.getIwStartPoint(), null, "startPoints", null, 1, -1, IwWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwWorkflow_Concern(), this.getIwConcern(), this.getIwConcern_Workflows(), "concern", null, 0, 1, IwWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwNodeEClass, IwNode.class, "IwNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwNode_Name(), this.getString(), "name", null, 0, 1, IwNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNode_Succs(), this.getIwNodeConnection(), this.getIwNodeConnection_Source(), "succs", null, 0, -1, IwNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNode_Preds(), this.getIwNodeConnection(), this.getIwNodeConnection_Target(), "preds", null, 0, -1, IwNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNode_Step(), this.getIwStep(), this.getIwStep_Nodes(), "step", null, 0, 1, IwNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNode_Workflow(), this.getIwWorkflow(), this.getIwWorkflow_Nodes(), "workflow", null, 0, 1, IwNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwNodeConnectionEClass, IwNodeConnection.class, "IwNodeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwNodeConnection_ConditionName(), this.getString(), "conditionName", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNodeConnection_Source(), this.getIwNode(), this.getIwNode_Succs(), "source", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNodeConnection_Target(), this.getIwNode(), this.getIwNode_Preds(), "target", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNodeConnection_InBinding(), this.getIwInBinding(), this.getIwInBinding_DisjunctiveStubEntries(), "inBinding", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIwNodeConnection_StubEntryIndexAsString(), this.getString(), "stubEntryIndexAsString", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwNodeConnection_OutBinding(), this.getIwOutBinding(), this.getIwOutBinding_StubExit(), "outBinding", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIwNodeConnection_StubExitIndexAsString(), this.getString(), "stubExitIndexAsString", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIwNodeConnection_Trigger(), this.getBoolean(), "trigger", null, 0, 1, IwNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwInputEClass, IwInput.class, "IwInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iwCustomizableNodeEClass, IwCustomizableNode.class, "IwCustomizableNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwCustomizableNode_CustomizableNodeRefId(), this.getString(), "customizableNodeRefId", null, 0, 1, IwCustomizableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwOutputEClass, IwOutput.class, "IwOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iwStartPointEClass, IwStartPoint.class, "IwStartPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwStartPoint_StartPointType(), this.getString(), "startPointType", null, 0, 1, IwStartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwStartPoint_InBindings(), this.getIwInBinding(), this.getIwInBinding_PluginStartPoint(), "inBindings", null, 0, -1, IwStartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwEndPointEClass, IwEndPoint.class, "IwEndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIwEndPoint_OutBindings(), this.getIwOutBinding(), this.getIwOutBinding_PluginEndPoint(), "outBindings", null, 0, -1, IwEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwOrForkEClass, IwOrFork.class, "IwOrFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iwAndForkEClass, IwAndFork.class, "IwAndFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iwAndJoinEClass, IwAndJoin.class, "IwAndJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iwWaitingPlaceEClass, IwWaitingPlace.class, "IwWaitingPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwWaitingPlace_Transient(), this.getBoolean(), "transient", null, 0, 1, IwWaitingPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwStubEClass, IwStub.class, "IwStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIwStub_StubType(), this.getString(), "stubType", null, 0, 1, IwStub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwStub_PluginBindings(), this.getIwPluginBinding(), this.getIwPluginBinding_Stub(), "pluginBindings", null, 0, -1, IwStub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwStub_OutboundInSteps(), this.getIwStep(), this.getIwStep_OutboundStubs(), "outboundInSteps", null, 0, -1, IwStub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwPluginBindingEClass, IwPluginBinding.class, "IwPluginBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIwPluginBinding_InBindings(), this.getIwInBinding(), this.getIwInBinding_PluginBinding(), "inBindings", null, 0, -1, IwPluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwPluginBinding_OutBindings(), this.getIwOutBinding(), this.getIwOutBinding_PluginBinding(), "outBindings", null, 0, -1, IwPluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwPluginBinding_Stub(), this.getIwStub(), this.getIwStub_PluginBindings(), "stub", null, 0, 1, IwPluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwInBindingEClass, IwInBinding.class, "IwInBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIwInBinding_DisjunctiveStubEntries(), this.getIwNodeConnection(), this.getIwNodeConnection_InBinding(), "disjunctiveStubEntries", null, 1, -1, IwInBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwInBinding_PluginStartPoint(), this.getIwStartPoint(), this.getIwStartPoint_InBindings(), "pluginStartPoint", null, 0, 1, IwInBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwInBinding_PluginBinding(), this.getIwPluginBinding(), this.getIwPluginBinding_InBindings(), "pluginBinding", null, 0, 1, IwInBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iwOutBindingEClass, IwOutBinding.class, "IwOutBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIwOutBinding_StubExit(), this.getIwNodeConnection(), this.getIwNodeConnection_OutBinding(), "stubExit", null, 0, 1, IwOutBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwOutBinding_PluginEndPoint(), this.getIwEndPoint(), this.getIwEndPoint_OutBindings(), "pluginEndPoint", null, 0, 1, IwOutBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIwOutBinding_PluginBinding(), this.getIwPluginBinding(), this.getIwPluginBinding_OutBindings(), "pluginBinding", null, 0, 1, IwOutBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(_KermetaSpecialTypesAlias_EDataType, Object.class, "_KermetaSpecialTypesAlias_", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta";		
		addAnnotation
		  (getIwModel_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwConcern_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwStep_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwWorkflow_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwNode_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwNodeConnection_ConditionName(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwNodeConnection_StubEntryIndexAsString(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwNodeConnection_StubExitIndexAsString(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwNodeConnection_Trigger(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwCustomizableNode_CustomizableNodeRefId(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwStartPoint_StartPointType(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwWaitingPlace_Transient(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getIwStub_StubType(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });
	}

} //IntermediateWorkflowPackageImpl
