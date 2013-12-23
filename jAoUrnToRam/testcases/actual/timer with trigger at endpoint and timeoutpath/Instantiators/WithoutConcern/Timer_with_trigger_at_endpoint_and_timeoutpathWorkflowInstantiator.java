package timer with trigger at endpoint and timeoutpath.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _EP=new EndNode();
    public CustomizableNode _TheOuput=createCustomizableNode("timer with trigger at endpoint and timeoutpath.Steps.WithoutConcern.TheInput.TheOuput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _SP=new StartupNode();
    public TimedSynchronizationNode _Timer=new TimedSynchronizationNode();
    public EndNode _Ep2=new EndNode();
    public StartupNode _Sp3=new StartupNode();
    public EndNode _Ep3=new EndNode();

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
        _Timer.addNextNode("cond2",_Ep2);
        _Sp3.addNextNode(_Ep3);
        _Ep3.addNextNode(_Timer);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_EP);
        workflow.addNode(_TheOuput);
        workflow.addNode(_TheInput);
        workflow.addNode(_SP);
        workflow.addNode(_Timer);
        workflow.addNode(_Ep2);
        workflow.addNode(_Sp3);
        workflow.addNode(_Ep3);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SP,false);
        workflow.addStartupNode(_Sp3,false);
    }

    public void bind(){
    }
}

