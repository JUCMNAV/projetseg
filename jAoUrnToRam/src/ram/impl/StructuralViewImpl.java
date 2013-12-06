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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.Association;
import ram.Classifier;
import ram.RamPackage;
import ram.StructuralView;
import ram.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.StructuralViewImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link ram.impl.StructuralViewImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link ram.impl.StructuralViewImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralViewImpl extends EObjectImpl implements StructuralView {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classes;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associations;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.STRUCTURAL_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<Classifier>(Classifier.class, this, RamPackage.STRUCTURAL_VIEW__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		if (associations == null) {
			associations = new EObjectContainmentEList<Association>(Association.class, this, RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS);
		}
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, RamPackage.STRUCTURAL_VIEW__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.STRUCTURAL_VIEW__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
			case RamPackage.STRUCTURAL_VIEW__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case RamPackage.STRUCTURAL_VIEW__CLASSES:
				return getClasses();
			case RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS:
				return getAssociations();
			case RamPackage.STRUCTURAL_VIEW__TYPES:
				return getTypes();
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
			case RamPackage.STRUCTURAL_VIEW__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Classifier>)newValue);
				return;
			case RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends Association>)newValue);
				return;
			case RamPackage.STRUCTURAL_VIEW__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
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
			case RamPackage.STRUCTURAL_VIEW__CLASSES:
				getClasses().clear();
				return;
			case RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS:
				getAssociations().clear();
				return;
			case RamPackage.STRUCTURAL_VIEW__TYPES:
				getTypes().clear();
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
			case RamPackage.STRUCTURAL_VIEW__CLASSES:
				return classes != null && !classes.isEmpty();
			case RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
			case RamPackage.STRUCTURAL_VIEW__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuralViewImpl
