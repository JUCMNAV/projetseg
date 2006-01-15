package uCM2CSM;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.draw2d.IFigure;

import seg.jUCMNav.extensionpoints.IUseCaseMapExport;
import ucm.map.UCMmap;

// Performs a 1-to-1 conversion on UCM components 
 
public class Converter implements IUseCaseMapExport {

    public void export(UCMmap map, FileOutputStream fos) throws InvocationTargetException {
        
    }

    public void export(IFigure map, FileOutputStream fos) throws InvocationTargetException {
    }

    public void export(UCMmap map, String path) throws InvocationTargetException {
    }

    public void export(IFigure map, String path) throws InvocationTargetException {
    }

}
