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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ram.AbstractMessageView;
import ram.Aspect;
import ram.Instantiation;
import ram.Layout;
import ram.MappableElement;
import ram.RamPackage;
import ram.StateView;
import ram.StructuralView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ram.impl.AspectImpl#getStructuralView <em>Structural View</em>}</li>
 *   <li>{@link ram.impl.AspectImpl#getMandatoryAspectParameters <em>Mandatory Aspect Parameters</em>}</li>
 *   <li>{@link ram.impl.AspectImpl#getMessageViews <em>Message Views</em>}</li>
 *   <li>{@link ram.impl.AspectImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link ram.impl.AspectImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link ram.impl.AspectImpl#getStateViews <em>State Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends NamedElementImpl implements Aspect {
	/**
	 * The cached value of the '{@link #getStructuralView() <em>Structural View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralView()
	 * @generated
	 * @ordered
	 */
	protected StructuralView structuralView;

	/**
	 * The cached setting delegate for the '{@link #getMandatoryAspectParameters() <em>Mandatory Aspect Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryAspectParameters()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MANDATORY_ASPECT_PARAMETERS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RamPackage.Literals.ASPECT__MANDATORY_ASPECT_PARAMETERS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getMessageViews() <em>Message Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageViews()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMessageView> messageViews;

	/**
	 * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiations()
	 * @generated
	 * @ordered
	 */
	protected EList<Instantiation> instantiations;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The cached value of the '{@link #getStateViews() <em>State Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateViews()
	 * @generated
	 * @ordered
	 */
	protected EList<StateView> stateViews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RamPackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralView getStructuralView() {
		return structuralView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralView(StructuralView newStructuralView, NotificationChain msgs) {
		StructuralView oldStructuralView = structuralView;
		structuralView = newStructuralView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT__STRUCTURAL_VIEW, oldStructuralView, newStructuralView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralView(StructuralView newStructuralView) {
		if (newStructuralView != structuralView) {
			NotificationChain msgs = null;
			if (structuralView != null)
				msgs = ((InternalEObject)structuralView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RamPackage.ASPECT__STRUCTURAL_VIEW, null, msgs);
			if (newStructuralView != null)
				msgs = ((InternalEObject)newStructuralView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RamPackage.ASPECT__STRUCTURAL_VIEW, null, msgs);
			msgs = basicSetStructuralView(newStructuralView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT__STRUCTURAL_VIEW, newStructuralView, newStructuralView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MappableElement> getMandatoryAspectParameters() {
		return (EList<MappableElement>)MANDATORY_ASPECT_PARAMETERS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMessageView> getMessageViews() {
		if (messageViews == null) {
			messageViews = new EObjectContainmentEList<AbstractMessageView>(AbstractMessageView.class, this, RamPackage.ASPECT__MESSAGE_VIEWS);
		}
		return messageViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instantiation> getInstantiations() {
		if (instantiations == null) {
			instantiations = new EObjectContainmentEList<Instantiation>(Instantiation.class, this, RamPackage.ASPECT__INSTANTIATIONS);
		}
		return instantiations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RamPackage.ASPECT__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RamPackage.ASPECT__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.ASPECT__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateView> getStateViews() {
		if (stateViews == null) {
			stateViews = new EObjectContainmentEList<StateView>(StateView.class, this, RamPackage.ASPECT__STATE_VIEWS);
		}
		return stateViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RamPackage.ASPECT__STRUCTURAL_VIEW:
				return basicSetStructuralView(null, msgs);
			case RamPackage.ASPECT__MESSAGE_VIEWS:
				return ((InternalEList<?>)getMessageViews()).basicRemove(otherEnd, msgs);
			case RamPackage.ASPECT__INSTANTIATIONS:
				return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
			case RamPackage.ASPECT__LAYOUT:
				return basicSetLayout(null, msgs);
			case RamPackage.ASPECT__STATE_VIEWS:
				return ((InternalEList<?>)getStateViews()).basicRemove(otherEnd, msgs);
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
			case RamPackage.ASPECT__STRUCTURAL_VIEW:
				return getStructuralView();
			case RamPackage.ASPECT__MANDATORY_ASPECT_PARAMETERS:
				return getMandatoryAspectParameters();
			case RamPackage.ASPECT__MESSAGE_VIEWS:
				return getMessageViews();
			case RamPackage.ASPECT__INSTANTIATIONS:
				return getInstantiations();
			case RamPackage.ASPECT__LAYOUT:
				return getLayout();
			case RamPackage.ASPECT__STATE_VIEWS:
				return getStateViews();
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
			case RamPackage.ASPECT__STRUCTURAL_VIEW:
				setStructuralView((StructuralView)newValue);
				return;
			case RamPackage.ASPECT__MESSAGE_VIEWS:
				getMessageViews().clear();
				getMessageViews().addAll((Collection<? extends AbstractMessageView>)newValue);
				return;
			case RamPackage.ASPECT__INSTANTIATIONS:
				getInstantiations().clear();
				getInstantiations().addAll((Collection<? extends Instantiation>)newValue);
				return;
			case RamPackage.ASPECT__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case RamPackage.ASPECT__STATE_VIEWS:
				getStateViews().clear();
				getStateViews().addAll((Collection<? extends StateView>)newValue);
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
			case RamPackage.ASPECT__STRUCTURAL_VIEW:
				setStructuralView((StructuralView)null);
				return;
			case RamPackage.ASPECT__MESSAGE_VIEWS:
				getMessageViews().clear();
				return;
			case RamPackage.ASPECT__INSTANTIATIONS:
				getInstantiations().clear();
				return;
			case RamPackage.ASPECT__LAYOUT:
				setLayout((Layout)null);
				return;
			case RamPackage.ASPECT__STATE_VIEWS:
				getStateViews().clear();
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
			case RamPackage.ASPECT__STRUCTURAL_VIEW:
				return structuralView != null;
			case RamPackage.ASPECT__MANDATORY_ASPECT_PARAMETERS:
				return MANDATORY_ASPECT_PARAMETERS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RamPackage.ASPECT__MESSAGE_VIEWS:
				return messageViews != null && !messageViews.isEmpty();
			case RamPackage.ASPECT__INSTANTIATIONS:
				return instantiations != null && !instantiations.isEmpty();
			case RamPackage.ASPECT__LAYOUT:
				return layout != null;
			case RamPackage.ASPECT__STATE_VIEWS:
				return stateViews != null && !stateViews.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AspectImpl
