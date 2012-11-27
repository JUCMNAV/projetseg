import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

import org.xml.sax.helpers.DefaultHandler;

import seg.jUCMNav.extensionpoints.IURNImport;
import seg.jUCMNav.importexport.ImportGRLCatalog;
import seg.jUCMNav.model.ModelCreationFactory;
import urn.URNspec;

/**
 * @author Rouzbahan
 *
 */
public class CSVLegislationImport extends DefaultHandler implements IURNImport
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
        return null;
    }
    
    @Override
    public URNspec importURN(String filename, Vector autolayoutDiagrams) throws InvocationTargetException {
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
        xmlFileSimple.createXMLFile(filename);
        System.out.println("createXMLFile is done!");
      
        IGR = new ImportGRLCatalog();
        urn = ModelCreationFactory.getNewURNspec(false, false);
        
        try {
            grlFileStream = new FileInputStream(filename + "file.grl") ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }       
       
        return IGR.importURN(grlFileStream, urn, autolayoutDiagrams);        
    }
    
    @Override
    public URNspec importURN(FileInputStream fis, URNspec urn, Vector autolayoutDiagrams) throws InvocationTargetException
    {
        // Of no use
        return null;
    }

    @Override
    public URNspec importURN(String filename, URNspec urn, Vector autolayoutDiagrams) throws InvocationTargetException
    {
        // Of no use
        return null;
    }    
}
