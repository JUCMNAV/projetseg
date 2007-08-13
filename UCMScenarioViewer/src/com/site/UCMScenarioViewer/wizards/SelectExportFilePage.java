/*
 * Created on 31-Mar-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.wizards;

import java.io.File;

import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.site.UCMScenarioViewer.UCMScenarioViewer;
import com.site.UCMScenarioViewer.utils.Helper;


/**
 * @author mkova062
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SelectExportFilePage extends WizardPage implements SelectionListener{

    
    public static final String TITLE = "Save diagram to file";
    public static final String DESCRIPTION = "Save diagram to image file of desired format";

    private static final String LABEL = "Select file to save diagram to";
    private static final String BROWSE_TEXT = "Browse";
    private static final String INVALID_PATH_ERROR = "Selected path is invalid";
    private static final String CANT_WRITE_ERROR = "Can't overwrite selected file";
    private static final String NOT_SELECTED_ERROR = "Diagram is not selected";
    
    private static final int PNG_TYPE = 0;
    private static final int BMP_TYPE = 1;
    private static final int JPG_TYPE = 2;

    private UCMScenarioViewer viewer;
    private Shell shell;
    private Label label;
    private Text fileField;
    private Button browseButton;
    private Group group;
    private Button png;
    private Button bmp;
    private Button jpeg;
    private int fileType = PNG_TYPE; // .png by default

    public SelectExportFilePage(Shell shell) {
        super("selectDiagramTypeAndFilePage", TITLE, Helper.EXPORT_WIZARD_BANNER);
        this.shell = shell;
        setDescription(DESCRIPTION);
    }

    // Page data manipulation
    public void setViewer(UCMScenarioViewer viewer) {
        this.viewer = viewer;
        setDefaultFileName();
    }

    public boolean export() {
        if (viewer == null) {
            return false;
        }
        
        GraphicalViewer gv = (GraphicalViewer)viewer.getAdapter(GraphicalViewer.class);
        
        if (gv == null) {
            return false;
        }
        
        try {
            // get root figure 
            IFigure f = ((ScalableFreeformRootEditPart)gv.getRootEditPart()).getLayer(LayerConstants.PRINTABLE_LAYERS);
            
            // create image from root figure
            Image img = new Image(null, f.getSize().width, f.getSize().height);
            GC gc = new GC(img);
            Graphics graphics = new SWTGraphics(gc);
            graphics.translate(f.getBounds().getLocation());
            f.paint(graphics);
            graphics.dispose();
            gc.dispose();
            
            // save image to file
            ImageLoader il = new ImageLoader();
            il.data = new ImageData[]{img.getImageData()};
            if (fileType == PNG_TYPE)
            	il.save(fileField.getText(), SWT.IMAGE_PNG);
            else if (fileType == BMP_TYPE)
            	il.save(fileField.getText(), SWT.IMAGE_BMP_RLE);
            else if (fileType == JPG_TYPE)
            	il.save(fileField.getText(), SWT.IMAGE_JPEG);
        } catch (Exception e) {
            MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
            messageBox.setText("Error");
            messageBox.setMessage(e.getMessage());
            messageBox.open();
            return false;
        }
        
        return true;
    }

    // Page validation
    protected void validatePage(boolean showErrorMessage) {
        String errorMessage = testPathValid();

        errorMessage = errorMessage == null ? testCanWrite() : errorMessage;
        errorMessage = errorMessage == null ? testViewer() : errorMessage;

        setErrorMessage(showErrorMessage ? errorMessage : null);
        setPageComplete(errorMessage == null);
    }

    private String testPathValid() {
        return "".equals(fileField.getText()) || !Path.EMPTY.isValidPath(fileField.getText()) ?
                INVALID_PATH_ERROR :
                null;
    }

    private String testCanWrite() {
        File file = new File(fileField.getText());
        return file.exists() && !file.canWrite() ? CANT_WRITE_ERROR : null;
    }

    private String testViewer() {
        return viewer == null ? NOT_SELECTED_ERROR : null;
    }

    // Page controls
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new FormLayout());
        setControl(composite);

        createLabel(composite);
        createFileField(composite);
        createBrowseButton(composite);
        createGroup(composite);
                
        hookBrowseSelected();
        hookFileFieldChanged();

        validatePage(false);
    }

    private void createLabel(Composite parent) {
        label = new Label(parent, SWT.NONE);
        label.setText(LABEL);

        FormData formData = new FormData();
        formData.top = new FormAttachment(group, 10, SWT.BOTTOM);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(100, 0);
        label.setLayoutData(formData);
    }
    
    private void createGroup(Composite parent) {
        Group group = new Group(parent,SWT.NONE);
    	group.setLayout(new GridLayout());
    	group.setText("Image file formats:"); 
    	group.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));

    	png = new Button(group,SWT.RADIO);
    	png.setText(".PNG format file (best results for Web and printed documents)");
    	png.addSelectionListener(this);
    	png.setSelection(true);
    	
    	bmp = new Button(group,SWT.RADIO);
    	bmp.setText(".BMP format file");
    	bmp.addSelectionListener(this);

    	jpeg = new Button(group, SWT.RADIO);
    	jpeg.setText(".JPEG format file");
    	jpeg.addSelectionListener(this);

        FormData formData = new FormData();
        formData.top = new FormAttachment(20, 0);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(100, 0);
        group.setLayoutData(formData);
    }

    private void createFileField(Composite parent) {
        fileField = new Text(parent, SWT.LEFT | SWT.SINGLE | SWT.BORDER);

        setDefaultFileName();

        FormData data = new FormData();
        data.top = new FormAttachment(label, 5);
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, -80);
        fileField.setLayoutData(data);
    }

    private void createBrowseButton(Composite parent) {
        browseButton = new Button(parent, SWT.NONE);
        browseButton.setText(BROWSE_TEXT);

        FormData formData = new FormData();
        formData.top = new FormAttachment(label, 5);
        formData.bottom = new FormAttachment(fileField, 0, SWT.BOTTOM);
        formData.left = new FormAttachment(fileField, 5);
        formData.right = new FormAttachment(100, 0);
        browseButton.setLayoutData(formData);
    }

    private void hookFileFieldChanged() {
        fileField.addModifyListener(
                new ModifyListener() {
                    public void modifyText(ModifyEvent e) {
                        validatePage(true);
                    }
                });
    }

    private void hookBrowseSelected() {
        browseButton.addSelectionListener(
                new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        FileDialog fileDialog = new FileDialog(shell);
                        fileDialog.setFileName(fileField.getText());
                        String file = fileDialog.open();
                        if (file != null) {
                            fileField.setText(file);
                            validatePage(true);
                        }
                    }
                });
    }

    // Convenience
    private void setDefaultFileName() {
        if (fileField != null && viewer != null) {
            String fileName = viewer.getMSCDiagram().getSelectedScenario().getName() + getFileExtension();
            File fileFolder = new File(fileField.getText()).getParentFile();
            String filePath = new File(fileFolder, fileName).getPath();
            fileField.setText(filePath);
        }
    }

    /**
     * @see org.eclipse.swt.events.SelectionListener#widgetSelected(SelectionEvent)
     */
    public void widgetSelected(SelectionEvent e) {
    	if( e.getSource() == png ){
    		fileType = PNG_TYPE;
    		setFileExtension();
    	} else if (e.getSource() == bmp){
    		fileType = BMP_TYPE;
    		setFileExtension();
    	}
    	else {
    		fileType = JPG_TYPE;
    		setFileExtension();
    	}
    }
    
    private void setFileExtension() {
    	String fileName = fileField.getText();
    	String result = fileName.substring(0, fileName.lastIndexOf('.')).concat(getFileExtension());
    	fileField.setText(result);
    }
    
    private String getFileExtension() {
    	if (fileType == PNG_TYPE)
    		return ".png";
    	if (fileType == BMP_TYPE)
    		return ".bmp";
    	return ".jpg";
    }

    /**
     * Empty method
     */
    public void widgetDefaultSelected(SelectionEvent e) {

    }
}
