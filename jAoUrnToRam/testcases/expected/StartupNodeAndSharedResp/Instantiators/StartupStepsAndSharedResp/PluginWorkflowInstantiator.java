package StartupNodeAndSharedResp.Instantiators.StartupStepsAndSharedResp;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class PluginWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E11=new EndNode();
    public ConditionalExecutionNode _IsCondition=new ConditionalExecutionNode();
    public EndNode _E10=new EndNode();
    public InputNode _I10=new InputNode();
    public StartupNode _LocalInSub=new StartupNode();
    public StartupNode _GlobalInSub=new StartupNode();
    public CustomizableNode _Init=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I10.Init");
    public CustomizableNode _Shared1_221=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I1_I2_I3.Shared1");
    public CustomizableNode _Shared1_521=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I10.Shared1");
    public CustomizableNode _ProcessI10=createCustomizableNode("StartupNodeAndSharedResp.Steps.StartupStepsAndSharedResp.I10.ProcessI10");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _IsCondition.addNextNode("false",_E11);
        _IsCondition.addNextNode("true",_I10);
        _I10.addNextNode(_ProcessI10);
        _LocalInSub.addNextNode(_E11);
        _GlobalInSub.addNextNode(_Init);
        _Init.addNextNode(_Shared1_521);
        _Shared1_221.addNextNode(_IsCondition);
        _Shared1_521.addNextNode(_E10);
        _ProcessI10.addNextNode(_Shared1_521);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E11);
        workflow.addNode(_IsCondition);
        workflow.addNode(_E10);
        workflow.addNode(_I10);
        workflow.addNode(_LocalInSub);
        workflow.addNode(_GlobalInSub);
        workflow.addNode(_Init);
        workflow.addNode(_Shared1_221);
        workflow.addNode(_Shared1_521);
        workflow.addNode(_ProcessI10);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_LocalInSub,true);
        workflow.addStartupNode(_GlobalInSub,false);
    }

    public void bind(){
    }
}
