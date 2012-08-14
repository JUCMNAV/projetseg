package aoUrnToRam.javaExternalCall;

import java.util.Date;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

public class Timer {
	
	private static Date start;
	
	//static class
	private Timer(){}

	public static void start(){
		start = new Date();
	}
	
	public static RuntimeObject stop(RuntimeObject noParam){
		//Don't know how to get a handle on the factory without param
		RuntimeObjectFactory factory=noParam.getFactory();
		
		long timeSpanMili=new Date().getTime()-start.getTime();
		long timeSpanSec=timeSpanMili/1000;
		int numOfSec=(int)timeSpanSec;
		
		return Integer.create(numOfSec,factory);
	}

}
