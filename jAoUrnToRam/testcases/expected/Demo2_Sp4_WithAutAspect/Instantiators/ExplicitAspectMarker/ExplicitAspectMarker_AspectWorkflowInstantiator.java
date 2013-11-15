package Demo2_Sp4_WithAutAspect.Instantiators.ExplicitAspectMarker;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class ExplicitAspectMarker_AspectWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public EndNode _E10=new EndNode();
    public ConditionalExecutionNode _TheOrFork=new ConditionalExecutionNode();
    public EndNode _E11=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _TheOrFork.addNextNode("false",_E10);
        _TheOrFork.addNextNode("true",_E11);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_E10);
        workflow.addNode(_TheOrFork);
        workflow.addNode(_E11);
    }

    public void linkStartNodesToWorkflow(){
    }

    public void bind(){
    }
}
