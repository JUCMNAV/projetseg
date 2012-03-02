package aoUrnToRam.javaExternalCall;

import java.io.IOException;
import java.io.OutputStream;

public class CommandLineImpl {
	
	//static class
	private CommandLineImpl(){}

	public static String exe(String command,String input) throws IOException{
		Process p = Runtime.getRuntime().exec(command);

		OutputStream ostream = p.getOutputStream();
        ostream.write(input.getBytes());
        ostream.close();

		//return ReadInputStream(new BufferedInputStream(p.getInputStream()));
		return "noOutput";
	}
}
