package one2one;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import seg.jUCMNav.extensionpoints.IURNExport;
import ucm.map.AndJoin;
import ucm.map.OrJoin;
import ucm.map.PathNode;
import ucm.map.UCMmap;
import urn.URNspec;
import urncore.SpecificationDiagram;
/**
 * <!-- begin-user-doc -->
 * Performs a 1-to-1 conversion on UCM components 
 * <!-- end-user-doc -->
 * @see one2one 
 * @generated
 */

public class Convert implements IURNExport {
	
	// Converts object through polymorphism (dynamic binding)
    public void doConvert(AbstractConverter pn, PrintStream ps){
        pn.Convert(ps);
    }

	public void export(URNspec urn, FileOutputStream fos) throws InvocationTargetException {
        
        PrintStream ps = new PrintStream(fos);
        
        // CSM header and footer 
        String XML_header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";    
        String CSM_header = "<CSM name=\"" + urn.getClass().getName() + "\" " +
                            "description= \"" + urn.getDescription() + "\">";
        String CSM_footer = "</CSM>";
        
        // output to file
        ps.println(XML_header);
        ps.println(CSM_header);
        
        // parsing SpecDiagram
        for (Iterator iter = urn.getUrndef().getSpecDiagrams().iterator(); iter.hasNext();) {
			SpecificationDiagram diag = (SpecificationDiagram) iter.next();
			if (diag instanceof UCMmap) {
				UCMmap map = (UCMmap) diag;
		        exportMap(map, ps);
			}			
		}
        ps.println(CSM_footer);
        ps.flush(); 
	}
	
	private void exportMap(UCMmap map, PrintStream ps) {
        // map header and footer
        String Open_scenario_tag = "<Scenario id=\"" + map.getId() + "\"" +
                                    " " + "name=\"" + map.getName()+ "\"" +
                                    " " + "description= \"" + map.getDescription()+ "\"" + ">";
        String Close_scenario_tag = "</Scenario>";
        
        // output to file
        ps.println("        " + Open_scenario_tag);
        
		// parsing the map 
		for (Iterator iter2 = map.getNodes().iterator(); iter2.hasNext();) {
		    PathNode node = (PathNode) iter2.next();
		    // if OrJoin UCM object is found, generate CSM representation
		    if(node instanceof OrJoin){
		       OrJoinConverter obj = new OrJoinConverter(node); 
		       doConvert(obj,ps);
		    }
		    // if AndJoin UCM object is found, generate CSM representation
		    if(node instanceof AndJoin){
		       AndJoinConverter obj = new AndJoinConverter(node); 
		       doConvert(obj,ps);
		    }         
		}        
        ps.println("        " + Close_scenario_tag);
        ps.flush();
	}
	
	public void export(URNspec urn, String filename) throws InvocationTargetException {
		// TODO Auto-generated method stub		
	}

}
