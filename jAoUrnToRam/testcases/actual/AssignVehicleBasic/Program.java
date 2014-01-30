package AssignVehicleBasic;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import AssignVehicleBasic.Instantiators.AssignVehicle.AssignVehicleWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        AssignVehicleWorkflowInstantiator l_AssignVehicleWorkflowInstantiator=new AssignVehicleWorkflowInstantiator();

        l_AssignVehicleWorkflowInstantiator.link();
        l_AssignVehicleWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_AssignVehicleWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

