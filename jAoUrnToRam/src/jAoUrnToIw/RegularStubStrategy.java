package jAoUrnToIw;

import ucm.map.AspectKind;
import ucm.map.NodeConnection;
import ucm.map.PluginBinding;
import ucm.map.Stub;
import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStub;

public class RegularStubStrategy extends StubStrategy  {
	
	
	public IwStub getIwStub() {
		return iwStub;
	}
	
	public RegularStubStrategy(Stub stub) {
		super(stub);
	}

	@Override
	public void build() {
		iwStub = IntermediateWorkflowFactory.eINSTANCE.createIwStub();
		iwStub.setStubType(iwStubType());
		
		if(iwStubType().equals("aspectMarker")) 
			iwStub.setName("AspectMarker"+stub.getId());
		else {
			iwStub.setName(stub.stubNameOrPrefixId());
		}
		for(PluginBinding pb : stub.getBindings())
			pb.build();
	}
	
	@Override
	public void link() {
		iwStub.setWorkflow(stub.getUCMmap().getIwWorkflow());
		initStubEntryIndexes();
		initStubExitIndexes();
		
		for(PluginBinding pluginBinding : stub.getBindings())
			pluginBinding.link();
	}

	public void initStubEntryIndexes() {
		Integer stubEntryIndex = 1;
		for(NodeConnection stubEntry : stub.predAsNodeConnection()){
			stubEntry.initStubEntryIndex(stubEntryIndex);
			stubEntryIndex++;
		}	
	}
	
	public void initStubExitIndexes() {
		Integer nextIndex = 1;
		for(NodeConnection nodeConnection : stub.succAsNodeConnection()){
			nodeConnection.getIwNodeConnection().setStubExitIndexAsString(nextIndex.toString());
			nextIndex++;
		}
	}
	
	@Override
	public boolean hasNodes() {
		return true;
	}

	@Override
	public IwNode setEntryNode(NodeConnection nodeConnection){
		return iwStub;
	}

	@Override
	public IwNode setExitNode(NodeConnection nodeConnection) {
		return iwStub;
	}
    
    public String iwStubType() {	
		String result = "static";
    	if(stub.getAspect() != null){
			if(!stub.getAspect().equals(AspectKind.NONE)){
				result =  "aspectMarker";
			}
		}	
		return result;
	}
}