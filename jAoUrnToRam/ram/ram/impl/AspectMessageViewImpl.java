/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ram.AspectMessageView;
import ram.Interaction;
import ram.NamedElement;
import ram.Operation;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Message View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.AspectMessageViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link ram.impl.AspectMessageViewImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link ram.impl.AspectMessageViewImpl#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectMessageViewImpl extends AbstractMessageViewImpl implements AspectMessageView {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcut()
	 * @generated
	 * @ordered
	 */
	protected Operation pointcut;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected Interaction advice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectMessageViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.ASPECT_MESSAGE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT_MESSAGE_VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPointcut() {
		if (pointcut != null && pointcut.eIsProxy()) {
			InternalEObject oldPointcut = (InternalEObject)pointcut;
			pointcut = (Operation)eResolveProxy(oldPointcut);
			if (pointcut != oldPointcut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.ASPECT_MESSAGE_VIEW__POINTCUT, oldPointcut, pointcut));
			}
		}
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetPointcut() {
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointcut(Operation newPointcut) {
		Operation oldPointcut = pointcut;
		pointcut = newPointcut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT_MESSAGE_VIEW__POINTCUT, oldPointcut, pointcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getAdvice() {
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdvice(Interaction newAdvice, NotificationChain msgs) {
		Interaction oldAdvice = advice;
		advice = newAdvice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT_MESSAGE_VIEW__ADVICE, oldAdvice, newAdvice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvice(Interaction newAdvice) {
		if (newAdvice != advice) {
			NotificationChain msgs = null;
			if (advice != null)
				msgs = ((InternalEObject)advice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RamPackage.ASPECT_MESSAGE_VIEW__ADVICE, null, msgs);
			if (newAdvice != null)
				msgs = ((InternalEObject)newAdvice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RamPackage.ASPECT_MESSAGE_VIEW__ADVICE, null, msgs);
			msgs = basicSetAdvice(newAdvice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT_MESSAGE_VIEW__ADVICE, newAdvice, newAdvice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.ASPECT_MESSAGE_VIEW__ADVICE:
				return basicSetAdvice(null, msgs);
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
			case RamPackage.ASPECT_MESSAGE_VIEW__NAME:
				return getName();
			case RamPackage.ASPECT_MESSAGE_VIEW__POINTCUT:
				if (resolve) return getPointcut();
				return basicGetPointcut();
			case RamPackage.ASPECT_MESSAGE_VIEW__ADVICE:
				return getAdvice();
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
			case RamPackage.ASPECT_MESSAGE_VIEW__NAME:
				setName((String)newValue);
				return;
			case RamPackage.ASPECT_MESSAGE_VIEW__POINTCUT:
				setPointcut((Operation)newValue);
				return;
			case RamPackage.ASPECT_MESSAGE_VIEW__ADVICE:
				setAdvice((Interaction)newValue);
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
			case RamPackage.ASPECT_MESSAGE_VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RamPackage.ASPECT_MESSAGE_VIEW__POINTCUT:
				setPointcut((Operation)null);
				return;
			case RamPackage.ASPECT_MESSAGE_VIEW__ADVICE:
				setAdvice((Interaction)null);
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
			case RamPackage.ASPECT_MESSAGE_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RamPackage.ASPECT_MESSAGE_VIEW__POINTCUT:
				return pointcut != null;
			case RamPackage.ASPECT_MESSAGE_VIEW__ADVICE:
				return advice != null;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RamPackage.ASPECT_MESSAGE_VIEW__NAME: return RamPackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case RamPackage.NAMED_ELEMENT__NAME: return RamPackage.ASPECT_MESSAGE_VIEW__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AspectMessageViewImpl
