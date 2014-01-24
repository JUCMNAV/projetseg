package timer with trigger and timeoutpath.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Timer_with_timeoutpathWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _EP=new EndNode();
    public CustomizableNode _TheOuput=createCustomizableNode("timer with trigger and timeoutpath.Steps.WithoutConcern.TheInput.TheOuput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _SP=new StartupNode();
    public TimedSynchronizationNode _Timer=new TimedSynchronizationNode(true);
    public InputNode _timerInput=new InputNode();
    public EndNode _Ep2=new EndNode();
    public StartupNode _Sp3=new StartupNode();
    public EndNode _Ep3=new EndNode();
    public CustomizableNode _ProcesstimerInput=createCustomizableNode("timer with trigger and timeoutpath.Steps.WithoutConcern.timerInput.ProcesstimerInput");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _TheOuput.addNextNode(_EP);
        _TheInput.addNextNode(_Timer);
        _SP.addNextNode(_TheInput);
        _Timer.addNextNode("cond1",_TheOuput);
        _Timer.addNextNode("cond2",_timerInput);
        _Timer.addNextNode(_Ep3,"release");
        _timerInput.addNextNode(_ProcesstimerInput);
        _Sp3.addNextNode(_Timer);
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
        workflow.addNode(_Sp3);
        workflow.addNode(_Ep3);
        workflow.addNode(_ProcesstimerInput);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SP,false);
        workflow.addStartupNode(_Sp3,false);
    }

    public void bind(){
    }
}

