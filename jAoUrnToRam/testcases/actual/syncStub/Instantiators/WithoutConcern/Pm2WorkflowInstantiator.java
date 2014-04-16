package syncStub.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Pm2WorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _Ep2=new EndNode();
    public CustomizableNode _R2=createCustomizableNode("syncStub.Steps.WithoutConcern.SpA_SpB.R2");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _R2.addNextNode(_Ep2);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_Ep2);
        workflow.addNode(_R2);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}

