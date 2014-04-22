package blockingStub.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class MapWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _SpA=new StartupNode();
    public EndNode _EpA=new EndNode();
    public StubNode _BlockingStub=new StubNode();
    public StartupNode _SpB=new StartupNode();
    public EndNode _EpB=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _SpA.addNextNode(_BlockingStub,"BlockingStub_IN1");
        _BlockingStub.addNextNodeWithThreshold("BlockingStub_OUT1",_EpA,2);
        _BlockingStub.addNextNodeWithThreshold("BlockingStub_OUT2",_EpB,3);
        _SpB.addNextNode(_BlockingStub,"BlockingStub_IN2");
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_SpA);
        workflow.addNode(_EpA);
        workflow.addNode(_BlockingStub);
        workflow.addNode(_SpB);
        workflow.addNode(_EpB);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SpA,false);
        workflow.addStartupNode(_SpB,false);
    }

    public void bind(blockingStub.Instantiators.WithoutConcern.Pm2WorkflowInstantiator p_Pm2,
                     blockingStub.Instantiators.WithoutConcern.Pm1WorkflowInstantiator p_Pm1){

        Binding BlockingStub_Pm2_PluginBinding=new Binding(p_Pm2.workflow);
        _BlockingStub.addBinding(BlockingStub_Pm2_PluginBinding);
        _BlockingStub.addInBinding(BlockingStub_Pm2_PluginBinding,"BlockingStub_IN2",p_Pm2._R2);
        _BlockingStub.addOutBinding(BlockingStub_Pm2_PluginBinding,p_Pm2._Ep2,"BlockingStub_OUT2");

        Binding BlockingStub_Pm1_PluginBinding=new Binding(p_Pm1.workflow);
        _BlockingStub.addBinding(BlockingStub_Pm1_PluginBinding);
        _BlockingStub.addInBinding(BlockingStub_Pm1_PluginBinding,"BlockingStub_IN1",p_Pm1._R1);
        _BlockingStub.addOutBinding(BlockingStub_Pm1_PluginBinding,p_Pm1._Ep1,"BlockingStub_OUT1");
    }
}

