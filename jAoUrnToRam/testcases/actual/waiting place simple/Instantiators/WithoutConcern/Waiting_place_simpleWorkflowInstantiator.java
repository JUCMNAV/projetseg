package waiting place simple.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Waiting_place_simpleWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public ConditionalSynchronizationNode _Wp=new ConditionalSynchronizationNode(true);
    public EndNode _EP=new EndNode();
    public CustomizableNode _TheOuput=createCustomizableNode("waiting place simple.Steps.WithoutConcern.TheInput.TheOuput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _SP=new StartupNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _Wp.addNextNode("cond",_TheOuput);
        _TheOuput.addNextNode(_EP);
        _TheInput.addNextNode(_Wp,"waiting");
        _SP.addNextNode(_TheInput);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_Wp);
        workflow.addNode(_EP);
        workflow.addNode(_TheOuput);
        workflow.addNode(_TheInput);
        workflow.addNode(_SP);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SP,false);
    }

    public void bind(){
    }
}

