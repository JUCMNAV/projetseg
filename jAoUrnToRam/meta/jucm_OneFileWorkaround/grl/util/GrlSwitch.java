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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jucm_OneFileWorkaround.grl.GrlPackage
 * @generated
 */
public class GrlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrlSwitch() {
		if (modelPackage == null) {
			modelPackage = GrlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GrlPackage.GR_LSPEC: {
				GRLspec grLspec = (GRLspec)theEObject;
				T result = caseGRLspec(grLspec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.BELIEF: {
				Belief belief = (Belief)theEObject;
				T result = caseBelief(belief);
				if (result == null) result = caseGRLNode(belief);
				if (result == null) result = caseGRLmodelElement(belief);
				if (result == null) result = caseIURNNode(belief);
				if (result == null) result = caseURNmodelElement(belief);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.INTENTIONAL_ELEMENT: {
				IntentionalElement intentionalElement = (IntentionalElement)theEObject;
				T result = caseIntentionalElement(intentionalElement);
				if (result == null) result = caseGRLLinkableElement(intentionalElement);
				if (result == null) result = caseGRLmodelElement(intentionalElement);
				if (result == null) result = caseURNmodelElement(intentionalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseGRLLinkableElement(actor);
				if (result == null) result = caseIURNContainer(actor);
				if (result == null) result = caseGRLmodelElement(actor);
				if (result == null) result = caseURNmodelElement(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.GRL_GRAPH: {
				GRLGraph grlGraph = (GRLGraph)theEObject;
				T result = caseGRLGraph(grlGraph);
				if (result == null) result = caseGRLmodelElement(grlGraph);
				if (result == null) result = caseIURNDiagram(grlGraph);
				if (result == null) result = caseURNmodelElement(grlGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.ACTOR_REF: {
				ActorRef actorRef = (ActorRef)theEObject;
				T result = caseActorRef(actorRef);
				if (result == null) result = caseGRLmodelElement(actorRef);
				if (result == null) result = caseIURNContainerRef(actorRef);
				if (result == null) result = caseURNmodelElement(actorRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.INTENTIONAL_ELEMENT_REF: {
				IntentionalElementRef intentionalElementRef = (IntentionalElementRef)theEObject;
				T result = caseIntentionalElementRef(intentionalElementRef);
				if (result == null) result = caseGRLNode(intentionalElementRef);
				if (result == null) result = caseGRLmodelElement(intentionalElementRef);
				if (result == null) result = caseIURNNode(intentionalElementRef);
				if (result == null) result = caseURNmodelElement(intentionalElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = caseElementLink(contribution);
				if (result == null) result = caseGRLmodelElement(contribution);
				if (result == null) result = caseURNmodelElement(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.LINK_REF: {
				LinkRef linkRef = (LinkRef)theEObject;
				T result = caseLinkRef(linkRef);
				if (result == null) result = caseIURNConnection(linkRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.ELEMENT_LINK: {
				ElementLink elementLink = (ElementLink)theEObject;
				T result = caseElementLink(elementLink);
				if (result == null) result = caseGRLmodelElement(elementLink);
				if (result == null) result = caseURNmodelElement(elementLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				T result = caseDecomposition(decomposition);
				if (result == null) result = caseElementLink(decomposition);
				if (result == null) result = caseGRLmodelElement(decomposition);
				if (result == null) result = caseURNmodelElement(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseElementLink(dependency);
				if (result == null) result = caseGRLmodelElement(dependency);
				if (result == null) result = caseURNmodelElement(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.EVALUATION_STRATEGY: {
				EvaluationStrategy evaluationStrategy = (EvaluationStrategy)theEObject;
				T result = caseEvaluationStrategy(evaluationStrategy);
				if (result == null) result = caseGRLmodelElement(evaluationStrategy);
				if (result == null) result = caseURNmodelElement(evaluationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.GRL_NODE: {
				GRLNode grlNode = (GRLNode)theEObject;
				T result = caseGRLNode(grlNode);
				if (result == null) result = caseGRLmodelElement(grlNode);
				if (result == null) result = caseIURNNode(grlNode);
				if (result == null) result = caseURNmodelElement(grlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.LINK_REF_BENDPOINT: {
				LinkRefBendpoint linkRefBendpoint = (LinkRefBendpoint)theEObject;
				T result = caseLinkRefBendpoint(linkRefBendpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.BELIEF_LINK: {
				BeliefLink beliefLink = (BeliefLink)theEObject;
				T result = caseBeliefLink(beliefLink);
				if (result == null) result = caseIURNConnection(beliefLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.STRATEGIES_GROUP: {
				StrategiesGroup strategiesGroup = (StrategiesGroup)theEObject;
				T result = caseStrategiesGroup(strategiesGroup);
				if (result == null) result = caseGRLmodelElement(strategiesGroup);
				if (result == null) result = caseURNmodelElement(strategiesGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.CONTRIBUTION_CONTEXT_GROUP: {
				ContributionContextGroup contributionContextGroup = (ContributionContextGroup)theEObject;
				T result = caseContributionContextGroup(contributionContextGroup);
				if (result == null) result = caseGRLmodelElement(contributionContextGroup);
				if (result == null) result = caseURNmodelElement(contributionContextGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.CONTRIBUTION_CONTEXT: {
				ContributionContext contributionContext = (ContributionContext)theEObject;
				T result = caseContributionContext(contributionContext);
				if (result == null) result = caseGRLmodelElement(contributionContext);
				if (result == null) result = caseURNmodelElement(contributionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.CONTRIBUTION_CHANGE: {
				ContributionChange contributionChange = (ContributionChange)theEObject;
				T result = caseContributionChange(contributionChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.GRL_LINKABLE_ELEMENT: {
				GRLLinkableElement grlLinkableElement = (GRLLinkableElement)theEObject;
				T result = caseGRLLinkableElement(grlLinkableElement);
				if (result == null) result = caseGRLmodelElement(grlLinkableElement);
				if (result == null) result = caseURNmodelElement(grlLinkableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.COLLAPSED_ACTOR_REF: {
				CollapsedActorRef collapsedActorRef = (CollapsedActorRef)theEObject;
				T result = caseCollapsedActorRef(collapsedActorRef);
				if (result == null) result = caseGRLNode(collapsedActorRef);
				if (result == null) result = caseGRLmodelElement(collapsedActorRef);
				if (result == null) result = caseIURNNode(collapsedActorRef);
				if (result == null) result = caseURNmodelElement(collapsedActorRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.EVALUATION_RANGE: {
				EvaluationRange evaluationRange = (EvaluationRange)theEObject;
				T result = caseEvaluationRange(evaluationRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrlPackage.CONTRIBUTION_RANGE: {
				ContributionRange contributionRange = (ContributionRange)theEObject;
				T result = caseContributionRange(contributionRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Lspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Lspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLspec(GRLspec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belief</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belief</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBelief(Belief object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionalElement(IntentionalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLGraph(GRLGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorRef(ActorRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionalElementRef(IntentionalElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkRef(LinkRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementLink(ElementLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationStrategy(EvaluationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLNode(GRLNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Ref Bendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Ref Bendpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkRefBendpoint(LinkRefBendpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belief Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belief Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeliefLink(BeliefLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategies Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategies Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategiesGroup(StrategiesGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution Context Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution Context Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributionContextGroup(ContributionContextGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributionContext(ContributionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributionChange(ContributionChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLLinkableElement(GRLLinkableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collapsed Actor Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collapsed Actor Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollapsedActorRef(CollapsedActorRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationRange(EvaluationRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributionRange(ContributionRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURNmodelElement(URNmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Lmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Lmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLmodelElement(GRLmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNNode(IURNNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNContainer(IURNContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNDiagram(IURNDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Container Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Container Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNContainerRef(IURNContainerRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNConnection(IURNConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GrlSwitch
