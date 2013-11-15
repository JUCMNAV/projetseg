package Bellairs.Instantiators.Base;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class ProposeRouteWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public CustomizableNode _AlertFSCNotCoordinated=createCustomizableNode("Bellairs.Steps.Base.FireRoutePropose_PoliceRoutePropose.AlertFSCNotCoordinated");
    public EndNode _RoutesNotCoordinated=new EndNode();
    public CustomizableNode _AskForPoliceVehicles=createCustomizableNode("Bellairs.Steps.Base.FSCDidntAgree_RequestFireRoute_RequestPoliceRoute.AskForPoliceVehicles");
    public InputNode _PoliceRoutePropose=new InputNode();
    public CustomizableNode _AskForfireVehicles=createCustomizableNode("Bellairs.Steps.Base.FSCDidntAgree_RequestFireRoute_RequestPoliceRoute.AskForfireVehicles");
    public InputNode _FireRoutePropose=new InputNode();
    public ConditionalExecutionNode _OrFork117115=new ConditionalExecutionNode();
    public ParallelExecutionNode _AndFork115939=new ParallelExecutionNode();
    public SynchronizationNode _OrJoin115953=new SynchronizationNode();
    public CustomizableNode _ProposedRouteToFSC=createCustomizableNode("Bellairs.Steps.Base.FireRoutePropose_PoliceRoutePropose.ProposedRouteToFSC");
    public InputNode _FSCDidntAgree=new InputNode();
    public ConditionalExecutionNode _ProposedRoute=new ConditionalExecutionNode();
    public EndNode _RoutesCoordinated=new EndNode();
    public CustomizableNode _ProcessPoliceRoutePropose=createCustomizableNode("Bellairs.Steps.Base.FireRoutePropose_PoliceRoutePropose.ProcessPoliceRoutePropose");
    public CustomizableNode _ProcessFireRoutePropose=createCustomizableNode("Bellairs.Steps.Base.FireRoutePropose_PoliceRoutePropose.ProcessFireRoutePropose");
    public CustomizableNode _ProcessFSCDidntAgree=createCustomizableNode("Bellairs.Steps.Base.FSCDidntAgree_RequestFireRoute_RequestPoliceRoute.ProcessFSCDidntAgree");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _AlertFSCNotCoordinated.addNextNode(_RoutesNotCoordinated);
        _AskForPoliceVehicles.addNextNode(_PoliceRoutePropose);
        _PoliceRoutePropose.addNextNode(_ProcessPoliceRoutePropose);
        _AskForfireVehicles.addNextNode(_FireRoutePropose);
        _FireRoutePropose.addNextNode(_ProcessFireRoutePropose);
        _OrFork117115.addNextNode("else",_ProposedRouteToFSC);
        _OrFork117115.addNextNode("noRouteProposed",_AlertFSCNotCoordinated);
        _AndFork115939.addNextNode(_AskForPoliceVehicles);
        _AndFork115939.addNextNode(_AskForfireVehicles);
        _OrJoin115953.addNextNode(_OrFork117115);
        _ProposedRouteToFSC.addNextNode(_FSCDidntAgree);
        _FSCDidntAgree.addNextNode(_ProcessFSCDidntAgree);
        _ProposedRoute.addNextNode("else",_AndFork115939);
        _ProposedRoute.addNextNode("agree",_RoutesCoordinated);
        _ProcessPoliceRoutePropose.addNextNode(_OrJoin115953);
        _ProcessFireRoutePropose.addNextNode(_OrJoin115953);
        _ProcessFSCDidntAgree.addNextNode(_ProposedRoute);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_AlertFSCNotCoordinated);
        workflow.addNode(_RoutesNotCoordinated);
        workflow.addNode(_AskForPoliceVehicles);
        workflow.addNode(_PoliceRoutePropose);
        workflow.addNode(_AskForfireVehicles);
        workflow.addNode(_FireRoutePropose);
        workflow.addNode(_OrFork117115);
        workflow.addNode(_AndFork115939);
        workflow.addNode(_OrJoin115953);
        workflow.addNode(_ProposedRouteToFSC);
        workflow.addNode(_FSCDidntAgree);
        workflow.addNode(_ProposedRoute);
        workflow.addNode(_RoutesCoordinated);
        workflow.addNode(_ProcessPoliceRoutePropose);
        workflow.addNode(_ProcessFireRoutePropose);
        workflow.addNode(_ProcessFSCDidntAgree);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}

