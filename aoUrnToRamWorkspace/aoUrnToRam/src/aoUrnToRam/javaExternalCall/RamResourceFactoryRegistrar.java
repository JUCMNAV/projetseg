package aoUrnToRam.javaExternalCall;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class RamResourceFactoryRegistrar {
	public static void registerRamResourceFactory(RuntimeObject extension) {
		try{
			RamResourceFactoryRegistrarImpl.registerRamResourceFactory(String.getValue(extension));
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
		}
	}
}
