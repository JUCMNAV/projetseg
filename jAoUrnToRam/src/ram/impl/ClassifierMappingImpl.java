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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.AttributeMapping;
import ram.Classifier;
import ram.ClassifierMapping;
import ram.OperationMapping;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.ClassifierMappingImpl#getOperationMappings <em>Operation Mappings</em>}</li>
 *   <li>{@link ram.impl.ClassifierMappingImpl#getAttributeMappings <em>Attribute Mappings</em>}</li>
 *   <li>{@link ram.impl.ClassifierMappingImpl#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ram.impl.ClassifierMappingImpl#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierMappingImpl extends MappingImpl implements ClassifierMapping {
	/**
	 * The cached value of the '{@link #getOperationMappings() <em>Operation Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationMapping> operationMappings;

	/**
	 * The cached value of the '{@link #getAttributeMappings() <em>Attribute Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMapping> attributeMappings;

	/**
	 * The cached value of the '{@link #getFromElement() <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElement()
	 * @generated
	 * @ordered
	 */
	protected Classifier fromElement;

	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected Classifier toElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.CLASSIFIER_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationMapping> getOperationMappings() {
		if (operationMappings == null) {
			operationMappings = new EObjectContainmentEList<OperationMapping>(OperationMapping.class, this, RamPackage.CLASSIFIER_MAPPING__OPERATION_MAPPINGS);
		}
		return operationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeMapping> getAttributeMappings() {
		if (attributeMappings == null) {
			attributeMappings = new EObjectContainmentEList<AttributeMapping>(AttributeMapping.class, this, RamPackage.CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS);
		}
		return attributeMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getFromElement() {
		if (fromElement != null && fromElement.eIsProxy()) {
			InternalEObject oldFromElement = (InternalEObject)fromElement;
			fromElement = (Classifier)eResolveProxy(oldFromElement);
			if (fromElement != oldFromElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.CLASSIFIER_MAPPING__FROM_ELEMENT, oldFromElement, fromElement));
			}
		}
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetFromElement() {
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElement(Classifier newFromElement) {
		Classifier oldFromElement = fromElement;
		fromElement = newFromElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.CLASSIFIER_MAPPING__FROM_ELEMENT, oldFromElement, fromElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getToElement() {
		if (toElement != null && toElement.eIsProxy()) {
			InternalEObject oldToElement = (InternalEObject)toElement;
			toElement = (Classifier)eResolveProxy(oldToElement);
			if (toElement != oldToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.CLASSIFIER_MAPPING__TO_ELEMENT, oldToElement, toElement));
			}
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElement(Classifier newToElement) {
		Classifier oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.CLASSIFIER_MAPPING__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.CLASSIFIER_MAPPING__OPERATION_MAPPINGS:
				return ((InternalEList<?>)getOperationMappings()).basicRemove(otherEnd, msgs);
			case RamPackage.CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS:
				return ((InternalEList<?>)getAttributeMappings()).basicRemove(otherEnd, msgs);
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
			case RamPackage.CLASSIFIER_MAPPING__OPERATION_MAPPINGS:
				return getOperationMappings();
			case RamPackage.CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS:
				return getAttributeMappings();
			case RamPackage.CLASSIFIER_MAPPING__FROM_ELEMENT:
				if (resolve) return getFromElement();
				return basicGetFromElement();
			case RamPackage.CLASSIFIER_MAPPING__TO_ELEMENT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RamPackage.CLASSIFIER_MAPPING__OPERATION_MAPPINGS:
				getOperationMappings().clear();
				getOperationMappings().addAll((Collection<? extends OperationMapping>)newValue);
				return;
			case RamPackage.CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS:
				getAttributeMappings().clear();
				getAttributeMappings().addAll((Collection<? extends AttributeMapping>)newValue);
				return;
			case RamPackage.CLASSIFIER_MAPPING__FROM_ELEMENT:
				setFromElement((Classifier)newValue);
				return;
			case RamPackage.CLASSIFIER_MAPPING__TO_ELEMENT:
				setToElement((Classifier)newValue);
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
			case RamPackage.CLASSIFIER_MAPPING__OPERATION_MAPPINGS:
				getOperationMappings().clear();
				return;
			case RamPackage.CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS:
				getAttributeMappings().clear();
				return;
			case RamPackage.CLASSIFIER_MAPPING__FROM_ELEMENT:
				setFromElement((Classifier)null);
				return;
			case RamPackage.CLASSIFIER_MAPPING__TO_ELEMENT:
				setToElement((Classifier)null);
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
			case RamPackage.CLASSIFIER_MAPPING__OPERATION_MAPPINGS:
				return operationMappings != null && !operationMappings.isEmpty();
			case RamPackage.CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS:
				return attributeMappings != null && !attributeMappings.isEmpty();
			case RamPackage.CLASSIFIER_MAPPING__FROM_ELEMENT:
				return fromElement != null;
			case RamPackage.CLASSIFIER_MAPPING__TO_ELEMENT:
				return toElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassifierMappingImpl
