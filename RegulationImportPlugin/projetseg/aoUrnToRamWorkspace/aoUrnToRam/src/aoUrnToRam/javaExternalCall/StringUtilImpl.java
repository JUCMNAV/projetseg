package aoUrnToRam.javaExternalCall;

public class StringUtilImpl {
	public static String replaceFirst(String str,String regex, String replacement){
		return str.replaceFirst(regex, replacement);
	}
	
	public static String replaceAll(String str,String regex, String replacement){
		return str.replaceAll(regex, replacement);
	}
	
	public static String trim(String str){
		return str.trim();
	}
}