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

import ram.Attribute;
import ram.AttributeMapping;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.AttributeMappingImpl#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ram.impl.AttributeMappingImpl#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeMappingImpl extends MappingImpl implements AttributeMapping {
	/**
	 * The cached value of the '{@link #getFromElement() <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElement()
	 * @generated
	 * @ordered
	 */
	protected Attribute fromElement;

	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected Attribute toElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.ATTRIBUTE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getFromElement() {
		if (fromElement != null && fromElement.eIsProxy()) {
			InternalEObject oldFromElement = (InternalEObject)fromElement;
			fromElement = (Attribute)eResolveProxy(oldFromElement);
			if (fromElement != oldFromElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.ATTRIBUTE_MAPPING__FROM_ELEMENT, oldFromElement, fromElement));
			}
		}
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetFromElement() {
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElement(Attribute newFromElement) {
		Attribute oldFromElement = fromElement;
		fromElement = newFromElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ATTRIBUTE_MAPPING__FROM_ELEMENT, oldFromElement, fromElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getToElement() {
		if (toElement != null && toElement.eIsProxy()) {
			InternalEObject oldToElement = (InternalEObject)toElement;
			toElement = (Attribute)eResolveProxy(oldToElement);
			if (toElement != oldToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.ATTRIBUTE_MAPPING__TO_ELEMENT, oldToElement, toElement));
			}
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElement(Attribute newToElement) {
		Attribute oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ATTRIBUTE_MAPPING__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.ATTRIBUTE_MAPPING__FROM_ELEMENT:
				if (resolve) return getFromElement();
				return basicGetFromElement();
			case RamPackage.ATTRIBUTE_MAPPING__TO_ELEMENT:
				if (resolve) return getToElement();
				return basicGetToElement();
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
			case RamPackage.ATTRIBUTE_MAPPING__FROM_ELEMENT:
				setFromElement((Attribute)newValue);
				return;
			case RamPackage.ATTRIBUTE_MAPPING__TO_ELEMENT:
				setToElement((Attribute)newValue);
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
			case RamPackage.ATTRIBUTE_MAPPING__FROM_ELEMENT:
				setFromElement((Attribute)null);
				return;
			case RamPackage.ATTRIBUTE_MAPPING__TO_ELEMENT:
				setToElement((Attribute)null);
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
			case RamPackage.ATTRIBUTE_MAPPING__FROM_ELEMENT:
				return fromElement != null;
			case RamPackage.ATTRIBUTE_MAPPING__TO_ELEMENT:
				return toElement != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeMappingImpl
