package aoUrnToRam.javaExternalCall;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

public class PlateformUrlResolverImpl {
	public static String resolve(String plateformUrl) throws MalformedURLException, IOException{
		String resolved=FileLocator.resolve(new URL(plateformUrl)).toString();
		return resolved.replaceFirst("^file:", "file:/"); 
	}
}
