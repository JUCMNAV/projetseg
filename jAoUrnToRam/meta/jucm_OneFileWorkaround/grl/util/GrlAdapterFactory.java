/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl.util;

import jucm_OneFileWorkaround.grl.*;

import jucm_OneFileWorkaround.urncore.GRLmodelElement;
import jucm_OneFileWorkaround.urncore.IURNConnection;
import jucm_OneFileWorkaround.urncore.IURNContainer;
import jucm_OneFileWorkaround.urncore.IURNContainerRef;
import jucm_OneFileWorkaround.urncore.IURNDiagram;
import jucm_OneFileWorkaround.urncore.IURNNode;
import jucm_OneFileWorkaround.urncore.URNmodelElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jucm_OneFileWorkaround.grl.GrlPackage
 * @generated
 */
public class GrlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GrlPackage.eINSTANCE;
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
	protected GrlSwitch<Adapter> modelSwitch =
		new GrlSwitch<Adapter>() {
			@Override
			public Adapter caseGRLspec(GRLspec object) {
				return createGRLspecAdapter();
			}
			@Override
			public Adapter caseBelief(Belief object) {
				return createBeliefAdapter();
			}
			@Override
			public Adapter caseIntentionalElement(IntentionalElement object) {
				return createIntentionalElementAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseGRLGraph(GRLGraph object) {
				return createGRLGraphAdapter();
			}
			@Override
			public Adapter caseActorRef(ActorRef object) {
				return createActorRefAdapter();
			}
			@Override
			public Adapter caseIntentionalElementRef(IntentionalElementRef object) {
				return createIntentionalElementRefAdapter();
			}
			@Override
			public Adapter caseContribution(Contribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseLinkRef(LinkRef object) {
				return createLinkRefAdapter();
			}
			@Override
			public Adapter caseElementLink(ElementLink object) {
				return createElementLinkAdapter();
			}
			@Override
			public Adapter caseDecomposition(Decomposition object) {
				return createDecompositionAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter caseEvaluationStrategy(EvaluationStrategy object) {
				return createEvaluationStrategyAdapter();
			}
			@Override
			public Adapter caseGRLNode(GRLNode object) {
				return createGRLNodeAdapter();
			}
			@Override
			public Adapter caseLinkRefBendpoint(LinkRefBendpoint object) {
				return createLinkRefBendpointAdapter();
			}
			@Override
			public Adapter caseBeliefLink(BeliefLink object) {
				return createBeliefLinkAdapter();
			}
			@Override
			public Adapter caseStrategiesGroup(StrategiesGroup object) {
				return createStrategiesGroupAdapter();
			}
			@Override
			public Adapter caseContributionContextGroup(ContributionContextGroup object) {
				return createContributionContextGroupAdapter();
			}
			@Override
			public Adapter caseContributionContext(ContributionContext object) {
				return createContributionContextAdapter();
			}
			@Override
			public Adapter caseContributionChange(ContributionChange object) {
				return createContributionChangeAdapter();
			}
			@Override
			public Adapter caseGRLLinkableElement(GRLLinkableElement object) {
				return createGRLLinkableElementAdapter();
			}
			@Override
			public Adapter caseCollapsedActorRef(CollapsedActorRef object) {
				return createCollapsedActorRefAdapter();
			}
			@Override
			public Adapter caseEvaluationRange(EvaluationRange object) {
				return createEvaluationRangeAdapter();
			}
			@Override
			public Adapter caseContributionRange(ContributionRange object) {
				return createContributionRangeAdapter();
			}
			@Override
			public Adapter caseURNmodelElement(URNmodelElement object) {
				return createURNmodelElementAdapter();
			}
			@Override
			public Adapter caseGRLmodelElement(GRLmodelElement object) {
				return createGRLmodelElementAdapter();
			}
			@Override
			public Adapter caseIURNNode(IURNNode object) {
				return createIURNNodeAdapter();
			}
			@Override
			public Adapter caseIURNContainer(IURNContainer object) {
				return createIURNContainerAdapter();
			}
			@Override
			public Adapter caseIURNDiagram(IURNDiagram object) {
				return createIURNDiagramAdapter();
			}
			@Override
			public Adapter caseIURNContainerRef(IURNContainerRef object) {
				return createIURNContainerRefAdapter();
			}
			@Override
			public Adapter caseIURNConnection(IURNConnection object) {
				return createIURNConnectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.GRLspec <em>GR Lspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.GRLspec
	 * @generated
	 */
	public Adapter createGRLspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.Belief
	 * @generated
	 */
	public Adapter createBeliefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.IntentionalElement
	 * @generated
	 */
	public Adapter createIntentionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.GRLGraph <em>GRL Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.GRLGraph
	 * @generated
	 */
	public Adapter createGRLGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.ActorRef <em>Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.ActorRef
	 * @generated
	 */
	public Adapter createActorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.IntentionalElementRef <em>Intentional Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.IntentionalElementRef
	 * @generated
	 */
	public Adapter createIntentionalElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.LinkRef <em>Link Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.LinkRef
	 * @generated
	 */
	public Adapter createLinkRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.ElementLink <em>Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.ElementLink
	 * @generated
	 */
	public Adapter createElementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.EvaluationStrategy <em>Evaluation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.EvaluationStrategy
	 * @generated
	 */
	public Adapter createEvaluationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.GRLNode <em>GRL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.GRLNode
	 * @generated
	 */
	public Adapter createGRLNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.LinkRefBendpoint <em>Link Ref Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.LinkRefBendpoint
	 * @generated
	 */
	public Adapter createLinkRefBendpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.BeliefLink <em>Belief Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.BeliefLink
	 * @generated
	 */
	public Adapter createBeliefLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.StrategiesGroup <em>Strategies Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.StrategiesGroup
	 * @generated
	 */
	public Adapter createStrategiesGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.ContributionContextGroup <em>Contribution Context Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.ContributionContextGroup
	 * @generated
	 */
	public Adapter createContributionContextGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.ContributionContext <em>Contribution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.ContributionContext
	 * @generated
	 */
	public Adapter createContributionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.ContributionChange <em>Contribution Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.ContributionChange
	 * @generated
	 */
	public Adapter createContributionChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.GRLLinkableElement <em>GRL Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.GRLLinkableElement
	 * @generated
	 */
	public Adapter createGRLLinkableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.CollapsedActorRef <em>Collapsed Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.CollapsedActorRef
	 * @generated
	 */
	public Adapter createCollapsedActorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.EvaluationRange <em>Evaluation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.EvaluationRange
	 * @generated
	 */
	public Adapter createEvaluationRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jucm_OneFileWorkaround.grl.ContributionRange <em>Contribution Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jucm_OneFileWorkaround.grl.ContributionRange
	 * @generated
	 */
	public Adapter createContributionRangeAdapter() {
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

} //GrlAdapterFactory
