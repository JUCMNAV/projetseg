/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.urncore.util;

import jucm_OneFileWorkaround.urncore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jucm_OneFileWorkaround.urncore.UrncorePackage
 * @generated
 */
public class UrncoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UrncorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrncoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UrncorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrncoreSwitch<Adapter> modelSwitch =
		new UrncoreSwitch<Adapter>() {
			@Override
			public Adapter caseURNdefinition(URNdefinition object) {
				return createURNdefinitionAdapter();
			}
			@Override
			public Adapter caseResponsibility(Responsibility object) {
				return createResponsibilityAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseUCMmodelElement(UCMmodelElement object) {
				return createUCMmodelElementAdapter();
			}
			@Override
			public Adapter caseGRLmodelElement(GRLmodelElement object) {
				return createGRLmodelElementAdapter();
			}
			@Override
			public Adapter caseNodeLabel(NodeLabel object) {
				return createNodeLabelAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseComponentLabel(ComponentLabel object) {
				return createComponentLabelAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseIURNDiagram(IURNDiagram object) {
				return createIURNDiagramAdapter();
			}
			@Override
			public Adapter caseURNmodelElement(URNmodelElement object) {
				return createURNmodelElementAdapter();
			}
			@Override
			public Adapter caseIURNNode(IURNNode object) {
				return createIURNNodeAdapter();
			}
			@Override
			public Adapter caseIURNContainerRef(IURNContainerRef object) {
				return createIURNContainerRefAdapter();
			}
			@Override
			public Adapter caseIURNContainer(IURNContainer object) {
				return createIURNContainerAdapter();
			}
			@Override
			public Adapter caseIURNConnection(IURNConnection object) {
				return createIURNConnectionAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseConcern(Concern object) {
				return createConcernAdapter();
			}
			@Override
			public Adapter caseConnectionLabel(ConnectionLabel object) {
				return createConnectionLabelAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.URNdefinition <em>UR Ndefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.URNdefinition
	 * @generated
	 */
	public Adapter createURNdefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.Responsibility
	 * @generated
	 */
	public Adapter createResponsibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.UCMmodelElement <em>UC Mmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.UCMmodelElement
	 * @generated
	 */
	public Adapter createUCMmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.GRLmodelElement <em>GR Lmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.GRLmodelElement
	 * @generated
	 */
	public Adapter createGRLmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.NodeLabel <em>Node Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.NodeLabel
	 * @generated
	 */
	public Adapter createNodeLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.ComponentLabel <em>Component Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.ComponentLabel
	 * @generated
	 */
	public Adapter createComponentLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.IURNDiagram <em>IURN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.IURNDiagram
	 * @generated
	 */
	public Adapter createIURNDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.URNmodelElement <em>UR Nmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.URNmodelElement
	 * @generated
	 */
	public Adapter createURNmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.IURNNode <em>IURN Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.IURNNode
	 * @generated
	 */
	public Adapter createIURNNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.IURNContainerRef <em>IURN Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.IURNContainerRef
	 * @generated
	 */
	public Adapter createIURNContainerRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.IURNContainer <em>IURN Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.IURNContainer
	 * @generated
	 */
	public Adapter createIURNContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.IURNConnection <em>IURN Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.IURNConnection
	 * @generated
	 */
	public Adapter createIURNConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.Concern
	 * @generated
	 */
	public Adapter createConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.ConnectionLabel <em>Connection Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.ConnectionLabel
	 * @generated
	 */
	public Adapter createConnectionLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.urncore.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.urncore.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UrncoreAdapterFactory
