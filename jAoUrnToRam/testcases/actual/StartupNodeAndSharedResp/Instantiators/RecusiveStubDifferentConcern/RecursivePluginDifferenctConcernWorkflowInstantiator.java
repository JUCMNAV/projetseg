package StartupNodeAndSharedResp.Instantiators.RecusiveStubDifferentConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class RecursivePluginDifferenctConcernWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StubNode _InvokeBaseDifferentConcern=new StubNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_InvokeBaseDifferentConcern);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(StartupNodeAndSharedResp.Instantiators.RecursiveStubs.RecursiveStubBaseWorkflowInstantiator p_RecursiveStubBase){

        Binding InvokeBaseDifferentConcern_RecursiveStubBase_PluginBinding=new Binding(p_RecursiveStubBase.workflow);
        _InvokeBaseDifferentConcern.addBinding(InvokeBaseDifferentConcern_RecursiveStubBase_PluginBinding);
        _InvokeBaseDifferentConcern.addInBinding(InvokeBaseDifferentConcern_RecursiveStubBase_PluginBinding,"InvokeBaseDifferentConcern_IN1",p_RecursiveStubBase._DoThatAgain);
    }
}

