package jAoUrnToRam.transformation;

import intermediateWorkflow.IwModel;
import jAoUrnToRam.util.OutputDirectory;
import jAoUrnToRam.util.OutputPath;

public class AoUrnToIw extends AbstractTransformer {
	private AoUrnSource source;
	private String sourceName;
	private IwModel target;

	public AoUrnToIw(AoUrnSource source, OutputDirectory outDir){
		super(outDir);
		this.source = source;
		this.sourceName = source.getName();
	}
	
	@Override
	public void transform(){
		target = source.toIw();
		//save("aoUrnToIw"); // delete for plugin build
		
		target.insertInputProcessingNodes();
		//save("iwToIwInsertInputProcessingNodes"); // delete for plugin build
		
		target.linkSteps();
		//save("iwToIwLinkSteps"); // delete for plugin build
		
		persistIwModel();
	}
	
	public IwModel getTarget(){
		return target;
	}
	
	// delete for plugin build
	private void save(String step) {
		String dirPath = outDir.create(step);
			
		OutputPath outFile = new OutputPath(dirPath, sourceName);
		String outPath = outFile.create();
		
		target.setName(sourceName);
		save(outPath, target);
		
		System.out.println(step + " finish");
	}
	
	private void persistIwModel() {
		String outDirPath = outDir.getPath();
		OutputPath outFile = new OutputPath(outDirPath, "Iw");
		String outPath = outFile.create();

		target.setName(sourceName);
		save(outPath, target);
	    //System.out.println("aourn to iw finish");
	}
}
