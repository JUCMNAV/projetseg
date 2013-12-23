package timer with trigger and timeoutpath;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import timer with trigger and timeoutpath.Instantiators.WithoutConcern.Timer_with_timeoutpathWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Timer_with_timeoutpathWorkflowInstantiator l_Timer_with_timeoutpathWorkflowInstantiator=new Timer_with_timeoutpathWorkflowInstantiator();

        l_Timer_with_timeoutpathWorkflowInstantiator.link();
        l_Timer_with_timeoutpathWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Timer_with_timeoutpathWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

