package jAoUrnToRam.transformation;

import java.io.PrintWriter;

import intermediateWorkflow.IwModel;
import jAoUrnToRam.util.OutputDirectory;

public abstract class IwToText extends IwTransformer{
	public IwToText(IwModel source, OutputDirectory outDir){
		super(source, outDir);
	}
	
	protected void writeOutput(String path, String content){
		try {
			PrintWriter out = new PrintWriter(path);
			out.println(content);
			out.close();		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
