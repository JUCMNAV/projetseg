package OrJoin.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class BaseWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _S1=new StartupNode();
    public InputNode _I1=new InputNode();
    public StartupNode _S4=new StartupNode();
    public InputNode _I4=new InputNode();
    public EndNode _E1=new EndNode();
    public StubNode _TheStub=new StubNode();
    public StartupNode _S2=new StartupNode();
    public InputNode _I2=new InputNode();
    public StartupNode _S3=new StartupNode();
    public InputNode _I3=new InputNode();
    public CustomizableNode _ProcessI1=createCustomizableNode("OrJoin.Steps.WithoutConcern.I1_I4_I2_I3.ProcessI1");
    public CustomizableNode _ProcessI4=createCustomizableNode("OrJoin.Steps.WithoutConcern.I1_I4_I2_I3.ProcessI4");
    public CustomizableNode _ProcessI2=createCustomizableNode("OrJoin.Steps.WithoutConcern.I1_I4_I2_I3.ProcessI2");
    public CustomizableNode _ProcessI3=createCustomizableNode("OrJoin.Steps.WithoutConcern.I1_I4_I2_I3.ProcessI3");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _S1.addNextNode(_I1);
        _I1.addNextNode(_ProcessI1);
        _S4.addNextNode(_I4);
        _I4.addNextNode(_ProcessI4);
        _TheStub.addNextNode("_OUT1",_E1);
        _S2.addNextNode(_I2);
        _I2.addNextNode(_ProcessI2);
        _S3.addNextNode(_I3);
        _I3.addNextNode(_ProcessI3);
        _ProcessI1.addNextNode(_TheStub,"TheStub_IN2");
        _ProcessI4.addNextNode(_TheStub,"TheStub_IN1");
        _ProcessI2.addNextNode(_TheStub,"TheStub_IN2");
        _ProcessI3.addNextNode(_TheStub,"TheStub_IN2");
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_S1);
        workflow.addNode(_I1);
        workflow.addNode(_S4);
        workflow.addNode(_I4);
        workflow.addNode(_E1);
        workflow.addNode(_TheStub);
        workflow.addNode(_S2);
        workflow.addNode(_I2);
        workflow.addNode(_S3);
        workflow.addNode(_I3);
        workflow.addNode(_ProcessI1);
        workflow.addNode(_ProcessI4);
        workflow.addNode(_ProcessI2);
        workflow.addNode(_ProcessI3);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_S1,false);
        workflow.addStartupNode(_S4,false);
        workflow.addStartupNode(_S2,false);
        workflow.addStartupNode(_S3,false);
    }

    public void bind(OrJoin.Instantiators.WithoutConcern.PluginWorkflowInstantiator p_Plugin){

        Binding TheStub_Plugin_PluginBinding=new Binding(p_Plugin.workflow);
        _TheStub.addBinding(TheStub_Plugin_PluginBinding);
        _TheStub.addInBinding(TheStub_Plugin_PluginBinding,"TheStub_IN2",p_Plugin._E10);
        _TheStub.addInBinding(TheStub_Plugin_PluginBinding,"TheStub_IN1",p_Plugin._E10);
        _TheStub.addOutBinding(TheStub_Plugin_PluginBinding,p_Plugin._E10,"TheStub_OUT1");
    }
}

