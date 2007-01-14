/*
 * Created on 31-Mar-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.wizards;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

import com.site.UCMScenarioViewer.UCMScenarioViewer;
import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.utils.Helper;


/**
 * @author mkova062
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SelectScenarioPage extends WizardPage {

    public static final String TITLE = "Select Scenario page";
    public static final String DESCRIPTION = "Select Scenario from Scenario Group that you want to export";

    private static final String LABEL = "Select Scenario";

    private Label label;
    private List scenarioList;
    private IFile modelFile;
    private UCMScenarioViewer viewer;

    public SelectScenarioPage() {
        super("selectScenarioFromModelPage", TITLE, Helper.EXPORT_WIZARD_BANNER);
        setDescription(DESCRIPTION);
    }

    // Page data manipulation
    public void setModelFile(IFile modelFile) {
        this.modelFile = modelFile;
        viewer = Helper.openViewer(modelFile);
        updateScenarioList();
    }

    public UCMScenarioViewer getSelectedDiagram() {
    	return viewer;
/*        if (viewer == null) {
            return null;
        }
        
        return viewer.getMSCDiagram().getSelectedScenario();
*/    }

    // Page validation
    protected void validatePage(boolean showErrorMessage) {
        String errorMessage = null;

        errorMessage = scenarioList.getSelectionIndex() == -1 ? "Scenario is not selected" : null;
        if (scenarioList.getSelectionIndex() != -1) {
        	viewer.getMSCDiagram().setSelectedScenario(scenarioList.getSelectionIndex());
        }
        setErrorMessage(showErrorMessage ? errorMessage : null);
        setPageComplete(errorMessage == null);
    }

    // Page controls
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new FormLayout());
        setControl(composite);

        createLabel(composite);
        createDiagramsList(composite);

        hookDiagramSelection();

        validatePage(false);
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

    private void createDiagramsList(Composite parent) {
        scenarioList = new List(parent, SWT.BORDER | SWT.SINGLE);
        
        FormData formData = new FormData();
        formData.top = new FormAttachment(label, 5);
        formData.bottom = new FormAttachment(100, 0);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(100, 0);
        scenarioList.setLayoutData(formData);
    }
    
    private void updateScenarioList() {
        if (scenarioList == null) {
            return;
        }
        
        scenarioList.removeAll();
        
        if (viewer == null) {
            return;
        }
        
        java.util.List scenarios = viewer.getMSCDiagram().getTreeChildren();
        Iterator i = scenarios.iterator();
        while (i.hasNext()) {
            scenarioList.add( ((Scenario)i.next()).getName());
        }
        
        scenarioList.setSelection(new int[]{viewer.getMSCDiagram().getSelectedScenario().getNumber()});
        
        validatePage(true);
    }

    private void hookDiagramSelection() {
        scenarioList.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                validatePage(true);
            }
        });
    }


}
