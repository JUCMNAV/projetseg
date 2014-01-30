package Bellairs.Instantiators.Authentication;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class AuthenticationWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public ConditionalExecutionNode _CheckAuthenticated=new ConditionalExecutionNode();
    public ConditionalExecutionNode _CheckBlock=new ConditionalExecutionNode();
    public EndNode _Authenticated=new EndNode();
    public ConditionalExecutionNode _CheckAuthenticatedAndIdle=new ConditionalExecutionNode();
    public EndNode _Fail=new EndNode();
    public ConditionalExecutionNode _CheckTrials=new ConditionalExecutionNode();
    public CustomizableNode _Authenticate=createCustomizableNode("Bellairs.Steps.Authentication.EnterUserCredentials.Authenticate");
    public CustomizableNode _Block=createCustomizableNode("Bellairs.Steps.Authentication.EnterUserCredentials.Block");
    public CustomizableNode _CheckAuthentication=createCustomizableNode("Bellairs.Steps.Authentication.EnterUserCredentials.CheckAuthentication");
    public CustomizableNode _AskEnterCredentials=createCustomizableNode("Bellairs.Steps.Authentication.EnterUserCredentials.AskEnterCredentials");
    public InputNode _EnterUserCredentials=new InputNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _CheckAuthenticated.addNextNode("fail",_CheckTrials);
        _CheckAuthenticated.addNextNode("success",_Authenticated);
        _CheckBlock.addNextNode("blocked",_Fail);
        _CheckBlock.addNextNode("else",_CheckAuthenticatedAndIdle);
        _CheckAuthenticatedAndIdle.addNextNode("else",_AskEnterCredentials);
        _CheckAuthenticatedAndIdle.addNextNode("alreadyAuthenticated_AND_idleLessThan30min",_Authenticated);
        _CheckTrials.addNextNode("lessThan4Times",_AskEnterCredentials);
        _CheckTrials.addNextNode("moreThan3Times",_Block);
        _Authenticate.addNextNode(_CheckAuthenticated);
        _Block.addNextNode(_Fail);
        _CheckAuthentication.addNextNode(_CheckBlock);
        _AskEnterCredentials.addNextNode(_EnterUserCredentials);
        _EnterUserCredentials.addNextNode(_Authenticate);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_CheckAuthenticated);
        workflow.addNode(_CheckBlock);
        workflow.addNode(_Authenticated);
        workflow.addNode(_CheckAuthenticatedAndIdle);
        workflow.addNode(_Fail);
        workflow.addNode(_CheckTrials);
        workflow.addNode(_Authenticate);
        workflow.addNode(_Block);
        workflow.addNode(_CheckAuthentication);
        workflow.addNode(_AskEnterCredentials);
        workflow.addNode(_EnterUserCredentials);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}

