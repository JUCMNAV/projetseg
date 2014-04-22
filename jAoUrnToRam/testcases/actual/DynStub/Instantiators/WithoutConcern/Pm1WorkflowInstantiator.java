package DynStub.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Pm1WorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _Ep1=new EndNode();
    public CustomizableNode _R1=createCustomizableNode("DynStub.Steps.WithoutConcern.Sp.R1");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _R1.addNextNode(_Ep1);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_Ep1);
        workflow.addNode(_R1);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}

