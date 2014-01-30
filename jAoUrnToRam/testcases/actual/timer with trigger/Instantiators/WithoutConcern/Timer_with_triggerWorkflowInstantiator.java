package timer with trigger.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Timer_with_triggerWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _EP=new EndNode();
    public CustomizableNode _TheOuput=createCustomizableNode("timer with trigger.Steps.WithoutConcern.TheInput.TheOuput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _SP=new StartupNode();
    public TimedSynchronizationNode _Timer=new TimedSynchronizationNode(true);
    public StartupNode _Sp2=new StartupNode();
    public ParallelExecutionNode _ImplicitAndFork=new ParallelExecutionNode();
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
        _Sp2.addNextNode(_ImplicitAndFork);
        _ImplicitAndFork.addNextNode(_Timer,"trigger");
        _ImplicitAndFork.addNextNode(_Ep2);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_EP);
        workflow.addNode(_TheOuput);
        workflow.addNode(_TheInput);
        workflow.addNode(_SP);
        workflow.addNode(_Timer);
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

