package jAoUrnToRam.transformation;

import intermediateWorkflow.IwModel;
import iwToRam.RamWorkspace;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import aoUrnToRam.javaExternalCall.FileSystemImpl;
import jAoUrnToRam.util.OutputDirectory;
import jAoUrnToRam.util.ResourceDir;
import ram.Aspect;

public class IwToRam extends IwTransformer{
	
	private String ramDir;
	
	public IwToRam(IwModel source, OutputDirectory outDir) {
		super(source, outDir);
		ramDir = "";
	}
	
	@Override
	public void transform(){
		copyRamLibToOutputDir();
		
		Aspect workflow = loadWorkflowLib("Workflow.ram");
		Aspect input = loadWorkflowLib("Input.ram");
		Aspect output = loadWorkflowLib("Output.ram");
		
		RamWorkspace ramWorkspace = new RamWorkspace(workflow, input, output);
		source.toStepClassDiagram(ramWorkspace);
		
		Set<String> paths = ramWorkspace.getAspectPerWorkspacePath().keySet();
		for(String path : paths){
			Aspect aspect = ramWorkspace.getAspectPerWorkspacePath().get(path);
			
			persistRamModel(path, aspect);
		}
		//System.out.println("Ram transformation finished");
	}
	
	private void persistRamModel(String path, EObject aspect){
		StringBuffer sb = new StringBuffer();
		String outDirPath = outDir.getPath();
		sb.append(outDirPath);
		sb.append("\\");
	
		String workspacePath = path.replace('/', '\\');
		sb.append(workspacePath);
		sb.append(".ram");
		
		String modelPath = sb.toString();
		
		save(modelPath, aspect);
	}
	
	private Aspect loadWorkflowLib(String libName){
		/*StringBuffer libPathSb = new StringBuffer();
		libPathSb.append(ramDir);
		libPathSb.append("\\");
		libPathSb.append("Workflow");
		libPathSb.append("\\");
		libPathSb.append(libName);*/
		
		File prjDir = new File(".");
		String prjAbsPath = "";
		try {
			prjAbsPath = prjDir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuffer libPathSb = new StringBuffer();
		libPathSb.append(prjAbsPath);
		libPathSb.append("\\testcases\\actual\\");
		libPathSb.append(outDir.getName());
		libPathSb.append("\\reusable_model_library\\Workflow\\");
		libPathSb.append(libName);
		
		String libPath = libPathSb.toString();
		//System.out.println(libPath);
		
		//URI libUri = URI.createURI(libPath);
		URI libUri = URI.createFileURI(libPath);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(libUri, true);
		
		Aspect root = (Aspect)resource.getContents().get(0);
		return root;
	}
	
	private void copyRamLibToOutputDir() {
		String ramLibPath = ResourceDir.getPath("ramLib");
		ramDir = outDir.create("reusable_model_library");
		
		File src = new File(ramLibPath);
		File dst = new File(ramDir);
		
		try {
			FileSystemImpl.copy(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
