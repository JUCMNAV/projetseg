package seg.jUCMNav.aoUrnToRamPlugin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.HashMap;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.osgi.framework.Bundle;

import seg.jUCMNav.editors.UCMNavMultiPageEditor;
import seg.jUCMNav.extensionpoints.IURNExport;
import seg.jUCMNav.extensionpoints.IURNExportPrePostHooks;
import urn.URNspec;

public class Exporter implements IURNExport,IURNExportPrePostHooks {
	private URI sourceAbsoluteFileUri;
	
	// ****************************************************************
	// IURNExport
	// ****************************************************************
    public void export(URNspec urn, HashMap mapDiagrams, String filename) throws InvocationTargetException {
    	filename=workaround_UrnExport_ExtensionIsMandatory(filename); 
    	
    	transformAoUrnToRam(
    			sourceAbsoluteFileUri.toString(),
    			windowsAbsolutePath_To_AbsoluteFileUri(filename)
    	);
    }
    
    public String workaround_UrnExport_ExtensionIsMandatory(String fileName){
    	return fileName.replaceFirst("\\.toBeRemoved$", "");
    }
    
    public String windowsAbsolutePath_To_AbsoluteFileUri(String windowsAbsolutePath){
    	return "file:/"+windowsAbsolutePath.replace('\\', '/');
    } 

	public void export(URNspec urn, HashMap mapDiagrams, FileOutputStream fos) throws InvocationTargetException {
    }
	
	// ****************************************************************
	// IURNExportPrePostHooks
	// ****************************************************************
	@Override
	public void postHook(IWorkbenchPage page) {
		//do nothing
	}

	@Override
	public void preHook(UCMNavMultiPageEditor editor) {
		sourceAbsoluteFileUri=editor.getInputRawLocationUri();
		saveSource(editor);
	}
	
	private void saveSource(final UCMNavMultiPageEditor editor){
		Display display = editor.getSite().getShell().getDisplay();
		display.asyncExec(
			new Runnable() {
				public void run() {
					editor.doSave(new NullProgressMonitor());
				}
			}
		);
	}

	// ****************************************************************
	// transformAoUrnToRam
	// ****************************************************************
	public void transformAoUrnToRam(String sourceAbsoluteFileUri, String destinationAbsoluteFolderUri)
	{
		KermetaInterpreterUtil.exeKermeta(
				"platform:/plugin/aoUrnToRam/kermeta/aoUrnToRam/AoUrnToRamTransformation_TempDemo.kmt",
				"aoUrnToRam::AoUrnToRamTransformation_TempDemo",
				"transform",
				new String[]{
						sourceAbsoluteFileUri,
						destinationAbsoluteFolderUri,
						dotAbsoluteFileUri(),
						imgAbsoluteFileUri(),
						"false",
						"false"
				},
				new String[]{"aoUrnToRam"},
				"AoUrnToRam"
		);
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
    
    public Bundle aoUrnToRamBundle(){
    	return Platform.getBundle("aoUrnToRam");
    }

}