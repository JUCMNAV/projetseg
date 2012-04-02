package aoUrnToRam.codegen;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jucm_OneFileWorkaround_Generator {
	private StringBuilder jucmPackage;
	private String workspaceDirectoryPath;

	public static void main(String[] args) {
		Jucm_OneFileWorkaround_Generator generator = new Jucm_OneFileWorkaround_Generator(args[0]);
		generator.generate();
	}
	
	public void generate(){
		mergeMetamodelsAsJucmSubPackagesIO(
				new String[]{
						resolve("seg.jUCMNav\\src\\seg\\jUCMNav\\emf\\grl.ecore")
				},
				resolve("aoUrnToRam\\metamodel\\jucm_OneFileWorkaround.ecore")
				);
	}
	
	public Jucm_OneFileWorkaround_Generator(String workspaceDirectoryPath){
		this.workspaceDirectoryPath=workspaceDirectoryPath+"\\";
	} 
	
	private String resolve(String relativeFilePath){
		return workspaceDirectoryPath+relativeFilePath;
	}
//*********************************************************
//I/O
//*********************************************************/
	public void mergeMetamodelsAsJucmSubPackagesIO(String[] metamodelFilePaths,String jucm_OneFileWorkaroundFilePath){
		System.out.println(jucm_OneFileWorkaroundFilePath);
		
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
		removeAcrossFileReferences();
		
		return jucmPackage.toString();
	}
	
	private void appendJucmPackagePre(){
		jucmPackage.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		jucmPackage.append("<ecore:EPackage\n");
		jucmPackage.append("    xmi:version=\"2.0\"\n");
		jucmPackage.append("    xmlns:xmi=\"http://www.omg.org/XMI\"\n");
		jucmPackage.append("    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
		jucmPackage.append("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\"\n");
		jucmPackage.append("    name=\"oneurn\"\n");
		jucmPackage.append("    nsURI=\"http:///oneurn.ecore\"\n");
		jucmPackage.append("    nsPrefix=\"oneurn\\n");
		jucmPackage.append(">\n");
	}
	
	private void appendSubPackages(String[] metamodels){
		for (String metamodel: metamodels) {
			jucmPackage.append(metamodelToSubPackage(metamodel));
		}
	}
	
	public String metamodelToSubPackage(String metamodel){
		Pattern pattern=Pattern.compile(".*?<ecore:EPackage.*?nsPrefix=\\\"(.+?)\\\".*?>(.*?)</ecore:EPackage>",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		Matcher matcher=pattern.matcher(metamodel);
		return matcher.replaceAll(	"<eSubpackages name=\"$1\" nsURI=\"http:///$1.ecore\" nsPrefix=\"$1\">\n"+
									"$2\n"+
									"</eSubpackages>");
	}
	
	private void appendJucmPackagePost(){
		jucmPackage.append("\n</ecore:EPackage>\n");
	} 
	
	
	public void removeAcrossFileReferences(){
		Pattern pattern=Pattern.compile("([^\\\"|\\s]+)\\.ecore#//",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(jucmPackage);
		jucmPackage=new StringBuilder(
						matcher.replaceAll("#//$1/")
					);
	}
}


