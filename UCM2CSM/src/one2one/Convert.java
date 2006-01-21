package one2one;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.draw2d.IFigure;

import seg.jUCMNav.extensionpoints.IUseCaseMapExport;
import ucm.map.PathNode;
import ucm.map.UCMmap;

// Performs a 1-to-1 conversion on UCM components 
public class Convert implements IUseCaseMapExport {
    
    public void doConvert(AbstractConverter pn, PrintStream ps){
        pn.Convert(ps);
    }
    // for every UCM component this method will generate its appropriate CSM representation
    public void export(UCMmap map, FileOutputStream fos) throws InvocationTargetException {        
        PrintStream ps = new PrintStream(fos); 
        // general CSM header and footer
        String CSM_header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";       
        String CSM_footer = "</CSM>";
        ps.println(CSM_header);
       
        // parsing the component (CoreScenario) package
        for (Iterator iter = map.getNodes().iterator(); iter.hasNext();) {
            PathNode node = (PathNode) iter.next();          
            if(node.getClass().getName()== "ucm.map.impl.OrJoinImpl"){
               OrJoinConverter obj = new OrJoinConverter(node); 
                doConvert(obj,ps);
            }            
        }
        ps.println(CSM_footer);
        ps.flush();       
    }

    public void export(IFigure map, FileOutputStream fos) throws InvocationTargetException {
    }

    public void export(UCMmap map, String path) throws InvocationTargetException {
    }
    
    public void export(IFigure map, String path) throws InvocationTargetException {
    }

}
