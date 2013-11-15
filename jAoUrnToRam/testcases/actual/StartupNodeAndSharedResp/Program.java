package StartupNodeAndSharedResp;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import StartupNodeAndSharedResp.Instantiators.StartupStepsAndSharedResp.StartupNodeAndSharedRespBaseWorkflowInstantiator;
import StartupNodeAndSharedResp.Instantiators.StartupStepsAndSharedResp.PluginWorkflowInstantiator;
import StartupNodeAndSharedResp.Instantiators.RecursiveStubs.RecursiveStubBaseWorkflowInstantiator;
import StartupNodeAndSharedResp.Instantiators.RecursiveStubs.RecursivePluginSameConcernWorkflowInstantiator;
import StartupNodeAndSharedResp.Instantiators.RecusiveStubDifferentConcern.RecursivePluginDifferenctConcernWorkflowInstantiator;
import StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Base.PluginInDifferentConcern_BaseWorkflowInstantiator;
import StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Plugin.Plugin_StepWillHaveStartPointNameWorkflowInstantiator;
import StartupNodeAndSharedResp.Instantiators.PluginInDifferentConcern_Plugin.Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        StartupNodeAndSharedRespBaseWorkflowInstantiator l_StartupNodeAndSharedRespBaseWorkflowInstantiator=new StartupNodeAndSharedRespBaseWorkflowInstantiator();
        PluginWorkflowInstantiator l_PluginWorkflowInstantiator=new PluginWorkflowInstantiator();
        RecursiveStubBaseWorkflowInstantiator l_RecursiveStubBaseWorkflowInstantiator=new RecursiveStubBaseWorkflowInstantiator();
        RecursivePluginSameConcernWorkflowInstantiator l_RecursivePluginSameConcernWorkflowInstantiator=new RecursivePluginSameConcernWorkflowInstantiator();
        RecursivePluginDifferenctConcernWorkflowInstantiator l_RecursivePluginDifferenctConcernWorkflowInstantiator=new RecursivePluginDifferenctConcernWorkflowInstantiator();
        PluginInDifferentConcern_BaseWorkflowInstantiator l_PluginInDifferentConcern_BaseWorkflowInstantiator=new PluginInDifferentConcern_BaseWorkflowInstantiator();
        Plugin_StepWillHaveStartPointNameWorkflowInstantiator l_Plugin_StepWillHaveStartPointNameWorkflowInstantiator=new Plugin_StepWillHaveStartPointNameWorkflowInstantiator();
        Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator l_Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator=new Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator();

        l_StartupNodeAndSharedRespBaseWorkflowInstantiator.link();
        l_StartupNodeAndSharedRespBaseWorkflowInstantiator.bind(l_PluginWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_StartupNodeAndSharedRespBaseWorkflowInstantiator.workflow);

        l_PluginWorkflowInstantiator.link();
        l_PluginWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_PluginWorkflowInstantiator.workflow);

        l_RecursiveStubBaseWorkflowInstantiator.link();
        l_RecursiveStubBaseWorkflowInstantiator.bind(l_RecursivePluginSameConcernWorkflowInstantiator,l_RecursivePluginDifferenctConcernWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_RecursiveStubBaseWorkflowInstantiator.workflow);

        l_RecursivePluginSameConcernWorkflowInstantiator.link();
        l_RecursivePluginSameConcernWorkflowInstantiator.bind(l_RecursiveStubBaseWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_RecursivePluginSameConcernWorkflowInstantiator.workflow);

        l_RecursivePluginDifferenctConcernWorkflowInstantiator.link();
        l_RecursivePluginDifferenctConcernWorkflowInstantiator.bind(l_RecursiveStubBaseWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_RecursivePluginDifferenctConcernWorkflowInstantiator.workflow);

        l_PluginInDifferentConcern_BaseWorkflowInstantiator.link();
        l_PluginInDifferentConcern_BaseWorkflowInstantiator.bind(l_Plugin_StepWillHaveStartPointNameWorkflowInstantiator,l_Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_PluginInDifferentConcern_BaseWorkflowInstantiator.workflow);

        l_Plugin_StepWillHaveStartPointNameWorkflowInstantiator.link();
        l_Plugin_StepWillHaveStartPointNameWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Plugin_StepWillHaveStartPointNameWorkflowInstantiator.workflow);

        l_Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator.link();
        l_Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Plugin_StepWillNotHaveStartPointNameWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}

