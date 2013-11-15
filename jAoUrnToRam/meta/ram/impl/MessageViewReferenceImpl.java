/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ram.MessageView;
import ram.MessageViewReference;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message View Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.MessageViewReferenceImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageViewReferenceImpl extends AbstractMessageViewImpl implements MessageViewReference {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected MessageView references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageViewReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.MESSAGE_VIEW_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageView getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (MessageView)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.MESSAGE_VIEW_REFERENCE__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageView basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(MessageView newReferences) {
		MessageView oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MESSAGE_VIEW_REFERENCE__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.MESSAGE_VIEW_REFERENCE__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RamPackage.MESSAGE_VIEW_REFERENCE__REFERENCES:
				setReferences((MessageView)newValue);
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
			case RamPackage.MESSAGE_VIEW_REFERENCE__REFERENCES:
				setReferences((MessageView)null);
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
			case RamPackage.MESSAGE_VIEW_REFERENCE__REFERENCES:
				return references != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageViewReferenceImpl
