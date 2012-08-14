/*
 * Created on 13-Feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import com.site.UCMScenarioViewer.utils.Helper;


/**
 * @author oboyk022
 *
 */
public class UCMScenarioImportWizard extends Wizard implements IImportWizard {

    public static final String WINDOW_TITLE = Helper.WIZARD_IMPORT_WINDOW_TITLE;
	private ImportWizardFirstPage UCMPage;
	private ImportWizardSecondPage UCMNewPage;	
	private IStructuredSelection selection;
	private IWorkbench workbench;

	public void addPages(){
		UCMPage = new ImportWizardFirstPage(workbench);
		addPage(UCMPage);
        UCMNewPage = new ImportWizardSecondPage(workbench, selection);
        addPage(UCMNewPage);
	}

    public boolean canFinish() {
        UCMNewPage.setModel(UCMPage.getObjectModel());
        return super.canFinish();  
    }

	public boolean performFinish() {
		return UCMNewPage.finish();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(WINDOW_TITLE);
	}

}
