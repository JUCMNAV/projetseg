package andjoin;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import andjoin.Instantiators.WithoutConcern.UCMmap2WorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        UCMmap2WorkflowInstantiator l_UCMmap2WorkflowInstantiator=new UCMmap2WorkflowInstantiator();

        l_UCMmap2WorkflowInstantiator.link();
        l_UCMmap2WorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_UCMmap2WorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

