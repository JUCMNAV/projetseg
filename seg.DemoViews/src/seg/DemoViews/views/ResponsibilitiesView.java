package seg.DemoViews.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.graphics.*;

public class ResponsibilitiesView extends ViewPart {

	private Label label1, label2;

	private Label label1_desc, label2_desc;

	private List list1;

	private Layout viewLayout;

	public ResponsibilitiesView() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		/*
		 * This kinda sucks right now because we're hard-coding data and
		 * hand-creating labels. In the future we'd probably get the data
		 * presentor to call a factory method to get bolded headers, or normal
		 * text labels, etc.
		 */

		viewLayout = new RowLayout(SWT.VERTICAL);
		parent.setLayout(viewLayout);

		FontData fdBold = parent.getFont().getFontData()[0];
		fdBold.setStyle(SWT.BOLD);

		label1 = new Label(parent, 0);
		label1.setText("Make Pizza");
		label1.setFont(new Font(parent.getDisplay(), fdBold));

		label1_desc = new Label(parent, SWT.WRAP);
		label1_desc.setText("Make a delicious new pizza.\n");

		Label labelSeparator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);

		label2 = new Label(parent, 0);
		label2.setText("Deliver Pizza");
		label2.setFont(new Font(parent.getDisplay(), fdBold));

		label2_desc = new Label(parent, SWT.WRAP);
		label2_desc.setText("Deliver the delicious pizza to waiting client.\n");

		labelSeparator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		// TODO Auto-generated method stub
		label1.setFocus();
	}

}