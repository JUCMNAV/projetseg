package aoUrnToRam.javaExternalCall;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	
	//static class
	private Logger(){}

	public static void log(String msg){
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter("C:\\Users\\S\\Desktop\\outFromJava.txt",true));
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
