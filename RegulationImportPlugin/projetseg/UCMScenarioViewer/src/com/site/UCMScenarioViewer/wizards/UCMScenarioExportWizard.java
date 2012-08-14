/*
 * Created on 31-Mar-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;

import com.site.UCMScenarioViewer.UCMScenarioViewer;
import com.site.UCMScenarioViewer.utils.Helper;

/**
 * @author mkova062
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class UCMScenarioExportWizard extends Wizard implements IExportWizard {

    public static final String WINDOW_TITLE = "Export MSC Diagram to Image";

    private IWorkbench workbench = null;
    private IStructuredSelection selection = null;

    // jkealey: quick hack: removed this page because it used a control that extends Tree that no longer works in new eclipse. 
    //private SelectModelFromWorkspacePage selectModelPage;
    private SelectScenarioPage selectScenarioPage;
    private SelectExportFilePage selectExportFile;

    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench;
        this.selection = selection;
        setWindowTitle(WINDOW_TITLE);
    }

    public void addPages() {
    	
    	
        //selectModelPage = new SelectModelFromWorkspacePage(getSelectedModel(workbench, selection));
        selectScenarioPage = new SelectScenarioPage();
        selectScenarioPage.setModelFile(getSelectedModel(workbench, selection));
        selectExportFile = new SelectExportFilePage(getShell());
        //addPage(selectModelPage);
        addPage(selectScenarioPage);
        addPage(selectExportFile);

        //selectModelPage.setWorkspace(ResourcesPlugin.getWorkspace());
    }

    public IWizardPage getNextPage(IWizardPage page) {
//        if (page == selectModelPage) {
//			selectScenarioPage.setModelFile(selectModelPage.getSelectedFile());
//   
//        	
//        } else 
    	if (page == selectScenarioPage) {
            selectExportFile.setViewer(selectScenarioPage.getSelectedDiagram());
        }
        
        return super.getNextPage(page);
    }

    public boolean performFinish() {
        return selectExportFile.export();
    }

    public Shell getShell() {
    	Shell shell = super.getShell();
        if (shell == null && workbench.getActiveWorkbenchWindow() != null) {
            shell = workbench.getActiveWorkbenchWindow().getShell();
        }
    	return shell;
    }
    
    public static IFile getSelectedModel(IWorkbench workbench, IStructuredSelection selection) {
    	UCMScenarioViewer editor = Helper.getUCMScenarioViewer(workbench);
        if (editor != null) {
            return ((IFileEditorInput) editor.getEditorInput()).getFile();
        }

        // If file is selected
        if (selection == null) {
            return null;
        }
        if (selection.getFirstElement() instanceof  IFile) {
            return (IFile) selection.getFirstElement();
        }

        // Nothing is selected
        return null;
    }

}
