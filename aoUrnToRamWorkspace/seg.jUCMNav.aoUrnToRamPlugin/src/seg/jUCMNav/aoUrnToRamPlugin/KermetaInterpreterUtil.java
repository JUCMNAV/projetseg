package seg.jUCMNav.aoUrnToRamPlugin;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class KermetaInterpreterUtil {

	private KermetaInterpreterUtil(){}
	
	public static void exeKermeta(
		String kermetaFile, 
		String className,
		String operationName,
		String[] parameters,
		String[] requiredBundles,
		String consoleTile
	) {
		IOConsole console = new EclipseConsole(consoleTile);
		try {			
			exeKermeta(kermetaFile,className,operationName,parameters,requiredBundles,console);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
	
	private static void exeKermeta(
			String kermetaFile, 
			String className,
			String operationName,
			String[] parameters,
			String[] requiredBundles,
			IOConsole console
	) throws NotRegisteredURIException, URIMalformedException
	{
		Interpreter interpreter= new Interpreter(
					kermetaFile,
					InterpreterMode.CONSTRAINT_RUN, 
					null
			);
	    interpreter.setStreams(console);		
	    interpreter.setEntryPoint(className,operationName);
		interpreter.setParameters(parameters);
		setRequiredBundles(interpreter,requiredBundles);
		interpreter.launch();
	}
	
	private static void setRequiredBundles(Interpreter interpreter, String[] requiredBundles){
		URLClassLoader cl = new URLClassLoader(
				getRequiredBundleUrls(requiredBundles),
				interpreter.getClass().getClassLoader()
		);
		Thread.currentThread().setContextClassLoader(cl);//stle: watch out
	}
	
	private static URL[] getRequiredBundleUrls(String[] requiredBundles){
		List<URL> requiredBundleUrls = new ArrayList<URL>();
		for (String requiredBundle: requiredBundles) {
			Bundle bundle = Platform.getBundle(requiredBundle);
			requiredBundleUrls.add(getBundleUrl_Debug(bundle));
			requiredBundleUrls.add(getBundleUrl_Release(bundle));
		}
		return requiredBundleUrls.toArray(new URL[0]);
	}
	
	private static URL getBundleUrl_Debug(Bundle bundle){
		try {
			return FileLocator.resolve(bundle.getEntry("/bin/"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static URL getBundleUrl_Release(Bundle bundle){
		try {
			return FileLocator.resolve(bundle.getEntry("/"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}