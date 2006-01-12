package seg.jUCMNav.importexport;


import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;

import seg.jUCMNav.extensionpoints.IURNExport;

/**
 * Helps access information from the seg.jUCMNav.URNImport extension point.
 * 
 * @author jkealey
 */
public class URNImportExtensionPointHelper extends ExportExtensionPointHelper {

    protected static String sExtensionPoint = "seg.jUCMNav.URNImport";

    /* Facade for ExportExtensionPointHelper */
    protected static IExtension[] getExportExtensions() {
        return ExportExtensionPointHelper.getExportExtensions(sExtensionPoint);
    }
    
    /* Facade for ExportExtensionPointHelper */
    protected static ArrayList getExportConfigurationElements() {
        return ExportExtensionPointHelper.getExportConfigurationElements(sExtensionPoint);
    }
    
    /* Facade for ExportExtensionPointHelper */
    protected static IConfigurationElement getExportConfigurationElement(String id) {
        return ExportExtensionPointHelper.getExportConfigurationElement(sExtensionPoint, id);
    }
    
    /* Facade for ExportExtensionPointHelper */
    public static String[] getImportLabels() {
        return ExportExtensionPointHelper.getExportLabels(sExtensionPoint);
    }
    
    /* Facade for ExportExtensionPointHelper */
    public static String getExporterFromLabelIndex(int index) {
        return ExportExtensionPointHelper.getExporterFromLabelIndex(sExtensionPoint, index);
    }
    
    /* Facade for ExportExtensionPointHelper */
    public static String getFilenameExtension(String id) {
        return ExportExtensionPointHelper.getFilenameExtension(sExtensionPoint, id);
    
    }
    /**
     * 
     * @param id
     *            the importer's unique id
     * @return an instance of the exporter defined in the class attribute
     */
    public static IURNExport getImporter(String id) {
        IConfigurationElement elem = getExportConfigurationElement(id);
        IURNExport exporter = null;
        try {
            exporter = (IURNExport) elem.createExecutableExtension("class");
        } catch (CoreException e) {
            // ignore
            e.printStackTrace();
        }
        return exporter;
    }


}
