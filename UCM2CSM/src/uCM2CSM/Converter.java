package uCM2CSM;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.TreeIterator;

import seg.jUCMNav.extensionpoints.IUseCaseMapExport;
import ucm.map.OrJoin;
import ucm.map.UCMmap;

// Performs a 1-to-1 conversion on UCM components 
public class Converter implements IUseCaseMapExport {

    // for every UCM component this method will generate its appropriate CSM representation
    public void export(UCMmap map, FileOutputStream fos) throws InvocationTargetException {        
        TreeIterator itr = map.eAllContents();
        // parsing the component (CoreScenario) package
        while (itr.hasNext()) {
            Object obj = itr.next(); 
            // identifying and converting component
            if (obj.getClass().getName() == "ucm.map.impl.OrJoinImpl") {
                OrJoin OJ = (OrJoin) obj;
                String CSM_header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
                String Object_header = "<element name=\"Join\" type=\"OrJoin\" substitutionGroup=\"PathConnection\"/>";
                String CSM_footer = "</CSM>";
                String Object_attributes = "<merge id=\"" + OJ.getId() + "\"" + " name=\"Merge\" x=\"" + OJ.getX() + "\"" + " y=\"" + OJ.getY() + "\"" + " Description=\""
                + OJ.getDescription() + "\"" + " />";
                PrintStream ps = new PrintStream(fos);
                // output to file
                ps.println(CSM_header);
                ps.println("    " + Object_header);
                ps.println("        " + Object_attributes);
                ps.println(CSM_footer);
                ps.flush();
            }   
        }        
    }

    public void export(IFigure map, FileOutputStream fos) throws InvocationTargetException {
    }

    public void export(UCMmap map, String path) throws InvocationTargetException {
    }
    
    public void export(IFigure map, String path) throws InvocationTargetException {
    }

}
