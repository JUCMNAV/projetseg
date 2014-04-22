package DynStub.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class MapWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _Sp=new StartupNode();
    public EndNode _Ep=new EndNode();
    public StubNode _DynStub=new StubNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _Sp.addNextNode(_DynStub,"DynStub_IN1");
        _DynStub.addNextNode("_OUT1",_Ep);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_Sp);
        workflow.addNode(_Ep);
        workflow.addNode(_DynStub);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_Sp,false);
    }

    public void bind(DynStub.Instantiators.WithoutConcern.Pm1WorkflowInstantiator p_Pm1){

        Binding DynStub_Pm1_PluginBinding=new Binding(p_Pm1.workflow);
        _DynStub.addBinding(DynStub_Pm1_PluginBinding);
        _DynStub.addInBinding(DynStub_Pm1_PluginBinding,"DynStub_IN1",p_Pm1._R1);
        _DynStub.addOutBinding(DynStub_Pm1_PluginBinding,p_Pm1._Ep1,"DynStub_OUT1");

        Binding DynStub_Pm2_PluginBinding=new Binding(p_Pm2.workflow);
        _DynStub.addBinding(DynStub_Pm2_PluginBinding);
        _DynStub.addInBinding(DynStub_Pm2_PluginBinding,"DynStub_IN1",p_Pm2._R2);
        _DynStub.addOutBinding(DynStub_Pm2_PluginBinding,p_Pm2._Ep2,"DynStub_OUT1");
    }
}

