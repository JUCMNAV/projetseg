package Simple.Instantiators.WithoutConcern;

import ram.reactiveworkflow.*;
import ram.workflow.*;

public class AllFeaturesWorkflowInstantiator extends WorkflowInstantiator{
    public Workflow workflow=new Workflow();
    public StartupNode _S1=new StartupNode();
    public EndNode _E1=new EndNode();
    public CustomizableNode _5=createCustomizableNode("Simple.Steps.WithoutConcern.TheInput.5");
    public CustomizableNode _4=createCustomizableNode("Simple.Steps.WithoutConcern.TheInput.4");
    public CustomizableNode _3=createCustomizableNode("Simple.Steps.WithoutConcern.TheInput.3");
    public CustomizableNode _2=createCustomizableNode("Simple.Steps.WithoutConcern.TheInput.2");
    public CustomizableNode _TheOutput=createCustomizableNode("Simple.Steps.WithoutConcern.TheInput.TheOutput");
    public InputNode _TheInput=new InputNode();
    public StartupNode _S2=new StartupNode();
    public CustomizableNode _StartOut=createCustomizableNode("Simple.Steps.WithoutConcern.S2.StartOut");
    public InputNode _StartIn=new InputNode();
    public CustomizableNode _EndOut=createCustomizableNode("Simple.Steps.WithoutConcern.StartIn.EndOut");
    public InputNode _EndIn=new InputNode();
    public EndNode _E2=new EndNode();
    public StartupNode _S3=new StartupNode();
    public InputNode _FirstIn=new InputNode();
    public EndNode _NoInputUntilTheEnd=new EndNode();
    public InputNode _SecondIn=new InputNode();
    public CustomizableNode _ProcessEndIn=createCustomizableNode("Simple.Steps.WithoutConcern.EndIn.ProcessEndIn");
    public CustomizableNode _ProcessFirstIn=createCustomizableNode("Simple.Steps.WithoutConcern.FirstIn.ProcessFirstIn");
    public CustomizableNode _ProcessSecondIn=createCustomizableNode("Simple.Steps.WithoutConcern.SecondIn.ProcessSecondIn");

    public void link(){
        linkNodesToNextNodes();
        linkNodesToWorkflow();
        linkStartNodesToWorkflow();
    }

    public void linkNodesToNextNodes(){
        _S1.addNextNode(_TheInput);
        _5.addNextNode(_TheOutput);
        _4.addNextNode(_5);
        _3.addNextNode(_4);
        _2.addNextNode(_3);
        _TheOutput.addNextNode(_E1);
        _TheInput.addNextNode(_2);
        _S2.addNextNode(_StartOut);
        _StartOut.addNextNode(_StartIn);
        _StartIn.addNextNode(_EndOut);
        _EndOut.addNextNode(_EndIn);
        _EndIn.addNextNode(_ProcessEndIn);
        _S3.addNextNode(_FirstIn);
        _FirstIn.addNextNode(_ProcessFirstIn);
        _SecondIn.addNextNode(_ProcessSecondIn);
        _ProcessEndIn.addNextNode(_E2);
        _ProcessFirstIn.addNextNode(_SecondIn);
        _ProcessSecondIn.addNextNode(_NoInputUntilTheEnd);
    }

    public void linkNodesToWorkflow(){
        workflow.addNode(_S1);
        workflow.addNode(_E1);
        workflow.addNode(_5);
        workflow.addNode(_4);
        workflow.addNode(_3);
        workflow.addNode(_2);
        workflow.addNode(_TheOutput);
        workflow.addNode(_TheInput);
        workflow.addNode(_S2);
        workflow.addNode(_StartOut);
        workflow.addNode(_StartIn);
        workflow.addNode(_EndOut);
        workflow.addNode(_EndIn);
        workflow.addNode(_E2);
        workflow.addNode(_S3);
        workflow.addNode(_FirstIn);
        workflow.addNode(_NoInputUntilTheEnd);
        workflow.addNode(_SecondIn);
        workflow.addNode(_ProcessEndIn);
        workflow.addNode(_ProcessFirstIn);
        workflow.addNode(_ProcessSecondIn);
    }

    public void linkStartNodesToWorkflow(){
        workflow.addStartupNode(_S1,false);
        workflow.addStartupNode(_S2,false);
        workflow.addStartupNode(_S3,false);
    }

    public void bind(){
    }
}

