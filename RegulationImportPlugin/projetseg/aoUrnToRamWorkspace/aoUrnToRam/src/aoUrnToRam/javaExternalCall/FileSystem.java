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
			Logger.logError(ex);
		}
	}
	
	public static void createDirectory(RuntimeObject directoryUri) {
		try{
			FileSystemImpl.createDirectory(
					toFile(directoryUri)
			);
		}
		catch(Exception ex){
			Logger.logError(ex);
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
			Logger.logError(ex);
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
			Logger.logError(ex);
		}
	}
	
	private static File toFile(RuntimeObject uri) throws URISyntaxException{
		java.lang.String spaceEncoded = String.getValue(uri).replace(" ","%20");
		URI asUri = new URI(spaceEncoded);
		return new File(asUri);
	}

}
