package andjoin.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class UCMmap2WorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _StartPoint11=new StartupNode();
    public EndNode _EndPoint13=new EndNode();
    public ParallelExecutionNode _AndFork25=new ParallelExecutionNode();
    public SynchronizationNode _AndJoin44=new SynchronizationNode();
    public CustomizableNode _R1=createCustomizableNode("andjoin.Steps.WithoutConcern.StartPoint11.R1");
    public CustomizableNode _R2=createCustomizableNode("andjoin.Steps.WithoutConcern.StartPoint11.R2");
    public StartupNode _StartPoint57=new StartupNode();
    public EndNode _EndPoint59=new EndNode();
    public StartupNode _StartPoint65=new StartupNode();
    public EndNode _EndPoint67=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _StartPoint11.addNextNode(_AndFork25);
        _AndFork25.addNextNode(_R2);
        _AndFork25.addNextNode(_R1);
        _AndJoin44.addNextNode(_EndPoint13);
        _R1.addNextNode(_AndJoin44);
        _R2.addNextNode(_AndJoin44);
        _StartPoint57.addNextNode(_EndPoint59);
        _StartPoint65.addNextNode(_EndPoint67);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_StartPoint11);
        workflow.addNode(_EndPoint13);
        workflow.addNode(_AndFork25);
        workflow.addNode(_AndJoin44);
        workflow.addNode(_R1);
        workflow.addNode(_R2);
        workflow.addNode(_StartPoint57);
        workflow.addNode(_EndPoint59);
        workflow.addNode(_StartPoint65);
        workflow.addNode(_EndPoint67);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_StartPoint11,false);
        workflow.addStartupNode(_StartPoint57,false);
        workflow.addStartupNode(_StartPoint65,false);
    }

    public void bind(){
    }
}

