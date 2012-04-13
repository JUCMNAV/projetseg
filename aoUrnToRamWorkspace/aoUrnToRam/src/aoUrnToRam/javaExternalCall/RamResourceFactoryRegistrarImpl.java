package aoUrnToRam.javaExternalCall;

import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import ca.mcgill.cs.sel.ram.util.RamResourceFactoryImpl;

public class RamResourceFactoryRegistrarImpl {
	public static void registerRamResourceFactoryIfNotAlreadyRegistered(String extension) {
		//It Would be better if we could access the local registry used by Kermeta
		//However, after a significant effort, we concludes that it is at least
		//not obvious to do so. Thus, we have to rely on the GLOBAL registry
		//shared by all applications. 
		
		Map<String, Object> factoryMap = getGlobalFactoryMap();
        if(factoryMap.containsKey(extension)==false){
        	factoryMap.put(extension, new RamResourceFactoryImpl());
        }
	}
	
	public static void unregisterRamResourceFactory(String extension) {
        Map<String, Object> factoryMap = getGlobalFactoryMap();
        factoryMap.remove(extension);
        Logger.log("r");
	}

	private static Map<String, Object> getGlobalFactoryMap() {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
        return registry.getExtensionToFactoryMap();
	}
}
