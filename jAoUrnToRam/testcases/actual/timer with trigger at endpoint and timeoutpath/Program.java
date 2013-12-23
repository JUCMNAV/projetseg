package timer with trigger at endpoint and timeoutpath;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import timer with trigger at endpoint and timeoutpath.Instantiators.WithoutConcern.Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator l_Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator=new Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator();

        l_Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator.link();
        l_Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Timer_with_trigger_at_endpoint_and_timeoutpathWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

