package jAoUrnToRam.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.core.runtime.FileLocator;

public class StringExtensions {
	public static String capitalizaFirtLetter(String aString){
		String result = "";
		result = aString.substring(0,1).toUpperCase() + aString.substring(1, aString.length());
		return result;
	}
	
	public static String replaceSpaceByUnderscore(String aString) { 
		String result = aString.trim();
		result = result.replaceAll("\\s","_");
		return result;
	}
	
	
	public static String windowsPathAppend(String aString, String toAppend) {
		String result = windowsPathWithoutPostSeparator(aString) +
				"\\"+ windowsPathWithoutPreSeparator(toAppend);
				
		return result;
	}
	
	public static String windowsPathParent(String aString) {
		String result = windowsPathWithoutPostSeparator(aString).replaceFirst("[^\\\\]+$","");
		return result;
	}
	
	
	public static String windowsPathWithoutPostSeparator(String aString) {
		String result = aString.replaceFirst("\\\\$","");
		return result;
	}
	
	public static String windowsPathWithoutPreSeparator(String aString) {
		//result:=self.replaceFirst("^\\\\","")
		String result = aString.replaceFirst("^\\\\","");
		return result;
	}
	
	//TODO
	public static String uriResolvePlateformUrl(String aString) throws MalformedURLException, IOException {
		//result ?= extern aoUrnToRam::javaExternalCall::PlateformUrlResolver.resolve(self) 
		String resolved=FileLocator.resolve(new URL(aString)).toString();
		
		return "";
	}
	
	public static String uriToWindowsPath(String aString) {
		String result = aString.replace("file:/","");
		result = result.replace("/","\\");
		return result;
	}
	
	public static String uriAppend(String aString, String toAppend) {
		String result = uriWithoutPostSeparator(aString)+
				"/"+ uriWithoutPreSeparator(toAppend);
		
		return result;
	}
	
	public static String uriParent(String aString) {
		String result = uriWithoutPostSeparator(aString).replaceFirst("[^/]+$","");
		return result;
	}
	
	public static String uriWithoutPostSeparator(String aString) {
		String result = aString.replaceFirst("/$","");
		return result;
	}
	
	public static String uriWithoutPreSeparator(String aString) {
		String result = aString.replaceFirst("^/","");
		return result;
	}
}
