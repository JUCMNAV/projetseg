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

import ram.Classifier;
import ram.ImplementationClass;
import ram.MappableElement;
import ram.ObjectType;
import ram.Operation;
import ram.PrimitiveType;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.PrimitiveTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link ram.impl.PrimitiveTypeImpl#getInstanceClassName <em>Instance Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PrimitiveTypeImpl extends TypeImpl implements PrimitiveType {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The default value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected String instanceClassName = INSTANCE_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, RamPackage.PRIMITIVE_TYPE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClassName() {
		return instanceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClassName(String newInstanceClassName) {
		String oldInstanceClassName = instanceClassName;
		instanceClassName = newInstanceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME, oldInstanceClassName, instanceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.PRIMITIVE_TYPE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case RamPackage.PRIMITIVE_TYPE__OPERATIONS:
				return getOperations();
			case RamPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
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
			case RamPackage.PRIMITIVE_TYPE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case RamPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
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
			case RamPackage.PRIMITIVE_TYPE__OPERATIONS:
				getOperations().clear();
				return;
			case RamPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				setInstanceClassName(INSTANCE_CLASS_NAME_EDEFAULT);
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
			case RamPackage.PRIMITIVE_TYPE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case RamPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				return INSTANCE_CLASS_NAME_EDEFAULT == null ? instanceClassName != null : !INSTANCE_CLASS_NAME_EDEFAULT.equals(instanceClassName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MappableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case RamPackage.PRIMITIVE_TYPE__OPERATIONS: return RamPackage.CLASSIFIER__OPERATIONS;
				default: return -1;
			}
		}
		if (baseClass == ImplementationClass.class) {
			switch (derivedFeatureID) {
				case RamPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME: return RamPackage.IMPLEMENTATION_CLASS__INSTANCE_CLASS_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MappableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case RamPackage.CLASSIFIER__OPERATIONS: return RamPackage.PRIMITIVE_TYPE__OPERATIONS;
				default: return -1;
			}
		}
		if (baseClass == ImplementationClass.class) {
			switch (baseFeatureID) {
				case RamPackage.IMPLEMENTATION_CLASS__INSTANCE_CLASS_NAME: return RamPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (instanceClassName: ");
		result.append(instanceClassName);
		result.append(')');
		return result.toString();
	}

} //PrimitiveTypeImpl
