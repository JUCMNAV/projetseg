package seg.jUCMNav.views.wizards;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import seg.jUCMNav.model.ModelCreationFactory;
import urn.URNlink;
import urn.URNspec;
import urncore.Metadata;

public class URNlinkTypeSelectionDialog extends Dialog {
	
	private Combo modeSelection = null;
	private Label entryLabel = null;
	private Text typeEntry = null;
	private Label listLabel = null;
	private List typesList = null;
	private Button renameButton = null;
	private Button deleteButton = null;
	
	private String title, message, initialType, acceptLabel, cancelLabel;
    private URNspec urn; // The urnspec of the current model

	final private int minWidth = 300, EXISTING_TYPE = 0, NEW_TYPE = 1;
	private int currentMode;
	public static String linkType = null;
	
	public URNlinkTypeSelectionDialog( Shell parent, URNspec urn, String title, String message, String initialType, String acceptLabel, String cancelLabel )
	{
		super(parent);
		this.urn = urn;
		this.title = title;
		this.message = message;
		this.initialType = initialType;
		this.acceptLabel = acceptLabel;
		this.cancelLabel = cancelLabel;
	}

	public String open()
	{
		FormData formData;
		Point size;

		String [] modes = { "Select existing URN Link Type", "Specify New URN Link Type" };
		
        Shell parent = getParent();
        final Shell shell = new Shell(parent, SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL | SWT.CENTER | SWT.RESIZE);

        shell.setText(title);
        
		FormLayout shellFormLayout = new FormLayout();
        shellFormLayout.marginWidth = 3;
        shellFormLayout.marginHeight = 3;
        shell.setLayout( shellFormLayout );
        
        // top level shell widgets
        Label messageLabel = new Label( shell, SWT.LEFT );
        messageLabel.setText(message);
        
		size = messageLabel.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x, size.y );
		formData.left = new FormAttachment( 0, 5 );
		formData.top = new FormAttachment( 0, 5 );
		messageLabel.setLayoutData( formData );

		modeSelection = new Combo( shell, SWT.DROP_DOWN|SWT.READ_ONLY );
		modeSelection.setItems( modes );
		modeSelection.addSelectionListener( new SelectionListener() {
		      public void widgetSelected(SelectionEvent e) {
		    	  setMode();
		      }

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		size = modeSelection.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x, size.y );
		formData.left = new FormAttachment( 0, 5 );
		formData.top = new FormAttachment( messageLabel, 5 );
		modeSelection.setLayoutData( formData );

		entryLabel = new Label( shell, SWT.LEFT );
		entryLabel.setText( "Please enter a new Link Type" );
		
		size = entryLabel.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x, size.y );
		formData.left = new FormAttachment( 0, 5 );
		formData.top = new FormAttachment( modeSelection, 5 );
		entryLabel.setLayoutData( formData );

		typeEntry = new Text( shell, SWT.SINGLE | SWT.LEFT | SWT.BORDER );
		size = typeEntry.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x, size.y );
		formData.left = new FormAttachment( 0, 5 );
		formData.top = new FormAttachment( entryLabel, 5 );
		formData.right = new FormAttachment( 100, -5 );
		typeEntry.setLayoutData( formData );

		// Composite container for types list and children
		Composite typesListComposite = new Composite( shell, SWT.BORDER );
		
		FormLayout nestedFormLayout = new FormLayout();
		typesListComposite.setLayout(nestedFormLayout);

		// forward reference to top level shell button for layout binding purposes
		Button cancelButton = new Button(shell, SWT.PUSH);

		listLabel = new Label( typesListComposite, SWT.LEFT );
		listLabel.setText( "URN Link Types" );
		
		size = listLabel.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x, size.y );
		formData.left = new FormAttachment( 0, 5 );
		formData.top = new FormAttachment( 0, 5 );
		listLabel.setLayoutData( formData );
		
		typesList = new List( typesListComposite, SWT.SINGLE | SWT.BORDER | SWT.SCROLL_LINE | SWT.V_SCROLL );

		// forward reference to button at bottom of List for layout binding purposes
		renameButton = new Button( typesListComposite, SWT.PUSH );

		formData = new FormData( minWidth, 5*size.y );
		formData.top = new FormAttachment( listLabel, 5 );
		formData.left = new FormAttachment( 0, 5 );
		formData.right = new FormAttachment( 100, -5 );
		formData.bottom = new FormAttachment( renameButton, -5 );
		typesList.setLayoutData( formData );
		
		typesList.addMouseListener( new MouseListener() {
			public void mouseDoubleClick(MouseEvent e) {
		    	  setType();
		    	  shell.close();
			}
			public void mouseDown(MouseEvent e) {}
			public void mouseUp(MouseEvent e) {
				
			}
		});
		
        renameButton.setText( "Rename Link Type" );
		
		size = renameButton.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x+8, size.y );
		formData.left = new FormAttachment( 0, 5 );
		formData.bottom = new FormAttachment( 100, -5 );
		renameButton.setLayoutData( formData );
		
		renameButton.addSelectionListener( new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				renameLinkType();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});		

		deleteButton = new Button( typesListComposite, SWT.PUSH );
        deleteButton.setText( "Delete Link Type" );
		
		size = deleteButton.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x+8, size.y );
		formData.left = new FormAttachment( renameButton, 5 );
		formData.bottom = new FormAttachment( 100, -5 );
		deleteButton.setLayoutData( formData );
		
		deleteButton.addSelectionListener( new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				deleteLinkType();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});		

		this.populateTypesList( true );
		
		size = typesListComposite.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x, size.y );
		formData.left = new FormAttachment( 0, 5 );
		formData.top = new FormAttachment( typeEntry, 5 );
		formData.right = new FormAttachment( 100, -5 );
		formData.bottom = new FormAttachment( cancelButton, -30 );
		typesListComposite.setLayoutData( formData );

        // top level shell widgets
        Button OK_Button = new Button(shell, SWT.PUSH);
        OK_Button.setText( acceptLabel );
		
		size = OK_Button.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x+8, size.y );
		formData.right = new FormAttachment( 100, -5 );
		formData.bottom = new FormAttachment( 100, -5 );
		OK_Button.setLayoutData( formData );

		OK_Button.addSelectionListener( new SelectionListener() {
		      public void widgetSelected(SelectionEvent e) {
		    	  setType();
		    	  shell.close();
		      }

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});		
		
		cancelButton.setText( cancelLabel );
		size = cancelButton.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		formData = new FormData( size.x+8, size.y );
		formData.right = new FormAttachment( OK_Button, -5 );
		formData.bottom = new FormAttachment( 100, -5 );
		cancelButton.setLayoutData( formData );
        
		cancelButton.addSelectionListener( new SelectionListener() {
		      public void widgetSelected(SelectionEvent e) {
		    	  linkType = null;
		    	  shell.close();
		      }

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		modeSelection.select( 0 );
		this.setMode();
		
		shell.pack();
		
		final Point minSize = shell.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		shell.setMinimumSize(minSize);
		shell.setSize(minSize);

		shell.open();
		
        Display display = parent.getDisplay();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }

		return linkType;
	}
	
	private void setMode()
	{
		currentMode = modeSelection.getSelectionIndex();
		switch( currentMode ) {
		case EXISTING_TYPE:
			entryLabel.setEnabled( false );
			typeEntry.setEnabled( false );
			listLabel.setEnabled( true );
			typesList.setEnabled( true );
			renameButton.setEnabled( true );
			deleteButton.setEnabled( true );
			break;
		case NEW_TYPE:
			entryLabel.setEnabled( true );
			typeEntry.setEnabled( true );
			listLabel.setEnabled( false );
			typesList.setEnabled( false );
			renameButton.setEnabled( false );
			deleteButton.setEnabled( false );
			break;
		}
	}
	
	private void setType()
	{
		switch( currentMode ) {
		case EXISTING_TYPE:
			if( typesList.getSelectionCount() > 0 ) {
				linkType = new String( (typesList.getSelection())[0] );
			} else {
				linkType = null;
			}
			break;
		case NEW_TYPE:
			linkType = new String( typeEntry.getText() );
			this.addNewLinkType();
			break;
		}		
	}
	
	private void addNewLinkType()
	{
		if( urn == null ) return;

		// check if new type already exists in types list
		for( String existingType: typesList.getItems() ) {
			if( linkType.contentEquals( existingType ))
				return;	
		}
		
		// add new Link Type to URNspec metadata
		Metadata newType = (Metadata) ModelCreationFactory.getNewObject(urn, Metadata.class);
		newType.setName( "UrnLinkType" );
		newType.setValue( linkType );
		urn.getMetadata().add( newType );
	}

	private void renameLinkType()
	{
		String title, message, editedType = null;
		int existingCount;
		
		if( typesList.getSelectionCount() == 0 )
			return;
		
		String linkType = typesList.getSelection()[0];
		
		// determine how many existing URN Links use this type
		Vector<URNlink> existingLinks = new Vector<URNlink>();

		for( Iterator iter = urn.getUrnLinks().iterator(); iter.hasNext(); ) {
			URNlink currentLink = (URNlink) iter.next();
			if( currentLink.getType() != null ) {
				if( currentLink.getType().contentEquals(linkType) ) {
					existingLinks.add(currentLink);
				}
			}
		}

		// allow user to edit existing Type
		title = "Rename Link Type";
		
		if( (existingCount = existingLinks.size()) > 0 ) {
			StringBuilder messageBuf = new StringBuilder();
			messageBuf.append( "The selected Link Type \"" + linkType + "\" is referenced by " + existingCount + " URN Link" );
			if( existingCount == 1 ) {
				messageBuf.append( ". This reference will be renamed." );
			} else {
				messageBuf.append( "s. These references will be renamed." );
			}
			message = messageBuf.toString();
		} else {
			message = "Please rename the Link Type";
		}

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		InputDialog typeInput = new InputDialog( shell, title, message, linkType, null);
    	
		if( typeInput.open() == SWT.CANCEL )
    		return;
    	
    	if( (editedType = typeInput.getValue()) == null)
    		return;
    	
		if( linkType.contentEquals(editedType) )
			return; // no change to type string
		
		Metadata renamedTypeMD = null;

		for( Iterator iter = urn.getMetadata().iterator(); iter.hasNext(); ) {
			Metadata md = (Metadata) iter.next();
			if( md.getName().contentEquals( "UrnLinkType" )) {
				if( md.getValue().contentEquals(linkType)) {
					renamedTypeMD = md;
					break;
				}
			}
		}

		if( renamedTypeMD != null ) {
			renamedTypeMD.setValue(editedType);
		}
		
		for( URNlink el : existingLinks ) {
			el.setType( editedType );
		}
		
		this.populateTypesList( false );
	}

	private void deleteLinkType()
	{
		final int CANCEL = 0;
		final int SET_EMPTY = 1;
		final int NO_CHANGE = 2;
		int existingCount, userChoice = CANCEL;

		if( typesList.getSelectionCount() == 0 )
			return;
		
		String linkType = typesList.getSelection()[0];
		
		// determine how many existing URN Links use this type
		Vector<URNlink> existingLinks = new Vector<URNlink>();

		for( Iterator iter = urn.getUrnLinks().iterator(); iter.hasNext(); ) {
			URNlink currentLink = (URNlink) iter.next();
			if( currentLink.getType() != null ) {
				if( currentLink.getType().contentEquals(linkType) ) {
					existingLinks.add(currentLink);
				}
			}
		}
		
		if( (existingCount = existingLinks.size()) > 0 ) {
			// prompt use how to handle deletion of referenced links, provide Cancel option
			
			final String title = "Deletion of Referenced URN Link Type";
			final String message = "The selected Link Type \"" + linkType + "\" is referenced by " + existingCount + " URN Link" + ((existingCount == 1) ? "" : "s") 
					+ ". Do you wish to set these references to empty strings or leave them untouched ? Warning: This operation is not undoable";
			final String[] labels = { "Cancel Delete", "Set to empty string", "Leave untouched" };

			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			MessageDialog md = new MessageDialog( shell, title, null, message, MessageDialog.QUESTION, labels, CANCEL );
			md.create();
			userChoice = md.open();

			if( userChoice == CANCEL) {
				return;
			} else if( userChoice == SET_EMPTY ) {
				for( URNlink el : existingLinks ) {
						el.setType( "" );
				}				
			}
		}
		
		Metadata deletedType = null;

		for( Iterator iter = urn.getMetadata().iterator(); iter.hasNext(); ) {
			Metadata md = (Metadata) iter.next();
			if( md.getName().contentEquals( "UrnLinkType" )) {
				if( md.getValue().contentEquals(linkType)) {
					deletedType = md;
					break;
				}
			}
		}

		if( deletedType != null ) {
			urn.getMetadata().remove(deletedType);
		}
		this.populateTypesList( false );
	}
	
	
	
	private void populateTypesList( boolean highlight )
	{
		int index = 0;
		boolean select = false;
		
		if( urn == null ) return;
		typesList.removeAll();

		if( highlight ) {
			if( (initialType != null) && !initialType.contentEquals("") ) {
				select = true;
			}
		}
		
		for( Iterator iter = urn.getMetadata().iterator(); iter.hasNext(); ) {
			Metadata md = (Metadata) iter.next();
			if( md.getName().contentEquals( "UrnLinkType" )) {
				typesList.add( md.getValue() );
				if( select ) {
					if( md.getValue().contentEquals(initialType) ) {
						typesList.select(index);
					}
				}
				index++;
			}
			
		}
		
//		renameButton.setEnabled( false );
//		deleteButton.setEnabled( false );	
	}
	
	public static void main(String[] args) {
		
		URNlinkTypeSelectionDialog testDialog = new URNlinkTypeSelectionDialog( new Shell(), null, "Specify URN Link Type",
				"Create New Link or Modify Existing Link's Type", "", "Accept", "Cancel" );
		String response = testDialog.open();
		System.out.println( "The selection was \"" + response + "\"." );
	}

}
