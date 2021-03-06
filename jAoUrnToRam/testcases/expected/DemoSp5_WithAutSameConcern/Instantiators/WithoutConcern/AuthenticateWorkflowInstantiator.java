package DemoSp5_WithAutSameConcern.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class AuthenticateWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public ConditionalExecutionNode _IsAuthenticated=new ConditionalExecutionNode();
    public CustomizableNode _LoginRequest=createCustomizableNode("DemoSp5_WithAutSameConcern.Steps.WithoutConcern.CaptureLocationType_CaptureWitnessInfo_ValidateWitness_LoginInfo.LoginRequest");
    public InputNode _LoginInfo=new InputNode();
    public CustomizableNode _PerformAuthentication=createCustomizableNode("DemoSp5_WithAutSameConcern.Steps.WithoutConcern.CaptureLocationType_CaptureWitnessInfo_ValidateWitness_LoginInfo.PerformAuthentication");
    public EndNode _Authenticated=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _IsAuthenticated.addNextNode("no",_LoginRequest);
        _IsAuthenticated.addNextNode("yes",_Authenticated);
        _LoginRequest.addNextNode(_LoginInfo);
        _LoginInfo.addNextNode(_PerformAuthentication);
        _PerformAuthentication.addNextNode(_IsAuthenticated);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_IsAuthenticated);
        workflow.addNode(_LoginRequest);
        workflow.addNode(_LoginInfo);
        workflow.addNode(_PerformAuthentication);
        workflow.addNode(_Authenticated);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}
