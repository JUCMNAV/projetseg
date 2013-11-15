package jAoUrnToRam.transformation;

import intermediateWorkflow.IwModel;
import iwToJavaInstantiator.WorkflowInstantiator;
import jAoUrnToRam.util.OutputDirectory;
import jAoUrnToRam.util.OutputPath;

public class IwToJava extends IwToText {
	public IwToJava(IwModel source, OutputDirectory outDir){
		super(source, outDir);
	}
	
	@Override
	public void transform(){
		String javaDirPath = outDir.create("Instantiators");
		
		for(WorkflowInstantiator workflowInstantiator : source.jiToJavaInstantiator()) {
			String path = workflowInstantiator.getWorkspacePath().replace('/', '\\');
			
			String concernName = path.substring(path.indexOf('\\')+1, path.lastIndexOf('\\'));
			String concernDirPath = outDir.create(javaDirPath, concernName);
			
			String javaClassName = path.substring(path.lastIndexOf('\\')+1);
			
			OutputPath outPath = new OutputPath(concernDirPath, javaClassName, ".java");
			String javaPath = outPath.create();
			
			String javaContent = workflowInstantiator.getContent();
			writeOutput(javaPath, javaContent);
		}
		//System.out.println("Java instantiator finished");
	}
}
