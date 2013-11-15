package Demo2_Sp4_WithAutAspect;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import Demo2_Sp4_WithAutAspect.Instantiators.OnStub.OnStub_BaseWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.OnStub.OnStub_PluginWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.OnStub.OnStub_AspectWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.Replacement.Replacement_BaseWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.Replacement.Replacement_AspectWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.NotBound.NotBound_AspectWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.ExplicitAspectMarker.ExplicitAspectMarker_BaseWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.ExplicitAspectMarker.ExplicitAspectMarker_AspectWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.WithoutConcern.CaptureWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.WithoutConcern.AuthenticationWorkflowInstantiator;
import Demo2_Sp4_WithAutAspect.Instantiators.WithoutConcern.AuthenticateWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        OnStub_BaseWorkflowInstantiator l_OnStub_BaseWorkflowInstantiator=new OnStub_BaseWorkflowInstantiator();
        OnStub_PluginWorkflowInstantiator l_OnStub_PluginWorkflowInstantiator=new OnStub_PluginWorkflowInstantiator();
        OnStub_AspectWorkflowInstantiator l_OnStub_AspectWorkflowInstantiator=new OnStub_AspectWorkflowInstantiator();
        Replacement_BaseWorkflowInstantiator l_Replacement_BaseWorkflowInstantiator=new Replacement_BaseWorkflowInstantiator();
        Replacement_AspectWorkflowInstantiator l_Replacement_AspectWorkflowInstantiator=new Replacement_AspectWorkflowInstantiator();
        NotBound_AspectWorkflowInstantiator l_NotBound_AspectWorkflowInstantiator=new NotBound_AspectWorkflowInstantiator();
        ExplicitAspectMarker_BaseWorkflowInstantiator l_ExplicitAspectMarker_BaseWorkflowInstantiator=new ExplicitAspectMarker_BaseWorkflowInstantiator();
        ExplicitAspectMarker_AspectWorkflowInstantiator l_ExplicitAspectMarker_AspectWorkflowInstantiator=new ExplicitAspectMarker_AspectWorkflowInstantiator();
        CaptureWorkflowInstantiator l_CaptureWorkflowInstantiator=new CaptureWorkflowInstantiator();
        AuthenticationWorkflowInstantiator l_AuthenticationWorkflowInstantiator=new AuthenticationWorkflowInstantiator();
        AuthenticateWorkflowInstantiator l_AuthenticateWorkflowInstantiator=new AuthenticateWorkflowInstantiator();

        l_OnStub_BaseWorkflowInstantiator.link();
        l_OnStub_BaseWorkflowInstantiator.bind(l_OnStub_PluginWorkflowInstantiator,l_OnStub_AspectWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_OnStub_BaseWorkflowInstantiator.workflow);

        l_OnStub_PluginWorkflowInstantiator.link();
        l_OnStub_PluginWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_OnStub_PluginWorkflowInstantiator.workflow);

        l_OnStub_AspectWorkflowInstantiator.link();
        l_OnStub_AspectWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_OnStub_AspectWorkflowInstantiator.workflow);

        l_Replacement_BaseWorkflowInstantiator.link();
        l_Replacement_BaseWorkflowInstantiator.bind(l_Replacement_AspectWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_Replacement_BaseWorkflowInstantiator.workflow);

        l_Replacement_AspectWorkflowInstantiator.link();
        l_Replacement_AspectWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Replacement_AspectWorkflowInstantiator.workflow);

        l_NotBound_AspectWorkflowInstantiator.link();
        l_NotBound_AspectWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_NotBound_AspectWorkflowInstantiator.workflow);

        l_ExplicitAspectMarker_BaseWorkflowInstantiator.link();
        l_ExplicitAspectMarker_BaseWorkflowInstantiator.bind(l_ExplicitAspectMarker_AspectWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_ExplicitAspectMarker_BaseWorkflowInstantiator.workflow);

        l_ExplicitAspectMarker_AspectWorkflowInstantiator.link();
        l_ExplicitAspectMarker_AspectWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_ExplicitAspectMarker_AspectWorkflowInstantiator.workflow);

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
