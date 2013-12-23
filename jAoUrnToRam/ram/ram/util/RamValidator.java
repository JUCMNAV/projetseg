/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ram.AbstractMessageView;
import ram.Aspect;
import ram.AspectMessageView;
import ram.Association;
import ram.AssociationEnd;
import ram.Attribute;
import ram.AttributeMapping;
import ram.Classifier;
import ram.ClassifierMapping;
import ram.CombinedFragment;
import ram.Constraint;
import ram.DestructionOccurrenceSpecification;
import ram.ExecutionStatement;
import ram.FragmentContainer;
import ram.Gate;
import ram.ImplementationClass;
import ram.Instantiation;
import ram.InstantiationType;
import ram.Interaction;
import ram.InteractionFragment;
import ram.InteractionOperand;
import ram.InteractionOperatorKind;
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
import ram.MessageSort;
import ram.MessageView;
import ram.MessageViewReference;
import ram.NamedElement;
import ram.ObjectType;
import ram.OccurrenceSpecification;
import ram.OpaqueExpression;
import ram.Operation;
import ram.OperationMapping;
import ram.OriginalBehaviorExecution;
import ram.Parameter;
import ram.ParameterMapping;
import ram.ParameterValue;
import ram.ParameterValueMapping;
import ram.PrimitiveType;
import ram.Property;
import ram.RAny;
import ram.RBoolean;
import ram.RChar;
import ram.RCollection;
import ram.RDouble;
import ram.REnum;
import ram.REnumLiteral;
import ram.RFloat;
import ram.RInt;
import ram.RSequence;
import ram.RList;
import ram.RSet;
import ram.RString;
import ram.RVoid;
import ram.RamPackage;
import ram.Reference;
import ram.ReferenceType;
import ram.State;
import ram.StateMachine;
import ram.StateView;
import ram.StructuralFeature;
import ram.StructuralFeatureValue;
import ram.StructuralView;
import ram.Substitution;
import ram.TemporaryProperty;
import ram.Transition;
import ram.TransitionSubstitution;
import ram.Type;
import ram.TypedElement;
import ram.ValueSpecification;
import ram.Visibility;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ram.RamPackage
 * @generated
 */
public class RamValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RamValidator INSTANCE = new RamValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RamPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RamPackage.ASPECT:
				return validateAspect((Aspect)value, diagnostics, context);
			case RamPackage.MAPPABLE_ELEMENT:
				return validateMappableElement((MappableElement)value, diagnostics, context);
			case RamPackage.STRUCTURAL_VIEW:
				return validateStructuralView((StructuralView)value, diagnostics, context);
			case RamPackage.CLASS:
				return validateClass((ram.Class)value, diagnostics, context);
			case RamPackage.ASSOCIATION_END:
				return validateAssociationEnd((AssociationEnd)value, diagnostics, context);
			case RamPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case RamPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case RamPackage.INSTANTIATION:
				return validateInstantiation((Instantiation)value, diagnostics, context);
			case RamPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case RamPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case RamPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case RamPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case RamPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case RamPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case RamPackage.OBJECT_TYPE:
				return validateObjectType((ObjectType)value, diagnostics, context);
			case RamPackage.RVOID:
				return validateRVoid((RVoid)value, diagnostics, context);
			case RamPackage.RBOOLEAN:
				return validateRBoolean((RBoolean)value, diagnostics, context);
			case RamPackage.RINT:
				return validateRInt((RInt)value, diagnostics, context);
			case RamPackage.RCHAR:
				return validateRChar((RChar)value, diagnostics, context);
			case RamPackage.RSTRING:
				return validateRString((RString)value, diagnostics, context);
			case RamPackage.RANY:
				return validateRAny((RAny)value, diagnostics, context);
			case RamPackage.RENUM:
				return validateREnum((REnum)value, diagnostics, context);
			case RamPackage.RENUM_LITERAL:
				return validateREnumLiteral((REnumLiteral)value, diagnostics, context);
			case RamPackage.ABSTRACT_MESSAGE_VIEW:
				return validateAbstractMessageView((AbstractMessageView)value, diagnostics, context);
			case RamPackage.MESSAGE_VIEW:
				return validateMessageView((MessageView)value, diagnostics, context);
			case RamPackage.MESSAGE_VIEW_REFERENCE:
				return validateMessageViewReference((MessageViewReference)value, diagnostics, context);
			case RamPackage.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case RamPackage.ASPECT_MESSAGE_VIEW:
				return validateAspectMessageView((AspectMessageView)value, diagnostics, context);
			case RamPackage.LIFELINE:
				return validateLifeline((Lifeline)value, diagnostics, context);
			case RamPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case RamPackage.MESSAGE_END:
				return validateMessageEnd((MessageEnd)value, diagnostics, context);
			case RamPackage.MESSAGE_OCCURRENCE_SPECIFICATION:
				return validateMessageOccurrenceSpecification((MessageOccurrenceSpecification)value, diagnostics, context);
			case RamPackage.OCCURRENCE_SPECIFICATION:
				return validateOccurrenceSpecification((OccurrenceSpecification)value, diagnostics, context);
			case RamPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION:
				return validateDestructionOccurrenceSpecification((DestructionOccurrenceSpecification)value, diagnostics, context);
			case RamPackage.INTERACTION_FRAGMENT:
				return validateInteractionFragment((InteractionFragment)value, diagnostics, context);
			case RamPackage.COMBINED_FRAGMENT:
				return validateCombinedFragment((CombinedFragment)value, diagnostics, context);
			case RamPackage.ORIGINAL_BEHAVIOR_EXECUTION:
				return validateOriginalBehaviorExecution((OriginalBehaviorExecution)value, diagnostics, context);
			case RamPackage.EXECUTION_STATEMENT:
				return validateExecutionStatement((ExecutionStatement)value, diagnostics, context);
			case RamPackage.INTERACTION_OPERAND:
				return validateInteractionOperand((InteractionOperand)value, diagnostics, context);
			case RamPackage.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case RamPackage.STRUCTURAL_FEATURE_VALUE:
				return validateStructuralFeatureValue((StructuralFeatureValue)value, diagnostics, context);
			case RamPackage.PARAMETER_VALUE_MAPPING:
				return validateParameterValueMapping((ParameterValueMapping)value, diagnostics, context);
			case RamPackage.PARAMETER_VALUE:
				return validateParameterValue((ParameterValue)value, diagnostics, context);
			case RamPackage.OPAQUE_EXPRESSION:
				return validateOpaqueExpression((OpaqueExpression)value, diagnostics, context);
			case RamPackage.LITERAL_SPECIFICATION:
				return validateLiteralSpecification((LiteralSpecification)value, diagnostics, context);
			case RamPackage.LITERAL_STRING:
				return validateLiteralString((LiteralString)value, diagnostics, context);
			case RamPackage.LITERAL_INTEGER:
				return validateLiteralInteger((LiteralInteger)value, diagnostics, context);
			case RamPackage.FRAGMENT_CONTAINER:
				return validateFragmentContainer((FragmentContainer)value, diagnostics, context);
			case RamPackage.RCOLLECTION:
				return validateRCollection((RCollection)value, diagnostics, context);
			case RamPackage.RSET:
				return validateRSet((RSet)value, diagnostics, context);
			case RamPackage.RSEQUENCE:
				return validateRSequence((RSequence)value, diagnostics, context);
			case RamPackage.LAYOUT:
				return validateLayout((Layout)value, diagnostics, context);
			case RamPackage.CONTAINER_MAP:
				return validateContainerMap((Map.Entry<?, ?>)value, diagnostics, context);
			case RamPackage.ELEMENT_MAP:
				return validateElementMap((Map.Entry<?, ?>)value, diagnostics, context);
			case RamPackage.LAYOUT_ELEMENT:
				return validateLayoutElement((LayoutElement)value, diagnostics, context);
			case RamPackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case RamPackage.IMPLEMENTATION_CLASS:
				return validateImplementationClass((ImplementationClass)value, diagnostics, context);
			case RamPackage.TEMPORARY_PROPERTY:
				return validateTemporaryProperty((TemporaryProperty)value, diagnostics, context);
			case RamPackage.STRUCTURAL_FEATURE:
				return validateStructuralFeature((StructuralFeature)value, diagnostics, context);
			case RamPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case RamPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case RamPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case RamPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case RamPackage.LITERAL_BOOLEAN:
				return validateLiteralBoolean((LiteralBoolean)value, diagnostics, context);
			case RamPackage.CLASSIFIER_MAPPING:
				return validateClassifierMapping((ClassifierMapping)value, diagnostics, context);
			case RamPackage.ATTRIBUTE_MAPPING:
				return validateAttributeMapping((AttributeMapping)value, diagnostics, context);
			case RamPackage.OPERATION_MAPPING:
				return validateOperationMapping((OperationMapping)value, diagnostics, context);
			case RamPackage.PARAMETER_MAPPING:
				return validateParameterMapping((ParameterMapping)value, diagnostics, context);
			case RamPackage.STATE_VIEW:
				return validateStateView((StateView)value, diagnostics, context);
			case RamPackage.STATE_MACHINE:
				return validateStateMachine((StateMachine)value, diagnostics, context);
			case RamPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case RamPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case RamPackage.RDOUBLE:
				return validateRDouble((RDouble)value, diagnostics, context);
			case RamPackage.RFLOAT:
				return validateRFloat((RFloat)value, diagnostics, context);
			case RamPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case RamPackage.SUBSTITUTION:
				return validateSubstitution((Substitution)value, diagnostics, context);
			case RamPackage.TRANSITION_SUBSTITUTION:
				return validateTransitionSubstitution((TransitionSubstitution)value, diagnostics, context);
			case RamPackage.VISIBILITY:
				return validateVisibility((Visibility)value, diagnostics, context);
			case RamPackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case RamPackage.MESSAGE_SORT:
				return validateMessageSort((MessageSort)value, diagnostics, context);
			case RamPackage.INTERACTION_OPERATOR_KIND:
				return validateInteractionOperatorKind((InteractionOperatorKind)value, diagnostics, context);
			case RamPackage.INSTANTIATION_TYPE:
				return validateInstantiationType((InstantiationType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspect(Aspect aspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aspect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aspect, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(aspect, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappableElement(MappableElement mappableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mappableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mappableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(mappableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralView(StructuralView structuralView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuralView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralView_uniqueTypes(structuralView, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralView_noTwoClassesWithSameName(structuralView, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueTypes constraint of '<em>Structural View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURAL_VIEW__UNIQUE_TYPES__EEXPRESSION = "self.types->isUnique(name)";

	/**
	 * Validates the uniqueTypes constraint of '<em>Structural View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralView_uniqueTypes(StructuralView structuralView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.STRUCTURAL_VIEW,
				 structuralView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueTypes",
				 STRUCTURAL_VIEW__UNIQUE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noTwoClassesWithSameName constraint of '<em>Structural View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURAL_VIEW__NO_TWO_CLASSES_WITH_SAME_NAME__EEXPRESSION = "self.classes->isUnique(name)";

	/**
	 * Validates the noTwoClassesWithSameName constraint of '<em>Structural View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralView_noTwoClassesWithSameName(StructuralView structuralView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.STRUCTURAL_VIEW,
				 structuralView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noTwoClassesWithSameName",
				 STRUCTURAL_VIEW__NO_TWO_CLASSES_WITH_SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(ram.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_notSelfSuperType(class_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the notSelfSuperType constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__NOT_SELF_SUPER_TYPE__EEXPRESSION = "not self.superTypes->includes(self)";

	/**
	 * Validates the notSelfSuperType constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_notSelfSuperType(ram.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notSelfSuperType",
				 CLASS__NOT_SELF_SUPER_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnd(AssociationEnd associationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validUpperBound(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validLowerBound(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validMultiplicity(associationEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationEnd_uniqueName(associationEnd, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueName constraint of '<em>Association End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION_END__UNIQUE_NAME__EEXPRESSION = "self.myClass.associationEnds->select(associationEnd : AssociationEnd | associationEnd.name <> null and associationEnd.name <> '')->isUnique(name)";

	/**
	 * Validates the uniqueName constraint of '<em>Association End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnd_uniqueName(AssociationEnd associationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.ASSOCIATION_END,
				 associationEnd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueName",
				 ASSOCIATION_END__UNIQUE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(association, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validName constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__VALID_NAME__EEXPRESSION = "if self.oclIsTypeOf(AssociationEnd) and self.oclAsType(AssociationEnd).navigable = false then true else self.name <> '' endif";

	/**
	 * Validates the validName constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validName(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validName",
				 NAMED_ELEMENT__VALID_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiation(Instantiation instantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instantiation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstantiation_aspectCannotMapSelf(instantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstantiation_mandatoryAspectParametersMapped(instantiation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the aspectCannotMapSelf constraint of '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANTIATION__ASPECT_CANNOT_MAP_SELF__EEXPRESSION = "not (self.externalAspect = self.Aspect)";

	/**
	 * Validates the aspectCannotMapSelf constraint of '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiation_aspectCannotMapSelf(Instantiation instantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.INSTANTIATION,
				 instantiation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "aspectCannotMapSelf",
				 INSTANTIATION__ASPECT_CANNOT_MAP_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the mandatoryAspectParametersMapped constraint of '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANTIATION__MANDATORY_ASPECT_PARAMETERS_MAPPED__EEXPRESSION = "if self.type = InstantiationType::Depends then self.externalAspect.mandatoryAspectParameters->forAll(element : MappableElement | self.mappings->exists(fromElement = element)) else true endif";

	/**
	 * Validates the mandatoryAspectParametersMapped constraint of '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiation_mandatoryAspectParametersMapped(Instantiation instantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.INSTANTIATION,
				 instantiation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mandatoryAspectParametersMapped",
				 INSTANTIATION__MANDATORY_ASPECT_PARAMETERS_MAPPED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_messageViewDefined(operation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the messageViewDefined constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__MESSAGE_VIEW_DEFINED__EEXPRESSION = "if visibility = Visibility::public and self.Classifier.oclIsTypeOf(Class) then self.Classifier.oclContainer().oclAsType(StructuralView).Aspect.messageViews->select(messageView : AbstractMessageView | messageView.oclIsTypeOf(MessageView))->one(messageView : AbstractMessageView | messageView.oclAsType(MessageView).specifies = self) else true endif";

	/**
	 * Validates the messageViewDefined constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_messageViewDefined(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "messageViewDefined",
				 OPERATION__MESSAGE_VIEW_DEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(attribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_notVoid(parameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the notVoid constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__NOT_VOID__EEXPRESSION = "not self.type.oclIsTypeOf(RVoid)";

	/**
	 * Validates the notVoid constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_notVoid(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notVoid",
				 PARAMETER__NOT_VOID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(primitiveType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType(ObjectType objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(objectType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRVoid(RVoid rVoid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rVoid, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rVoid, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rVoid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBoolean(RBoolean rBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rBoolean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rBoolean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRInt(RInt rInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rInt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rInt, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRChar(RChar rChar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rChar, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rChar, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rChar, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRString(RString rString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rString, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRAny(RAny rAny, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rAny, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rAny, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rAny, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREnum(REnum rEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rEnum, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREnumLiteral(REnumLiteral rEnumLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rEnumLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rEnumLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractMessageView(AbstractMessageView abstractMessageView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractMessageView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageView(MessageView messageView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageView_specifiesIsFirstMessage(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageView_specificationDefined(messageView, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageView_isAffectedBy(messageView, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the specifiesIsFirstMessage constraint of '<em>Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_VIEW__SPECIFIES_IS_FIRST_MESSAGE__EEXPRESSION = "if not self.specification.oclIsUndefined() and self.specification.messages->size() > 0 then self.specifies = self.specification.messages->select(message : Message | not message.sendEvent.oclIsTypeOf(MessageOccurrenceSpecification))->asOrderedSet()->at(1).signature else true endif";

	/**
	 * Validates the specifiesIsFirstMessage constraint of '<em>Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageView_specifiesIsFirstMessage(MessageView messageView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE_VIEW,
				 messageView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "specifiesIsFirstMessage",
				 MESSAGE_VIEW__SPECIFIES_IS_FIRST_MESSAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the specificationDefined constraint of '<em>Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_VIEW__SPECIFICATION_DEFINED__EEXPRESSION = "if not self.specifies.oclIsUndefined() then if not self.specifies.partial then not self.specification.oclIsUndefined() else true endif else true endif";

	/**
	 * Validates the specificationDefined constraint of '<em>Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageView_specificationDefined(MessageView messageView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE_VIEW,
				 messageView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "specificationDefined",
				 MESSAGE_VIEW__SPECIFICATION_DEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isAffectedBy constraint of '<em>Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_VIEW__IS_AFFECTED_BY__EEXPRESSION = "if self.specification.oclIsUndefined() and self.specifies.partial then self.affectedBy->notEmpty() else true endif";

	/**
	 * Validates the isAffectedBy constraint of '<em>Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageView_isAffectedBy(MessageView messageView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE_VIEW,
				 messageView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAffectedBy",
				 MESSAGE_VIEW__IS_AFFECTED_BY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageViewReference(MessageViewReference messageViewReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageViewReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageViewReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageViewReference_isAffectedBy(messageViewReference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isAffectedBy constraint of '<em>Message View Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_VIEW_REFERENCE__IS_AFFECTED_BY__EEXPRESSION = "self.affectedBy->size() > 0";

	/**
	 * Validates the isAffectedBy constraint of '<em>Message View Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageViewReference_isAffectedBy(MessageViewReference messageViewReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE_VIEW_REFERENCE,
				 messageViewReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAffectedBy",
				 MESSAGE_VIEW_REFERENCE__IS_AFFECTED_BY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectMessageView(AspectMessageView aspectMessageView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aspectMessageView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(aspectMessageView, diagnostics, context);
		if (result || diagnostics != null) result &= validateAspectMessageView_notAffectedBySelf(aspectMessageView, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the notAffectedBySelf constraint of '<em>Aspect Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASPECT_MESSAGE_VIEW__NOT_AFFECTED_BY_SELF__EEXPRESSION = "not self.affectedBy->includes(self)";

	/**
	 * Validates the notAffectedBySelf constraint of '<em>Aspect Message View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectMessageView_notAffectedBySelf(AspectMessageView aspectMessageView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.ASPECT_MESSAGE_VIEW,
				 aspectMessageView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notAffectedBySelf",
				 ASPECT_MESSAGE_VIEW__NOT_AFFECTED_BY_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lifeline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_validSelfMessage(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_argumentsSpecified(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_createMessageIsFirst(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_returnsSpecified(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_boundariesNotCrossed(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_validReturns(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_validAssignTo(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_deleteMessageIsLast(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_validReturnsValue(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_assignToAllowed(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_noCrossingMessages(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_validSignature(message, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validSelfMessage constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__VALID_SELF_MESSAGE__EEXPRESSION = "if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then let sendEvent : InteractionFragment = self.sendEvent.oclAsType(InteractionFragment) in let receiveEvent : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in if sendEvent.covered->asOrderedSet()->at(1) = receiveEvent.covered->asOrderedSet()->at(1) then sendEvent.container.fragments->indexOf(self.sendEvent) < receiveEvent.container.fragments->indexOf(self.receiveEvent) else true endif else true endif";

	/**
	 * Validates the validSelfMessage constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_validSelfMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validSelfMessage",
				 MESSAGE__VALID_SELF_MESSAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the argumentsSpecified constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__ARGUMENTS_SPECIFIED__EEXPRESSION = "if self.messageSort <> MessageSort::reply and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.signature.oclIsUndefined() then let container : FragmentContainer = self.sendEvent.oclAsType(MessageOccurrenceSpecification).container in if container.fragments->includes(self.sendEvent) then self.signature.parameters->size() = self.arguments->size() and self.signature.parameters->forAll(currentParameter : Parameter | self.arguments->one(argument : ParameterValueMapping | argument.parameter = currentParameter)) else true endif else true endif";

	/**
	 * Validates the argumentsSpecified constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_argumentsSpecified(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "argumentsSpecified",
				 MESSAGE__ARGUMENTS_SPECIFIED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the createMessageIsFirst constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__CREATE_MESSAGE_IS_FIRST__EEXPRESSION = "if self.messageSort = MessageSort::createMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) >= event.container.fragments->indexOf(event) else true endif) else true endif else true endif";

	/**
	 * Validates the createMessageIsFirst constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_createMessageIsFirst(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "createMessageIsFirst",
				 MESSAGE__CREATE_MESSAGE_IS_FIRST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the returnsSpecified constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__RETURNS_SPECIFIED__EEXPRESSION = "if self.messageSort = MessageSort::reply then if not self.signature.returnType.oclIsTypeOf(RVoid) then not self.returns.oclIsUndefined() else self.returns.oclIsUndefined() endif else true endif";

	/**
	 * Validates the returnsSpecified constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_returnsSpecified(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "returnsSpecified",
				 MESSAGE__RETURNS_SPECIFIED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the boundariesNotCrossed constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__BOUNDARIES_NOT_CROSSED__EEXPRESSION = "let send : MessageOccurrenceSpecification = self.sendEvent in let receive : MessageOccurrenceSpecification = self.receiveEvent in if send.container.oclIsTypeOf(InteractionOperand) and receive.container.oclIsTypeOf(InteractionOperand) then send.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(send.covered->asOrderedSet()->at(1)) and receive.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(receive.covered->asOrderedSet()->at(1)) else true endif";

	/**
	 * Validates the boundariesNotCrossed constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_boundariesNotCrossed(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "boundariesNotCrossed",
				 MESSAGE__BOUNDARIES_NOT_CROSSED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validReturns constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__VALID_RETURNS__EEXPRESSION = "if not self.returns.oclIsUndefined() then self.messageSort = MessageSort::reply else true endif";

	/**
	 * Validates the validReturns constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_validReturns(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validReturns",
				 MESSAGE__VALID_RETURNS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validAssignTo constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__VALID_ASSIGN_TO__EEXPRESSION = "if not self.assignTo.oclIsUndefined() then let type : Type = if self.assignTo.oclIsTypeOf(Attribute) then self.assignTo.oclAsType(Attribute).type else if self.assignTo.oclIsTypeOf(Reference) then self.assignTo.oclAsType(Reference).type else self.assignTo.oclAsType(AssociationEnd).getType() endif endif in type.oclIsKindOf(self.signature.returnType.oclType()) else true endif";

	/**
	 * Validates the validAssignTo constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_validAssignTo(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validAssignTo",
				 MESSAGE__VALID_ASSIGN_TO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the deleteMessageIsLast constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__DELETE_MESSAGE_IS_LAST__EEXPRESSION = "if self.messageSort = MessageSort::deleteMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) <= event.container.fragments->indexOf(event) else true endif) else true endif else true endif";

	/**
	 * Validates the deleteMessageIsLast constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_deleteMessageIsLast(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "deleteMessageIsLast",
				 MESSAGE__DELETE_MESSAGE_IS_LAST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validReturnsValue constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__VALID_RETURNS_VALUE__EEXPRESSION = "if self.returns.oclIsTypeOf(StructuralFeatureValue) then let value : StructuralFeatureValue = self.returns.oclAsType(StructuralFeatureValue).value in if not value.oclIsUndefined() then let type : Type = if value.oclIsTypeOf(Attribute) then value.oclAsType(Attribute).type else if value.oclIsTypeOf(Reference) then value.oclAsType(Reference).type else value.oclAsType(AssociationEnd).getType() endif endif in type.oclIsTypeOf(self.signature.returnType.oclType()) else true endif else if self.returns.oclIsKindOf(LiteralSpecification) then false else true endif endif";

	/**
	 * Validates the validReturnsValue constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_validReturnsValue(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validReturnsValue",
				 MESSAGE__VALID_RETURNS_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the assignToAllowed constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__ASSIGN_TO_ALLOWED__EEXPRESSION = "if self.signature.returnType.oclIsTypeOf(RVoid) then self.assignTo = null else true endif";

	/**
	 * Validates the assignToAllowed constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_assignToAllowed(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "assignToAllowed",
				 MESSAGE__ASSIGN_TO_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noCrossingMessages constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__NO_CROSSING_MESSAGES__EEXPRESSION = "if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then let container : FragmentContainer = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).container in let indexDifference : Integer = container.fragments->indexOf(self.receiveEvent) - container.fragments->indexOf(self.sendEvent) in indexDifference = 1 else true endif";

	/**
	 * Validates the noCrossingMessages constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_noCrossingMessages(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noCrossingMessages",
				 MESSAGE__NO_CROSSING_MESSAGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validSignature constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__VALID_SIGNATURE__EEXPRESSION = "if self.messageSort <> MessageSort::reply and not self.receiveEvent.oclIsUndefined() then let typedElement : TypedElement = self.receiveEvent.oclAsType(InteractionFragment).covered->asOrderedSet()->at(1).represents in if not typedElement.oclIsUndefined() then let type : Type = if typedElement.oclIsTypeOf(Parameter) then typedElement.oclAsType(Parameter).type else if typedElement.oclIsTypeOf(Attribute) then typedElement.oclAsType(Attribute).type else if typedElement.oclIsTypeOf(Reference) then typedElement.oclAsType(Reference).type else typedElement.oclAsType(AssociationEnd).getType() endif endif endif in if type.oclIsKindOf(Classifier) then type.oclAsType(Classifier).operations->includes(self.signature) else true endif else true endif else true endif";

	/**
	 * Validates the validSignature constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_validSignature(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validSignature",
				 MESSAGE__VALID_SIGNATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEnd(MessageEnd messageEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageOccurrenceSpecification(MessageOccurrenceSpecification messageOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionFragment_validCoveredMultiplicity(messageOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrenceSpecification(OccurrenceSpecification occurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(occurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionFragment_validCoveredMultiplicity(occurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestructionOccurrenceSpecification(DestructionOccurrenceSpecification destructionOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(destructionOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionFragment_validCoveredMultiplicity(destructionOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionFragment(InteractionFragment interactionFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionFragment_validCoveredMultiplicity(interactionFragment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validCoveredMultiplicity constraint of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_FRAGMENT__VALID_COVERED_MULTIPLICITY__EEXPRESSION = "if not self.oclIsTypeOf(CombinedFragment) and covered->notEmpty() then covered->size() = 1 else true endif";

	/**
	 * Validates the validCoveredMultiplicity constraint of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionFragment_validCoveredMultiplicity(InteractionFragment interactionFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.INTERACTION_FRAGMENT,
				 interactionFragment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validCoveredMultiplicity",
				 INTERACTION_FRAGMENT__VALID_COVERED_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(combinedFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionFragment_validCoveredMultiplicity(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_validOperands(combinedFragment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validOperands constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMBINED_FRAGMENT__VALID_OPERANDS__EEXPRESSION = "if self.interactionOperator = InteractionOperatorKind::opt or self.interactionOperator = InteractionOperatorKind::loop or self.interactionOperator = InteractionOperatorKind::critical then self.operands->size() = 1 else true endif";

	/**
	 * Validates the validOperands constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_validOperands(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.COMBINED_FRAGMENT,
				 combinedFragment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validOperands",
				 COMBINED_FRAGMENT__VALID_OPERANDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOriginalBehaviorExecution(OriginalBehaviorExecution originalBehaviorExecution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(originalBehaviorExecution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(originalBehaviorExecution, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionFragment_validCoveredMultiplicity(originalBehaviorExecution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionStatement(ExecutionStatement executionStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionStatement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionFragment_validCoveredMultiplicity(executionStatement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionOperand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureValue(StructuralFeatureValue structuralFeatureValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralFeatureValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueMapping(ParameterValueMapping parameterValueMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterValueMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterValueMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterValueMapping_validParameterValue(parameterValueMapping, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validParameterValue constraint of '<em>Parameter Value Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_VALUE_MAPPING__VALID_PARAMETER_VALUE__EEXPRESSION = "if self.value.oclIsTypeOf(StructuralFeatureValue) then let value : StructuralFeatureValue = self.value.oclAsType(StructuralFeatureValue).value in if not value.oclIsUndefined() then let type : Type = if value.oclIsTypeOf(Attribute) then value.oclAsType(Attribute).type else if value.oclIsTypeOf(Reference) then value.oclAsType(Reference).type else value.oclAsType(AssociationEnd).getType() endif endif in type.oclIsTypeOf(self.parameter.type.oclType()) else true endif else if self.value.oclIsKindOf(LiteralSpecification) then false else true endif endif";

	/**
	 * Validates the validParameterValue constraint of '<em>Parameter Value Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueMapping_validParameterValue(ParameterValueMapping parameterValueMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.PARAMETER_VALUE_MAPPING,
				 parameterValueMapping,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validParameterValue",
				 PARAMETER_VALUE_MAPPING__VALID_PARAMETER_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValue(ParameterValue parameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterValue_validValueType(parameterValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validValueType constraint of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_VALUE__VALID_VALUE_TYPE__EEXPRESSION = "self.parameter.type.oclIsTypeOf(self.ParameterValueMapping.parameter.type.oclType())";

	/**
	 * Validates the validValueType constraint of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValue_validValueType(ParameterValue parameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.PARAMETER_VALUE,
				 parameterValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validValueType",
				 PARAMETER_VALUE__VALID_VALUE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opaqueExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralSpecification(LiteralSpecification literalSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralString(LiteralString literalString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralInteger(LiteralInteger literalInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalInteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFragmentContainer(FragmentContainer fragmentContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fragmentContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRCollection(RCollection rCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rCollection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rCollection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRSet(RSet rSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRSequence(RSequence rSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rSequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rSequence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayout(Layout layout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerMap(Map.Entry<?, ?> containerMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)containerMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementMap(Map.Entry<?, ?> elementMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)elementMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutElement(LayoutElement layoutElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layoutElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(classifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationClass(ImplementationClass implementationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(implementationClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(implementationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(implementationClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporaryProperty(TemporaryProperty temporaryProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporaryProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(StructuralFeature structuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(structuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validUpperBound(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validLowerBound(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validMultiplicity(reference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validUpperBound(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validLowerBound(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validMultiplicity(property, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validUpperBound constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__VALID_UPPER_BOUND__EEXPRESSION = "self.upperBound > 0 or self.upperBound = -1";

	/**
	 * Validates the validUpperBound constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validUpperBound(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validUpperBound",
				 PROPERTY__VALID_UPPER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validLowerBound constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__VALID_LOWER_BOUND__EEXPRESSION = "self.lowerBound >= 0";

	/**
	 * Validates the validLowerBound constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validLowerBound(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validLowerBound",
				 PROPERTY__VALID_LOWER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validMultiplicity constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__VALID_MULTIPLICITY__EEXPRESSION = "self.lowerBound <= self.upperBound or self.upperBound = -1";

	/**
	 * Validates the validMultiplicity constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validMultiplicity(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RamPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validMultiplicity",
				 PROPERTY__VALID_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(typedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(gate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralBoolean(LiteralBoolean literalBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalBoolean, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierMapping(ClassifierMapping classifierMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifierMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMapping(AttributeMapping attributeMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationMapping(OperationMapping operationMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMapping(ParameterMapping parameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateView(StateView stateView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateView, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(stateView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(transition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(state, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDouble(RDouble rDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rDouble, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rDouble, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRFloat(RFloat rFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rFloat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rFloat, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validName(rFloat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitution(Substitution substitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionSubstitution(TransitionSubstitution transitionSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibility(Visibility visibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSort(MessageSort messageSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperatorKind(InteractionOperatorKind interactionOperatorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiationType(InstantiationType instantiationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RamValidator
