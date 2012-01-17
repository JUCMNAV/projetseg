package aoUrnToRam.javaExternalCall;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class File {
	public static void removeDirectory(RuntimeObject directory) {
		try{
			java.io.File directoryAsFile = new java.io.File(String.getValue(directory));
			FileImpl.removeDirectory(directoryAsFile);
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
		}
	}
}
