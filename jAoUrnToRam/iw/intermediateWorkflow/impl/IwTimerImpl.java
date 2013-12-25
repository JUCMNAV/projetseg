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
import iwToStepView.StepView;

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
	
	@Override
	public String getImageName(){
		return "Timer16.gif";
	}
	
	//private IwNodeConnection timeoutpath; 
	
	/*@Override
	public IwNodeConnection getTimeoutpath() {
		System.out.println("1");
		return timeoutpath;
	}

	@Override
	public void setTimeoutpath(IwNodeConnection timeoutpath) {
		System.out.println("3");
		this.timeoutpath = timeoutpath;
	}*/
	
	/*private PathNode timeoutPathFirstNode;
	@Override
	public void setTimeoutpathFirstNode(PathNode node){
		timeoutPathFirstNode = node;
	}*/

	@Override
	public  NodeInstantiationStrategy createStrategy() {
		return new WorkflowNodeInstantiationStrategy(this, "TimedSynchronizationNode");
	}
	
	/*@Override
	public boolean hasTimeoutPath() {
		return getSuccs().size() >= 2;
	}
	
	@Override
	public boolean hasTriggerPath() {
		return getPreds().size() == 2;
	}*/
	
	//private IwNode iwTimeoutPathFirstNode;
	/*private void exploreTimeoutPath(){
		iwTimeoutPathFirstNode = null;
		if(timeoutPathFirstNode != null) {
			IwStep step = createStep(false);
			iwTimeoutPathFirstNode = timeoutPathFirstNode.getIwEquivalentNode();
			iwTimeoutPathFirstNode.explore(step);
		}
	}*/
	
	/*@Override 
	protected IwNode getNextNodeToExplore(){
		IwNode nextNode = super.getNextNodeToExplore();
		
		if(isTimoutPathFirstNode(nextNode)){
			nextNode = getSucc(2).getTarget();
		}
		
		return nextNode;
	}*/
	
	/*@Override
	public void step_DeepFirstSearch(IwStep currentStep) {
		exploreTimeoutPath();
		
		super.step_DeepFirstSearch(currentStep);
	}*/
	
	/*private boolean isTimoutPathFirstNode(IwNode node){
		return iwTimeoutPathFirstNode == node;
	}*/
	
	
	/*@Override
	protected IwNodeConnection chooseSucc(){
		IwNodeConnection succ = super.chooseSucc();
		if(isTimeoutPathPred(succ)){
			succ = getSucc(2);
		}
		return succ;
	}*/
	
	/*private boolean isTimeoutPathPred(IwNodeConnection nodeConnection){
		IwNode target = nodeConnection.getTarget();
		
		boolean result = false;
		if(iwTimeoutPathFirstNode == target){
			result = true;
		}
		return result;
	}*/
	
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
