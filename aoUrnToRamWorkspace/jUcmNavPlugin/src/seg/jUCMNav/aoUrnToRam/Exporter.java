package seg.jUCMNav.aoUrnToRam;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchPage;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

import seg.jUCMNav.editors.UCMNavMultiPageEditor;
import seg.jUCMNav.extensionpoints.IURNExport;
import seg.jUCMNav.extensionpoints.IURNExportPrePostHooks;
import urn.URNspec;

public class Exporter implements IURNExport,IURNExportPrePostHooks {
	private URI sourceAbsoluteFileUri;
	
    private FileOutputStream fos = null;
     

    /*
     * (non-Javadoc)
     * 
     * @see seg.jUCMNav.extensionpoints.IURNExport#export(urn.URNspec, java.io.FileOutputStream)
     */
    public void export(URNspec urn, HashMap mapDiagrams, FileOutputStream fos) throws InvocationTargetException {
    }

    /*
     * (non-Javadoc)
     * 
     * @see seg.jUCMNav.extensionpoints.IURNExport#export(urn.URNspec, java.lang.String)
     */
    public void export(URNspec urn, HashMap mapDiagrams, String filename) throws InvocationTargetException {
    	filename=workaround_UrnExport_ExtensionIsMandatory(filename); 
    	
    	transformAoUrnToRam(
    			sourceAbsoluteFileUri.toString(),
    			windowsAbsolutePath_To_AbsoluteFileUri(filename),
    			dotAbsoluteFileUri(),
    			imgAbsoluteFileUri()
    	);
    }
    
    public String workaround_UrnExport_ExtensionIsMandatory(String fileName){
    	return fileName.replaceFirst("\\.toBeRemoved$", "");
    }

    //stle:dry
    public Bundle aoUrnToRamBundle(){
    	return Platform.getBundle("aoUrnToRam");
    }

    public String dotAbsoluteFileUri(){
		try {
			return FileLocator.resolve(aoUrnToRamBundle().getEntry("/thirdParty/Graphviz2.26.3/bin/dot.exe")).toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
    }
    
    public String imgAbsoluteFileUri(){
		try {
			return FileLocator.resolve(aoUrnToRamBundle().getEntry("/img")).toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
    }
    
    //Stle:Dry
    public String windowsAbsolutePath_To_AbsoluteFileUri(String windowsAbsolutePath){
    	return "file:/"+windowsAbsolutePath.replace('\\', '/');
    } 
    
    public void hello(String fileName) throws InvocationTargetException{
        try {
            fos = new FileOutputStream(fileName);
            write("Hello World!");
        } catch (Exception e) {
            throw new InvocationTargetException(e);
        } finally {
            // close the stream
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    /**
     * Write the string to the file output stream.
     * 
     * @param s
     *            the string to write
     * @throws IOException
     */
    public void write(String s) throws IOException {
        if (s != null && s.length() > 0) {
            fos.write(s.getBytes());
        }
    }

	@Override
	public void postHook(IWorkbenchPage page) {
		//do nothing
	}

	@Override
	public void preHook(UCMNavMultiPageEditor editor) {
		sourceAbsoluteFileUri=editor.getInputRawLocationUri();
	}
	
	public static void transformAoUrnToRam(String sourceAbsoluteFileUri, String destinationAbsoluteFolderUri, String dotAbsoluteFileUri,String imgFolderAbsoluteFileUri)
	{
		exeKermetaWithConsole(
				"platform:/plugin/aoUrnToRam/kermeta/aoUrnToRam/AoUrnToRamTransformation.kmt",
				"aoUrnToRam::AoUrnToRamTransformation",
				"transform",
				new String[]{sourceAbsoluteFileUri,destinationAbsoluteFolderUri,dotAbsoluteFileUri,imgFolderAbsoluteFileUri},
				new String[]{"aoUrnToRam"},
				"AoUrnToRam"
		);
	}
	
	public static void exeKermetaWithConsole(
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
	
	public static void exeKermeta(
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
	
	public static void setRequiredBundles(Interpreter interpreter, String[] requiredBundles){
		URLClassLoader cl = new URLClassLoader(
				getRequiredBundleUrls(requiredBundles),
				interpreter.getClass().getClassLoader()
		);
		Thread.currentThread().setContextClassLoader(cl);//stle: watch out
	}
	
	public static URL[] getRequiredBundleUrls(String[] requiredBundles){
		List<URL> requiredBundleUrls = new ArrayList<URL>();
		for (String requiredBundle: requiredBundles) {
			Bundle bundle = Platform.getBundle(requiredBundle);
			requiredBundleUrls.add(getBundleUrl_Debug(bundle));
			requiredBundleUrls.add(getBundleUrl_Release(bundle));
		}
		return requiredBundleUrls.toArray(new URL[0]);
	}
	
	public static URL getBundleUrl_Debug(Bundle bundle){
		try {
			return FileLocator.resolve(bundle.getEntry("/bin/"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static URL getBundleUrl_Release(Bundle bundle){
		try {
			return FileLocator.resolve(bundle.getEntry("/"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}