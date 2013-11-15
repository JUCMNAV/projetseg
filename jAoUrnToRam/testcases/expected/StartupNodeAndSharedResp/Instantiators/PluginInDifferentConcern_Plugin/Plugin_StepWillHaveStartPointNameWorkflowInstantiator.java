package StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Plugin;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Plugin_StepWillHaveStartPointNameWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E210=new EndNode();
    public CustomizableNode _R210=createCustomizableNode("StartupNodeAndSharedResp.Steps.PluginInDifferentConcern_Plugin.S210.R210");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _R210.addNextNode(_E210);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E210);
        workflow.addNode(_R210);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}
