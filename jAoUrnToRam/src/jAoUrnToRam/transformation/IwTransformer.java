package jAoUrnToRam.transformation;

import intermediateWorkflow.IwModel;
import jAoUrnToRam.util.OutputDirectory;

public abstract class IwTransformer extends AbstractTransformer {
	protected IwModel source;
	
	public IwTransformer(IwModel source, OutputDirectory outDir){
		super(outDir);
		this.source = source;
	}
}
