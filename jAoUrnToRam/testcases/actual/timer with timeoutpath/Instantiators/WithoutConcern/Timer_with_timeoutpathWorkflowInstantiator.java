package timer with timeoutpath.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Timer_with_timeoutpathWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _EP=new EndNode();
    public CustomizableNode _TheOuput=createCustomizableNode("timer with timeoutpath.Steps.WithoutConcern.TheInput.TheOuput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _SP=new StartupNode();
    public TimedSynchronizationNode _Timer=new TimedSynchronizationNode(true);
    public InputNode _timerInput=new InputNode();
    public EndNode _Ep2=new EndNode();
    public CustomizableNode _ProcesstimerInput=createCustomizableNode("timer with timeoutpath.Steps.WithoutConcern.timerInput.ProcesstimerInput");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _TheOuput.addNextNode(_EP);
        _TheInput.addNextNode(_Timer,"waiting");
        _SP.addNextNode(_TheInput);
        _Timer.addNextNode("regular",_TheOuput);
        _Timer.addNextNode("timeout",_timerInput);
        _timerInput.addNextNode(_ProcesstimerInput);
        _ProcesstimerInput.addNextNode(_Ep2);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_EP);
        workflow.addNode(_TheOuput);
        workflow.addNode(_TheInput);
        workflow.addNode(_SP);
        workflow.addNode(_Timer);
        workflow.addNode(_timerInput);
        workflow.addNode(_Ep2);
        workflow.addNode(_ProcesstimerInput);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SP,false);
    }

    public void bind(){
    }
}

