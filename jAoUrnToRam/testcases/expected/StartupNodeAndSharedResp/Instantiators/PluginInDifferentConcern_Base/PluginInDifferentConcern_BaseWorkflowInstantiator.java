package StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Base;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class PluginInDifferentConcern_BaseWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _S200=new StartupNode();
    public InputNode _I200=new InputNode();
    public EndNode _E200=new EndNode();
    public StubNode _Invoke_StepWillHaveStartPointName=new StubNode();
    public StubNode _Invoke_StepWillNotHaveStartPointName=new StubNode();
    public CustomizableNode _ProcessI200=createCustomizableNode("StartupNodeAndSharedResp.Steps.PluginInDifferentConcern_Base.I200.ProcessI200");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _S200.addNextNode(_I200);
        _I200.addNextNode(_ProcessI200);
        _Invoke_StepWillHaveStartPointName.addNextNode("1",_Invoke_StepWillNotHaveStartPointName,"1");
        _Invoke_StepWillNotHaveStartPointName.addNextNode("1",_E200);
        _ProcessI200.addNextNode(_Invoke_StepWillHaveStartPointName,"1");
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_S200);
        workflow.addNode(_I200);
        workflow.addNode(_E200);
        workflow.addNode(_Invoke_StepWillHaveStartPointName);
        workflow.addNode(_Invoke_StepWillNotHaveStartPointName);
        workflow.addNode(_ProcessI200);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_S200,false);
    }

    public void bind(StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Plugin.Plugin_StepWillHaveStartPointNameWorkflowInstantiator p_Plugin_StepWillHaveStartPointName,
                     StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Plugin.Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator p_Plugin_StepWillNotHaveStartPointName){

        Binding l_Invoke_StepWillHaveStartPointName_PluginBinding=new Binding(p_Plugin_StepWillHaveStartPointName.workflow);
        _Invoke_StepWillHaveStartPointName.addBinding(l_Invoke_StepWillHaveStartPointName_PluginBinding);
        _Invoke_StepWillHaveStartPointName.addInBinding(l_Invoke_StepWillHaveStartPointName_PluginBinding,"1",p_Plugin_StepWillHaveStartPointName._R210);
        _Invoke_StepWillHaveStartPointName.addOutBinding(l_Invoke_StepWillHaveStartPointName_PluginBinding,p_Plugin_StepWillHaveStartPointName._E210,"1");

        Binding l_Invoke_StepWillNotHaveStartPointName_PluginBinding=new Binding(p_Plugin_StepWillNotHaveStartPointName.workflow);
        _Invoke_StepWillNotHaveStartPointName.addBinding(l_Invoke_StepWillNotHaveStartPointName_PluginBinding);
        _Invoke_StepWillNotHaveStartPointName.addInBinding(l_Invoke_StepWillNotHaveStartPointName_PluginBinding,"1",p_Plugin_StepWillNotHaveStartPointName._R220);
        _Invoke_StepWillNotHaveStartPointName.addOutBinding(l_Invoke_StepWillNotHaveStartPointName_PluginBinding,p_Plugin_StepWillNotHaveStartPointName._E220,"1");
    }
}
