//stle: need to support 1 to many links

package aoUrnToRam.codegen;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jucm_OneFileWorkaround_Generator {
	private StringBuilder jucmPackage;

	public static void main(String[] args) {
		List<String> argList = new ArrayList<String>(Arrays.asList(args));
		String jucm_OneFileWorkaroundFilePath = argList.remove(argList.size()-1);
		String[] metamodelFilePaths=argList.toArray(new String[]{});
		
		Jucm_OneFileWorkaround_Generator generator = new Jucm_OneFileWorkaround_Generator();
		generator.mergeMetamodelsAsJucmSubPackagesIO(metamodelFilePaths,jucm_OneFileWorkaroundFilePath);
	}
	
//*********************************************************
//I/O
//*********************************************************/
	public void mergeMetamodelsAsJucmSubPackagesIO(String[] metamodelFilePaths,String jucm_OneFileWorkaroundFilePath){
		String[] metamodels=readMetamodels(metamodelFilePaths);
		String jucm_OneFileWorkaround=mergeMetamodelsAsJucmSubPackages(metamodels);
		FileUtil.overwriteFile(
				jucm_OneFileWorkaroundFilePath, 
				jucm_OneFileWorkaround
		);
	}
	
	private String[] readMetamodels(String[] metamodelFilePaths){
		List<String> metamodels=new ArrayList<String>();
		for (String metamodelFilePath : metamodelFilePaths) {
			metamodels.add(FileUtil.readFile(metamodelFilePath));
		}
		return metamodels.toArray(new String[]{});
	}
	
	
//*********************************************************
//Merging
//*********************************************************/
	public String mergeMetamodelsAsJucmSubPackages(String[] metamodels){
		jucmPackage= new StringBuilder();

		appendJucmPackagePre();
		appendSubPackages(metamodels);
		appendJucmPackagePost();
		
		removeEClassPrefix_fromAcrossFileReferences();
		adaptAcrossFileReferences();
		
		return jucmPackage.toString();
	}
	
	private void appendJucmPackagePre(){
		jucmPackage.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		jucmPackage.append("<ecore:EPackage\n");
		jucmPackage.append("    xmi:version=\"2.0\"\n");
		jucmPackage.append("    xmlns:xmi=\"http://www.omg.org/XMI\"\n");
		jucmPackage.append("    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
		jucmPackage.append("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\"\n");
		jucmPackage.append("    name=\"jucm_OneFileWorkaround\"\n");
		jucmPackage.append("    nsURI=\"http:///jucm_OneFileWorkaround.ecore\"\n");
		jucmPackage.append("    nsPrefix=\"jucm_OneFileWorkaround\"\n");
		jucmPackage.append(">\n");
	}
	
	private void appendSubPackages(String[] metamodels){
		for (String metamodel: metamodels) {
			jucmPackage.append(metamodelToSubPackage(metamodel));
		}
	}
	
	private String metamodelToSubPackage(String metamodel){
		String metamodelName=parseMetamodelName(metamodel);
		String withInternalReferencesAdapted=adaptInternalReferences(metamodel,metamodelName);
		return replacePackageWithSubPackage(withInternalReferencesAdapted,metamodelName);
	}

	private String replacePackageWithSubPackage(String metamodel,String metamodelName){
		Pattern pattern=Pattern.compile(".*?<ecore:EPackage.*?>(.*?)</ecore:EPackage>",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		Matcher matcher=pattern.matcher(metamodel);
		matcher.find();
		return matcher.replaceAll(	"<eSubpackages name=\""+metamodelName+"\" nsURI=\"http:///"+metamodelName+".ecore\" nsPrefix=\""+metamodelName+"\">"+
									"$1"+
									"</eSubpackages>");
	}
	
	private String adaptInternalReferences(String metamodel,String metamodelName){
		return metamodel.replace("(\"|\\s)#//", "\"#//"+metamodelName+"/");
	}
	
	private String parseMetamodelName(String metamodel){
		Pattern pattern=Pattern.compile("<ecore:EPackage.*?nsPrefix=\\\"(.+?)\\\"",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		Matcher matcher=pattern.matcher(metamodel);
		matcher.find();
		return matcher.group(1);
	}
	
	private void appendJucmPackagePost(){
		jucmPackage.append("\n</ecore:EPackage>\n");
	} 
	
	
	public void removeEClassPrefix_fromAcrossFileReferences(){
		Pattern pattern=Pattern.compile("(\\\")ecore:EClass\\s(.+?\\.ecore#//)",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(jucmPackage);
		jucmPackage=new StringBuilder(
						matcher.replaceAll("$1$2")
					);
	}
	
	public void adaptAcrossFileReferences(){
		Pattern pattern=Pattern.compile("([^\\\"]+)\\.ecore#//",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(jucmPackage);
		jucmPackage=new StringBuilder(
						matcher.replaceAll("#//$1/")
					);
	}
}


