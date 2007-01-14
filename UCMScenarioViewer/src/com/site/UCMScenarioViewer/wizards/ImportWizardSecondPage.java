package com.site.UCMScenarioViewer.wizards;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.utils.Helper;

public class ImportWizardSecondPage extends WizardNewFileCreationPage {

    // default naming convention for new filenames created upon import
    public static final MessageFormat DEFAULT_FILE_NAME = new MessageFormat("UCMViewer-diagram-{0}" + Helper.EXTENSION_SCENARIOS);

    private IWorkbench workbench;
    private static int exampleCount = 1;
    private ScenarioGroup model = null;

    public ImportWizardSecondPage(IWorkbench workbench, IStructuredSelection selection) {
		super("UCMImportSecondPage", selection);
		this.workbench = workbench;
		this.setTitle(Helper.WIZARD_P2_TITLE);
		this.setDescription(Helper.WIZARD_P2_DESCRIPTION);

        this.setImageDescriptor(Helper.IMPORT_WIZARD_BANNER);
    }

    public void setModel(ScenarioGroup model) {
        this.model = model;
    }

    public void createControl(Composite parent) {
        super.createControl(parent);
        setFileName(DEFAULT_FILE_NAME.format(new Object[] {new Integer(exampleCount)}));
        setPageComplete(validatePage());
    }
    
	/**
	 * 
	 * Makes sure the new page name complies with the extension constraint
	 *
	 */
	protected boolean validatePage()
	{
		boolean result = super.validatePage();
		if (result)
		{
			String fileName = getFileName();
			if (!fileName.endsWith(Helper.EXTENSION_SCENARIOS))
			{
				result = false;
				setErrorMessage(Helper.WIZARD_P2_WRONG_EXT_ERROR);
			}
		}
		return result;
	}

	protected InputStream getInitialContents()
	{
		ScenarioGroup ld = model;
		ByteArrayInputStream bais = null;
		try
		{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(ld);
			oos.flush();
			oos.close();
			baos.close();
			bais = new ByteArrayInputStream(baos.toByteArray());
			bais.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return bais;
	}
	
	/**
	 * 
	 * Creates new file and opens editor window in Eclipse
	 *
	 */
    public boolean finish() {
        IFile newFile = createNewFile();
        if (newFile == null) {
            return false;
        }

        IWorkbenchWindow dwindow = workbench.getActiveWorkbenchWindow();
        try {
            IWorkbenchPage page = dwindow.getActivePage();
            if (page != null) {
                IDE.openEditor(page, newFile);
            }
        } catch (org.eclipse.ui.PartInitException e) {
            e.printStackTrace();
            return false;
        }
        
        exampleCount++;
        return true;
    }

}
