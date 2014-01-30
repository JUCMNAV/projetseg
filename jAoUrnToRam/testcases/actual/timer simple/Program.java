package timer simple;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import timer simple.Instantiators.WithoutConcern.Timer_simpleWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Timer_simpleWorkflowInstantiator l_Timer_simpleWorkflowInstantiator=new Timer_simpleWorkflowInstantiator();

        l_Timer_simpleWorkflowInstantiator.link();
        l_Timer_simpleWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Timer_simpleWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

