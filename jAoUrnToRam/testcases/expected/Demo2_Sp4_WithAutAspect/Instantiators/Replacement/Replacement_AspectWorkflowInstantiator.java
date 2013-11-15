package Demo2_Sp4_WithAutAspect.Instantiators.Replacement;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Replacement_AspectWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E10=new EndNode();
    public CustomizableNode _ReplAspect1=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.Replacement.TheReplacementStub_Out1.ReplAspect1");
    public CustomizableNode _ReplAspect2=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.Replacement.TheReplacementStub_Out1.ReplAspect2");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _ReplAspect1.addNextNode(_ReplAspect2);
        _ReplAspect2.addNextNode(_E10);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E10);
        workflow.addNode(_ReplAspect1);
        workflow.addNode(_ReplAspect2);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}
