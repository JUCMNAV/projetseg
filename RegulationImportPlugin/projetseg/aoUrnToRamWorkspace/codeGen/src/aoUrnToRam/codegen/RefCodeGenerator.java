package aoUrnToRam.codegen;

import java.io.File;
import java.util.List;

public class RefCodeGenerator extends CodeGenerator {
	static final String GeneratedCodeTag = "//|||GENERATED CODE BEYOND THIS POINT|||";
	private File refFilePath;
	private String projectName;

	public static void main(String[] args) {
		RefCodeGenerator codeGenerator = new RefCodeGenerator(
				args[0], args[1]);
		codeGenerator.updateRef();
	}

	public RefCodeGenerator(String refSiblingFilePath,String projectName) {
		refFilePath = new File(refSiblingFilePath);
		this.projectName = projectName;
	}

	public void updateRef() {
		StringBuilder sb= new StringBuilder();
		sb.append(getManuallyEditedContent());
		appendRequireStatementsSection(sb);
		FileUtil.overwriteFile(refFilePath,sb.toString());
	}

	public String getManuallyEditedContent() {
		String refFilePathContent = FileUtil.readFile(refFilePath.getAbsolutePath());
		
		if (refFilePathContent.contains(GeneratedCodeTag)) {
			int endIndex = refFilePathContent.indexOf(GeneratedCodeTag);
			return refFilePathContent.substring(0, endIndex);

		} else {
			return refFilePathContent;
		}
	}

	public void appendRequireStatementsSection(StringBuilder sb) {
		sb.append(GeneratedCodeTag);
		sb.append("\n//To regenerate\n//Run: aoUrnToRam.codegen.RefCodeGenerator\n//Args: ${resource_loc} ${project_name}");
		List<File> requiredFiles=getFilesWithExt(refFilePath.getParentFile(), ".kmt");
		appendRequireStatements(sb,requiredFiles,projectName);
	}
}
