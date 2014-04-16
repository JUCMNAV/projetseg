package Demo2_Sp4_WithAutAspect.Instantiators.ExplicitAspectMarker;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class ExplicitAspectMarker_BaseWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _StartPoint1143=new StartupNode();
    public EndNode _EndPoint1145=new EndNode();
    public StubNode _AspectMarker1148=new StubNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _StartPoint1143.addNextNode(_AspectMarker1148,"1");
        _AspectMarker1148.addNextNode("1",_EndPoint1145);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_StartPoint1143);
        workflow.addNode(_EndPoint1145);
        workflow.addNode(_AspectMarker1148);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_StartPoint1143,false);
    }

    public void bind(Demo2_Sp4_WithAutAspect.Instantiators.ExplicitAspectMarker.ExplicitAspectMarker_AspectWorkflowInstantiator p_ExplicitAspectMarker_Aspect){

        Binding AspectMarker1148_ExplicitAspectMarker_Aspect_PluginBinding=new Binding(p_ExplicitAspectMarker_Aspect.workflow);
        _AspectMarker1148.addBinding(AspectMarker1148_ExplicitAspectMarker_Aspect_PluginBinding);
        _AspectMarker1148.addInBinding(AspectMarker1148_ExplicitAspectMarker_Aspect_PluginBinding,"1",p_ExplicitAspectMarker_Aspect._TheOrFork);
        _AspectMarker1148.addOutBinding(AspectMarker1148_ExplicitAspectMarker_Aspect_PluginBinding,p_ExplicitAspectMarker_Aspect._E10,"1");
    }
}

