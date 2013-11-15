package jAoUrnToRam.util;

public class OutputPath {
	private String parentPath;
	private String name;
	private String extension;
	
	private static final String DEFAULT_EXTENSION = ".xmi";
	
	public OutputPath(String parentPath, String name){
		this.parentPath = parentPath;
		this.name = name;
		this.extension = DEFAULT_EXTENSION;
	}
	
	public OutputPath(String parentPath, String name, String extension){
		this.parentPath = parentPath;
		this.name = name;
		this.extension = extension;
	}
	
	public String create(){
		StringBuffer pathSb = new StringBuffer();
		pathSb.append(parentPath);
		pathSb.append("\\");
		pathSb.append(name);
		pathSb.append(extension);
		
		String path = pathSb.toString();
		return path;
	}
}
