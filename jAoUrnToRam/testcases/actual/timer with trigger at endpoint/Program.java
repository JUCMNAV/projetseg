package timer with trigger at endpoint;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import timer with trigger at endpoint.Instantiators.WithoutConcern.Timer_with_trigger_at_endpointWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Timer_with_trigger_at_endpointWorkflowInstantiator l_Timer_with_trigger_at_endpointWorkflowInstantiator=new Timer_with_trigger_at_endpointWorkflowInstantiator();

        l_Timer_with_trigger_at_endpointWorkflowInstantiator.link();
        l_Timer_with_trigger_at_endpointWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Timer_with_trigger_at_endpointWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

