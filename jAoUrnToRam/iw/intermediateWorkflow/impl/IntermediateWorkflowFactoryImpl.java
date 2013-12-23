/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateWorkflowFactoryImpl extends EFactoryImpl implements IntermediateWorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateWorkflowFactory init() {
		try {
			IntermediateWorkflowFactory theIntermediateWorkflowFactory = (IntermediateWorkflowFactory)EPackage.Registry.INSTANCE.getEFactory("http:///intermediateWorkflow.ecore"); 
			if (theIntermediateWorkflowFactory != null) {
				return theIntermediateWorkflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateWorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateWorkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntermediateWorkflowPackage.IW_MODEL: return createIwModel();
			case IntermediateWorkflowPackage.IW_CONCERN: return createIwConcern();
			case IntermediateWorkflowPackage.IW_STEP: return createIwStep();
			case IntermediateWorkflowPackage.IW_WORKFLOW: return createIwWorkflow();
			case IntermediateWorkflowPackage.IW_NODE_CONNECTION: return createIwNodeConnection();
			case IntermediateWorkflowPackage.IW_INPUT: return createIwInput();
			case IntermediateWorkflowPackage.IW_CUSTOMIZABLE_NODE: return createIwCustomizableNode();
			case IntermediateWorkflowPackage.IW_OUTPUT: return createIwOutput();
			case IntermediateWorkflowPackage.IW_START_POINT: return createIwStartPoint();
			case IntermediateWorkflowPackage.IW_END_POINT: return createIwEndPoint();
			case IntermediateWorkflowPackage.IW_OR_FORK: return createIwOrFork();
			case IntermediateWorkflowPackage.IW_AND_FORK: return createIwAndFork();
			case IntermediateWorkflowPackage.IW_AND_JOIN: return createIwAndJoin();
			case IntermediateWorkflowPackage.IW_WAITING_PLACE: return createIwWaitingPlace();
			case IntermediateWorkflowPackage.IW_STUB: return createIwStub();
			case IntermediateWorkflowPackage.IW_PLUGIN_BINDING: return createIwPluginBinding();
			case IntermediateWorkflowPackage.IW_IN_BINDING: return createIwInBinding();
			case IntermediateWorkflowPackage.IW_OUT_BINDING: return createIwOutBinding();
			case IntermediateWorkflowPackage.IW_TIMER: return createIwTimer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IntermediateWorkflowPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case IntermediateWorkflowPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case IntermediateWorkflowPackage._KERMETA_SPECIAL_TYPES_ALIAS_:
				return create_KermetaSpecialTypesAlias_FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IntermediateWorkflowPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case IntermediateWorkflowPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case IntermediateWorkflowPackage._KERMETA_SPECIAL_TYPES_ALIAS_:
				return convert_KermetaSpecialTypesAlias_ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwModel createIwModel() {
		IwModelImpl iwModel = new IwModelImpl();
		return iwModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwConcern createIwConcern() {
		IwConcernImpl iwConcern = new IwConcernImpl();
		return iwConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStep createIwStep() {
		IwStepImpl iwStep = new IwStepImpl();
		return iwStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwWorkflow createIwWorkflow() {
		IwWorkflowImpl iwWorkflow = new IwWorkflowImpl();
		return iwWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwNodeConnection createIwNodeConnection() {
		IwNodeConnectionImpl iwNodeConnection = new IwNodeConnectionImpl();
		return iwNodeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwInput createIwInput() {
		IwInputImpl iwInput = new IwInputImpl();
		return iwInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwCustomizableNode createIwCustomizableNode() {
		IwCustomizableNodeImpl iwCustomizableNode = new IwCustomizableNodeImpl();
		return iwCustomizableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwOutput createIwOutput() {
		IwOutputImpl iwOutput = new IwOutputImpl();
		return iwOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStartPoint createIwStartPoint() {
		IwStartPointImpl iwStartPoint = new IwStartPointImpl();
		return iwStartPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwEndPoint createIwEndPoint() {
		IwEndPointImpl iwEndPoint = new IwEndPointImpl();
		return iwEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwOrFork createIwOrFork() {
		IwOrForkImpl iwOrFork = new IwOrForkImpl();
		return iwOrFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwAndFork createIwAndFork() {
		IwAndForkImpl iwAndFork = new IwAndForkImpl();
		return iwAndFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwAndJoin createIwAndJoin() {
		IwAndJoinImpl iwAndJoin = new IwAndJoinImpl();
		return iwAndJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwWaitingPlace createIwWaitingPlace() {
		IwWaitingPlaceImpl iwWaitingPlace = new IwWaitingPlaceImpl();
		return iwWaitingPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwStub createIwStub() {
		IwStubImpl iwStub = new IwStubImpl();
		return iwStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwPluginBinding createIwPluginBinding() {
		IwPluginBindingImpl iwPluginBinding = new IwPluginBindingImpl();
		return iwPluginBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwInBinding createIwInBinding() {
		IwInBindingImpl iwInBinding = new IwInBindingImpl();
		return iwInBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwOutBinding createIwOutBinding() {
		IwOutBindingImpl iwOutBinding = new IwOutBindingImpl();
		return iwOutBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IwTimer createIwTimer() {
		IwTimerImpl iwTimer = new IwTimerImpl();
		return iwTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object create_KermetaSpecialTypesAlias_FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convert_KermetaSpecialTypesAlias_ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateWorkflowPackage getIntermediateWorkflowPackage() {
		return (IntermediateWorkflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediateWorkflowPackage getPackage() {
		return IntermediateWorkflowPackage.eINSTANCE;
	}

} //IntermediateWorkflowFactoryImpl
