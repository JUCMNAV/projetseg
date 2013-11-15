/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ram.Association;
import ram.AssociationEnd;
import ram.RamPackage;
import ram.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.AssociationEndImpl#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link ram.impl.AssociationEndImpl#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link ram.impl.AssociationEndImpl#getMyClass <em>My Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndImpl extends PropertyImpl implements AssociationEnd {
	/**
	 * The default value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean navigable = NAVIGABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssoc() <em>Assoc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssoc()
	 * @generated
	 * @ordered
	 */
	protected Association assoc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		return navigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigable(boolean newNavigable) {
		boolean oldNavigable = navigable;
		navigable = newNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASSOCIATION_END__NAVIGABLE, oldNavigable, navigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssoc() {
		if (assoc != null && assoc.eIsProxy()) {
			InternalEObject oldAssoc = (InternalEObject)assoc;
			assoc = (Association)eResolveProxy(oldAssoc);
			if (assoc != oldAssoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RamPackage.ASSOCIATION_END__ASSOC, oldAssoc, assoc));
			}
		}
		return assoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssoc() {
		return assoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssoc(Association newAssoc, NotificationChain msgs) {
		Association oldAssoc = assoc;
		assoc = newAssoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.ASSOCIATION_END__ASSOC, oldAssoc, newAssoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssoc(Association newAssoc) {
		if (newAssoc != assoc) {
			NotificationChain msgs = null;
			if (assoc != null)
				msgs = ((InternalEObject)assoc).eInverseRemove(this, RamPackage.ASSOCIATION__ENDS, Association.class, msgs);
			if (newAssoc != null)
				msgs = ((InternalEObject)newAssoc).eInverseAdd(this, RamPackage.ASSOCIATION__ENDS, Association.class, msgs);
			msgs = basicSetAssoc(newAssoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASSOCIATION_END__ASSOC, newAssoc, newAssoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ram.Class getMyClass() {
		if (eContainerFeatureID() != RamPackage.ASSOCIATION_END__MY_CLASS) return null;
		return (ram.Class)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyClass(ram.Class newMyClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMyClass, RamPackage.ASSOCIATION_END__MY_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyClass(ram.Class newMyClass) {
		if (newMyClass != eInternalContainer() || (eContainerFeatureID() != RamPackage.ASSOCIATION_END__MY_CLASS && newMyClass != null)) {
			if (EcoreUtil.isAncestor(this, newMyClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMyClass != null)
				msgs = ((InternalEObject)newMyClass).eInverseAdd(this, RamPackage.CLASS__ASSOCIATION_ENDS, ram.Class.class, msgs);
			msgs = basicSetMyClass(newMyClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASSOCIATION_END__MY_CLASS, newMyClass, newMyClass));
	}

	/**
	 * The cached invocation delegate for the '{@link #getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)RamPackage.Literals.ASSOCIATION_END.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		try {
			return (Type)GET_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.ASSOCIATION_END__ASSOC:
				if (assoc != null)
					msgs = ((InternalEObject)assoc).eInverseRemove(this, RamPackage.ASSOCIATION__ENDS, Association.class, msgs);
				return basicSetAssoc((Association)otherEnd, msgs);
			case RamPackage.ASSOCIATION_END__MY_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMyClass((ram.Class)otherEnd, msgs);
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
			case RamPackage.ASSOCIATION_END__ASSOC:
				return basicSetAssoc(null, msgs);
			case RamPackage.ASSOCIATION_END__MY_CLASS:
				return basicSetMyClass(null, msgs);
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
			case RamPackage.ASSOCIATION_END__MY_CLASS:
				return eInternalContainer().eInverseRemove(this, RamPackage.CLASS__ASSOCIATION_ENDS, ram.Class.class, msgs);
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
			case RamPackage.ASSOCIATION_END__NAVIGABLE:
				return isNavigable();
			case RamPackage.ASSOCIATION_END__ASSOC:
				if (resolve) return getAssoc();
				return basicGetAssoc();
			case RamPackage.ASSOCIATION_END__MY_CLASS:
				return getMyClass();
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
			case RamPackage.ASSOCIATION_END__NAVIGABLE:
				setNavigable((Boolean)newValue);
				return;
			case RamPackage.ASSOCIATION_END__ASSOC:
				setAssoc((Association)newValue);
				return;
			case RamPackage.ASSOCIATION_END__MY_CLASS:
				setMyClass((ram.Class)newValue);
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
			case RamPackage.ASSOCIATION_END__NAVIGABLE:
				setNavigable(NAVIGABLE_EDEFAULT);
				return;
			case RamPackage.ASSOCIATION_END__ASSOC:
				setAssoc((Association)null);
				return;
			case RamPackage.ASSOCIATION_END__MY_CLASS:
				setMyClass((ram.Class)null);
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
			case RamPackage.ASSOCIATION_END__NAVIGABLE:
				return navigable != NAVIGABLE_EDEFAULT;
			case RamPackage.ASSOCIATION_END__ASSOC:
				return assoc != null;
			case RamPackage.ASSOCIATION_END__MY_CLASS:
				return getMyClass() != null;
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
		result.append(" (navigable: ");
		result.append(navigable);
		result.append(')');
		return result.toString();
	}

} //AssociationEndImpl
