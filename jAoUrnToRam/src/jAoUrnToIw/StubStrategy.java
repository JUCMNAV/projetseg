package jAoUrnToIw;

import intermediateWorkflow.IwNode;
import ucm.map.NodeConnection;
import ucm.map.Stub;

public abstract class StubStrategy {
	protected Stub stub;
	
	public Stub getStub() {
		return stub;
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
