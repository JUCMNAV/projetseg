package aoUrnToRam.javaExternalCall;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class PlateformUrlResolver {
	public static RuntimeObject resolve(RuntimeObject plateformUrl){
		try{
			java.lang.String result=PlateformUrlResolverImpl.resolve(String.getValue(plateformUrl));
			return String.create(result,plateformUrl.getFactory());
		}
		catch(Exception ex){
			Logger.log("Error:"+ ex.toString());
			return String.create(null,plateformUrl.getFactory());
		}
	}
}
