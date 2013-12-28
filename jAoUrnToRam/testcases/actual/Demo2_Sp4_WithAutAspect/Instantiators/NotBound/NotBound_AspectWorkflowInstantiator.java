package Demo2_Sp4_WithAutAspect.Instantiators.NotBound;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class NotBound_AspectWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E100=new EndNode();
    public CustomizableNode _AspectAfter100_1127=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.NotBound.ThePointcutStub_Out1.AspectAfter100");
    public EndNode _ThePointcutStub_In2=new EndNode();
    public EndNode _ThePointcutStub_In1=new EndNode();
    public StartupNode _ThePointcutStub_Out2=new StartupNode();
    public StartupNode _ThePointcutStub_Out1=new StartupNode();
    public StartupNode _S100=new StartupNode();
    public CustomizableNode _AspectBefore100_1130=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.NotBound.S100.AspectBefore100");
    public StartupNode _S101=new StartupNode();
    public CustomizableNode _AspectBefore101_1132=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.NotBound.S101.AspectBefore101");
    public EndNode _End101=new EndNode();
    public CustomizableNode _AspectAfter101_1134=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.NotBound.ThePointcutStub_Out2.AspectAfter101");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _AspectAfter100_1127.addNextNode(_E100);
        _ThePointcutStub_Out2.addNextNode(_AspectAfter101_1134);
        _ThePointcutStub_Out1.addNextNode(_AspectAfter100_1127);
        _S100.addNextNode(_AspectBefore100_1130);
        _AspectBefore100_1130.addNextNode(_ThePointcutStub_In1);
        _S101.addNextNode(_AspectBefore101_1132);
        _AspectBefore101_1132.addNextNode(_ThePointcutStub_In2);
        _AspectAfter101_1134.addNextNode(_End101);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E100);
        workflow.addNode(_AspectAfter100_1127);
        workflow.addNode(_ThePointcutStub_In2);
        workflow.addNode(_ThePointcutStub_In1);
        workflow.addNode(_ThePointcutStub_Out2);
        workflow.addNode(_ThePointcutStub_Out1);
        workflow.addNode(_S100);
        workflow.addNode(_AspectBefore100_1130);
        workflow.addNode(_S101);
        workflow.addNode(_AspectBefore101_1132);
        workflow.addNode(_End101);
        workflow.addNode(_AspectAfter101_1134);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_ThePointcutStub_Out2,false);
        workflow.addStartupNode(_ThePointcutStub_Out1,false);
        workflow.addStartupNode(_S100,false);
        workflow.addStartupNode(_S101,false);
    }

    public void bind(){
    }
}

