package aoUrnToRam.javaExternalCall;

import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import ca.mcgill.cs.sel.ram.util.RamResourceFactoryImpl;

public class RamResourceFactoryRegistrarImpl {
	public static void registerRamResourceFactory(String extension) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(extension, new RamResourceFactoryImpl());
	}
}
