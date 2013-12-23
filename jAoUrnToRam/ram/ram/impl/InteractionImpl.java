/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.Gate;
import ram.Interaction;
import ram.Lifeline;
import ram.Message;
import ram.RamPackage;
import ram.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.InteractionImpl#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link ram.impl.InteractionImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link ram.impl.InteractionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ram.impl.InteractionImpl#getFormalGates <em>Formal Gates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends FragmentContainerImpl implements Interaction {
	/**
	 * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifelines()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> lifelines;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> properties;

	/**
	 * The cached value of the '{@link #getFormalGates() <em>Formal Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> formalGates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifelines() {
		if (lifelines == null) {
			lifelines = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, RamPackage.INTERACTION__LIFELINES);
		}
		return lifelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentWithInverseEList<Message>(Message.class, this, RamPackage.INTERACTION__MESSAGES, RamPackage.MESSAGE__INTERACTION);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Reference>(Reference.class, this, RamPackage.INTERACTION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getFormalGates() {
		if (formalGates == null) {
			formalGates = new EObjectContainmentEList<Gate>(Gate.class, this, RamPackage.INTERACTION__FORMAL_GATES);
		}
		return formalGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.INTERACTION__MESSAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessages()).basicAdd(otherEnd, msgs);
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
			case RamPackage.INTERACTION__LIFELINES:
				return ((InternalEList<?>)getLifelines()).basicRemove(otherEnd, msgs);
			case RamPackage.INTERACTION__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
			case RamPackage.INTERACTION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case RamPackage.INTERACTION__FORMAL_GATES:
				return ((InternalEList<?>)getFormalGates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.INTERACTION__LIFELINES:
				return getLifelines();
			case RamPackage.INTERACTION__MESSAGES:
				return getMessages();
			case RamPackage.INTERACTION__PROPERTIES:
				return getProperties();
			case RamPackage.INTERACTION__FORMAL_GATES:
				return getFormalGates();
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
			case RamPackage.INTERACTION__LIFELINES:
				getLifelines().clear();
				getLifelines().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case RamPackage.INTERACTION__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case RamPackage.INTERACTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Reference>)newValue);
				return;
			case RamPackage.INTERACTION__FORMAL_GATES:
				getFormalGates().clear();
				getFormalGates().addAll((Collection<? extends Gate>)newValue);
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
			case RamPackage.INTERACTION__LIFELINES:
				getLifelines().clear();
				return;
			case RamPackage.INTERACTION__MESSAGES:
				getMessages().clear();
				return;
			case RamPackage.INTERACTION__PROPERTIES:
				getProperties().clear();
				return;
			case RamPackage.INTERACTION__FORMAL_GATES:
				getFormalGates().clear();
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
			case RamPackage.INTERACTION__LIFELINES:
				return lifelines != null && !lifelines.isEmpty();
			case RamPackage.INTERACTION__MESSAGES:
				return messages != null && !messages.isEmpty();
			case RamPackage.INTERACTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case RamPackage.INTERACTION__FORMAL_GATES:
				return formalGates != null && !formalGates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionImpl
