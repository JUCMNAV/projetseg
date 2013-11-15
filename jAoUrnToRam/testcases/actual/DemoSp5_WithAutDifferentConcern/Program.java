package DemoSp5_WithAutDifferentConcern;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import DemoSp5_WithAutDifferentConcern.Instantiators.WithoutConcern.CaptureWorkflowInstantiator;
import DemoSp5_WithAutDifferentConcern.Instantiators.AuthenticationConcern.AuthenticationWorkflowInstantiator;
import DemoSp5_WithAutDifferentConcern.Instantiators.AuthenticationConcern.AuthenticateWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        CaptureWorkflowInstantiator l_CaptureWorkflowInstantiator=new CaptureWorkflowInstantiator();
        AuthenticationWorkflowInstantiator l_AuthenticationWorkflowInstantiator=new AuthenticationWorkflowInstantiator();
        AuthenticateWorkflowInstantiator l_AuthenticateWorkflowInstantiator=new AuthenticateWorkflowInstantiator();

        l_CaptureWorkflowInstantiator.link();
        l_CaptureWorkflowInstantiator.bind(l_AuthenticationWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_CaptureWorkflowInstantiator.workflow);

        l_AuthenticationWorkflowInstantiator.link();
        l_AuthenticationWorkflowInstantiator.bind(l_AuthenticateWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_AuthenticationWorkflowInstantiator.workflow);

        l_AuthenticateWorkflowInstantiator.link();
        l_AuthenticateWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_AuthenticateWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

