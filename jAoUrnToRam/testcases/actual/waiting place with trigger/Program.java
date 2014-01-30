package waiting place with trigger;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import waiting place with trigger.Instantiators.WithoutConcern.Waiting_place_with_triggerWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Waiting_place_with_triggerWorkflowInstantiator l_Waiting_place_with_triggerWorkflowInstantiator=new Waiting_place_with_triggerWorkflowInstantiator();

        l_Waiting_place_with_triggerWorkflowInstantiator.link();
        l_Waiting_place_with_triggerWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Waiting_place_with_triggerWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

