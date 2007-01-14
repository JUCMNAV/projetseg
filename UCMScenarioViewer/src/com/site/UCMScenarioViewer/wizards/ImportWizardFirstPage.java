package com.site.UCMScenarioViewer.wizards;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.MessageFormat;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.parser.XMLParserInitializer;
import com.site.UCMScenarioViewer.parser.MSCParserInitializer;
import com.site.UCMScenarioViewer.utils.Helper;

public class ImportWizardFirstPage extends WizardPage {

	private IWorkbench workbench;
    private Text fileField;
    private ScenarioGroup model; // for parsing

    public ImportWizardFirstPage(IWorkbench aWorkbench) {
        super("UCMImportFirstPage", Helper.WIZARD_P1_TITLE, Helper.IMPORT_WIZARD_BANNER);
        this.workbench = aWorkbench;
        this.setDescription(Helper.WIZARD_P1_DESC);
    }

    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new FormLayout());

        final Label label = createLabel(composite);
        fileField = createFileField(composite, label);
        final Button browse = createBrowseButton(composite, label, fileField);

        browse.addSelectionListener(
                new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        FileDialog fileDialog = new FileDialog(
                                workbench.getActiveWorkbenchWindow().getShell(), SWT.OPEN);
                        fileDialog.setFileName(fileField.getText());
                        String file = fileDialog.open();
                        if (file != null) {
                            fileField.setText(file);
                            // validatePage();
                        }
                    }
                });

        fileField.addModifyListener(
                new ModifyListener() {
                    public void modifyText(ModifyEvent e) {
                        validatePage();
                    }
                });

        setControl(composite);
        setPageComplete(false);
    }

    public ScenarioGroup getObjectModel() {
        return model;
    }
    /*
     * TODO - move the parsing logic outside the validation method,
     * this is confusing!
     */
    protected void validatePage() {
        this.model = null;
        File file = new File(fileField.getText());
        
        if (file.isFile()) {

			// check for extension
			String fileName = file.getName();
			
			// TODO - change to one try block with if checking for extension inside the try block
			if (fileName.toLowerCase().endsWith(Helper.EXTENSION_XML)) 
			{
				// start parsing .XML file
				try {
					InputStream stream = new FileInputStream(file);
					model = XMLParserInitializer.parseXmlModel(file);
					setErrorMessage(null);
				} catch (Exception e) {
					e.printStackTrace();
					setErrorMessage(MessageFormat.format(Helper.WIZARD_P1_CANT_PARSE_ERROR,
							new String[] { file.getName() }));
				}
			}
			else if (fileName.toLowerCase().endsWith(Helper.EXTENSION_MSC)) {
						// start parsing .MSC file
						try {
							InputStream stream = new FileInputStream(file);
							model = MSCParserInitializer.parseMscModel(file);

							setErrorMessage(null);
						} catch (Exception e) {
							e.printStackTrace();
							setErrorMessage(MessageFormat.format(Helper.WIZARD_P1_CANT_PARSE_ERROR,
									new String[] { file.getName() }));
						}
			}
			else {
				setErrorMessage(MessageFormat.format(Helper.WIZARD_P1_WRONG_EXT_ERROR, new String[] { file.getName() }));
			}
		} else {
			setErrorMessage(Helper.WIZARD_P1_NOT_A_FILE_ERROR);
		}

        setPageComplete(model != null);
    }

    private Button createBrowseButton(Composite composite, Label label, Text fileField) {
        Button browse = new Button(composite, SWT.NONE);
        browse.setText(Helper.WIZARD_P1_BROWSE_TEXT);


        FormData formData = new FormData();
        formData.top = new FormAttachment(label, 5);
        formData.bottom = new FormAttachment(fileField, 0, SWT.BOTTOM);
        formData.left = new FormAttachment(fileField, 5);
        formData.right = new FormAttachment(100, 0);
        browse.setLayoutData(formData);

        return browse;
    }

    private Label createLabel(Composite composite) {
        Label label;
        label = new Label(composite, SWT.NONE);
        label.setText(Helper.WIZARD_P1_LABEL);

        FormData formData = new FormData();
        formData.top = new FormAttachment(0, 10);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(100, 0);
        label.setLayoutData(formData);

        return label;
    }

    private Text createFileField(Composite composite, Label label) {
        Text fileField = new Text(composite, SWT.LEFT | SWT.SINGLE | SWT.BORDER);

        FormData data = new FormData();
        data.top = new FormAttachment(label, 5);
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, -80);
        fileField.setLayoutData(data);
        return fileField;
    }



}
