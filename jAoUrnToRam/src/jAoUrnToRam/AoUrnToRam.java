package jAoUrnToRam;

import java.util.Map;
import urn.UrnPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import ram.RamPackage;
import ca.mcgill.cs.sel.ram.util.RamResourceFactoryImpl;
import jAoUrnToRam.transformation.AoUrnSource;
import jAoUrnToRam.transformation.AoUrnToIw;
import jAoUrnToRam.transformation.IwToJava;
import jAoUrnToRam.transformation.IwToJavaProgram;
import jAoUrnToRam.transformation.IwToRam;
import jAoUrnToRam.transformation.IwToStep;
import jAoUrnToRam.util.OutputDirectory;
import intermediateWorkflow.IntermediateWorkflowPackage;
import intermediateWorkflow.IwModel;

public class AoUrnToRam {	
	private String outDirPath;
	
	public AoUrnToRam(String outDirPath) {
		this.outDirPath = outDirPath;
	}
	
	public void transform(String sourcePath){
		regExts();
		initModels();
		
		AoUrnSource source = new AoUrnSource(sourcePath);
		String sourceName = source.getName();
		
		System.out.println("begin " + sourceName);
		
		OutputDirectory outDir = new OutputDirectory(outDirPath, sourceName); 
		outDir.create();
		
		AoUrnToIw iwTrnsfrmr = new AoUrnToIw(source, outDir);
		iwTrnsfrmr.transform();
		IwModel target = iwTrnsfrmr.getTarget();
		
		IwToStep iwToStepTrnsfrmrm = new IwToStep(target, outDir);
		iwToStepTrnsfrmrm.transform();
		
		IwToJava iwToJavaTrnsfrmr = new IwToJava(target, outDir);
		iwToJavaTrnsfrmr.transform();
		
		IwToJavaProgram iwToJavaPrgrmTrnsfrmr = new IwToJavaProgram(target, outDir);
		iwToJavaPrgrmTrnsfrmr.transform();
		
		IwToRam iwToRamTrnsfrmr = new IwToRam(target, outDir);
		iwToRamTrnsfrmr.transform();
		
		System.out.println("end " + sourceName + "\n");
	}
	
	private void regExts() {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> factoryMap = registry.getExtensionToFactoryMap();
		
		factoryMap.put("jucm", new XMIResourceFactoryImpl());
		factoryMap.put("xmi", new XMIResourceFactoryImpl());
		factoryMap.put("ram", new RamResourceFactoryImpl());
	}
	
	private void initModels() {
		UrnPackage.eINSTANCE.eClass();
		IntermediateWorkflowPackage.eINSTANCE.eClass();
		RamPackage.eINSTANCE.eClass();
	}
}
