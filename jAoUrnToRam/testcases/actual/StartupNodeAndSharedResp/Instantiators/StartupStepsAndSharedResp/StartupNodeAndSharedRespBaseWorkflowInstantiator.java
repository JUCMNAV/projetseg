package StartupNodeAndSharedResp.Instantiators.StartupStepsAndSharedResp;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class StartupNodeAndSharedRespBaseWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _S1=new StartupNode();
    public EndNode _E1=new EndNode();
    public StubNode _AStub=new StubNode();
    public StartupNode _S2=new StartupNode();
    public InputNode _I2=new InputNode();
    public EndNode _E2=new EndNode();
    public StartupNode _S3=new StartupNode();
    public InputNode _I3=new InputNode();
    public CustomizableNode _Shared1_522=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I1_I2_I3.Shared1");
    public CustomizableNode _R1=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.S1.R1");
    public InputNode _I1=new InputNode();
    public CustomizableNode _ProcessI2=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I1_I2_I3.ProcessI2");
    public CustomizableNode _ProcessI3=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I1_I2_I3.ProcessI3");
    public CustomizableNode _ProcessI1=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I1_I2_I3.ProcessI1");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _S1.addNextNode(_R1);
        _AStub.addNextNode("1",_E1);
        _AStub.addNextNode("2",_E2);
        _S2.addNextNode(_I2);
        _I2.addNextNode(_ProcessI2);
        _S3.addNextNode(_I3);
        _I3.addNextNode(_ProcessI3);
        _Shared1_522.addNextNode(_AStub,"2");
        _R1.addNextNode(_I1);
        _I1.addNextNode(_ProcessI1);
        _ProcessI2.addNextNode(_Shared1_522);
        _ProcessI3.addNextNode(_AStub,"3");
        _ProcessI1.addNextNode(_AStub,"1");
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_S1);
        workflow.addNode(_E1);
        workflow.addNode(_AStub);
        workflow.addNode(_S2);
        workflow.addNode(_I2);
        workflow.addNode(_E2);
        workflow.addNode(_S3);
        workflow.addNode(_I3);
        workflow.addNode(_Shared1_522);
        workflow.addNode(_R1);
        workflow.addNode(_I1);
        workflow.addNode(_ProcessI2);
        workflow.addNode(_ProcessI3);
        workflow.addNode(_ProcessI1);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_S1,false);
        workflow.addStartupNode(_S2,false);
        workflow.addStartupNode(_S3,true);
    }

    public void bind(StartupNodeAndSharedResp.Instantiators.StartupStepsAndSharedResp.PluginWorkflowInstantiator p_Plugin){

        Binding l_AStub_PluginBinding=new Binding(p_Plugin.workflow);
        _AStub.addBinding(l_AStub_PluginBinding);
        _AStub.addInBinding(l_AStub_PluginBinding,"1",p_Plugin._Shared1_221);
        _AStub.addInBinding(l_AStub_PluginBinding,"3",p_Plugin._IsCondition);
        _AStub.addInBinding(l_AStub_PluginBinding,"2",p_Plugin._Shared1_221);
        _AStub.addOutBinding(l_AStub_PluginBinding,p_Plugin._E10,"1");
        _AStub.addOutBinding(l_AStub_PluginBinding,p_Plugin._E11,"2");
    }
}

