package StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Plugin;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E220=new EndNode();
    public CustomizableNode _R220=createCustomizableNode("StartupNodeAndSharedResp.Steps.PluginInDifferentConcern_Plugin.I221.R220");
    public CustomizableNode _Input222=createCustomizableNode("StartupNodeAndSharedResp.Steps.PluginInDifferentConcern_Plugin.I221.Input222");
    public StartupNode _S221=new StartupNode();
    public InputNode _I221=new InputNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _R220.addNextNode(_Input222);
        _Input222.addNextNode(_E220);
        _S221.addNextNode(_I221);
        _I221.addNextNode(_Input222);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E220);
        workflow.addNode(_R220);
        workflow.addNode(_Input222);
        workflow.addNode(_S221);
        workflow.addNode(_I221);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_S221,false);
    }

    public void bind(){
    }
}
