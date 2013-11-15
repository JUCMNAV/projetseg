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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.AssociationEnd;
import ram.Attribute;
import ram.Classifier;
import ram.RamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.ClassImpl#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link ram.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ram.impl.ClassImpl#isPartial <em>Partial</em>}</li>
 *   <li>{@link ram.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ram.impl.ClassImpl#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements ram.Class {
	/**
	 * The cached value of the '{@link #getAssociationEnds() <em>Association Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationEnd> associationEnds;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The default value of the '{@link #isPartial() <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartial() <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean partial = PARTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> superTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEnd> getAssociationEnds() {
		if (associationEnds == null) {
			associationEnds = new EObjectContainmentWithInverseEList<AssociationEnd>(AssociationEnd.class, this, RamPackage.CLASS__ASSOCIATION_ENDS, RamPackage.ASSOCIATION_END__MY_CLASS);
		}
		return associationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RamPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartial() {
		return partial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartial(boolean newPartial) {
		boolean oldPartial = partial;
		partial = newPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.CLASS__PARTIAL, oldPartial, partial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.CLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<Classifier>(Classifier.class, this, RamPackage.CLASS__SUPER_TYPES);
		}
		return superTypes;
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
			case RamPackage.CLASS__ASSOCIATION_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationEnds()).basicAdd(otherEnd, msgs);
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
			case RamPackage.CLASS__ASSOCIATION_ENDS:
				return ((InternalEList<?>)getAssociationEnds()).basicRemove(otherEnd, msgs);
			case RamPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case RamPackage.CLASS__ASSOCIATION_ENDS:
				return getAssociationEnds();
			case RamPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case RamPackage.CLASS__PARTIAL:
				return isPartial();
			case RamPackage.CLASS__ABSTRACT:
				return isAbstract();
			case RamPackage.CLASS__SUPER_TYPES:
				return getSuperTypes();
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
			case RamPackage.CLASS__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				getAssociationEnds().addAll((Collection<? extends AssociationEnd>)newValue);
				return;
			case RamPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case RamPackage.CLASS__PARTIAL:
				setPartial((Boolean)newValue);
				return;
			case RamPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case RamPackage.CLASS__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends Classifier>)newValue);
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
			case RamPackage.CLASS__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				return;
			case RamPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case RamPackage.CLASS__PARTIAL:
				setPartial(PARTIAL_EDEFAULT);
				return;
			case RamPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case RamPackage.CLASS__SUPER_TYPES:
				getSuperTypes().clear();
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
			case RamPackage.CLASS__ASSOCIATION_ENDS:
				return associationEnds != null && !associationEnds.isEmpty();
			case RamPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case RamPackage.CLASS__PARTIAL:
				return partial != PARTIAL_EDEFAULT;
			case RamPackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case RamPackage.CLASS__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
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
		result.append(" (partial: ");
		result.append(partial);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
