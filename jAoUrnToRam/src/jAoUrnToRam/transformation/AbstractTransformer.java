package jAoUrnToRam.transformation;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import jAoUrnToRam.util.OutputDirectory;

public abstract class AbstractTransformer {
	protected OutputDirectory outDir;
	
	public AbstractTransformer(){}
	
	public AbstractTransformer(OutputDirectory outDir){
		this.outDir = outDir;
	}
	
	protected void save(String modelPath, EObject model){
		URI uri = URI.createURI(modelPath);
		
		Resource resource = new ResourceSetImpl().createResource(uri);
		resource.getContents().add(model);
		
		try {
		    resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public abstract void transform();
}
