package jAoUrnToIw;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStub;
import ucm.map.NodeConnection;
import ucm.map.Stub;

public abstract class StubStrategy {
	protected Stub stub;
	protected IwStub iwStub; 
	
	public Stub getStub() {
		return stub;
	}
	
	public IwStub getIwStub() {
		return iwStub;
	}
	
	public StubStrategy initialize(Stub stub) {
		this.stub = stub;
		return this;
	}

	public StubStrategy(Stub stub){
		this.stub = stub;
	}

	public abstract void build();
	public abstract void link();
	public abstract boolean hasNodes();
	public abstract IwNode setEntryNode(NodeConnection nodeConnection);
	public abstract IwNode setExitNode(NodeConnection nodeConnection);
}
