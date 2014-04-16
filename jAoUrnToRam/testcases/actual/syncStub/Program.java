package syncStub;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import syncStub.Instantiators.WithoutConcern.MapWorkflowInstantiator;
import syncStub.Instantiators.WithoutConcern.Pm1WorkflowInstantiator;
import syncStub.Instantiators.WithoutConcern.Pm2WorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        MapWorkflowInstantiator l_MapWorkflowInstantiator=new MapWorkflowInstantiator();
        Pm1WorkflowInstantiator l_Pm1WorkflowInstantiator=new Pm1WorkflowInstantiator();
        Pm2WorkflowInstantiator l_Pm2WorkflowInstantiator=new Pm2WorkflowInstantiator();

        l_MapWorkflowInstantiator.link();
        l_MapWorkflowInstantiator.bind(l_Pm2WorkflowInstantiator,l_Pm1WorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_MapWorkflowInstantiator.workflow);

        l_Pm1WorkflowInstantiator.link();
        l_Pm1WorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Pm1WorkflowInstantiator.workflow);

        l_Pm2WorkflowInstantiator.link();
        l_Pm2WorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Pm2WorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

