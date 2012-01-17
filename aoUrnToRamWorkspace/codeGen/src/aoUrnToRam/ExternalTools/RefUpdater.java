package aoUrnToRam.ExternalTools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class RefUpdater {
	static final String GeneratedCodeTag = "//|||GENERATED CODE BEYOND THIS POINT|||";

	public static void main(String[] args) {
		UpdateRef(new File(args[0]),args[1]);
	}

	public static void UpdateRef(File refFilePath, String projectName) {
		String manuallyEditedContent = getManuallyEditedContent(refFilePath);
		String generatedContent = generateRequireStatementsSection(refFilePath,projectName);
		overwriteFile(refFilePath,manuallyEditedContent+generatedContent);
	}

	public static String getManuallyEditedContent(File refFilePath) {
		String refFilePathContent = readFile(refFilePath.getAbsolutePath(),
				Charset.defaultCharset());
		
		if (refFilePathContent.contains(GeneratedCodeTag)) {
			int endIndex = refFilePathContent.indexOf(GeneratedCodeTag);
			return refFilePathContent.substring(0, endIndex);

		} else {
			return refFilePathContent;
		}
	}

	public static String generateRequireStatementsSection(File refFilePath,
			String projectName) {
		StringBuilder sb = new StringBuilder();
		sb.append(GeneratedCodeTag);
		sb
				.append("\n//To regenerate\n//Run: aoUrnToRam.ExternalTools.RefUpdater\n//Args: ${resource_loc} ${project_name}");
		appendRequireStatements(refFilePath, projectName, sb);
		return sb.toString();
	}

	public static void appendRequireStatements(File refFilePath,
			String projectName, StringBuilder sb) {
		List<File> files = new ArrayList<File>();
		addFilesWithExt(refFilePath.getParentFile(), ".kmt", files);

		// Useless to reference the refFile itself
		files.remove(refFilePath);

		for (File file : files) {
			sb.append("\n");
			sb.append(getRequireStatement(file, projectName));
		}
	}

	public static String getRequireStatement(File file, String projectName) {
		String filePathWithSlash = file.getAbsolutePath().replace('\\', '/');
		String regEx = ".*(" + projectName + ".*)";
		return filePathWithSlash.replaceFirst(regEx,
				"require \"platform:/resource/$1\"");
	}

	private static void addFilesWithExt(File dir, String extension,
			List<File> files) {
		for (File file : dir.listFiles()) {
			if (file.isFile()
					&& file.getName().toLowerCase().endsWith(extension)) {
				files.add(file);
			} else if (file.isDirectory()) {
				addFilesWithExt(file, extension, files);
			}
		}
	}

	// Adapted from
	// http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
	public static String readFile(String file, Charset cs) {
		try {
			// No real need to close the BufferedReader/InputStreamReader
			// as they're only wrapping the stream
			FileInputStream stream = new FileInputStream(file);
			try {
				Reader reader = new BufferedReader(new InputStreamReader(
						stream, cs));
				StringBuilder builder = new StringBuilder();
				char[] buffer = new char[8192];
				int read;
				while ((read = reader.read(buffer, 0, buffer.length)) > 0) {
					builder.append(buffer, 0, read);
				}
				return builder.toString();
			} finally {
				// Potential issue here: if this throws an IOException,
				// it will mask any others. Normally I'd use a utility
				// method which would log exceptions and swallow them
				stream.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void overwriteFile(File file, String content) {
		try {
			BufferedWriter out=null;
			try {
				out = new BufferedWriter(new FileWriter(file,false));
				out.write(content);
			} finally {
				if(out!=null){
					out.close();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
