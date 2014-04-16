package Demo2_Sp4_WithAutAspect.Instantiators.Replacement;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class Replacement_BaseWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _S1=new StartupNode();
    public EndNode _E1=new EndNode();
    public CustomizableNode _ToBeReplaced_994=createCustomizableNode("Demo2_Sp4_WithAutAspect.Steps.Replacement.S1.ToBeReplaced");
    public StubNode _AspectMarker1039=new StubNode();
    public StubNode _AspectMarker1040=new StubNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _S1.addNextNode(_AspectMarker1039,"1");
        _ToBeReplaced_994.addNextNode(_AspectMarker1040,"1");
        _AspectMarker1039.addNextNode("1",_ToBeReplaced_994);
        _AspectMarker1040.addNextNode("1",_E1);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_S1);
        workflow.addNode(_E1);
        workflow.addNode(_ToBeReplaced_994);
        workflow.addNode(_AspectMarker1039);
        workflow.addNode(_AspectMarker1040);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_S1,false);
    }

    public void bind(Demo2_Sp4_WithAutAspect.Instantiators.Replacement.Replacement_AspectWorkflowInstantiator p_Replacement_Aspect){

        Binding AspectMarker1039_Replacement_Aspect_PluginBinding=new Binding(p_Replacement_Aspect.workflow);
        _AspectMarker1039.addBinding(AspectMarker1039_Replacement_Aspect_PluginBinding);
        _AspectMarker1039.addInBinding(AspectMarker1039_Replacement_Aspect_PluginBinding,"1",p_Replacement_Aspect._ReplAspect1);

        Binding AspectMarker1040_Replacement_Aspect_PluginBinding=new Binding(p_Replacement_Aspect.workflow);
        _AspectMarker1040.addBinding(AspectMarker1040_Replacement_Aspect_PluginBinding);
        _AspectMarker1040.addOutBinding(AspectMarker1040_Replacement_Aspect_PluginBinding,p_Replacement_Aspect._E10,"1");
    }
}

