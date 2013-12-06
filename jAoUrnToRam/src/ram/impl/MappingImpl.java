/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ram.MappableElement;
import ram.Mapping;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.MappingImpl#getToElements <em>To Elements</em>}</li>
 *   <li>{@link ram.impl.MappingImpl#getFromElement <em>From Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends EObjectImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getToElements() <em>To Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MappableElement> toElements;

	/**
	 * The cached value of the '{@link #getFromElement() <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElement()
	 * @generated
	 * @ordered
	 */
	protected MappableElement fromElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappableElement> getToElements() {
		if (toElements == null) {
			toElements = new EObjectResolvingEList<MappableElement>(MappableElement.class, this, RamPackage.MAPPING__TO_ELEMENTS);
		}
		return toElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappableElement getFromElement() {
		if (fromElement != null && fromElement.eIsProxy()) {
			InternalEObject oldFromElement = (InternalEObject)fromElement;
			fromElement = (MappableElement)eResolveProxy(oldFromElement);
			if (fromElement != oldFromElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.MAPPING__FROM_ELEMENT, oldFromElement, fromElement));
			}
		}
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappableElement basicGetFromElement() {
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElement(MappableElement newFromElement) {
		MappableElement oldFromElement = fromElement;
		fromElement = newFromElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.MAPPING__FROM_ELEMENT, oldFromElement, fromElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RamPackage.MAPPING__TO_ELEMENTS:
				return getToElements();
			case RamPackage.MAPPING__FROM_ELEMENT:
				if (resolve) return getFromElement();
				return basicGetFromElement();
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
			case RamPackage.MAPPING__TO_ELEMENTS:
				getToElements().clear();
				getToElements().addAll((Collection<? extends MappableElement>)newValue);
				return;
			case RamPackage.MAPPING__FROM_ELEMENT:
				setFromElement((MappableElement)newValue);
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
			case RamPackage.MAPPING__TO_ELEMENTS:
				getToElements().clear();
				return;
			case RamPackage.MAPPING__FROM_ELEMENT:
				setFromElement((MappableElement)null);
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
			case RamPackage.MAPPING__TO_ELEMENTS:
				return toElements != null && !toElements.isEmpty();
			case RamPackage.MAPPING__FROM_ELEMENT:
				return fromElement != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
