/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import ram.AbstractMessageView;
import ram.Aspect;
import ram.AspectMessageView;
import ram.Association;
import ram.AssociationEnd;
import ram.Attribute;
import ram.Classifier;
import ram.CombinedFragment;
import ram.DestructionOccurrenceSpecification;
import ram.ExecutionStatement;
import ram.FragmentContainer;
import ram.Gate;
import ram.ImplementationClass;
import ram.Instantiation;
import ram.Interaction;
import ram.InteractionFragment;
import ram.InteractionOperand;
import ram.Layout;
import ram.LayoutElement;
import ram.Lifeline;
import ram.LiteralBoolean;
import ram.LiteralInteger;
import ram.LiteralSpecification;
import ram.LiteralString;
import ram.MappableElement;
import ram.Mapping;
import ram.Message;
import ram.MessageEnd;
import ram.MessageOccurrenceSpecification;
import ram.MessageView;
import ram.MessageViewReference;
import ram.NamedElement;
import ram.ObjectType;
import ram.OccurrenceSpecification;
import ram.OpaqueExpression;
import ram.Operation;
import ram.OriginalBehaviorExecution;
import ram.Parameter;
import ram.ParameterValue;
import ram.ParameterValueMapping;
import ram.PrimitiveType;
import ram.Property;
import ram.RAny;
import ram.RBoolean;
import ram.RChar;
import ram.RCollection;
import ram.REnum;
import ram.REnumLiteral;
import ram.RInt;
import ram.RList;
import ram.RSet;
import ram.RString;
import ram.RVoid;
import ram.RamPackage;
import ram.Reference;
import ram.StructuralFeature;
import ram.StructuralFeatureValue;
import ram.StructuralView;
import ram.TemporaryProperty;
import ram.Type;
import ram.TypedElement;
import ram.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ram.RamPackage
 * @generated
 */
public class RamAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RamPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RamPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RamSwitch<Adapter> modelSwitch =
		new RamSwitch<Adapter>() {
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter caseMappableElement(MappableElement object) {
				return createMappableElementAdapter();
			}
			@Override
			public Adapter caseStructuralView(StructuralView object) {
				return createStructuralViewAdapter();
			}
			@Override
			public Adapter caseClass(ram.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseAssociationEnd(AssociationEnd object) {
				return createAssociationEndAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseInstantiation(Instantiation object) {
				return createInstantiationAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseRVoid(RVoid object) {
				return createRVoidAdapter();
			}
			@Override
			public Adapter caseRBoolean(RBoolean object) {
				return createRBooleanAdapter();
			}
			@Override
			public Adapter caseRInt(RInt object) {
				return createRIntAdapter();
			}
			@Override
			public Adapter caseRChar(RChar object) {
				return createRCharAdapter();
			}
			@Override
			public Adapter caseRString(RString object) {
				return createRStringAdapter();
			}
			@Override
			public Adapter caseRAny(RAny object) {
				return createRAnyAdapter();
			}
			@Override
			public Adapter caseREnum(REnum object) {
				return createREnumAdapter();
			}
			@Override
			public Adapter caseREnumLiteral(REnumLiteral object) {
				return createREnumLiteralAdapter();
			}
			@Override
			public Adapter caseAbstractMessageView(AbstractMessageView object) {
				return createAbstractMessageViewAdapter();
			}
			@Override
			public Adapter caseMessageView(MessageView object) {
				return createMessageViewAdapter();
			}
			@Override
			public Adapter caseMessageViewReference(MessageViewReference object) {
				return createMessageViewReferenceAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseAspectMessageView(AspectMessageView object) {
				return createAspectMessageViewAdapter();
			}
			@Override
			public Adapter caseLifeline(Lifeline object) {
				return createLifelineAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseMessageEnd(MessageEnd object) {
				return createMessageEndAdapter();
			}
			@Override
			public Adapter caseMessageOccurrenceSpecification(MessageOccurrenceSpecification object) {
				return createMessageOccurrenceSpecificationAdapter();
			}
			@Override
			public Adapter caseOccurrenceSpecification(OccurrenceSpecification object) {
				return createOccurrenceSpecificationAdapter();
			}
			@Override
			public Adapter caseDestructionOccurrenceSpecification(DestructionOccurrenceSpecification object) {
				return createDestructionOccurrenceSpecificationAdapter();
			}
			@Override
			public Adapter caseInteractionFragment(InteractionFragment object) {
				return createInteractionFragmentAdapter();
			}
			@Override
			public Adapter caseCombinedFragment(CombinedFragment object) {
				return createCombinedFragmentAdapter();
			}
			@Override
			public Adapter caseOriginalBehaviorExecution(OriginalBehaviorExecution object) {
				return createOriginalBehaviorExecutionAdapter();
			}
			@Override
			public Adapter caseExecutionStatement(ExecutionStatement object) {
				return createExecutionStatementAdapter();
			}
			@Override
			public Adapter caseInteractionOperand(InteractionOperand object) {
				return createInteractionOperandAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseStructuralFeatureValue(StructuralFeatureValue object) {
				return createStructuralFeatureValueAdapter();
			}
			@Override
			public Adapter caseParameterValueMapping(ParameterValueMapping object) {
				return createParameterValueMappingAdapter();
			}
			@Override
			public Adapter caseParameterValue(ParameterValue object) {
				return createParameterValueAdapter();
			}
			@Override
			public Adapter caseOpaqueExpression(OpaqueExpression object) {
				return createOpaqueExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralSpecification(LiteralSpecification object) {
				return createLiteralSpecificationAdapter();
			}
			@Override
			public Adapter caseLiteralString(LiteralString object) {
				return createLiteralStringAdapter();
			}
			@Override
			public Adapter caseLiteralInteger(LiteralInteger object) {
				return createLiteralIntegerAdapter();
			}
			@Override
			public Adapter caseFragmentContainer(FragmentContainer object) {
				return createFragmentContainerAdapter();
			}
			@Override
			public Adapter caseRCollection(RCollection object) {
				return createRCollectionAdapter();
			}
			@Override
			public Adapter caseRSet(RSet object) {
				return createRSetAdapter();
			}
			@Override
			public Adapter caseRList(RList object) {
				return createRListAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseContainerMap(Map.Entry<EObject, EMap<EObject, LayoutElement>> object) {
				return createContainerMapAdapter();
			}
			@Override
			public Adapter caseElementMap(Map.Entry<EObject, LayoutElement> object) {
				return createElementMapAdapter();
			}
			@Override
			public Adapter caseLayoutElement(LayoutElement object) {
				return createLayoutElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseImplementationClass(ImplementationClass object) {
				return createImplementationClassAdapter();
			}
			@Override
			public Adapter caseTemporaryProperty(TemporaryProperty object) {
				return createTemporaryPropertyAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object) {
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ram.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.MappableElement <em>Mappable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.MappableElement
	 * @generated
	 */
	public Adapter createMappableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.StructuralView <em>Structural View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.StructuralView
	 * @generated
	 */
	public Adapter createStructuralViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.AssociationEnd
	 * @generated
	 */
	public Adapter createAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Instantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Instantiation
	 * @generated
	 */
	public Adapter createInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RVoid <em>RVoid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RVoid
	 * @generated
	 */
	public Adapter createRVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RBoolean <em>RBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RBoolean
	 * @generated
	 */
	public Adapter createRBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RInt <em>RInt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RInt
	 * @generated
	 */
	public Adapter createRIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RChar <em>RChar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RChar
	 * @generated
	 */
	public Adapter createRCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RString <em>RString</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RString
	 * @generated
	 */
	public Adapter createRStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RAny <em>RAny</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RAny
	 * @generated
	 */
	public Adapter createRAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.REnum <em>REnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.REnum
	 * @generated
	 */
	public Adapter createREnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.REnumLiteral <em>REnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.REnumLiteral
	 * @generated
	 */
	public Adapter createREnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.AbstractMessageView <em>Abstract Message View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.AbstractMessageView
	 * @generated
	 */
	public Adapter createAbstractMessageViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.MessageView <em>Message View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.MessageView
	 * @generated
	 */
	public Adapter createMessageViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.MessageViewReference <em>Message View Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.MessageViewReference
	 * @generated
	 */
	public Adapter createMessageViewReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.AspectMessageView <em>Aspect Message View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.AspectMessageView
	 * @generated
	 */
	public Adapter createAspectMessageViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Lifeline
	 * @generated
	 */
	public Adapter createLifelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.MessageEnd
	 * @generated
	 */
	public Adapter createMessageEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.MessageOccurrenceSpecification <em>Message Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.MessageOccurrenceSpecification
	 * @generated
	 */
	public Adapter createMessageOccurrenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.OccurrenceSpecification <em>Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.OccurrenceSpecification
	 * @generated
	 */
	public Adapter createOccurrenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.DestructionOccurrenceSpecification <em>Destruction Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.DestructionOccurrenceSpecification
	 * @generated
	 */
	public Adapter createDestructionOccurrenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.InteractionFragment
	 * @generated
	 */
	public Adapter createInteractionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.CombinedFragment
	 * @generated
	 */
	public Adapter createCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.OriginalBehaviorExecution <em>Original Behavior Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.OriginalBehaviorExecution
	 * @generated
	 */
	public Adapter createOriginalBehaviorExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.ExecutionStatement <em>Execution Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.ExecutionStatement
	 * @generated
	 */
	public Adapter createExecutionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.InteractionOperand
	 * @generated
	 */
	public Adapter createInteractionOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.StructuralFeatureValue <em>Structural Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.StructuralFeatureValue
	 * @generated
	 */
	public Adapter createStructuralFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.ParameterValueMapping <em>Parameter Value Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.ParameterValueMapping
	 * @generated
	 */
	public Adapter createParameterValueMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.OpaqueExpression
	 * @generated
	 */
	public Adapter createOpaqueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.LiteralSpecification
	 * @generated
	 */
	public Adapter createLiteralSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.FragmentContainer <em>Fragment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.FragmentContainer
	 * @generated
	 */
	public Adapter createFragmentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RCollection <em>RCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RCollection
	 * @generated
	 */
	public Adapter createRCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RSet <em>RSet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RSet
	 * @generated
	 */
	public Adapter createRSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.RList <em>RList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.RList
	 * @generated
	 */
	public Adapter createRListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Container Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createContainerMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Element Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createElementMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.LayoutElement <em>Layout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.LayoutElement
	 * @generated
	 */
	public Adapter createLayoutElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.ImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.ImplementationClass
	 * @generated
	 */
	public Adapter createImplementationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.TemporaryProperty <em>Temporary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.TemporaryProperty
	 * @generated
	 */
	public Adapter createTemporaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ram.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ram.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RamAdapterFactory
