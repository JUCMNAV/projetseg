package aoUrnToRam.javaExternalCall;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

//adapted from http://www.javapractices.com/topic/TopicAction.do?Id=78
public final class StackTraceUtil {
	  public static String getStackTrace(Throwable aThrowable) {
	    final Writer result = new StringWriter();
	    final PrintWriter printWriter = new PrintWriter(result);
	    aThrowable.printStackTrace(printWriter);
	    return result.toString();
	  }
}
