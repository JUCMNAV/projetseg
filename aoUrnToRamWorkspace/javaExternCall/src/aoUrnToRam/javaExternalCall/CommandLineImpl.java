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
	
	/*
	public static String exe(String command,String input) throws IOException{
		Process p = Runtime.getRuntime().exec(command);
		WriteOutputStream(p.getOutputStream(),input);
		//return ReadInputStream(new BufferedInputStream(p.getInputStream()));
		return "noOutput";
	}


	private static void WriteOutputStream(OutputStream ostream, String value) throws IOException{
		ostream.write(value.getBytes());
		ostream.close();
	}
	

	private static String ReadInputStream(InputStream is) throws IOException{
		String s = ""; //$NON-NLS-1$
        StringBuffer builder = new StringBuffer();
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            try {
                while ((s = reader.readLine()) != null)
                    builder.append(s + "\n"); //$NON-NLS-1$
            } finally 
            {
            		reader.close();
            }
        }

        return builder.toString();
	}*/
}
