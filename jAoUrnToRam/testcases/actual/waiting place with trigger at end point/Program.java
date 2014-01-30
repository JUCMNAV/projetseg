package waiting place with trigger at end point;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import waiting place with trigger at end point.Instantiators.WithoutConcern.Waiting_place_with_trigger_at_end_pointWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Waiting_place_with_trigger_at_end_pointWorkflowInstantiator l_Waiting_place_with_trigger_at_end_pointWorkflowInstantiator=new Waiting_place_with_trigger_at_end_pointWorkflowInstantiator();

        l_Waiting_place_with_trigger_at_end_pointWorkflowInstantiator.link();
        l_Waiting_place_with_trigger_at_end_pointWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Waiting_place_with_trigger_at_end_pointWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

