/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.Interaction;
import ram.Message;
import ram.MessageEnd;
import ram.MessageSort;
import ram.Operation;
import ram.ParameterValueMapping;
import ram.RamPackage;
import ram.StructuralFeature;
import ram.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#getReturns <em>Returns</em>}</li>
 *   <li>{@link ram.impl.MessageImpl#isSelfMessage <em>Self Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The cached value of the '{@link #getSendEvent() <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent()
	 * @generated
	 * @ordered
	 */
	protected MessageEnd sendEvent;

	/**
	 * The cached value of the '{@link #getReceiveEvent() <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent()
	 * @generated
	 * @ordered
	 */
	protected MessageEnd receiveEvent;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Operation signature;

	/**
	 * The cached value of the '{@link #getAssignTo() <em>Assign To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignTo()
	 * @generated
	 * @ordered
	 */
	protected StructuralFeature assignTo;

	/**
	 * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCH_CALL;

	/**
	 * The cached value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected MessageSort messageSort = MESSAGE_SORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValueMapping> arguments;

	/**
	 * The cached value of the '{@link #getReturns() <em>Returns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturns()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification returns;

	/**
	 * The cached setting delegate for the '{@link #isSelfMessage() <em>Self Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfMessage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SELF_MESSAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RamPackage.Literals.MESSAGE__SELF_MESSAGE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd getSendEvent() {
		if (sendEvent != null && sendEvent.eIsProxy()) {
			InternalEObject oldSendEvent = (InternalEObject)sendEvent;
			sendEvent = (MessageEnd)eResolveProxy(oldSendEvent);
			if (sendEvent != oldSendEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
			}
		}
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd basicGetSendEvent() {
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendEvent(MessageEnd newSendEvent) {
		MessageEnd oldSendEvent = sendEvent;
		sendEvent = newSendEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd getReceiveEvent() {
		if (receiveEvent != null && receiveEvent.eIsProxy()) {
			InternalEObject oldReceiveEvent = (InternalEObject)receiveEvent;
			receiveEvent = (MessageEnd)eResolveProxy(oldReceiveEvent);
			if (receiveEvent != oldReceiveEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
			}
		}
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd basicGetReceiveEvent() {
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveEvent(MessageEnd newReceiveEvent) {
		MessageEnd oldReceiveEvent = receiveEvent;
		receiveEvent = newReceiveEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (Operation)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.MESSAGE__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Operation newSignature) {
		Operation oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getAssignTo() {
		if (assignTo != null && assignTo.eIsProxy()) {
			InternalEObject oldAssignTo = (InternalEObject)assignTo;
			assignTo = (StructuralFeature)eResolveProxy(oldAssignTo);
			if (assignTo != oldAssignTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.MESSAGE__ASSIGN_TO, oldAssignTo, assignTo));
			}
		}
		return assignTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetAssignTo() {
		return assignTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignTo(StructuralFeature newAssignTo) {
		StructuralFeature oldAssignTo = assignTo;
		assignTo = newAssignTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__ASSIGN_TO, oldAssignTo, assignTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort getMessageSort() {
		return messageSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSort(MessageSort newMessageSort) {
		MessageSort oldMessageSort = messageSort;
		messageSort = newMessageSort == null ? MESSAGE_SORT_EDEFAULT : newMessageSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__MESSAGE_SORT, oldMessageSort, messageSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValueMapping> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<ParameterValueMapping>(ParameterValueMapping.class, this, RamPackage.MESSAGE__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID() != RamPackage.MESSAGE__INTERACTION) return null;
		return (Interaction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInteraction, RamPackage.MESSAGE__INTERACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eInternalContainer() || (eContainerFeatureID() != RamPackage.MESSAGE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, RamPackage.INTERACTION__MESSAGES, Interaction.class, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReturns() {
		return returns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturns(ValueSpecification newReturns, NotificationChain msgs) {
		ValueSpecification oldReturns = returns;
		returns = newReturns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__RETURNS, oldReturns, newReturns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturns(ValueSpecification newReturns) {
		if (newReturns != returns) {
			NotificationChain msgs = null;
			if (returns != null)
				msgs = ((InternalEObject)returns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RamPackage.MESSAGE__RETURNS, null, msgs);
			if (newReturns != null)
				msgs = ((InternalEObject)newReturns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RamPackage.MESSAGE__RETURNS, null, msgs);
			msgs = basicSetReturns(newReturns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE__RETURNS, newReturns, newReturns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelfMessage() {
		return (Boolean)SELF_MESSAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.MESSAGE__INTERACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInteraction((Interaction)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.MESSAGE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case RamPackage.MESSAGE__INTERACTION:
				return basicSetInteraction(null, msgs);
			case RamPackage.MESSAGE__RETURNS:
				return basicSetReturns(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RamPackage.MESSAGE__INTERACTION:
				return eInternalContainer().eInverseRemove(this, RamPackage.INTERACTION__MESSAGES, Interaction.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.MESSAGE__SEND_EVENT:
				if (resolve) return getSendEvent();
				return basicGetSendEvent();
			case RamPackage.MESSAGE__RECEIVE_EVENT:
				if (resolve) return getReceiveEvent();
				return basicGetReceiveEvent();
			case RamPackage.MESSAGE__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
			case RamPackage.MESSAGE__ASSIGN_TO:
				if (resolve) return getAssignTo();
				return basicGetAssignTo();
			case RamPackage.MESSAGE__MESSAGE_SORT:
				return getMessageSort();
			case RamPackage.MESSAGE__ARGUMENTS:
				return getArguments();
			case RamPackage.MESSAGE__INTERACTION:
				return getInteraction();
			case RamPackage.MESSAGE__RETURNS:
				return getReturns();
			case RamPackage.MESSAGE__SELF_MESSAGE:
				return isSelfMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RamPackage.MESSAGE__SEND_EVENT:
				setSendEvent((MessageEnd)newValue);
				return;
			case RamPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((MessageEnd)newValue);
				return;
			case RamPackage.MESSAGE__SIGNATURE:
				setSignature((Operation)newValue);
				return;
			case RamPackage.MESSAGE__ASSIGN_TO:
				setAssignTo((StructuralFeature)newValue);
				return;
			case RamPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort((MessageSort)newValue);
				return;
			case RamPackage.MESSAGE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends ParameterValueMapping>)newValue);
				return;
			case RamPackage.MESSAGE__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case RamPackage.MESSAGE__RETURNS:
				setReturns((ValueSpecification)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RamPackage.MESSAGE__SEND_EVENT:
				setSendEvent((MessageEnd)null);
				return;
			case RamPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((MessageEnd)null);
				return;
			case RamPackage.MESSAGE__SIGNATURE:
				setSignature((Operation)null);
				return;
			case RamPackage.MESSAGE__ASSIGN_TO:
				setAssignTo((StructuralFeature)null);
				return;
			case RamPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort(MESSAGE_SORT_EDEFAULT);
				return;
			case RamPackage.MESSAGE__ARGUMENTS:
				getArguments().clear();
				return;
			case RamPackage.MESSAGE__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case RamPackage.MESSAGE__RETURNS:
				setReturns((ValueSpecification)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RamPackage.MESSAGE__SEND_EVENT:
				return sendEvent != null;
			case RamPackage.MESSAGE__RECEIVE_EVENT:
				return receiveEvent != null;
			case RamPackage.MESSAGE__SIGNATURE:
				return signature != null;
			case RamPackage.MESSAGE__ASSIGN_TO:
				return assignTo != null;
			case RamPackage.MESSAGE__MESSAGE_SORT:
				return messageSort != MESSAGE_SORT_EDEFAULT;
			case RamPackage.MESSAGE__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case RamPackage.MESSAGE__INTERACTION:
				return getInteraction() != null;
			case RamPackage.MESSAGE__RETURNS:
				return returns != null;
			case RamPackage.MESSAGE__SELF_MESSAGE:
				return SELF_MESSAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageSort: ");
		result.append(messageSort);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
