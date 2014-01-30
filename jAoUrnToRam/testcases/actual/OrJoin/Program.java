package OrJoin;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import OrJoin.Instantiators.WithoutConcern.BaseWorkflowInstantiator;
import OrJoin.Instantiators.WithoutConcern.PluginWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        BaseWorkflowInstantiator l_BaseWorkflowInstantiator=new BaseWorkflowInstantiator();
        PluginWorkflowInstantiator l_PluginWorkflowInstantiator=new PluginWorkflowInstantiator();

        l_BaseWorkflowInstantiator.link();
        l_BaseWorkflowInstantiator.bind(l_PluginWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_BaseWorkflowInstantiator.workflow);

        l_PluginWorkflowInstantiator.link();
        l_PluginWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_PluginWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

