package Bellairs.Instantiators.Base;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class DevelopRoutePlanComplexWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public CustomizableNode _EnterNumPoliceVehicle=createCustomizableNode("Bellairs.Steps.Base.Develop.EnterNumPoliceVehicle");
    public InputNode _RequestPoliceRoute=new InputNode();
    public StartupNode _Develop=new StartupNode();
    public CustomizableNode _EnterNumFireTruck=createCustomizableNode("Bellairs.Steps.Base.Develop.EnterNumFireTruck");
    public InputNode _RequestFireRoute=new InputNode();
    public SynchronizationNode _OrJoin115936=new SynchronizationNode();
    public ParallelExecutionNode _AndFork115896=new ParallelExecutionNode();
    public StubNode _ProposeRouteStub=new StubNode();
    public CustomizableNode _ProcessRequestPoliceRoute=createCustomizableNode("Bellairs.Steps.Base.FSCDidntAgree_RequestFireRoute_RequestPoliceRoute.ProcessRequestPoliceRoute");
    public CustomizableNode _ProcessRequestFireRoute=createCustomizableNode("Bellairs.Steps.Base.FSCDidntAgree_RequestFireRoute_RequestPoliceRoute.ProcessRequestFireRoute");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _EnterNumPoliceVehicle.addNextNode(_RequestPoliceRoute);
        _RequestPoliceRoute.addNextNode(_ProcessRequestPoliceRoute);
        _Develop.addNextNode(_AndFork115896);
        _EnterNumFireTruck.addNextNode(_RequestFireRoute);
        _RequestFireRoute.addNextNode(_ProcessRequestFireRoute);
        _OrJoin115936.addNextNode(_ProposeRouteStub,"1");
        _AndFork115896.addNextNode(_EnterNumFireTruck);
        _AndFork115896.addNextNode(_EnterNumPoliceVehicle);
        _ProcessRequestPoliceRoute.addNextNode(_OrJoin115936);
        _ProcessRequestFireRoute.addNextNode(_OrJoin115936);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_EnterNumPoliceVehicle);
        workflow.addNode(_RequestPoliceRoute);
        workflow.addNode(_Develop);
        workflow.addNode(_EnterNumFireTruck);
        workflow.addNode(_RequestFireRoute);
        workflow.addNode(_OrJoin115936);
        workflow.addNode(_AndFork115896);
        workflow.addNode(_ProposeRouteStub);
        workflow.addNode(_ProcessRequestPoliceRoute);
        workflow.addNode(_ProcessRequestFireRoute);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_Develop,false);
    }

    public void bind(Bellairs.Instantiators.Base.ProposeRouteWorkflowInstantiator p_ProposeRoute){

        Binding l_ProposeRouteStub_PluginBinding=new Binding(p_ProposeRoute.workflow);
        _ProposeRouteStub.addBinding(l_ProposeRouteStub_PluginBinding);
        _ProposeRouteStub.addInBinding(l_ProposeRouteStub_PluginBinding,"1",p_ProposeRoute._AndFork115939);
    }
}

