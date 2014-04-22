package Demo2_Sp4_WithAutAspect.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class CaptureWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public ConditionalExecutionNode _OrFork70=new ConditionalExecutionNode();
    public EndNode _Captured=new EndNode();
    public StartupNode _Capture=new StartupNode();
    public CustomizableNode _ValidateWitnessInfo=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.WithoutConcern.CaptureLocationType_ValidateWitness.ValidateWitnessInfo");
    public CustomizableNode _PhoneDataRequest=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.WithoutConcern.CaptureWitnessInfo.PhoneDataRequest");
    public InputNode _ValidateWitness=new InputNode();
    public CustomizableNode _FakeCrisisNotification=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.WithoutConcern.CaptureLocationType_ValidateWitness.FakeCrisisNotification");
    public EndNode _FakeCrisis=new EndNode();
    public InputNode _CaptureWitnessInfo=new InputNode();
    public CustomizableNode _CrisisInfoRequest=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.WithoutConcern.CaptureWitnessInfo.CrisisInfoRequest");
    public InputNode _CaptureLocationType=new InputNode();
    public StubNode _AspectMarker812=new StubNode();
    public StubNode _AspectMarker813=new StubNode();
    public StubNode _AspectMarker814=new StubNode();
    public ParallelExecutionNode _AndFork1180=new ParallelExecutionNode();
    public SynchronizationNode _AndJoin1188=new SynchronizationNode();
    public CustomizableNode _ProcessCaptureWitnessInfo=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.WithoutConcern.CaptureWitnessInfo.ProcessCaptureWitnessInfo");
    public CustomizableNode _ProcessCaptureLocationType=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.WithoutConcern.CaptureLocationType_ValidateWitness.ProcessCaptureLocationType");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _OrFork70.addNextNode("witnessInfoNotVerified",_FakeCrisisNotification);
        _OrFork70.addNextNode("else",_Captured);
        _Capture.addNextNode(_CaptureWitnessInfo);
        _ValidateWitnessInfo.addNextNode(_AndJoin1188);
        _PhoneDataRequest.addNextNode(_ValidateWitness);
        _ValidateWitness.addNextNode(_AspectMarker813,"AspectMarker813_IN1");
        _FakeCrisisNotification.addNextNode(_FakeCrisis);
        _CaptureWitnessInfo.addNextNode(_AspectMarker812,"AspectMarker812_IN1");
        _CrisisInfoRequest.addNextNode(_CaptureLocationType);
        _CaptureLocationType.addNextNode(_AspectMarker814,"AspectMarker814_IN1");
        _AspectMarker812.addNextNode("_OUT1",_ProcessCaptureWitnessInfo);
        _AspectMarker813.addNextNode("_OUT1",_ValidateWitnessInfo);
        _AspectMarker814.addNextNode("_OUT1",_ProcessCaptureLocationType);
        _AndFork1180.addNextNode(_PhoneDataRequest);
        _AndFork1180.addNextNode(_CrisisInfoRequest);
        _AndJoin1188.addNextNode(_OrFork70);
        _ProcessCaptureWitnessInfo.addNextNode(_AndFork1180);
        _ProcessCaptureLocationType.addNextNode(_AndJoin1188);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_OrFork70);
        workflow.addNode(_Captured);
        workflow.addNode(_Capture);
        workflow.addNode(_ValidateWitnessInfo);
        workflow.addNode(_PhoneDataRequest);
        workflow.addNode(_ValidateWitness);
        workflow.addNode(_FakeCrisisNotification);
        workflow.addNode(_FakeCrisis);
        workflow.addNode(_CaptureWitnessInfo);
        workflow.addNode(_CrisisInfoRequest);
        workflow.addNode(_CaptureLocationType);
        workflow.addNode(_AspectMarker812);
        workflow.addNode(_AspectMarker813);
        workflow.addNode(_AspectMarker814);
        workflow.addNode(_AndFork1180);
        workflow.addNode(_AndJoin1188);
        workflow.addNode(_ProcessCaptureWitnessInfo);
        workflow.addNode(_ProcessCaptureLocationType);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_Capture,false);
    }

    public void bind(Demo2_Sp4_WithAutAspect.Instantiators.WithoutConcern.AuthenticationWorkflowInstantiator p_Authentication){

        Binding AspectMarker812_Authentication_PluginBinding=new Binding(p_Authentication.workflow);
        _AspectMarker812.addBinding(AspectMarker812_Authentication_PluginBinding);
        _AspectMarker812.addInBinding(AspectMarker812_Authentication_PluginBinding,"AspectMarker812_IN1",p_Authentication._IsAlreadyAuthenticated);
        _AspectMarker812.addOutBinding(AspectMarker812_Authentication_PluginBinding,p_Authentication._AuthenticationVerified,"AspectMarker812_OUT1");

        Binding AspectMarker813_Authentication_PluginBinding=new Binding(p_Authentication.workflow);
        _AspectMarker813.addBinding(AspectMarker813_Authentication_PluginBinding);
        _AspectMarker813.addInBinding(AspectMarker813_Authentication_PluginBinding,"AspectMarker813_IN1",p_Authentication._IsAlreadyAuthenticated);
        _AspectMarker813.addOutBinding(AspectMarker813_Authentication_PluginBinding,p_Authentication._AuthenticationVerified,"AspectMarker813_OUT1");

        Binding AspectMarker814_Authentication_PluginBinding=new Binding(p_Authentication.workflow);
        _AspectMarker814.addBinding(AspectMarker814_Authentication_PluginBinding);
        _AspectMarker814.addInBinding(AspectMarker814_Authentication_PluginBinding,"AspectMarker814_IN1",p_Authentication._IsAlreadyAuthenticated);
        _AspectMarker814.addOutBinding(AspectMarker814_Authentication_PluginBinding,p_Authentication._AuthenticationVerified,"AspectMarker814_OUT1");
    }
}

