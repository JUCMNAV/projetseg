package aoUrnToIw.test;

import ucm.map.MapFactory;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.UCMmap;
import urn.URNspec;
import urn.UrnFactory;
import urncore.Concern;
import urncore.IURNNode;
import urncore.URNdefinition;
import urncore.UrncoreFactory;

public class AoUrnTestFactory {

	public URNspec createUrnSpec() {
		URNspec urnSpec = UrnFactory.eINSTANCE.createURNspec();
		urnSpec.setName("TheUrnSpec");
		
		URNdefinition urnDefinition = createUrnDefinition();
		urnSpec.setUrndef(urnDefinition);
		
		return urnSpec;
	}
	
	/*operation createURNdefinition():URNdefinition is do
	result:=URNdefinition.new
	end*/
	public URNdefinition createUrnDefinition(){	
		URNdefinition urnDefinition = UrncoreFactory.eINSTANCE.createURNdefinition();
		
		return urnDefinition;
	}
	
	/*operation createUcmMap():UCMmap is do
		result:=UCMmap.new
		result.name:="TheUcmMap"
	end*/
	public UCMmap createUcmMap(){
		UCMmap ucmMap = MapFactory.eINSTANCE.createUCMmap();
		return ucmMap;
	}
	
	/*operation createUcmMap_UrnSpec(urnSpec:URNspec):UCMmap is do
		result:=createUcmMap
		urnSpec.urndef.specDiagrams.add(result)
	end*/
	
	public UCMmap createUcmMap_UrnSpec(URNspec urnSpec){
		UCMmap ucmMap = createUcmMap();
		urnSpec.getUrndef().getSpecDiagrams().add(ucmMap);
		
		return ucmMap;
	}
	
	/*operation createUcmMap_UrnSpec_Concern(urnSpec:URNspec,concern:Concern):UCMmap is do
		result:=createUcmMap_UrnSpec(urnSpec)
		result.concern:=concern
	end*/
	public UCMmap createUcmMap_UrnSpec_Concern(URNspec urnSpec, Concern concern){
		UCMmap ucmMap = createUcmMap_UrnSpec(urnSpec);
		ucmMap.setConcern(concern);
		
		return ucmMap;
	}
	
	/*operation createConcern():Concern is do
		result:=Concern.new
		result.name:="TheConcern"
	end*/
	public Concern createConcern(){
		Concern concern = UrncoreFactory.eINSTANCE.createConcern();
		concern.setName("TheConcern");
		
		return concern;
	}
	
	/*operation createConcern_UrnSpec(urnSpec:URNspec):Concern is do
		result:=createConcern
		urnSpec.urndef.concerns.add(result)
	end*/
	public Concern createConcern_UrnSpec(URNspec urnSpec) {
		Concern concern = createConcern();
		urnSpec.getUrndef().getConcerns().add(concern);
		
		return concern;
	}
	
	/*operation createNodeConnection():NodeConnection is do
		result:=NodeConnection.new
	end*/
	
	public NodeConnection createNodeConnection(){
		NodeConnection nodeConnection = MapFactory.eINSTANCE.createNodeConnection();
		return nodeConnection;
	}
	
	/*operation connectNodes(source:IURNNode,target:IURNNode):NodeConnection is do
		result:=createNodeConnection
		result.source:=source
		result.target:=target 
	end*/
	
	public NodeConnection connectNodes(IURNNode source, IURNNode target){
		NodeConnection nodeConnection = createNodeConnection();
		nodeConnection.setSource(source);
		nodeConnection.setTarget(target);
		
		return nodeConnection;
	}
	
	/*operation connectEndPointAsTarget(pathNode:PathNode):NodeConnection is do
		var target:PathNode init createEndPoint_UcmMap(pathNode.ucmMap)
		result:=connectNodes(pathNode,target)
	end*/
	public NodeConnection connectEndPointAsTarget(PathNode pathNode){
		/*PathNode target = createEndPoint_UcmMap(pathNode.getUCMmap());
		
		NodeConnection nodeConnection = connectNodes(pathNode, target);
		return nodeConnection;*/
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
