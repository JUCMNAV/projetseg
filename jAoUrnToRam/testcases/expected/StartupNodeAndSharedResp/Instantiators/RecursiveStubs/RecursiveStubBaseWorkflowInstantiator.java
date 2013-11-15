package StartupNodeAndSharedResp.Instantiators.RecursiveStubs;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class RecursiveStubBaseWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _StartRecursion=new StartupNode();
    public InputNode _StartRecursionInput=new InputNode();
    public ConditionalExecutionNode _IsPluginInvokedInSameConcern=new ConditionalExecutionNode();
    public StubNode _InvokePluginSameConcern=new StubNode();
    public StartupNode _UsefulLocalStartPointOnRootMap=new StartupNode();
    public CustomizableNode _ShouldBeAnAndJoin=createCustomizableNode("StartupNodeAndSharedResp.Steps.RecursiveStubs.StartRecursionInput.ShouldBeAnAndJoin");
    public StubNode _InvokePluginDifferentConcern=new StubNode();
    public CustomizableNode _DoThisAgain=createCustomizableNode("StartupNodeAndSharedResp.Steps.RecursiveStubs.StartRecursionInput.DoThisAgain");
    public CustomizableNode _DoThatAgain=createCustomizableNode("StartupNodeAndSharedResp.Steps.RecursiveStubs.StartRecursionInput.DoThatAgain");
    public CustomizableNode _ProcessStartRecursionInput=createCustomizableNode("StartupNodeAndSharedResp.Steps.RecursiveStubs.StartRecursionInput.ProcessStartRecursionInput");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _StartRecursion.addNextNode(_StartRecursionInput);
        _StartRecursionInput.addNextNode(_ProcessStartRecursionInput);
        _IsPluginInvokedInSameConcern.addNextNode("Yes",_InvokePluginSameConcern,"1");
        _IsPluginInvokedInSameConcern.addNextNode("No",_InvokePluginDifferentConcern,"1");
        _UsefulLocalStartPointOnRootMap.addNextNode(_ShouldBeAnAndJoin);
        _ShouldBeAnAndJoin.addNextNode(_InvokePluginSameConcern,"1");
        _DoThisAgain.addNextNode(_ShouldBeAnAndJoin);
        _DoThatAgain.addNextNode(_InvokePluginDifferentConcern,"1");
        _ProcessStartRecursionInput.addNextNode(_IsPluginInvokedInSameConcern);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_StartRecursion);
        workflow.addNode(_StartRecursionInput);
        workflow.addNode(_IsPluginInvokedInSameConcern);
        workflow.addNode(_InvokePluginSameConcern);
        workflow.addNode(_UsefulLocalStartPointOnRootMap);
        workflow.addNode(_ShouldBeAnAndJoin);
        workflow.addNode(_InvokePluginDifferentConcern);
        workflow.addNode(_DoThisAgain);
        workflow.addNode(_DoThatAgain);
        workflow.addNode(_ProcessStartRecursionInput);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_StartRecursion,false);
        workflow.addStartupNode(_UsefulLocalStartPointOnRootMap,true);
    }

    public void bind(StartupNodeAndSharedResp.Instantiators.RecursiveStubs.RecursivePluginSameConcernWorkflowInstantiator p_RecursivePluginSameConcern,
                     StartupNodeAndSharedResp.Instantiators.RecusiveStubDifferentConcern.RecursivePluginDifferenctConcernWorkflowInstantiator p_RecursivePluginDifferenctConcern){

        Binding l_InvokePluginSameConcern_PluginBinding=new Binding(p_RecursivePluginSameConcern.workflow);
        _InvokePluginSameConcern.addBinding(l_InvokePluginSameConcern_PluginBinding);
        _InvokePluginSameConcern.addInBinding(l_InvokePluginSameConcern_PluginBinding,"1",p_RecursivePluginSameConcern._InvokeBaseSameConcern);

        Binding l_InvokePluginDifferentConcern_PluginBinding=new Binding(p_RecursivePluginDifferenctConcern.workflow);
        _InvokePluginDifferentConcern.addBinding(l_InvokePluginDifferentConcern_PluginBinding);
        _InvokePluginDifferentConcern.addInBinding(l_InvokePluginDifferentConcern_PluginBinding,"1",p_RecursivePluginDifferenctConcern._InvokeBaseDifferentConcern);
    }
}
