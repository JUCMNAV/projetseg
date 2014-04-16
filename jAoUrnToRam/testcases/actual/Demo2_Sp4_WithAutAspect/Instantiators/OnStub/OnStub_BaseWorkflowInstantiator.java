package Demo2_Sp4_WithAutAspect.Instantiators.OnStub;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class OnStub_BaseWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _S1=new StartupNode();
    public InputNode _I1=new InputNode();
    public EndNode _E1=new EndNode();
    public StubNode _TheStub=new StubNode();
    public StartupNode _S2=new StartupNode();
    public InputNode _I2=new InputNode();
    public EndNode _E2=new EndNode();
    public StubNode _AspectMarker1119=new StubNode();
    public StubNode _AspectMarker1120=new StubNode();
    public StubNode _AspectMarker1121=new StubNode();
    public StubNode _AspectMarker1122=new StubNode();
    public CustomizableNode _ProcessI1=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.I1_I2.ProcessI1");
    public CustomizableNode _ProcessI2=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.OnStub.I1_I2.ProcessI2");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _S1.addNextNode(_I1);
        _I1.addNextNode(_AspectMarker1119,"1");
        _TheStub.addNextNode("1",_AspectMarker1121,"1");
        _TheStub.addNextNode("2",_AspectMarker1122,"1");
        _S2.addNextNode(_I2);
        _I2.addNextNode(_AspectMarker1120,"1");
        _AspectMarker1119.addNextNode("1",_ProcessI1);
        _AspectMarker1120.addNextNode("1",_ProcessI2);
        _AspectMarker1121.addNextNode("1",_E1);
        _AspectMarker1122.addNextNode("1",_E2);
        _ProcessI1.addNextNode(_TheStub,"1");
        _ProcessI2.addNextNode(_TheStub,"2");
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_S1);
        workflow.addNode(_I1);
        workflow.addNode(_E1);
        workflow.addNode(_TheStub);
        workflow.addNode(_S2);
        workflow.addNode(_I2);
        workflow.addNode(_E2);
        workflow.addNode(_AspectMarker1119);
        workflow.addNode(_AspectMarker1120);
        workflow.addNode(_AspectMarker1121);
        workflow.addNode(_AspectMarker1122);
        workflow.addNode(_ProcessI1);
        workflow.addNode(_ProcessI2);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_S1,false);
        workflow.addStartupNode(_S2,false);
    }

    public void bind(Demo2_Sp4_WithAutAspect.Instantiators.OnStub.OnStub_PluginWorkflowInstantiator p_OnStub_Plugin,
                     Demo2_Sp4_WithAutAspect.Instantiators.OnStub.OnStub_AspectWorkflowInstantiator p_OnStub_Aspect){

        Binding TheStub_OnStub_Plugin_PluginBinding=new Binding(p_OnStub_Plugin.workflow);
        _TheStub.addBinding(TheStub_OnStub_Plugin_PluginBinding);
        _TheStub.addInBinding(TheStub_OnStub_Plugin_PluginBinding,"1",p_OnStub_Plugin._R10);
        _TheStub.addInBinding(TheStub_OnStub_Plugin_PluginBinding,"2",p_OnStub_Plugin._R11);
        _TheStub.addOutBinding(TheStub_OnStub_Plugin_PluginBinding,p_OnStub_Plugin._E10,"1");
        _TheStub.addOutBinding(TheStub_OnStub_Plugin_PluginBinding,p_OnStub_Plugin._E11,"2");

        Binding AspectMarker1119_OnStub_Aspect_PluginBinding=new Binding(p_OnStub_Aspect.workflow);
        _AspectMarker1119.addBinding(AspectMarker1119_OnStub_Aspect_PluginBinding);
        _AspectMarker1119.addInBinding(AspectMarker1119_OnStub_Aspect_PluginBinding,"1",p_OnStub_Aspect._AspectBefore100_1072);
        _AspectMarker1119.addOutBinding(AspectMarker1119_OnStub_Aspect_PluginBinding,p_OnStub_Aspect._ThePointcutStub_In1,"1");

        Binding AspectMarker1120_OnStub_Aspect_PluginBinding=new Binding(p_OnStub_Aspect.workflow);
        _AspectMarker1120.addBinding(AspectMarker1120_OnStub_Aspect_PluginBinding);
        _AspectMarker1120.addInBinding(AspectMarker1120_OnStub_Aspect_PluginBinding,"1",p_OnStub_Aspect._AspectBefore101_1089);
        _AspectMarker1120.addOutBinding(AspectMarker1120_OnStub_Aspect_PluginBinding,p_OnStub_Aspect._ThePointcutStub_In2,"1");

        Binding AspectMarker1121_OnStub_Aspect_PluginBinding=new Binding(p_OnStub_Aspect.workflow);
        _AspectMarker1121.addBinding(AspectMarker1121_OnStub_Aspect_PluginBinding);
        _AspectMarker1121.addInBinding(AspectMarker1121_OnStub_Aspect_PluginBinding,"1",p_OnStub_Aspect._AspectAfter100_913);
        _AspectMarker1121.addOutBinding(AspectMarker1121_OnStub_Aspect_PluginBinding,p_OnStub_Aspect._E100,"1");

        Binding AspectMarker1122_OnStub_Aspect_PluginBinding=new Binding(p_OnStub_Aspect.workflow);
        _AspectMarker1122.addBinding(AspectMarker1122_OnStub_Aspect_PluginBinding);
        _AspectMarker1122.addInBinding(AspectMarker1122_OnStub_Aspect_PluginBinding,"1",p_OnStub_Aspect._AspectAfter101_1118);
        _AspectMarker1122.addOutBinding(AspectMarker1122_OnStub_Aspect_PluginBinding,p_OnStub_Aspect._End101,"1");
    }
}

