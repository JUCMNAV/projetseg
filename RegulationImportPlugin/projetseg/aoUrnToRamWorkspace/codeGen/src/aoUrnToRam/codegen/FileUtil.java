package aoUrnToRam.codegen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileUtil {
	public static String readFile(String file) {
		return readFile(file,Charset.defaultCharset());
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

	public static void overwriteFile(String filePath, String content) {
		overwriteFile(new File(filePath),content);
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
	
	public static String combineFilePath(String filePath1,String filePath2) {
		String combinedFilePath=filePath1;
		if(combinedFilePath.endsWith("\\")==false){
			combinedFilePath+="\\";
		}
		combinedFilePath+=filePath2;
		return combinedFilePath;
	}

}
