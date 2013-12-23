/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package intermediateWorkflow.impl;

import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwNodeConnection;
import intermediateWorkflow.IwStep;
import intermediateWorkflow.IwTimer;
import iwToJavaInstantiator.NodeInstantiationStrategy;
import iwToJavaInstantiator.WorkflowNodeInstantiationStrategy;

import org.eclipse.emf.ecore.EClass;

import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iw Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IwTimerImpl extends IwWaitingPlaceImpl implements IwTimer {
	
	private IwNodeConnection timeoutpath; 
	
	@Override
	public IwNodeConnection getTimeoutpath() {
		return timeoutpath;
	}

	@Override
	public void setTimeoutpath(IwNodeConnection timeoutpath) {
		this.timeoutpath = timeoutpath;
	}
	
	private PathNode timeoutPathFirstNode;
	@Override
	public void setTimeoutpathFirstNode(PathNode node){
		timeoutPathFirstNode = node;
	}

	@Override
	public  NodeInstantiationStrategy createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this, "TimedSynchronizationNode");
	}
	
	@Override
	public boolean hasTimeoutPath() {
		if(getSuccs().size() == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public boolean hasTriggerPath() {
		if(getPreds().size() == 2){
			return true;
		}
		else {
			return false;
		}
	}
	
	private IwNode iwTimeoutPathFirstNode;
	private void exploreTimeoutPath(){
		iwTimeoutPathFirstNode = null;
		if(timeoutPathFirstNode != null) {
			IwStep step = createStep(false);
			iwTimeoutPathFirstNode = timeoutPathFirstNode.getIwEquivalentNode();
			iwTimeoutPathFirstNode.explore(step);
		}
	}
	
	@Override
	public void step_DeepFirstSearch(IwStep currentStep) {
		exploreTimeoutPath();
		
		IwNode nextNode;
		if(!visited) {
			nextNode = getFirstSucc().getTarget();
			visited = true;
		}
		else {
			nextNode = getSuccs().get(1).getTarget();
			
			if(iwTimeoutPathFirstNode == nextNode){
				nextNode = getSuccs().get(2).getTarget();
			}
		}
		nextNode.explore(currentStep);
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IwTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateWorkflowPackage.Literals.IW_TIMER;
	}

} //IwTimerImpl
