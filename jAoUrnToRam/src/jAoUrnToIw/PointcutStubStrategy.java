package jAoUrnToIw;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IwEndPoint;
import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStartPoint;

import java.util.Hashtable;

import jucm_OneFileWorkaround.ucm.map.NodeConnection;
import jucm_OneFileWorkaround.ucm.map.Stub;

public class PointcutStubStrategy extends StubStrategy {
	private Hashtable<NodeConnection,IwEndPoint> iwEndPoints = new Hashtable<NodeConnection,IwEndPoint>();
	private Hashtable<NodeConnection,IwStartPoint> iwStartPoints  = new Hashtable<NodeConnection,IwStartPoint>();

	public PointcutStubStrategy(Stub stub){
		super(stub);
	}
	
	@Override
	public void build() {
		buildIwEndPoints();
		buildIwStartPoints();
		//if(!stub.isReplacementPointcutStub()) {
			
		//}
	}
    
    public void buildIwEndPoints() {
    	//iwEndPoints = new Hashtable<NodeConnection,IwEndPoint>();
    	Integer index = 1;
    	
    	for(NodeConnection nodeConnection : stub.predAsNodeConnection()){
    		IwEndPoint iwEndPoint = IntermediateWorkflowFactory.eINSTANCE.createIwEndPoint();
			iwEndPoint.setName(stub.stubNameOrPrefixId()+"_In"+index.toString());
			//System.out.println(iwEndPoint.getName());
			iwEndPoints.put(nodeConnection,iwEndPoint);
			index++;
    	}	
    }
    
    public void buildIwStartPoints() {
    	//iwStartPoints = new Hashtable<NodeConnection,IwStartPoint>();
    	
    	int index = 1;
    	for(NodeConnection nodeConnection : stub.succAsNodeConnection()){
    		iwStartPoints.put(nodeConnection,buildIwStartPoint(nodeConnection,index));
    		index++;
    	}	
    }
    
    public IwStartPoint buildIwStartPoint(NodeConnection nodeConnection,Integer index) {
    	IwStartPoint result = IntermediateWorkflowFactory.eINSTANCE.createIwStartPoint();
    	
    	result.setName(stub.stubNameOrPrefixId()+"_Out"+index.toString());
		if(nodeConnection.getInBindingsPlugin().size()>0) 
			result.setStartPointType("bound");
		else
			result.setStartPointType("global");
		
		return result;
    }

    @Override
	public void link() {
    	linkIwEndPointsToIwWorkflow();
		linkIwStartPointsToIwWorkflow();
    	//if(!stub.isReplacementPointcutStub()) {
    		
    	//}
	}
	
	public void linkIwStartPointsToIwWorkflow() {
		for(IwStartPoint iwStartPoint : iwStartPoints.values()){
			stub.getUCMmap().getIwWorkflow().getNodes().add(iwStartPoint);
			stub.getUCMmap().getIwWorkflow().getStartPoints().add(iwStartPoint);
		}
	}
	
	public void linkIwEndPointsToIwWorkflow() {
		if(stub.isReplacementPointcutStub()==false) {
			for(IwEndPoint iwEndPoint : iwEndPoints.values()){
				iwEndPoint.setWorkflow(stub.getUCMmap().getIwWorkflow());
			}
		} //else {
		//	System.out.println(stub.getName() + ": why my end points are not linked? ");
		//}
	}

	@Override
	public boolean hasNodes() {
		//if(stub.isReplacementPointcutStub())
			//return false;
		//else 
			return iwEndPoints.size()>0 || iwStartPoints.size()>0;
	}

	@Override
	public IwNode setEntryNode(NodeConnection nodeConnection) {
		return iwEndPoints.get(nodeConnection);
	}

	@Override
	public IwNode setExitNode(NodeConnection nodeConnection) {
		return iwStartPoints.get(nodeConnection);
	}
}
