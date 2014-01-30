package TimerWithAsyncTriggerAndTimeout;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import TimerWithAsyncTriggerAndTimeout.Instantiators.WithoutConcern.TimerWithAsyncTriggerAndTimeoutWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        TimerWithAsyncTriggerAndTimeoutWorkflowInstantiator l_TimerWithAsyncTriggerAndTimeoutWorkflowInstantiator=new TimerWithAsyncTriggerAndTimeoutWorkflowInstantiator();

        l_TimerWithAsyncTriggerAndTimeoutWorkflowInstantiator.link();
        l_TimerWithAsyncTriggerAndTimeoutWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_TimerWithAsyncTriggerAndTimeoutWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

