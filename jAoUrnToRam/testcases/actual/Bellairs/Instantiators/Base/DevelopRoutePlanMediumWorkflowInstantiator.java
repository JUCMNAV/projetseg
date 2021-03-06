package Bellairs.Instantiators.Base;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class DevelopRoutePlanMediumWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public ConditionalExecutionNode _OrFork117333=new ConditionalExecutionNode();
    public EndNode _RoutesEstablished=new EndNode();
    public CustomizableNode _ShowVehicleList=createCustomizableNode("Bellairs.Steps.Base.ConfirmAssignment.ShowVehicleList");
    public StartupNode _EstablishRoutes=new StartupNode();
    public InputNode _RequestDriverConfirmation=new InputNode();
    public StubNode _AspectMarker117542=new StubNode();
    public CustomizableNode _ShowAssignment=createCustomizableNode("Bellairs.Steps.Base.RequestDriverConfirmation.ShowAssignment");
    public InputNode _ConfirmAssignment=new InputNode();
    public StubNode _AspectMarker117545=new StubNode();
    public CustomizableNode _ProcessConfirmAssignment=createCustomizableNode("Bellairs.Steps.Base.ConfirmAssignment.ProcessConfirmAssignment");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _OrFork117333.addNextNode("else",_ShowVehicleList);
        _OrFork117333.addNextNode("accepted",_RoutesEstablished);
        _ShowVehicleList.addNextNode(_RequestDriverConfirmation);
        _EstablishRoutes.addNextNode(_ShowVehicleList);
        _RequestDriverConfirmation.addNextNode(_AspectMarker117542,"AspectMarker117542_IN1");
        _AspectMarker117542.addNextNode("_OUT1",_ShowAssignment);
        _ShowAssignment.addNextNode(_ConfirmAssignment);
        _ConfirmAssignment.addNextNode(_AspectMarker117545,"AspectMarker117545_IN1");
        _AspectMarker117545.addNextNode("_OUT1",_ProcessConfirmAssignment);
        _ProcessConfirmAssignment.addNextNode(_OrFork117333);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_OrFork117333);
        workflow.addNode(_RoutesEstablished);
        workflow.addNode(_ShowVehicleList);
        workflow.addNode(_EstablishRoutes);
        workflow.addNode(_RequestDriverConfirmation);
        workflow.addNode(_AspectMarker117542);
        workflow.addNode(_ShowAssignment);
        workflow.addNode(_ConfirmAssignment);
        workflow.addNode(_AspectMarker117545);
        workflow.addNode(_ProcessConfirmAssignment);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_EstablishRoutes,false);
    }

    public void bind(Bellairs.Instantiators.Authentication.AuthenticationWorkflowInstantiator p_Authentication){

        Binding AspectMarker117542_Authentication_PluginBinding=new Binding(p_Authentication.workflow);
        _AspectMarker117542.addBinding(AspectMarker117542_Authentication_PluginBinding);
        _AspectMarker117542.addInBinding(AspectMarker117542_Authentication_PluginBinding,"AspectMarker117542_IN1",p_Authentication._CheckAuthentication);
        _AspectMarker117542.addOutBinding(AspectMarker117542_Authentication_PluginBinding,p_Authentication._Authenticated,"AspectMarker117542_OUT1");

        Binding AspectMarker117545_Authentication_PluginBinding=new Binding(p_Authentication.workflow);
        _AspectMarker117545.addBinding(AspectMarker117545_Authentication_PluginBinding);
        _AspectMarker117545.addInBinding(AspectMarker117545_Authentication_PluginBinding,"AspectMarker117545_IN1",p_Authentication._CheckAuthentication);
        _AspectMarker117545.addOutBinding(AspectMarker117545_Authentication_PluginBinding,p_Authentication._Authenticated,"AspectMarker117545_OUT1");
    }
}

