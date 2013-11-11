import grl.Evaluation;
import grl.EvaluationStrategy;
import grl.IntentionalElement;
import grl.kpimodel.QualitativeMapping;
import grl.kpimodel.QualitativeMappings;

import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;

import org.eclipse.swt.widgets.Display;
import org.xml.sax.helpers.DefaultHandler;

import seg.jUCMNav.extensionpoints.IURNImport;
import seg.jUCMNav.model.ModelCreationFactory;
import seg.jUCMNav.model.commands.create.CreateKPIConversionCommand;
import seg.jUCMNav.model.commands.create.CreateQualitativeMappingCommand;
import seg.jUCMNav.strategies.EvaluationStrategyManager;
import urn.URNspec;
import urncore.Metadata;

/**
 * @author Rouzbahan
 *
 */
public class QualitativeMappingsPlugin extends DefaultHandler implements IURNImport {    
    private URNspec urnSpec;
    private QualitativeMapping qualitativeMap;
    private QualitativeMappings qualitativeMaps;
    private CSVFile qualitativeMappingCSVFile;
    private QualitativeMappingSimple qualitativeMappingSimple;
    
    private int numberOfMappings;
    private int numberOfBorder = 0;
    
    @Override
    public URNspec importURN(FileInputStream fis, Vector autolayoutDiagrams) throws InvocationTargetException {
        System.out.println("in 1");
        return null;
    }
  
    @Override
    public URNspec importURN(String filename, Vector autolayoutDiagrams) throws InvocationTargetException {
        System.out.println("in 2");
        urnSpec = ModelCreationFactory.getNewURNspec(false, false, false);
        qualitativeMappingCSVFile = new CSVFile(filename);
        qualitativeMappingSimple = new QualitativeMappingSimple();
        // Reading and cleaning up file
        qualitativeMappingCSVFile.ReadFile();
        qualitativeMappingCSVFile.deleteBlanks();
        // Creating Qualitative Mapping list
        qualitativeMappingSimple.setRealWorldLabelList(qualitativeMappingCSVFile.getStringValues());
        qualitativeMappingSimple.setEvaluationList(qualitativeMappingCSVFile.getStringValues());
        qualitativeMappingSimple.setExceedsList(qualitativeMappingCSVFile.getStringValues());
        qualitativeMappingSimple.setKPICoversionNames();
        if(qualitativeMappingSimple.getRealWorldLabelList().size() == qualitativeMappingSimple.getEvaluationList().size() && 
            qualitativeMappingSimple.getEvaluationList().size() == qualitativeMappingSimple.getExceedsList().size()) {
            numberOfMappings = qualitativeMappingSimple.getEvaluationList().size();
            for (int i = 0; i < numberOfMappings; i++)
                if (qualitativeMappingSimple.getRealWorldLabelList().get(i).contains("RealWorldLabel"))
                    numberOfBorder++;
                
            System.out.println("All the list are equal!!!");
            System.out.println("number of mappings : " + numberOfMappings);
            System.out.println("number of borders : " + numberOfBorder);
        }
        else 
            return null;
                
        Display.getDefault().syncExec(new Runnable() { 
            @Override
            public void run() {
                int j = 1;
                for (int counter = 0; counter < numberOfBorder; counter++) { // for the number of borders
                    CreateKPIConversionCommand cmd1 = new CreateKPIConversionCommand(urnSpec, QualitativeMappings.class); 
                    cmd1.execute(); // creating mapping groups
                    qualitativeMaps = (QualitativeMappings) cmd1.getKPIConversion();
                    for (int i = j; i < numberOfMappings; i++) {
                        if (!qualitativeMappingSimple.getRealWorldLabelList().get(i).contains("RealWorldLabel")) {
                            qualitativeMaps.setName(qualitativeMappingSimple.getKPICoversionNames().get(counter));
                            CreateQualitativeMappingCommand cmd2 = new CreateQualitativeMappingCommand(urnSpec, qualitativeMaps); 
                            cmd2.execute(); // creating maps
                            qualitativeMap = cmd2.getMapping();
                            qualitativeMap.setRealWorldLabel(qualitativeMappingSimple.getRealWorldLabelList().get(i));
                            qualitativeMap.setEvaluation(Integer.parseInt((qualitativeMappingSimple.getEvaluationList().get(i))));
                            qualitativeMap.setExceeds(qualitativeMappingSimple.getExceedsList().get(i));
                            j++;
                        }
                        else {
                            j++;
                            break;
                        }
                    } // end of second for
                } // end of first for               
            } // end of run
        });        
        
        System.out.println("All the mappings are done properly!!!");
        
        return urnSpec;        
    }
  
    @Override
    public URNspec importURN(FileInputStream fis, URNspec urn, Vector autolayoutDiagrams) throws InvocationTargetException {
        System.out.println("in 3");
        return null;
    }
  
    @Override
    public URNspec importURN(String filename, URNspec urn, Vector autolayoutDiagrams) throws InvocationTargetException {   
        /*urnSpec = urn;
        qualitativeMappingCSVFile = new CSVFile(filename);
        qualitativeMappingSimple = new QualitativeMappingSimple();
        // Reading and cleaning up file
        qualitativeMappingCSVFile.ReadFile();
        qualitativeMappingCSVFile.deleteBlanks();
        // Creating Qualitative Mapping list
        qualitativeMappingSimple.setRealWorldLabelList(qualitativeMappingCSVFile.getStringValues());
        qualitativeMappingSimple.setEvaluationList(qualitativeMappingCSVFile.getStringValues());
        qualitativeMappingSimple.setExceedsList(qualitativeMappingCSVFile.getStringValues());
        qualitativeMappingSimple.setKPICoversionNames();
        if(qualitativeMappingSimple.getRealWorldLabelList().size() == qualitativeMappingSimple.getEvaluationList().size() && 
            qualitativeMappingSimple.getEvaluationList().size() == qualitativeMappingSimple.getExceedsList().size()) {
            numberOfMappings = qualitativeMappingSimple.getEvaluationList().size();
            for (int i = 0; i < numberOfMappings; i++)
                if (qualitativeMappingSimple.getRealWorldLabelList().get(i).contains("RealWorldLabel"))
                    numberOfBorder++;
                
            System.out.println("All the list are equal!!!");
            System.out.println("number of mappings : " + numberOfMappings);
            System.out.println("number of borders : " + numberOfBorder);
        }
        else 
            return null;
                
        Display.getDefault().syncExec(new Runnable() { 
            @Override
            public void run() {
                int j = 1;
                for (int counter = 0; counter < numberOfBorder; counter++) { // for the number of borders
                    CreateKPIConversionCommand cmd1 = new CreateKPIConversionCommand(urnSpec, QualitativeMappings.class); 
                    cmd1.execute(); // creating mapping groups
                    qualitativeMaps = (QualitativeMappings) cmd1.getKPIConversion();
                    for (int i = j; i < numberOfMappings; i++) {
                        if (!qualitativeMappingSimple.getRealWorldLabelList().get(i).contains("RealWorldLabel")) {
                            qualitativeMaps.setName(qualitativeMappingSimple.getKPICoversionNames().get(counter));
                            CreateQualitativeMappingCommand cmd2 = new CreateQualitativeMappingCommand(urnSpec, qualitativeMaps); 
                            cmd2.execute(); // creating maps
                            qualitativeMap = cmd2.getMapping();
                            qualitativeMap.setRealWorldLabel(qualitativeMappingSimple.getRealWorldLabelList().get(i));
                            qualitativeMap.setEvaluation(Integer.parseInt((qualitativeMappingSimple.getEvaluationList().get(i))));
                            qualitativeMap.setExceeds(qualitativeMappingSimple.getExceedsList().get(i));
                            j++;
                        }
                        else {
                            j++;
                            break;
                        }
                    } // end of second for
                } // end of first for               
            } // end of run
        });        
        
        System.out.println("All the mappings are done properly!!!");
        
        return urnSpec; */
        System.out.println("in 4");
        return null;
    }    
}