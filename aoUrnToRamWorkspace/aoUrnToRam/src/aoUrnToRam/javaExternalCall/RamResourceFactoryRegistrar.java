package aoUrnToRam.javaExternalCall;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class RamResourceFactoryRegistrar {
	public static void registerRamResourceFactoryIfNotAlreadyRegistered(RuntimeObject extension) {
		try{
			RamResourceFactoryRegistrarImpl.registerRamResourceFactoryIfNotAlreadyRegistered(String.getValue(extension));
		}
		catch(Exception ex){
			Logger.logError(ex);
		}
	}
	
	public static void unregisterRamResourceFactory(RuntimeObject extension) {
		try{
			RamResourceFactoryRegistrarImpl.unregisterRamResourceFactory(String.getValue(extension));
		}
		catch(Exception ex){
			Logger.logError(ex);
		}
	}
}
