//As is from: http://www.java2s.com/Tutorial/Java/0180__File/Removeadirectoryandallofitscontents.htm
package aoUrnToRam.javaExternalCall;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSystemImpl {
	//adapted from http://www.mkyong.com/java/how-to-copy-directory-in-java/
	public static void copy(File src, File dest) throws IOException{
		if(src.isDirectory()){
			createDirectory(dest);
		
			//list all the directory contents
			String files[] = src.list();
		
			for (String file : files) {
			   //construct the src and dest file structure
			   File srcFile = new File(src, file);
			   File destFile = new File(dest, file);
			   //recursive copy
			   copy(srcFile,destFile);
			}
		
		}else{
			//if file, then copy it
			//Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
		        OutputStream out = new FileOutputStream(dest); 
		
		        byte[] buffer = new byte[1024];
		
		        int length;
		        //copy the file content in bytes 
		        while ((length = in.read(buffer)) > 0){
		    	   out.write(buffer, 0, length);
		        }
		
		        in.close();
		        out.close();
		}
	}
	
	public static void rename(File src, File dest){
		src.renameTo(dest);
	}
	
	public static void createDirectory(File dir){
		if(!dir.exists()){
		   dir.mkdirs();
		}
	}

}