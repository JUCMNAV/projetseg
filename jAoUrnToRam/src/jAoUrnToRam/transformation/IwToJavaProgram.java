package jAoUrnToRam.transformation;

import intermediateWorkflow.IwModel;
import iwToJavaInstantiator.JavaView;
import jAoUrnToRam.util.OutputDirectory;
import jAoUrnToRam.util.OutputPath;

public class IwToJavaProgram extends IwToText {

	public IwToJavaProgram(IwModel source, OutputDirectory outDir){
		super(source, outDir);
	}
	
	@Override
	public void transform(){
		JavaView program = source.jpToJavaProgram();
		String content = program.getContent();
		
		String dirPath = outDir.getPath();
		OutputPath outPath = new OutputPath(dirPath, "Program", ".java");
		
		String path = outPath.create();
		writeOutput(path, content);
		
		//System.out.println("Java program finished");
	}
}
