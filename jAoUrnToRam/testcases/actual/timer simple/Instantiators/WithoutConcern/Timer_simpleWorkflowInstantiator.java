package timer simple.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Timer_simpleWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _EP=new EndNode();
    public CustomizableNode _TheOuput=createCustomizableNode("timer simple.Steps.WithoutConcern.TheInput.TheOuput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _SP=new StartupNode();
    public TimedSynchronizationNode _Timer=new TimedSynchronizationNode(false);

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _TheOuput.addNextNode(_EP);
        _TheInput.addNextNode(_Timer);
        _SP.addNextNode(_TheInput);
        _Timer.addNextNode("cond",_TheOuput);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_EP);
        workflow.addNode(_TheOuput);
        workflow.addNode(_TheInput);
        workflow.addNode(_SP);
        workflow.addNode(_Timer);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SP,false);
    }

    public void bind(){
    }
}

