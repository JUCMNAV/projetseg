package timer with trigger at endpoint.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Timer_with_trigger_at_endpointWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _EP=new EndNode();
    public CustomizableNode _TheOuput=createCustomizableNode("timer with trigger at endpoint.Steps.WithoutConcern.TheInput.TheOuput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _SP=new StartupNode();
    public TimedSynchronizationNode _Timer=new TimedSynchronizationNode(true);
    public StartupNode _Sp2=new StartupNode();
    public EndNode _Ep2=new EndNode();

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
        _Sp2.addNextNode(_Ep2);
        _Ep2.addNextNode(_Timer,"trigger");
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_EP);
        workflow.addNode(_TheOuput);
        workflow.addNode(_TheInput);
        workflow.addNode(_SP);
        workflow.addNode(_Timer);
        workflow.addNode(_Sp2);
        workflow.addNode(_Ep2);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SP,false);
        workflow.addStartupNode(_Sp2,false);
    }

    public void bind(){
    }
}

