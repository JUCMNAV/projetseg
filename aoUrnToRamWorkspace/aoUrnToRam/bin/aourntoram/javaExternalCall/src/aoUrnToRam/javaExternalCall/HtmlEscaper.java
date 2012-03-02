package aoUrnToRam.javaExternalCall;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class HtmlEscaper {
	public static RuntimeObject escape(RuntimeObject toEscape){
		try{
			java.lang.String result= HtmlEscaperImpl.escape(String.getValue(toEscape));
			return String.create(result,toEscape.getFactory());
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
			return String.create(null,toEscape.getFactory());
		}
	}
}