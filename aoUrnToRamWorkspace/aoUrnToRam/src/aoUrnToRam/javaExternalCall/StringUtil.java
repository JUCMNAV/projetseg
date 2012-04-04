package aoUrnToRam.javaExternalCall;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class StringUtil {
	public static RuntimeObject replaceFirst(RuntimeObject str,RuntimeObject regex, RuntimeObject replacement){
		try{
			java.lang.String result=StringUtilImpl.replaceFirst(
					String.getValue(str),
					String.getValue(regex),
					String.getValue(replacement)
			);
			return String.create(result,str.getFactory());
		}
		catch(Exception ex){
			Logger.logError(ex);
			return String.create(null,str.getFactory());
		}
	}
}
