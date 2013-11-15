package AssignVehicleBasic.Instantiators.AssignVehicle;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class AssignVehicleWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _AssignVehicle=new StartupNode();
    public EndNode _VehicleAssigned=new EndNode();
    public InputNode _SelectedVehicle=new InputNode();
    public CustomizableNode _ShowVehicleList=createCustomizableNode("AssignVehicleBasic.Steps.AssignVehicle.AssignVehicle.ShowVehicleList");
    public CustomizableNode _ShowVehicleAssignment=createCustomizableNode("AssignVehicleBasic.Steps.AssignVehicle.SelectedVehicle.ShowVehicleAssignment");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _AssignVehicle.addNextNode(_ShowVehicleList);
        _SelectedVehicle.addNextNode(_ShowVehicleAssignment);
        _ShowVehicleList.addNextNode(_SelectedVehicle);
        _ShowVehicleAssignment.addNextNode(_VehicleAssigned);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_AssignVehicle);
        workflow.addNode(_VehicleAssigned);
        workflow.addNode(_SelectedVehicle);
        workflow.addNode(_ShowVehicleList);
        workflow.addNode(_ShowVehicleAssignment);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_AssignVehicle,false);
    }

    public void bind(){
    }
}
