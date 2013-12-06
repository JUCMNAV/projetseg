/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.util;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ram.RamPackage
 * @generated
 */
public class RamSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RamPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamSwitch() {
		if (modelPackage == null) {
			modelPackage = RamPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RamPackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				T result = caseAspect(aspect);
				if (result == null) result = caseNamedElement(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.MAPPABLE_ELEMENT: {
				MappableElement mappableElement = (MappableElement)theEObject;
				T result = caseMappableElement(mappableElement);
				if (result == null) result = caseNamedElement(mappableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.STRUCTURAL_VIEW: {
				StructuralView structuralView = (StructuralView)theEObject;
				T result = caseStructuralView(structuralView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.CLASS: {
				ram.Class class_ = (ram.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseObjectType(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseMappableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.ASSOCIATION_END: {
				AssociationEnd associationEnd = (AssociationEnd)theEObject;
				T result = caseAssociationEnd(associationEnd);
				if (result == null) result = caseProperty(associationEnd);
				if (result == null) result = caseStructuralFeature(associationEnd);
				if (result == null) result = caseTypedElement(associationEnd);
				if (result == null) result = caseNamedElement(associationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.INSTANTIATION: {
				Instantiation instantiation = (Instantiation)theEObject;
				T result = caseInstantiation(instantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseMappableElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseStructuralFeature(attribute);
				if (result == null) result = caseTemporaryProperty(attribute);
				if (result == null) result = caseTypedElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseImplementationClass(primitiveType);
				if (result == null) result = caseClassifier(primitiveType);
				if (result == null) result = caseObjectType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseMappableElement(primitiveType);
				if (result == null) result = caseNamedElement(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = caseType(objectType);
				if (result == null) result = caseMappableElement(objectType);
				if (result == null) result = caseNamedElement(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RVOID: {
				RVoid rVoid = (RVoid)theEObject;
				T result = caseRVoid(rVoid);
				if (result == null) result = caseType(rVoid);
				if (result == null) result = caseNamedElement(rVoid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RBOOLEAN: {
				RBoolean rBoolean = (RBoolean)theEObject;
				T result = caseRBoolean(rBoolean);
				if (result == null) result = casePrimitiveType(rBoolean);
				if (result == null) result = caseImplementationClass(rBoolean);
				if (result == null) result = caseClassifier(rBoolean);
				if (result == null) result = caseObjectType(rBoolean);
				if (result == null) result = caseType(rBoolean);
				if (result == null) result = caseMappableElement(rBoolean);
				if (result == null) result = caseNamedElement(rBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RINT: {
				RInt rInt = (RInt)theEObject;
				T result = caseRInt(rInt);
				if (result == null) result = casePrimitiveType(rInt);
				if (result == null) result = caseImplementationClass(rInt);
				if (result == null) result = caseClassifier(rInt);
				if (result == null) result = caseObjectType(rInt);
				if (result == null) result = caseType(rInt);
				if (result == null) result = caseMappableElement(rInt);
				if (result == null) result = caseNamedElement(rInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RCHAR: {
				RChar rChar = (RChar)theEObject;
				T result = caseRChar(rChar);
				if (result == null) result = casePrimitiveType(rChar);
				if (result == null) result = caseImplementationClass(rChar);
				if (result == null) result = caseClassifier(rChar);
				if (result == null) result = caseObjectType(rChar);
				if (result == null) result = caseType(rChar);
				if (result == null) result = caseMappableElement(rChar);
				if (result == null) result = caseNamedElement(rChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RSTRING: {
				RString rString = (RString)theEObject;
				T result = caseRString(rString);
				if (result == null) result = casePrimitiveType(rString);
				if (result == null) result = caseImplementationClass(rString);
				if (result == null) result = caseClassifier(rString);
				if (result == null) result = caseObjectType(rString);
				if (result == null) result = caseType(rString);
				if (result == null) result = caseMappableElement(rString);
				if (result == null) result = caseNamedElement(rString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RANY: {
				RAny rAny = (RAny)theEObject;
				T result = caseRAny(rAny);
				if (result == null) result = caseType(rAny);
				if (result == null) result = caseNamedElement(rAny);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RENUM: {
				REnum rEnum = (REnum)theEObject;
				T result = caseREnum(rEnum);
				if (result == null) result = casePrimitiveType(rEnum);
				if (result == null) result = caseImplementationClass(rEnum);
				if (result == null) result = caseClassifier(rEnum);
				if (result == null) result = caseObjectType(rEnum);
				if (result == null) result = caseType(rEnum);
				if (result == null) result = caseMappableElement(rEnum);
				if (result == null) result = caseNamedElement(rEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RENUM_LITERAL: {
				REnumLiteral rEnumLiteral = (REnumLiteral)theEObject;
				T result = caseREnumLiteral(rEnumLiteral);
				if (result == null) result = caseNamedElement(rEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.ABSTRACT_MESSAGE_VIEW: {
				AbstractMessageView abstractMessageView = (AbstractMessageView)theEObject;
				T result = caseAbstractMessageView(abstractMessageView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.MESSAGE_VIEW: {
				MessageView messageView = (MessageView)theEObject;
				T result = caseMessageView(messageView);
				if (result == null) result = caseAbstractMessageView(messageView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.MESSAGE_VIEW_REFERENCE: {
				MessageViewReference messageViewReference = (MessageViewReference)theEObject;
				T result = caseMessageViewReference(messageViewReference);
				if (result == null) result = caseAbstractMessageView(messageViewReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseFragmentContainer(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.ASPECT_MESSAGE_VIEW: {
				AspectMessageView aspectMessageView = (AspectMessageView)theEObject;
				T result = caseAspectMessageView(aspectMessageView);
				if (result == null) result = caseAbstractMessageView(aspectMessageView);
				if (result == null) result = caseNamedElement(aspectMessageView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.LIFELINE: {
				Lifeline lifeline = (Lifeline)theEObject;
				T result = caseLifeline(lifeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.MESSAGE_END: {
				MessageEnd messageEnd = (MessageEnd)theEObject;
				T result = caseMessageEnd(messageEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.MESSAGE_OCCURRENCE_SPECIFICATION: {
				MessageOccurrenceSpecification messageOccurrenceSpecification = (MessageOccurrenceSpecification)theEObject;
				T result = caseMessageOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseMessageEnd(messageOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(messageOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.OCCURRENCE_SPECIFICATION: {
				OccurrenceSpecification occurrenceSpecification = (OccurrenceSpecification)theEObject;
				T result = caseOccurrenceSpecification(occurrenceSpecification);
				if (result == null) result = caseInteractionFragment(occurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION: {
				DestructionOccurrenceSpecification destructionOccurrenceSpecification = (DestructionOccurrenceSpecification)theEObject;
				T result = caseDestructionOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseMessageOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseMessageEnd(destructionOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(destructionOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.INTERACTION_FRAGMENT: {
				InteractionFragment interactionFragment = (InteractionFragment)theEObject;
				T result = caseInteractionFragment(interactionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.COMBINED_FRAGMENT: {
				CombinedFragment combinedFragment = (CombinedFragment)theEObject;
				T result = caseCombinedFragment(combinedFragment);
				if (result == null) result = caseInteractionFragment(combinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.ORIGINAL_BEHAVIOR_EXECUTION: {
				OriginalBehaviorExecution originalBehaviorExecution = (OriginalBehaviorExecution)theEObject;
				T result = caseOriginalBehaviorExecution(originalBehaviorExecution);
				if (result == null) result = caseInteractionFragment(originalBehaviorExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.EXECUTION_STATEMENT: {
				ExecutionStatement executionStatement = (ExecutionStatement)theEObject;
				T result = caseExecutionStatement(executionStatement);
				if (result == null) result = caseInteractionFragment(executionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.INTERACTION_OPERAND: {
				InteractionOperand interactionOperand = (InteractionOperand)theEObject;
				T result = caseInteractionOperand(interactionOperand);
				if (result == null) result = caseFragmentContainer(interactionOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.VALUE_SPECIFICATION: {
				ValueSpecification valueSpecification = (ValueSpecification)theEObject;
				T result = caseValueSpecification(valueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.STRUCTURAL_FEATURE_VALUE: {
				StructuralFeatureValue structuralFeatureValue = (StructuralFeatureValue)theEObject;
				T result = caseStructuralFeatureValue(structuralFeatureValue);
				if (result == null) result = caseValueSpecification(structuralFeatureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.PARAMETER_VALUE_MAPPING: {
				ParameterValueMapping parameterValueMapping = (ParameterValueMapping)theEObject;
				T result = caseParameterValueMapping(parameterValueMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.PARAMETER_VALUE: {
				ParameterValue parameterValue = (ParameterValue)theEObject;
				T result = caseParameterValue(parameterValue);
				if (result == null) result = caseValueSpecification(parameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.OPAQUE_EXPRESSION: {
				OpaqueExpression opaqueExpression = (OpaqueExpression)theEObject;
				T result = caseOpaqueExpression(opaqueExpression);
				if (result == null) result = caseValueSpecification(opaqueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.LITERAL_SPECIFICATION: {
				LiteralSpecification literalSpecification = (LiteralSpecification)theEObject;
				T result = caseLiteralSpecification(literalSpecification);
				if (result == null) result = caseValueSpecification(literalSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.LITERAL_STRING: {
				LiteralString literalString = (LiteralString)theEObject;
				T result = caseLiteralString(literalString);
				if (result == null) result = caseLiteralSpecification(literalString);
				if (result == null) result = caseValueSpecification(literalString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.LITERAL_INTEGER: {
				LiteralInteger literalInteger = (LiteralInteger)theEObject;
				T result = caseLiteralInteger(literalInteger);
				if (result == null) result = caseLiteralSpecification(literalInteger);
				if (result == null) result = caseValueSpecification(literalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.FRAGMENT_CONTAINER: {
				FragmentContainer fragmentContainer = (FragmentContainer)theEObject;
				T result = caseFragmentContainer(fragmentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RCOLLECTION: {
				RCollection rCollection = (RCollection)theEObject;
				T result = caseRCollection(rCollection);
				if (result == null) result = caseImplementationClass(rCollection);
				if (result == null) result = caseClassifier(rCollection);
				if (result == null) result = caseObjectType(rCollection);
				if (result == null) result = caseType(rCollection);
				if (result == null) result = caseMappableElement(rCollection);
				if (result == null) result = caseNamedElement(rCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RSET: {
				RSet rSet = (RSet)theEObject;
				T result = caseRSet(rSet);
				if (result == null) result = caseRCollection(rSet);
				if (result == null) result = caseImplementationClass(rSet);
				if (result == null) result = caseClassifier(rSet);
				if (result == null) result = caseObjectType(rSet);
				if (result == null) result = caseType(rSet);
				if (result == null) result = caseMappableElement(rSet);
				if (result == null) result = caseNamedElement(rSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.RLIST: {
				RList rList = (RList)theEObject;
				T result = caseRList(rList);
				if (result == null) result = caseRCollection(rList);
				if (result == null) result = caseImplementationClass(rList);
				if (result == null) result = caseClassifier(rList);
				if (result == null) result = caseObjectType(rList);
				if (result == null) result = caseType(rList);
				if (result == null) result = caseMappableElement(rList);
				if (result == null) result = caseNamedElement(rList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.CONTAINER_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<EObject, EMap<EObject, LayoutElement>> containerMap = (Map.Entry<EObject, EMap<EObject, LayoutElement>>)theEObject;
				T result = caseContainerMap(containerMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.ELEMENT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<EObject, LayoutElement> elementMap = (Map.Entry<EObject, LayoutElement>)theEObject;
				T result = caseElementMap(elementMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.LAYOUT_ELEMENT: {
				LayoutElement layoutElement = (LayoutElement)theEObject;
				T result = caseLayoutElement(layoutElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseObjectType(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = caseMappableElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.IMPLEMENTATION_CLASS: {
				ImplementationClass implementationClass = (ImplementationClass)theEObject;
				T result = caseImplementationClass(implementationClass);
				if (result == null) result = caseClassifier(implementationClass);
				if (result == null) result = caseObjectType(implementationClass);
				if (result == null) result = caseType(implementationClass);
				if (result == null) result = caseMappableElement(implementationClass);
				if (result == null) result = caseNamedElement(implementationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.TEMPORARY_PROPERTY: {
				TemporaryProperty temporaryProperty = (TemporaryProperty)theEObject;
				T result = caseTemporaryProperty(temporaryProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseTypedElement(structuralFeature);
				if (result == null) result = caseNamedElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseProperty(reference);
				if (result == null) result = caseTemporaryProperty(reference);
				if (result == null) result = caseStructuralFeature(reference);
				if (result == null) result = caseTypedElement(reference);
				if (result == null) result = caseNamedElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseStructuralFeature(property);
				if (result == null) result = caseTypedElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseMessageEnd(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RamPackage.LITERAL_BOOLEAN: {
				LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
				T result = caseLiteralBoolean(literalBoolean);
				if (result == null) result = caseLiteralSpecification(literalBoolean);
				if (result == null) result = caseValueSpecification(literalBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mappable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mappable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappableElement(MappableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralView(StructuralView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(ram.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEnd(AssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiation(Instantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RVoid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RVoid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRVoid(RVoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBoolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBoolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBoolean(RBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RInt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RInt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRInt(RInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RChar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RChar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRChar(RChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RString</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RString</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRString(RString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAny</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAny</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAny(RAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREnum(REnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREnumLiteral(REnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Message View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Message View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMessageView(AbstractMessageView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageView(MessageView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message View Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message View Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageViewReference(MessageViewReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Message View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Message View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectMessageView(AspectMessageView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOccurrenceSpecification(MessageOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrenceSpecification(OccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructionOccurrenceSpecification(DestructionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Original Behavior Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Original Behavior Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginalBehaviorExecution(OriginalBehaviorExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionStatement(ExecutionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOperand(InteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureValue(StructuralFeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueMapping(ParameterValueMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue(ParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueExpression(OpaqueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecification(LiteralSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentContainer(FragmentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RCollection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RCollection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRCollection(RCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSet(RSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RList</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRList(RList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerMap(Map.Entry<EObject, EMap<EObject, LayoutElement>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementMap(Map.Entry<EObject, LayoutElement> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutElement(LayoutElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationClass(ImplementationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporaryProperty(TemporaryProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RamSwitch
