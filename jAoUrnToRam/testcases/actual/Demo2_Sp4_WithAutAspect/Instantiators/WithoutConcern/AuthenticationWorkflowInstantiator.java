package Demo2_Sp4_WithAutAspect.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class AuthenticationWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public ConditionalExecutionNode _IsAlreadyAuthenticated=new ConditionalExecutionNode();
    public EndNode _AuthenticationVerified=new EndNode();
    public StubNode _AuthenticateStub=new StubNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _IsAlreadyAuthenticated.addNextNode("yes",_AuthenticationVerified);
        _IsAlreadyAuthenticated.addNextNode("no",_AuthenticateStub,"1");
        _AuthenticateStub.addNextNode("1",_AuthenticationVerified);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_IsAlreadyAuthenticated);
        workflow.addNode(_AuthenticationVerified);
        workflow.addNode(_AuthenticateStub);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(Demo2_Sp4_WithAutAspect.Instantiators.WithoutConcern.AuthenticateWorkflowInstantiator p_Authenticate){

        Binding l_AuthenticateStub_PluginBinding=new Binding(p_Authenticate.workflow);
        _AuthenticateStub.addBinding(l_AuthenticateStub_PluginBinding);
        _AuthenticateStub.addInBinding(l_AuthenticateStub_PluginBinding,"1",p_Authenticate._LoginRequest);
        _AuthenticateStub.addOutBinding(l_AuthenticateStub_PluginBinding,p_Authenticate._Authenticated,"1");
    }
}

