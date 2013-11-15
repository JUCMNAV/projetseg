package jAoUrnToRam.transformation;

import intermediateWorkflow.IwModel;
import iwToStepView.StepView;
import jAoUrnToRam.util.OutputDirectory;
import jAoUrnToRam.util.OutputPath;
import jAoUrnToRam.util.ResourceDir;
import java.util.List;

public class IwToStep extends IwToText{
	public IwToStep(IwModel source, OutputDirectory outDir){
		super(source, outDir);
	}
	
	@Override
	public void transform() {
		String stepsDirPath = outDir.create("Steps");
		
		String dirPath = ResourceDir.getPath("img");
		List<StepView> steps = source.toStepView(dirPath);
		
		for(StepView step : steps){
			String concern = step.getConcernName();
			String conernDirPath = outDir.create(stepsDirPath, concern);
			
			String name = step.getStepName();
			OutputPath stepFile = new OutputPath(conernDirPath, name, ".dot");
			
			String stepFilePath = stepFile.create();
			String stepDot = step.getDot();
			
			writeOutput(stepFilePath, stepDot);
		}
		//System.out.println("Step view finish");
	}
}
