package jAoUrnToRam.util;

import java.io.File;
import java.io.IOException;

public class ResourceDir {
	
	public static String getPath(String dirName){
		File directory = new File (".");
		
		StringBuffer pathSb = new StringBuffer();
		try {
			pathSb.append(directory.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pathSb.append("\\");
		pathSb.append(dirName);
		
		String path = pathSb.toString();
		
		return path;
	}
}
