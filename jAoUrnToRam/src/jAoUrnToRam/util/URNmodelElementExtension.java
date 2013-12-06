package jAoUrnToRam.util;

import urncore.URNmodelElement;

public class URNmodelElementExtension {
	public static String getNameOrPrefixId(URNmodelElement source, String prefix){
		String name = source.getName();
		String result = "";
		if(name == null || name.equals(""))
			result = prefix + source.getId();
		else{
			result = name.trim();
			result = result.replaceAll("\\s", "_");
			result = result.substring(0,1).toUpperCase()+ result.substring(1,result.length()); 
		}
		return result;
	}
}
