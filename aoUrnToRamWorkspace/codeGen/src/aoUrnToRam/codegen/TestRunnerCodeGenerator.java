package aoUrnToRam.codegen;

import java.io.File;
import java.util.List;

public class TestRunnerCodeGenerator extends CodeGenerator {
	private File refFilePath;
	private String projectName;
	private File testSuiteDirectory;
	private String testSuitePrefix;
	private List<File> testCaseFiles;
	private File testRunnerFile;
	private String testRunnerClassName;
	
	private StringBuilder sb;

	public static void main(String[] args) {
		TestRunnerCodeGenerator codeGenerator = new TestRunnerCodeGenerator(
				args[0], args[1]);
		codeGenerator.generateTestRunnerFile();
	}

	public TestRunnerCodeGenerator(String testRunnerSiblingFilePath,
			String projectName) {
		refFilePath = new File(testRunnerSiblingFilePath);
		this.projectName = projectName;
		testSuiteDirectory=refFilePath.getParentFile();
		testSuitePrefix=firstLetterUpperCase(testSuiteDirectory.getName());
		testCaseFiles=getFilesWithExt(testSuiteDirectory, "TestCase.kmt");
		testRunnerClassName=testSuitePrefix+"_TestRunner";

		String testRunnerFilePath=FileUtil.combineFilePath(
				refFilePath.getParentFile()
				.getAbsolutePath(), "TestRunner.CodeGen.kmt"
		);
		testRunnerFile=new File(testRunnerFilePath);
	}
	
	public void generateTestRunnerFile() {
		String code = generateTestRunnerCode();
		FileUtil.overwriteFile(testRunnerFile, code);
	}

	public String generateTestRunnerCode() {
		sb = new StringBuilder();
		sb.append("@mainClass \"aoUrnToRam::test::"+testRunnerClassName+"\"");
		sb.append("\n@mainOperation \"runTestClassesWithReport\"");
		sb.append("\npackage aoUrnToRam::test;");
		sb.append("\n");
		sb.append("\n//To regenerate\n//Run: aoUrnToRam.codegen.TestRunnerCodeGenerator\n//Args: ${resource_loc} ${project_name}");
		sb.append("\n");
		sb.append("\nrequire kermeta");
		sb.append("\n");
		appendRequireStatements(sb,testCaseFiles,projectName);
		sb.append("\nrequire \"platform:/resource/aoUrnToRam/test/CustomTestRunner.kmt\"");
		sb.append("\n");
		sb.append("\nusing kermeta::standard");
		sb.append("\nusing kermeta::language::structure");
		sb.append("\n");
		sb.append("\nclass "+testRunnerClassName+" inherits CustomTestRunner");
		sb.append("\n{");
		sb.append("\n	method getTestClasses(): OrderedSet<Class> is do");
		sb.append("\n		result:=OrderedSet<Class>.new");
		appendAddTestCaseStatements();
		sb.append("\n	end");
		sb.append("\n}");

		return sb.toString();
	}
	
	private void appendAddTestCaseStatements() {
		for (File testCaseFile : testCaseFiles) {
			sb.append("\n");
			sb.append(getAddTestCaseStatement(testCaseFile));
		}
	}
	
	public String getAddTestCaseStatement(File testCaseFile) {
		String testCaseFileName=testCaseFile.getName();
		return 	"		result.add("+
				testSuitePrefix+
				"_"+
				testCaseFileName.substring(0,testCaseFileName.length()-4)+
				")";
	}
	
	private static String firstLetterUpperCase(String value){
		return value.substring(0,1).toUpperCase()+value.substring(1);
	}
}
