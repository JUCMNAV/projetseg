package jAoUrnToIw;

import ucm.map.Stub;

public class DynamicStubStrategy extends RegularStubStrategy {

	public DynamicStubStrategy(Stub stub) {
		super(stub);
	}
	
	@Override
	public String iwStubType() {	
		String result = "dynamic";
		
		/*if(stub.getAspect() != null){
			if(!stub.getAspect().equals(AspectKind.NONE)){
				result =  "aspectMarker";
		   }
		}*/
		if(stub.isSynchronizingStub()) {
			result = "dynamicSync";
		}
		else if(stub.isBlockingStub()) {
			result = "dynamicBlocking";
		}
		return result;
	}	
}
