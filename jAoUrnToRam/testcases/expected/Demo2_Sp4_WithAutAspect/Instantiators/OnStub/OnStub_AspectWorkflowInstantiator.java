package Demo2_Sp4_WithAutAspect.Instantiators.OnStub;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class OnStub_AspectWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E100=new EndNode();
    public CustomizableNode _AspectAfter100_913=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.ThePointcutStub_Out1.AspectAfter100");
    public EndNode _ThePointcutStub_In2=new EndNode();
    public EndNode _ThePointcutStub_In1=new EndNode();
    public CustomizableNode _AspectBefore100_1072=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.S100.AspectBefore100");
    public CustomizableNode _AspectBefore101_1089=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.S101.AspectBefore101");
    public EndNode _End101=new EndNode();
    public CustomizableNode _AspectAfter101_1118=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.ThePointcutStub_Out2.AspectAfter101");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _AspectAfter100_913.addNextNode(_E100);
        _AspectBefore100_1072.addNextNode(_ThePointcutStub_In1);
        _AspectBefore101_1089.addNextNode(_ThePointcutStub_In2);
        _AspectAfter101_1118.addNextNode(_End101);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E100);
        workflow.addNode(_AspectAfter100_913);
        workflow.addNode(_ThePointcutStub_In2);
        workflow.addNode(_ThePointcutStub_In1);
        workflow.addNode(_AspectBefore100_1072);
        workflow.addNode(_AspectBefore101_1089);
        workflow.addNode(_End101);
        workflow.addNode(_AspectAfter101_1118);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}
