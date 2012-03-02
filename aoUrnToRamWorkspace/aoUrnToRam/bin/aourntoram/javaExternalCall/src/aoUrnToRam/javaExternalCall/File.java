package aoUrnToRam.javaExternalCall;

import java.net.URI;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class File {
	public static void removeDirectory_DirectoryUri(RuntimeObject directoryUri) {
		
		try{
			URI directoryAsUri = new URI(String.getValue(directoryUri));
			java.io.File directoryAsFile = new java.io.File(directoryAsUri);
			DirectoryRemover.removeDirectory(directoryAsFile);
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
		}
	}
}
