package syncStub.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class MapWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _SpA=new StartupNode();
    public EndNode _EpA=new EndNode();
    public StubNode _SyncStub=new StubNode();
    public StartupNode _SpB=new StartupNode();
    public EndNode _EpB=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _SpA.addNextNode(_SyncStub,"1");
        _SyncStub.addNextNodeWithThreshold("_OUT1",_EpA,2);
        _SyncStub.addNextNodeWithThreshold("_OUT2",_EpB,3);
        _SpB.addNextNode(_SyncStub,"2");
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_SpA);
        workflow.addNode(_EpA);
        workflow.addNode(_SyncStub);
        workflow.addNode(_SpB);
        workflow.addNode(_EpB);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_SpA,false);
        workflow.addStartupNode(_SpB,false);
    }

    public void bind(syncStub.Instantiators.WithoutConcern.Pm2WorkflowInstantiator p_Pm2,
                     syncStub.Instantiators.WithoutConcern.Pm1WorkflowInstantiator p_Pm1){

        Binding SyncStub_Pm2_PluginBinding=new Binding(p_Pm2.workflow);
        _SyncStub.addBinding(SyncStub_Pm2_PluginBinding);
        _SyncStub.addInBinding(SyncStub_Pm2_PluginBinding,"2",p_Pm2._R2);
        _SyncStub.addOutBinding(SyncStub_Pm2_PluginBinding,p_Pm2._Ep2,"2");

        Binding SyncStub_Pm1_PluginBinding=new Binding(p_Pm1.workflow);
        _SyncStub.addBinding(SyncStub_Pm1_PluginBinding);
        _SyncStub.addInBinding(SyncStub_Pm1_PluginBinding,"1",p_Pm1._R1);
        _SyncStub.addOutBinding(SyncStub_Pm1_PluginBinding,p_Pm1._Ep1,"1");
    }
}

