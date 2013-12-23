package timer with trigger;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import timer with trigger.Instantiators.WithoutConcern.Timer_with_triggerWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Timer_with_triggerWorkflowInstantiator l_Timer_with_triggerWorkflowInstantiator=new Timer_with_triggerWorkflowInstantiator();

        l_Timer_with_triggerWorkflowInstantiator.link();
        l_Timer_with_triggerWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Timer_with_triggerWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

