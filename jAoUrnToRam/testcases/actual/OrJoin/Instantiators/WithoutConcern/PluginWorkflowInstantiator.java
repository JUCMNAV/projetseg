package OrJoin.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class PluginWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E10=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E10);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}

