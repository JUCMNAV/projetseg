import grl.Evaluation;
import grl.EvaluationStrategy;
import grl.GRLspec;
import grl.IntentionalElement;
import grl.StrategiesGroup;
import grl.kpimodel.KPIEvalValueSet;
import grl.kpimodel.QualitativeMappings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.swt.widgets.Display;
import org.xml.sax.helpers.DefaultHandler;

import seg.jUCMNav.extensionpoints.IURNImport;
import seg.jUCMNav.importexport.ImportGRLCatalog;
import seg.jUCMNav.model.ModelCreationFactory;
import seg.jUCMNav.model.commands.create.AddEvaluationCommand;
import seg.jUCMNav.model.commands.create.CreateStrategiesGroupCommand;
import seg.jUCMNav.model.commands.create.CreateStrategyCommand;
import urn.URNspec;

/**
 * @author Rouzbahan
 *
 */
public class CSVLegislationImportWithKpiConversions extends DefaultHandler implements IURNImport
{
  
    private URNspec urn;
    //private GRLGraph graph;
    //private HashMap map;
    //private ArrayList idList;
    ImportGRLCatalog IGR;

    //private Vector autolayoutDiagrams;
    
    @Override
    public URNspec importURN(FileInputStream fis, Vector autolayoutDiagrams) throws InvocationTargetException
    {
        // Of no use
        System.out.println("in 1");
        return null;
    }
    
    @Override
    public URNspec importURN(String filename, Vector autolayoutDiagrams) throws InvocationTargetException {
      /*System.out.println("in 2");
      
      FileInputStream grlFileStream = null;        
      CSVFile legislationFileSimple = new CSVFile(filename);
      XMLFileSimple xmlFileSimple = new XMLFileSimple();  
      
       
      // Reading and cleaning up file
      legislationFileSimple.ReadFile();
      legislationFileSimple.deleteBlanks();
      
      // Creating lists of information provided by csv file
      xmlFileSimple.setLegislationID( legislationFileSimple.getStringValues() );
      xmlFileSimple.setLegislationSection( legislationFileSimple.getStringValues() );
      xmlFileSimple.setIntentionalElement( legislationFileSimple.getStringValues() );
      xmlFileSimple.setAltName( legislationFileSimple.getStringValues() );
      xmlFileSimple.setHyperlink( legislationFileSimple.getStringValues() );
      xmlFileSimple.setAltDescription( legislationFileSimple.getStringValues() );
      xmlFileSimple.setImportance( legislationFileSimple.getStringValues() );
      xmlFileSimple.setDecomposition( legislationFileSimple.getStringValues() );
      xmlFileSimple.setGoalStereoType( legislationFileSimple.getStringValues() );
      xmlFileSimple.setKpi( legislationFileSimple.getStringValues() );
      xmlFileSimple.setAltKpi( legislationFileSimple.getStringValues() );
      xmlFileSimple.setKpiStereotype( legislationFileSimple.getStringValues() );
    
      // Creating xml(or grl) file
      xmlFileSimple.makeRelationList();
      System.out.println("makeRelationList is done!");
      xmlFileSimple.calculateContributionValueList();
      System.out.println("calculateContributionValueList is done!");
      xmlFileSimple.makeElementDefinitionList();
      System.out.println("makeElementDefinitionList is done!");
      xmlFileSimple.makeLinkDefinitionList();
      System.out.println("makeLinkDefinitionList is done!");
      
      //if (filename.contains("Compliance"))
      //    xmlFileSimple.generatingKpiQuestionDefsLinks(1);
      //else if (filename.contains("Effectiveness"))
      //    xmlFileSimple.generatingKpiQuestionDefsLinks(2);            
      //System.out.println("generatingKpiQuestionDefsLinks is done!");
      
      xmlFileSimple.createXMLFile(filename);
      System.out.println("createXMLFile is done!");
    
      IGR = new ImportGRLCatalog();
      urn = ModelCreationFactory.getNewURNspec(false, false);
              
      try {
          grlFileStream = new FileInputStream(filename + "file.grl");
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } 
      
      urn = IGR.importURN(grlFileStream, urn, autolayoutDiagrams);
      /*
      final ArrayList<ArrayList<String>> conversions = xmlFileSimple.getKpiConversionList(); // getting all the introduced KPIConversions from CSV file
      final ArrayList<String> KPINamesWithConversion = new ArrayList<String>(); // to keep the name of the KPIs that have Conversion
      for (int i = 0; i < conversions.size(); i++) // adding names of KPIs that are in the first cell of each sublist
          KPINamesWithConversion.add(conversions.get(i).get(0)); 
      
      final URNspec urnspec = urn;
      
      Display.getDefault().syncExec( new Runnable() { 
          @Override
          public void run() {
              GRLspec grl = urnspec.getGrlspec();
              List<IntentionalElement> ieList = grl.getIntElements();
                             
              StrategiesGroup strategyGroup = (StrategiesGroup) ModelCreationFactory.getNewObject(urnspec, StrategiesGroup.class); // creating n new instance 
              strategyGroup.setName("TestGroup"); // setting a new name
                  
              CreateStrategiesGroupCommand cmd1 = new CreateStrategiesGroupCommand(urnspec, strategyGroup);
              cmd1.execute();
                  
              CreateStrategyCommand cmd2 = new CreateStrategyCommand(urnspec, strategyGroup);
              cmd2.getStrategy().setName("TestStrategy");
              EvaluationStrategy strategy = cmd2.getStrategy();
              cmd2.execute();
              
              for (int i = 0; i < KPINamesWithConversion.size(); i++) {
                  for (int j = 0; j < ieList.size(); j++) {
                      if (ieList.get(j).getName().equals(KPINamesWithConversion.get(i))) { // a KPI, that has a conversion already defined, is found // Now, we add an evaluation to this element
                          //System.out.println("found KPI!!!");
                          
                          Evaluation evaluation = (Evaluation) ModelCreationFactory.getNewObject(urnspec, Evaluation.class); // creating an evaluation
                          evaluation.setEvaluation(50); // this is just a test
                          
                          KPIEvalValueSet kpiEvalValSet = (KPIEvalValueSet)ModelCreationFactory.getNewObject(urnspec, KPIEvalValueSet.class); // creating KPI stuff for evaluation
                          kpiEvalValSet.setEval(evaluation); // assigning it to evaluation
                                                      
                          for (int k = 0; k < grl.getKPIConversion().size(); k++) {
                              System.out.println("found KPI!!!");
                              QualitativeMappings qm = (QualitativeMappings) grl.getKPIConversion().get(k); // finding relative KPIConversion for KPI stuff
                              if (qm.getName().equals(conversions.get(i).get(1))) {
                                  kpiEvalValSet.setKpiConv(qm); // assigning KPIConvesion to KPI stuff
                                  break;
                              }
                          }
                                                      
                          AddEvaluationCommand cmd3 = new AddEvaluationCommand(evaluation, ieList.get(j), strategy); // creating evaluation in proper group
                          cmd3.execute();
                      }
                  }
              }
          }
      } );
      */
      
      //UCMNavMultiPageEditor editor;
      //EvaluationStrategy strategy = EvaluationStrategyManager.getInstance().getEvaluationStrategy();
      //EvaluationStrategyManager.getInstance();
      //if (strategy == null)
      //    System.out.println("There is a null strategy!!!");
      
      /*return urn;*/
      return null;
    }
    
    @Override
    public URNspec importURN(FileInputStream fis, URNspec urn, Vector autolayoutDiagrams) throws InvocationTargetException
    {
        // Of no use
        System.out.println("in 3");
        return null;
    }

    @Override
    public URNspec importURN(String filename, URNspec urn, Vector autolayoutDiagrams) throws InvocationTargetException
    {        
        System.out.println("in 4");
        
        FileInputStream grlFileStream = null;        
        CSVFile legislationFileSimple = new CSVFile(filename);
        XMLFileSimple xmlFileSimple = new XMLFileSimple();  
        
         
        // Reading and cleaning up file
        legislationFileSimple.ReadFile();
        legislationFileSimple.deleteBlanks();
        
        // Creating lists of information provided by csv file
        xmlFileSimple.setLegislationID( legislationFileSimple.getStringValues() );
        xmlFileSimple.setLegislationSection( legislationFileSimple.getStringValues() );
        xmlFileSimple.setIntentionalElement( legislationFileSimple.getStringValues() );
        xmlFileSimple.setAltName( legislationFileSimple.getStringValues() );
        xmlFileSimple.setHyperlink( legislationFileSimple.getStringValues() );
        xmlFileSimple.setAltDescription( legislationFileSimple.getStringValues() );
        xmlFileSimple.setImportance( legislationFileSimple.getStringValues() );
        xmlFileSimple.setDecomposition( legislationFileSimple.getStringValues() );
        xmlFileSimple.setGoalStereoType( legislationFileSimple.getStringValues() );
        xmlFileSimple.setKpi( legislationFileSimple.getStringValues() );
        xmlFileSimple.setAltKpi( legislationFileSimple.getStringValues() );
        xmlFileSimple.setKpiStereotype( legislationFileSimple.getStringValues() );
      
        // Creating xml(or grl) file
        xmlFileSimple.makeRelationList();
        System.out.println("makeRelationList is done!");
        xmlFileSimple.calculateContributionValueList();
        System.out.println("calculateContributionValueList is done!");
        xmlFileSimple.makeElementDefinitionList();
        System.out.println("makeElementDefinitionList is done!");
        xmlFileSimple.makeLinkDefinitionList();
        System.out.println("makeLinkDefinitionList is done!");
        
        //if (filename.contains("Compliance"))
        //    xmlFileSimple.generatingKpiQuestionDefsLinks(1);
        //else if (filename.contains("Effectiveness"))
        //    xmlFileSimple.generatingKpiQuestionDefsLinks(2);            
        //System.out.println("generatingKpiQuestionDefsLinks is done!");
        
        xmlFileSimple.createXMLFile(filename);
        System.out.println("createXMLFile is done!");
      
        IGR = new ImportGRLCatalog();
        //urn = ModelCreationFactory.getNewURNspec(false, false);
                
        try {
            grlFileStream = new FileInputStream(filename + "file.grl");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        
        urn = IGR.importURN(grlFileStream, urn, autolayoutDiagrams);
        
        final ArrayList<ArrayList<String>> conversions = xmlFileSimple.getKpiConversionList(); // getting all the introduced KPIConversions from CSV file
        final ArrayList<String> KPINamesWithConversion = new ArrayList<String>(); // to keep the name of the KPIs that have Conversion
        for (int i = 0; i < conversions.size(); i++) // adding names of KPIs that are in the first cell of each sublist
            KPINamesWithConversion.add(conversions.get(i).get(0)); 
        
        final URNspec urnspec = urn;
        
        Display.getDefault().syncExec( new Runnable() { 
            @Override
            public void run() {
                GRLspec grl = urnspec.getGrlspec();
                List<IntentionalElement> ieList = grl.getIntElements();
                               
                StrategiesGroup strategyGroup = (StrategiesGroup) ModelCreationFactory.getNewObject(urnspec, StrategiesGroup.class); // creating n new instance 
                strategyGroup.setName("TestGroup"); // setting a new name
                    
                CreateStrategiesGroupCommand cmd1 = new CreateStrategiesGroupCommand(urnspec, strategyGroup);
                cmd1.execute();
                    
                CreateStrategyCommand cmd2 = new CreateStrategyCommand(urnspec, strategyGroup);
                cmd2.getStrategy().setName("TestStrategy");
                EvaluationStrategy strategy = cmd2.getStrategy();
                cmd2.execute();
                
                for (int i = 0; i < KPINamesWithConversion.size(); i++) {
                    for (int j = 0; j < ieList.size(); j++) {
                        if (ieList.get(j).getName().equals(KPINamesWithConversion.get(i))) { // a KPI, that has a conversion already defined, is found // Now, we add an evaluation to this element
                            //System.out.println("found KPI!!!");
                            
                            Evaluation evaluation = (Evaluation) ModelCreationFactory.getNewObject(urnspec, Evaluation.class); // creating an evaluation
                            //evaluation.setEvaluation(50); // this is just a test
                                                        
                            KPIEvalValueSet kpiEvalValSet = (KPIEvalValueSet)ModelCreationFactory.getNewObject(urnspec, KPIEvalValueSet.class); // creating KPI stuff for evaluation
                            kpiEvalValSet.setEval(evaluation); // assigning it to evaluation
                                                        
                            for (int k = 0; k < grl.getKPIConversion().size(); k++) {
                                System.out.println("found KPI!!!");
                                QualitativeMappings qm = (QualitativeMappings) grl.getKPIConversion().get(k); // finding relative KPIConversion for KPI stuff
                                if (qm.getName().equals(conversions.get(i).get(1))) {
                                    kpiEvalValSet.setKpiConv(qm); // assigning KPIConvesion to KPI stuff
                                    break;
                                }
                            }
                                                        
                            AddEvaluationCommand cmd3 = new AddEvaluationCommand(evaluation, ieList.get(j), strategy); // creating evaluation in proper group
                            cmd3.execute();
                        }
                    }
                }
            }
        } );
        
        //UCMNavMultiPageEditor editor;
        //EvaluationStrategy strategy = EvaluationStrategyManager.getInstance().getEvaluationStrategy();
        
        /*URNspec urnspec = IGR.importURN(grlFileStream, urn, autolayoutDiagrams);
        GRLspec grlspec= urnspec.getGrlspec();
        List<EvaluationStrategy> evalStrategies = grlspec.getStrategies(); // getting a list of strategies existing in GRLSpec that must be only 1.
        if (evalStrategies.size() == 1) { // Since it is exactly after the import, then there must be only one (base) strategy available.
            System.out.println("size of strategies is 1!!!");
            List<Evaluation> evaluations = evalStrategies.get(0).getEvaluations(); // All the evaluations in the strategy are captured. They are all zeros.
            System.out.println("size of the evaluations is : " + evaluations.size());
            for (int i = 0; i < evaluations.size(); i++) {
                System.out.println("Checking evaluations");
                IntentionalElement ie = evaluations.get(i).getIntElement(); // fetching intentional element of an evaluation
                
                if (KPINamesWithConversion.contains(ie.getName())) { // checking it again list of KPIs that there are conversions defined for them, o find if it has a conversion
                    System.out.println("Can find KPIs with conversion");
                    int index = KPINamesWithConversion.indexOf(ie.getName()); // finding the place of the KPI in the list of KPIs (with conversion) names
                    QualitativeMappings qm = (QualitativeMappings) evaluations.get(i).getKpiEvalValueSet().getKpiConv(); // finding its mapping
                    qm.setName(conversionNames.get(index).get(1)); // assigning name to its mapping attribute
                    System.out.println("assigning is done!!!");
                }    
            }
        }*/
        
        //UCMNavMultiPageEditor editor;
        //EvaluationStrategy strategy = EvaluationStrategyManager.getInstance().getEvaluationStrategy();
        //EvaluationStrategyManager.getInstance();
        //if (strategy == null)
        //    System.out.println("There is a null strategy!!!");
        
        return urn;
    }    
}
