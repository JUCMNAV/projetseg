package Simple.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class SimpleWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _StartPoint21=new StartupNode();
    public EndNode _EndPoint23=new EndNode();
    public InputNode _In=new InputNode();
    public CustomizableNode _Processing=createCustomizableNode("Simple.Steps.WithoutConcern.In.Processing");
    public CustomizableNode _Out=createCustomizableNode("Simple.Steps.WithoutConcern.In.Out");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _StartPoint21.addNextNode(_In);
        _In.addNextNode(_Processing);
        _Processing.addNextNode(_Out);
        _Out.addNextNode(_EndPoint23);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_StartPoint21);
        workflow.addNode(_EndPoint23);
        workflow.addNode(_In);
        workflow.addNode(_Processing);
        workflow.addNode(_Out);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_StartPoint21,false);
    }

    public void bind(){
    }
}

