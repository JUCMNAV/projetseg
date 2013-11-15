package Demo2_Sp4_WithAutAspect.Instantiators.OnStub;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class OnStub_PluginWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E10=new EndNode();
    public EndNode _E11=new EndNode();
    public CustomizableNode _R10=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.I1_I2.R10");
    public CustomizableNode _R11=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.I1_I2.R11");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _R10.addNextNode(_E10);
        _R11.addNextNode(_E11);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E10);
        workflow.addNode(_E11);
        workflow.addNode(_R10);
        workflow.addNode(_R11);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}
