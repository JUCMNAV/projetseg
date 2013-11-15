package Simple;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import Simple.Instantiators.WithoutConcern.SimpleWorkflowInstantiator;
import Simple.Instantiators.WithoutConcern.ToBeIgnoredInStepClassDiagramWorkflowInstantiator;
import Simple.Instantiators.WithoutConcern.AllFeaturesWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        SimpleWorkflowInstantiator l_SimpleWorkflowInstantiator=new SimpleWorkflowInstantiator();
        ToBeIgnoredInStepClassDiagramWorkflowInstantiator l_ToBeIgnoredInStepClassDiagramWorkflowInstantiator=new ToBeIgnoredInStepClassDiagramWorkflowInstantiator();
        AllFeaturesWorkflowInstantiator l_AllFeaturesWorkflowInstantiator=new AllFeaturesWorkflowInstantiator();

        l_SimpleWorkflowInstantiator.link();
        l_SimpleWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_SimpleWorkflowInstantiator.workflow);

        l_ToBeIgnoredInStepClassDiagramWorkflowInstantiator.link();
        l_ToBeIgnoredInStepClassDiagramWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_ToBeIgnoredInStepClassDiagramWorkflowInstantiator.workflow);

        l_AllFeaturesWorkflowInstantiator.link();
        l_AllFeaturesWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_AllFeaturesWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

