package jAoUrnToRam.util;

import jucm_OneFileWorkaround.urncore.Component;
import jucm_OneFileWorkaround.urncore.ComponentKind;

public class ComponentUtil {
	public static boolean isSystem(Component aComponent){
		//if(aComponent.getKind() == ComponentKind.ACTOR)
		if(aComponent.getKind().equals(ComponentKind.ACTOR))
			return false;
		else {
			return recurseIncludingComponentIsSystem(aComponent);
		}
	}
	
	public static boolean recurseIncludingComponentIsSystem(Component aComponent) {
		if(aComponent.getIncludingComponent()==null) 
			return aComponent.getKind() !=ComponentKind.ACTOR;
		else
			return isSystem(aComponent.getIncludingComponent());
	}
}
