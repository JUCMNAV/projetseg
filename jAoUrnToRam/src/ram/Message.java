/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link ram.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link ram.Message#getSignature <em>Signature</em>}</li>
 *   <li>{@link ram.Message#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link ram.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link ram.Message#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ram.Message#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link ram.Message#getReturns <em>Returns</em>}</li>
 *   <li>{@link ram.Message#isSelfMessage <em>Self Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getMessage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validSelfMessage argumentsSpecified createMessageIsFirst returnsSpecified boundariesNotCrossed validReturns validAssignTo deleteMessageIsLast validReturnsValue assignToAllowed noCrossingMessages validSignature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validSelfMessage='if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then if self.sendEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) then self.interaction.fragments->indexOf(self.sendEvent) < self.interaction.fragments->indexOf(self.receiveEvent) else true endif else true endif' validSelfMessage$message='\'receiveEvent of a self message may not come before the sendEvent\'' argumentsSpecified='if self.messageSort <> MessageSort::reply and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.signature.oclIsUndefined() then let container : FragmentContainer = self.sendEvent.oclAsType(MessageOccurrenceSpecification).container in if container.fragments->includes(self.sendEvent) then self.signature.parameters->size() = self.arguments->size() and self.signature.parameters->forAll(currentParameter : Parameter | self.arguments->one(argument : ParameterValueMapping | argument.parameter = currentParameter)) else true endif else true endif' argumentsSpecified$message='\'All arguments of the operation must be specified\'' createMessageIsFirst='if self.messageSort = MessageSort::createMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) >= event.container.fragments->indexOf(event) else true endif) else true endif else true endif' createMessageIsFirst$message='\'The create message occurrence may not come after any other occurrence on this lifeline\'' returnsSpecified='if self.messageSort = MessageSort::reply then if not self.signature.returnType.oclIsTypeOf(RVoid) then not self.returns.oclIsUndefined() else self.returns.oclIsUndefined() endif else true endif' returnsSpecified$message='\'Reply message must have returns specified if return type is not void\'' boundariesNotCrossed='let send : MessageOccurrenceSpecification = self.sendEvent in let receive : MessageOccurrenceSpecification = self.receiveEvent in if send.container.oclIsTypeOf(InteractionOperand) and receive.container.oclIsTypeOf(InteractionOperand) then send.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(send.covered->asOrderedSet()->at(1)) and receive.container.oclAsType(InteractionOperand).CombinedFragment.covered->includes(receive.covered->asOrderedSet()->at(1)) else true endif' boundariesNotCrossed$message='\'Messages may not cross boundaries of CombinedFragments or their operands\'' validReturns='if not self.returns.oclIsUndefined() then self.messageSort = MessageSort::reply else true endif' validReturns$message='\'Returns may only be specified if message sort is reply message\'' validAssignTo='if not self.assignTo.oclIsUndefined() then let type : Type = if self.assignTo.oclIsTypeOf(Attribute) then self.assignTo.oclAsType(Attribute).type else if self.assignTo.oclIsTypeOf(Reference) then self.assignTo.oclAsType(Reference).type else self.assignTo.oclAsType(AssociationEnd).getType() endif endif in type.oclIsKindOf(self.signature.returnType.oclType()) else true endif' validAssignTo$message='\'Return type of signature operation must match the type of assignTo\'' deleteMessageIsLast='if self.messageSort = MessageSort::deleteMessage then if not self.receiveEvent.oclIsUndefined() and not self.receiveEvent.oclAsType(InteractionFragment).covered->isEmpty() then let event : InteractionFragment = self.receiveEvent.oclAsType(InteractionFragment) in event.covered->asOrderedSet()->at(1).coveredBy->forAll(fragment : InteractionFragment | if event.container.fragments->includes(fragment) then event.container.fragments->indexOf(fragment) <= event.container.fragments->indexOf(event) else true endif) else true endif else true endif' deleteMessageIsLast$message='\'The destruction occurrence may not come before any other occurrence on this lifeline\'' validReturnsValue='if self.returns.oclIsTypeOf(StructuralFeatureValue) then let value : StructuralFeatureValue = self.returns.oclAsType(StructuralFeatureValue).value in if not value.oclIsUndefined() then let type : Type = if value.oclIsTypeOf(Attribute) then value.oclAsType(Attribute).type else if value.oclIsTypeOf(Reference) then value.oclAsType(Reference).type else value.oclAsType(AssociationEnd).getType() endif endif in type.oclIsTypeOf(self.signature.returnType.oclType()) else true endif else if self.returns.oclIsKindOf(LiteralSpecification) then false else true endif endif' validReturnsValue$message='\'Type of return value must match the type of the return\'' assignToAllowed='if self.signature.returnType.oclIsTypeOf(RVoid) then self.assignTo = null else true endif' assignToAllowed$message='\'assignTo may not be specified for operations whose return type is void\'' noCrossingMessages='if not self.receiveEvent.oclIsUndefined() and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) and not self.sendEvent.oclIsUndefined() and self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) then let container : FragmentContainer = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).container in let indexDifference : Integer = container.fragments->indexOf(self.receiveEvent) - container.fragments->indexOf(self.sendEvent) in indexDifference = 1 else true endif' noCrossingMessages$message='\'Messages may not cross each other, MessageEnds of one message must come one after the other (also, send must come before receive)\'' validSignature='if self.messageSort <> MessageSort::reply and not self.receiveEvent.oclIsUndefined() then let typedElement : TypedElement = self.receiveEvent.oclAsType(InteractionFragment).covered->asOrderedSet()->at(1).represents in if not typedElement.oclIsUndefined() then let type : Type = if typedElement.oclIsTypeOf(Parameter) then typedElement.oclAsType(Parameter).type else if typedElement.oclIsTypeOf(Attribute) then typedElement.oclAsType(Attribute).type else if typedElement.oclIsTypeOf(Reference) then typedElement.oclAsType(Reference).type else typedElement.oclAsType(AssociationEnd).getType() endif endif endif in if type.oclIsKindOf(Classifier) then type.oclAsType(Classifier).operations->includes(self.signature) else true endif else true endif else true endif' validSignature$message='\'Message signature must be an operation of the classifier that is represented by the lifeline of the receive event\''"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Event</em>' reference.
	 * @see #setSendEvent(MessageEnd)
	 * @see ram.RamPackage#getMessage_SendEvent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageEnd getSendEvent();

	/**
	 * Sets the value of the '{@link ram.Message#getSendEvent <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' reference.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Event</em>' reference.
	 * @see #setReceiveEvent(MessageEnd)
	 * @see ram.RamPackage#getMessage_ReceiveEvent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageEnd getReceiveEvent();

	/**
	 * Sets the value of the '{@link ram.Message#getReceiveEvent <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' reference.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(Operation)
	 * @see ram.RamPackage#getMessage_Signature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getSignature();

	/**
	 * Sets the value of the '{@link ram.Message#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Operation value);

	/**
	 * Returns the value of the '<em><b>Assign To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign To</em>' reference.
	 * @see #setAssignTo(StructuralFeature)
	 * @see ram.RamPackage#getMessage_AssignTo()
	 * @model ordered="false"
	 * @generated
	 */
	StructuralFeature getAssignTo();

	/**
	 * Sets the value of the '{@link ram.Message#getAssignTo <em>Assign To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign To</em>' reference.
	 * @see #getAssignTo()
	 * @generated
	 */
	void setAssignTo(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link ram.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see ram.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see ram.RamPackage#getMessage_MessageSort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link ram.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see ram.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link ram.ParameterValueMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see ram.RamPackage#getMessage_Arguments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterValueMapping> getArguments();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ram.Interaction#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see ram.RamPackage#getMessage_Interaction()
	 * @see ram.Interaction#getMessages
	 * @model opposite="messages" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link ram.Message#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns</em>' containment reference.
	 * @see #setReturns(ValueSpecification)
	 * @see ram.RamPackage#getMessage_Returns()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getReturns();

	/**
	 * Sets the value of the '{@link ram.Message#getReturns <em>Returns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' containment reference.
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Self Message</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Message</em>' attribute.
	 * @see ram.RamPackage#getMessage_SelfMessage()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if self.sendEvent.oclIsKindOf(MessageOccurrenceSpecification) and self.receiveEvent.oclIsKindOf(MessageOccurrenceSpecification) then self.sendEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) = self.receiveEvent.oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()->at(1) else false endif'"
	 * @generated
	 */
	boolean isSelfMessage();

} // Message
