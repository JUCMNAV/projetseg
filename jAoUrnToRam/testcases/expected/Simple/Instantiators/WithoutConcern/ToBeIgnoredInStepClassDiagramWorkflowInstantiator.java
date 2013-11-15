package Simple.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class ToBeIgnoredInStepClassDiagramWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _StartPoint37=new StartupNode();
    public EndNode _EndPoint39=new EndNode();

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _StartPoint37.addNextNode(_EndPoint39);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_StartPoint37);
        workflow.addNode(_EndPoint39);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_StartPoint37,false);
    }

    public void bind(){
    }
}
