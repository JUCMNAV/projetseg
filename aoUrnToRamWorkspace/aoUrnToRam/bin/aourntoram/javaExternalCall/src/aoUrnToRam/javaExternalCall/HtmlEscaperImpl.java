package aoUrnToRam.javaExternalCall;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEscaperImpl {
	
	//static class
	private HtmlEscaperImpl(){}

	public static String escape(String toEscape){
		return StringEscapeUtils.escapeHtml4(toEscape);
	}
}
