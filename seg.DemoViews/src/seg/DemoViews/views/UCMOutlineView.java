/*
 * Created on 12-Feb-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.DemoViews.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.part.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.graphics.*;

/**
 * @author jpdaigle
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class UCMOutlineView extends ViewPart {

	private Tree t;
	
	public UCMOutlineView() {
		// ctor
		super();
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		t = new Tree(parent, 0);
		fillTreeItemsDummy(parent);
	}

	private void fillTreeItemsDummy(Composite parent) {
		
		TreeItem tiOutlineComponents = new TreeItem(t,0);
		tiOutlineComponents.setText("Components");
		
		// it don't work :(
		//tiOutlineComponents.setImage(new Image(parent.getDisplay(),"icons/fldr_obj.gif"));

		TreeItem tiOutlineResponsibilities = new TreeItem(t,0);
		tiOutlineResponsibilities.setText("Responsibilities");

		for(int i=0; i<5; i++) {
			TreeItem tiInnerNodeComponent = new TreeItem(tiOutlineComponents,0);
			tiInnerNodeComponent.setText("Component " + i);
			
			TreeItem tiInnerNodeResponsibility = new TreeItem(tiOutlineResponsibilities,0);
			tiInnerNodeResponsibility.setText("Responsibility " + i);
		}
		
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPart#setFocus()
	 */
	public void setFocus() {
		// TODO Auto-generated method stub
		t.setFocus();
	}

}
