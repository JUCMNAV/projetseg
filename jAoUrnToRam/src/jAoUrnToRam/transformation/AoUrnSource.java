package jAoUrnToRam.transformation;

import intermediateWorkflow.IwModel;
import urn.URNspec;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class AoUrnSource {
	
	private String path;
	private String name;
	private URNspec root;
	
	public AoUrnSource(String path)  {
		this.path = path;
		initName();
		initRoot();
	}
	
	public String getPath() {
		return path;
	}
	
	public String getName() {
		return name;
	}
	
	public IwModel toIw(){
		IwModel iwModel = root.toIw();
		return iwModel;
	}

	private void initRoot(){
		URI sourceUri = URI.createURI(path);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(sourceUri, true);
		
		root = (URNspec)resource.getContents().get(0);
	}
	
	private void initName() {
		name = path.substring(path.lastIndexOf('\\')+1, path.lastIndexOf('.'));
	}
}
