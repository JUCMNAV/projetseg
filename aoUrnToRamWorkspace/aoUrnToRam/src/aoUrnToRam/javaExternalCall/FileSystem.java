package aoUrnToRam.javaExternalCall;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class FileSystem {
	public static void removeDirectory(RuntimeObject directoryUri) {
		try{
			DirectoryRemover.removeDirectory(
					toFile(directoryUri)
			);
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
		}
	}
	
	public static void copy(RuntimeObject srcUri,RuntimeObject destUri) {
		try{
			FileSystemImpl.copy(
					toFile(srcUri),
					toFile(destUri)
			);
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
		}
	}
	
	public static void rename(RuntimeObject srcUri,RuntimeObject destUri) {
		try{
			FileSystemImpl.rename(
					toFile(srcUri),
					toFile(destUri)
			);
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
		}
	}
	
	private static File toFile(RuntimeObject uri) throws URISyntaxException{
		URI asUri = new URI(String.getValue(uri));
		return new File(asUri);
	}

}
