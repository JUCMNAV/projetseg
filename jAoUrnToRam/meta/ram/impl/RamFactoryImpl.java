/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ram.Aspect;
import ram.AspectMessageView;
import ram.Association;
import ram.AssociationEnd;
import ram.Attribute;
import ram.CombinedFragment;
import ram.DestructionOccurrenceSpecification;
import ram.ExecutionStatement;
import ram.Gate;
import ram.ImplementationClass;
import ram.Instantiation;
import ram.InstantiationType;
import ram.Interaction;
import ram.InteractionOperand;
import ram.InteractionOperatorKind;
import ram.Layout;
import ram.LayoutElement;
import ram.Lifeline;
import ram.LiteralBoolean;
import ram.LiteralInteger;
import ram.LiteralString;
import ram.Mapping;
import ram.Message;
import ram.MessageOccurrenceSpecification;
import ram.MessageSort;
import ram.MessageView;
import ram.MessageViewReference;
import ram.OccurrenceSpecification;
import ram.OpaqueExpression;
import ram.Operation;
import ram.OriginalBehaviorExecution;
import ram.Parameter;
import ram.ParameterValue;
import ram.ParameterValueMapping;
import ram.RAny;
import ram.RBoolean;
import ram.RChar;
import ram.REnum;
import ram.REnumLiteral;
import ram.RInt;
import ram.RList;
import ram.RSet;
import ram.RString;
import ram.RVoid;
import ram.RamFactory;
import ram.RamPackage;
import ram.Reference;
import ram.ReferenceType;
import ram.StructuralFeatureValue;
import ram.StructuralView;
import ram.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RamFactoryImpl extends EFactoryImpl implements RamFactory {
	/*****iw to ram *****************************/
	
	@Override
	public ram.Class createRamClass(String name) {
		//result:=Class.new
		//result.name:=name
		
		ram.Class ramClass = RamFactory.eINSTANCE.createClass();
		ramClass.setName(name);
		
		return ramClass;
	}
	
	 /*  already implemented by EMF so changed name */
	@Override
	public RVoid createRVoidWname() {
		//result:=RVoid.new
		//result.name:="void"
		
		RVoid rVoid = RamFactory.eINSTANCE.createRVoid();
		rVoid.setName("void");
		return rVoid;
	}
	
	@Override
	public ram.Class createRamCustomizableNodeClass(String name) {
		//result:=createRamClass(name)
		//result.operations.add(createExecuteOperation)
		
		ram.Class custNodeClass = this.createRamClass(name);
		custNodeClass.getOperations().add(createExecuteOperation());
		
		return custNodeClass;
	}
	
	@Override
	public Operation createExecuteOperation() {
		/*result:=Operation.new
		result.name:="execute"
		result.~abstract:=false
		result.visibility:=Visibility.public
		result.static:=false
		result.partial:=false
		result.parameters.add(createExecuteOperationCParam)*/
		
		Operation oprtn = RamFactory.eINSTANCE.createOperation();
		oprtn.setName("execute");
		oprtn.setAbstract(false);
		oprtn.setVisibility(Visibility.PUBLIC);
		oprtn.setStatic(false);
		oprtn.setPartial(false);
		oprtn.getParameters().add(createExecuteOperationCParam());
		
		return oprtn;
	}
	
	@Override
	public Parameter createExecuteOperationCParam() {
		//result:=Parameter.new
		//result.name:="c"
		
		Parameter param = RamFactory.eINSTANCE.createParameter();
		param.setName("c");
		
		return param;
	}
	/*****iw to ram *****************************/
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RamFactory init() {
		try {
			RamFactory theRamFactory = (RamFactory)EPackage.Registry.INSTANCE.getEFactory("http://cs.mcgill.ca/sel/ram/2.0"); 
			if (theRamFactory != null) {
				return theRamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamFactoryImpl() {
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
			case RamPackage.ASPECT: return createAspect();
			case RamPackage.STRUCTURAL_VIEW: return createStructuralView();
			case RamPackage.CLASS: return createClass();
			case RamPackage.ASSOCIATION_END: return createAssociationEnd();
			case RamPackage.ASSOCIATION: return createAssociation();
			case RamPackage.INSTANTIATION: return createInstantiation();
			case RamPackage.MAPPING: return createMapping();
			case RamPackage.OPERATION: return createOperation();
			case RamPackage.ATTRIBUTE: return createAttribute();
			case RamPackage.PARAMETER: return createParameter();
			case RamPackage.RVOID: return createRVoid();
			case RamPackage.RBOOLEAN: return createRBoolean();
			case RamPackage.RINT: return createRInt();
			case RamPackage.RCHAR: return createRChar();
			case RamPackage.RSTRING: return createRString();
			case RamPackage.RANY: return createRAny();
			case RamPackage.RENUM: return createREnum();
			case RamPackage.RENUM_LITERAL: return createREnumLiteral();
			case RamPackage.MESSAGE_VIEW: return createMessageView();
			case RamPackage.MESSAGE_VIEW_REFERENCE: return createMessageViewReference();
			case RamPackage.INTERACTION: return createInteraction();
			case RamPackage.ASPECT_MESSAGE_VIEW: return createAspectMessageView();
			case RamPackage.LIFELINE: return createLifeline();
			case RamPackage.MESSAGE: return createMessage();
			case RamPackage.MESSAGE_OCCURRENCE_SPECIFICATION: return createMessageOccurrenceSpecification();
			case RamPackage.OCCURRENCE_SPECIFICATION: return createOccurrenceSpecification();
			case RamPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION: return createDestructionOccurrenceSpecification();
			case RamPackage.COMBINED_FRAGMENT: return createCombinedFragment();
			case RamPackage.ORIGINAL_BEHAVIOR_EXECUTION: return createOriginalBehaviorExecution();
			case RamPackage.EXECUTION_STATEMENT: return createExecutionStatement();
			case RamPackage.INTERACTION_OPERAND: return createInteractionOperand();
			case RamPackage.STRUCTURAL_FEATURE_VALUE: return createStructuralFeatureValue();
			case RamPackage.PARAMETER_VALUE_MAPPING: return createParameterValueMapping();
			case RamPackage.PARAMETER_VALUE: return createParameterValue();
			case RamPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
			case RamPackage.LITERAL_STRING: return createLiteralString();
			case RamPackage.LITERAL_INTEGER: return createLiteralInteger();
			case RamPackage.RSET: return createRSet();
			case RamPackage.RLIST: return createRList();
			case RamPackage.LAYOUT: return createLayout();
			case RamPackage.CONTAINER_MAP: return (EObject)createContainerMap();
			case RamPackage.ELEMENT_MAP: return (EObject)createElementMap();
			case RamPackage.LAYOUT_ELEMENT: return createLayoutElement();
			case RamPackage.IMPLEMENTATION_CLASS: return createImplementationClass();
			case RamPackage.REFERENCE: return createReference();
			case RamPackage.GATE: return createGate();
			case RamPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
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
			case RamPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case RamPackage.REFERENCE_TYPE:
				return createReferenceTypeFromString(eDataType, initialValue);
			case RamPackage.MESSAGE_SORT:
				return createMessageSortFromString(eDataType, initialValue);
			case RamPackage.INTERACTION_OPERATOR_KIND:
				return createInteractionOperatorKindFromString(eDataType, initialValue);
			case RamPackage.INSTANTIATION_TYPE:
				return createInstantiationTypeFromString(eDataType, initialValue);
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
			case RamPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case RamPackage.REFERENCE_TYPE:
				return convertReferenceTypeToString(eDataType, instanceValue);
			case RamPackage.MESSAGE_SORT:
				return convertMessageSortToString(eDataType, instanceValue);
			case RamPackage.INTERACTION_OPERATOR_KIND:
				return convertInteractionOperatorKindToString(eDataType, instanceValue);
			case RamPackage.INSTANTIATION_TYPE:
				return convertInstantiationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralView createStructuralView() {
		StructuralViewImpl structuralView = new StructuralViewImpl();
		return structuralView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ram.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd createAssociationEnd() {
		AssociationEndImpl associationEnd = new AssociationEndImpl();
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instantiation createInstantiation() {
		InstantiationImpl instantiation = new InstantiationImpl();
		return instantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RVoid createRVoid() {
		RVoidImpl rVoid = new RVoidImpl();
		return rVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBoolean createRBoolean() {
		RBooleanImpl rBoolean = new RBooleanImpl();
		return rBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RInt createRInt() {
		RIntImpl rInt = new RIntImpl();
		return rInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RChar createRChar() {
		RCharImpl rChar = new RCharImpl();
		return rChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RString createRString() {
		RStringImpl rString = new RStringImpl();
		return rString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAny createRAny() {
		RAnyImpl rAny = new RAnyImpl();
		return rAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REnum createREnum() {
		REnumImpl rEnum = new REnumImpl();
		return rEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REnumLiteral createREnumLiteral() {
		REnumLiteralImpl rEnumLiteral = new REnumLiteralImpl();
		return rEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageView createMessageView() {
		MessageViewImpl messageView = new MessageViewImpl();
		return messageView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageViewReference createMessageViewReference() {
		MessageViewReferenceImpl messageViewReference = new MessageViewReferenceImpl();
		return messageViewReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectMessageView createAspectMessageView() {
		AspectMessageViewImpl aspectMessageView = new AspectMessageViewImpl();
		return aspectMessageView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurrenceSpecification createMessageOccurrenceSpecification() {
		MessageOccurrenceSpecificationImpl messageOccurrenceSpecification = new MessageOccurrenceSpecificationImpl();
		return messageOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification createOccurrenceSpecification() {
		OccurrenceSpecificationImpl occurrenceSpecification = new OccurrenceSpecificationImpl();
		return occurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructionOccurrenceSpecification createDestructionOccurrenceSpecification() {
		DestructionOccurrenceSpecificationImpl destructionOccurrenceSpecification = new DestructionOccurrenceSpecificationImpl();
		return destructionOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalBehaviorExecution createOriginalBehaviorExecution() {
		OriginalBehaviorExecutionImpl originalBehaviorExecution = new OriginalBehaviorExecutionImpl();
		return originalBehaviorExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStatement createExecutionStatement() {
		ExecutionStatementImpl executionStatement = new ExecutionStatementImpl();
		return executionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createInteractionOperand() {
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureValue createStructuralFeatureValue() {
		StructuralFeatureValueImpl structuralFeatureValue = new StructuralFeatureValueImpl();
		return structuralFeatureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueMapping createParameterValueMapping() {
		ParameterValueMappingImpl parameterValueMapping = new ParameterValueMappingImpl();
		return parameterValueMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSet createRSet() {
		RSetImpl rSet = new RSetImpl();
		return rSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RList createRList() {
		RListImpl rList = new RListImpl();
		return rList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, EMap<EObject, LayoutElement>> createContainerMap() {
		ContainerMapImpl containerMap = new ContainerMapImpl();
		return containerMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, LayoutElement> createElementMap() {
		ElementMapImpl elementMap = new ElementMapImpl();
		return elementMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutElement createLayoutElement() {
		LayoutElementImpl layoutElement = new LayoutElementImpl();
		return layoutElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationClass createImplementationClass() {
		ImplementationClassImpl implementationClass = new ImplementationClassImpl();
		return implementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceTypeFromString(EDataType eDataType, String initialValue) {
		ReferenceType result = ReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue) {
		MessageSort result = MessageSort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind createInteractionOperatorKindFromString(EDataType eDataType, String initialValue) {
		InteractionOperatorKind result = InteractionOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationType createInstantiationTypeFromString(EDataType eDataType, String initialValue) {
		InstantiationType result = InstantiationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantiationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamPackage getRamPackage() {
		return (RamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RamPackage getPackage() {
		return RamPackage.eINSTANCE;
	}

} //RamFactoryImpl
