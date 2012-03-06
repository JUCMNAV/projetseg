package aoUrnToRam.javaExternalCall;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.eclipse.core.runtime.Platform;

public class Logger {
	
	//static class
	private Logger(){}

	public static void log(String msg){
		BufferedWriter writer=null;
		try {
			String logFilePath = Platform.getLocation().append("aoUrnToRam.javaExternalCall.log").toOSString();
			writer=new BufferedWriter(new FileWriter(logFilePath,true));
			writer.write(new Date().toString()+":    "+ msg+"\n");
		} catch (IOException e) {
			//There is nothing we can do if the log fails
			throw new RuntimeException(e);
		}
		finally{
			if(writer!=null){
				try {
					writer.flush();
					writer.close();
				} catch (IOException e) {
					//There is nothing we can do if the log fails
					throw new RuntimeException(e);
				}
			}
		}
	}
}
