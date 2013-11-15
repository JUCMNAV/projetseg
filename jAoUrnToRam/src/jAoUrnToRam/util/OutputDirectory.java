package jAoUrnToRam.util;

import java.io.File;

public class OutputDirectory {
	private String parent; //output root
	private String name;
	public String getName() {
		return name;
	}

	private String path;
	
	public String getPath() {
		return path;
	}
	
	public OutputDirectory() { }

	public OutputDirectory(String root, String name){
		this.parent = root; 
		this.name = name;
		path = "";
	}
	
	// create directory relative to aPath
	public String create(String aPath, String aName) {
		StringBuffer pathSb = new StringBuffer();
		pathSb.append(aPath);
		pathSb.append("\\");
		pathSb.append(aName);
			
		String path = pathSb.toString();
		createFile(path);
			
		return path;
	}
	
	/* create directory relative to path
	   pre: path must be set*/
	public String create(String aName) {
		String relativePath = create(path, aName);
			
		return relativePath;
	}

	//pre: modelName must be set
	public String create(){
		path = create(parent, name);
		
		return path;
	}
	
	private File createFile(String aPath) {
		File dir = new File(aPath);
		if(!dir.exists()){
			dir.mkdir();
		}
		return dir;
	}
}
