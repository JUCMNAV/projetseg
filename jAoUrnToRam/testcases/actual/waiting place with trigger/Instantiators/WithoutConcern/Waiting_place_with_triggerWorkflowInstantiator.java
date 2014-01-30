package waiting place with trigger.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Waiting_place_with_triggerWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _SP=new StartupNode();
    public EndNode _EP=new EndNode();
    public InputNode _TheInput=new InputNode();
    public CustomizableNode _TheOuput=createCustomizableNode("waiting place with trigger.Steps.WithoutConcern.TheInput.TheOuput");
    public ConditionalSynchronizationNode _Wp=new ConditionalSynchronizationNode(true);
    public StartupNode _Sp2=new StartupNode();
    public ParallelExecutionNode _ImplicitAndFork=new ParallelExecutionNode();
    public EndNode _Ep2=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _SP.addNextNode(_TheInput);
        _TheInput.addNextNode(_Wp,"waiting");
        _TheOuput.addNextNode(_EP);
        _Wp.addNextNode(_TheOuput);
        _Sp2.addNextNode(_ImplicitAndFork);
        _ImplicitAndFork.addNextNode(_Wp,"trigger");
        _ImplicitAndFork.addNextNode(_Ep2);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_SP);
        workflow.addNode(_EP);
        workflow.addNode(_TheInput);
        workflow.addNode(_TheOuput);
        workflow.addNode(_Wp);
        workflow.addNode(_Sp2);
        workflow.addNode(_ImplicitAndFork);
        workflow.addNode(_Ep2);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SP,false);
        workflow.addStartupNode(_Sp2,false);
    }

    public void bind(){
    }
}

