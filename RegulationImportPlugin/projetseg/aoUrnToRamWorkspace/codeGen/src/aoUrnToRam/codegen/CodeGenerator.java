package aoUrnToRam.codegen;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class CodeGenerator {

	public void appendRequireStatements(StringBuilder sb, List<File> files, String projectName) {
		for (File file : files) {
			sb.append("\n");
			sb.append(getRequireStatement(file, projectName));
		}
	}
	
	public String getRequireStatement(File file, String projectName) {
		String filePathWithSlash = file.getAbsolutePath().replace('\\', '/');
		String regEx = ".*/(" + projectName + "/.*)";
		return filePathWithSlash.replaceFirst(regEx,
				"require \"platform:/lookup/$1\"");
	}

	public List<File> getFilesWithExt(File dir, String suffix) {
		List<File> result=new ArrayList<File>();
		addFilesWithExt(dir,suffix,result);
		return result;
	}
	
	public void addFilesWithExt(File dir, String suffix,List<File> files) {
		for (File file : dir.listFiles()) {
			if (file.isFile()
					&& file.getName().toLowerCase().endsWith(suffix.toLowerCase())) {
				files.add(file);
			} else if (file.isDirectory()) {
				addFilesWithExt(file, suffix, files);
			}
		}
	}
}
