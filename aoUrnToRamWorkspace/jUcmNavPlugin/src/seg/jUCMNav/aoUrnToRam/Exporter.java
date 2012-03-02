package seg.jUCMNav.aoUrnToRam;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.ui.IWorkbenchPage;

import seg.jUCMNav.editors.UCMNavMultiPageEditor;
import seg.jUCMNav.extensionpoints.IURNExport;
import seg.jUCMNav.extensionpoints.IURNExportPrePostHooks;
import urn.URNspec;

public class Exporter implements IURNExport,IURNExportPrePostHooks {
	private String stleTemp_Workspace="file:///C:/";
	private String sourceAbsoluteFileUri;
	
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
    	//String destinationAbsoluteFolderUri=fileName;
    	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preHook(UCMNavMultiPageEditor editor) {
		sourceAbsoluteFileUri=stleTemp_Workspace+editor.getTitle();
	}
}