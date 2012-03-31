package aoUrnToRam.javaExternalCall;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class CommandLine {
	public static RuntimeObject exe(RuntimeObject command,RuntimeObject input){
		try{
			Logger.log("Info: command:"+ String.getValue(command));
			Logger.log("Info: input:"+ String.getValue(input));
			
			java.lang.String result=CommandLineImpl.exe(String.getValue(command),String.getValue(input));
			Logger.log("Info: done:"+result);
			return String.create(result,command.getFactory());
			
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
			return String.create(null,command.getFactory());
		}
	}
}
