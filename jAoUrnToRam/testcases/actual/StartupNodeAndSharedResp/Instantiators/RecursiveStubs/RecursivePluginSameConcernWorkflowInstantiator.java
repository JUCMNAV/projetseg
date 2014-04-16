package StartupNodeAndSharedResp.Instantiators.RecursiveStubs;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class RecursivePluginSameConcernWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StubNode _InvokeBaseSameConcern=new StubNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_InvokeBaseSameConcern);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(StartupNodeAndSharedResp.Instantiators.RecursiveStubs.RecursiveStubBaseWorkflowInstantiator p_RecursiveStubBase){

        Binding InvokeBaseSameConcern_RecursiveStubBase_PluginBinding=new Binding(p_RecursiveStubBase.workflow);
        _InvokeBaseSameConcern.addBinding(InvokeBaseSameConcern_RecursiveStubBase_PluginBinding);
        _InvokeBaseSameConcern.addInBinding(InvokeBaseSameConcern_RecursiveStubBase_PluginBinding,"1",p_RecursiveStubBase._DoThisAgain);
    }
}

