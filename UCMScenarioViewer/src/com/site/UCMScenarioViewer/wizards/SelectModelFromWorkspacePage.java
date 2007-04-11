/*
 * Created on 31-Mar-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.utils.Helper;

/**
 * @author mkova062
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SelectModelFromWorkspacePage extends WizardPage {

    public static final String TITLE = "Select Scenario Group";
    public static final String DESCRIPTION = "Select .scenarios file from opened projects of workspace";

    private static final String LABEL = "Select .scenarios file to export";

    private IFile defaultSelected;
    private IWorkspace workspace;
    private Label label;
    private WorkspaceModelsTree modelsTree;

    public SelectModelFromWorkspacePage(IFile defaultSelected) {
        super("selectModelFromWorkbench", TITLE, Helper.EXPORT_WIZARD_BANNER);

        this.defaultSelected = defaultSelected;
        this.setDescription(DESCRIPTION);
    }

    // Page data manipulation
    public void setWorkspace(IWorkspace workspace) {
        if (modelsTree == null){
            this.workspace = workspace;
        } else {
            this.modelsTree.setWorkspace(workspace);
            validatePage(false);
        }
    }

    public ScenarioGroup getSelectedModel() {
        return modelsTree.getSelectedModel();
    }
    
    public IFile getSelectedFile() {
        return modelsTree.getSelected();
    }

    // Page validation
    protected void validatePage(boolean showErrorMessage) {
        String errorMessage =  modelsTree.testModelSelected();

        errorMessage = errorMessage == null ? modelsTree.testModelCorrectness() : errorMessage;

        setErrorMessage(showErrorMessage ? errorMessage : null);
        setPageComplete(errorMessage == null);
    }

    // Page controls
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new FormLayout());
        setControl(composite);

        createLabel(composite);
        createModelsTree(composite);

        validatePage(false);
        
        hookTreeSelection();
    }
    
    private void hookTreeSelection() {
        modelsTree.addSelectionListener(
                new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        validatePage(true);
                    }
                });
    }

    private void createLabel(Composite parent) {
        label = new Label(parent, SWT.NONE);
        label.setText(LABEL);

        FormData formData = new FormData();
        formData.top = new FormAttachment(0, 10);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(100, 0);
        label.setLayoutData(formData);
    }

    private void createModelsTree(Composite parent) {
        modelsTree = new WorkspaceModelsTree(parent, defaultSelected);

        FormData formData = new FormData();
        formData.top = new FormAttachment(label, 5);
        formData.bottom = new FormAttachment(100, -30);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(100, 0);
        modelsTree.setLayoutData(formData);
        
        modelsTree.setWorkspace(workspace);
    }

}
