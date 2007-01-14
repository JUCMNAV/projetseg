/*
 * Created on 29.03.2005
 */
package com.site.UCMScenarioViewer.actions;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.ui.IWorkbenchPart;

import com.site.UCMScenarioViewer.UCMScenarioViewer;
import com.site.UCMScenarioViewer.commands.ChangeFontCommand;
import com.site.UCMScenarioViewer.utils.Helper;

/**
 * Set up of button for font switching.
 * 
 * @author Sasha
 */
public class SetFontAction extends WorkbenchPartAction {

	private UCMScenarioViewer viewer;
	
	/**
	 * Constructor
	 * @param part
	 */
	public SetFontAction(IWorkbenchPart part) {
		super(part);
		viewer = (UCMScenarioViewer)part;
		setText(Helper.SET_FONT_ACTION_TEXT);
		setId(Helper.SET_FONT_ACTION_ID);
		setToolTipText(Helper.SET_FONT_ACTION_TEXT);
		setImageDescriptor(Helper.FONT_CHANGE_BUTTON);
	}

	/**
	 * Constructor
	 * 
	 * @param part
	 * @param style
	 */
	public SetFontAction(IWorkbenchPart part, int style) {
		super(part, style);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	protected boolean calculateEnabled() {
		return !viewer.getMSCDiagram().getTreeChildren().isEmpty();
	}
	
	/**
	 * Creates the command for changing fonts
	 * @param fontData - <code>org.eclipse.swt.graphics.FontData</code> object contains
	 * font size, style, name/type
	 * @return <code>com.site.UCMScenarioViewer.commands.ChangeFontCommand</code> command
	 * the execution of which initiate the font change
	 */
	private Command getCommand(FontData fontData) {
		return new ChangeFontCommand(viewer.getMSCDiagram().getSelectedScenario(), 
				viewer.getMSCDiagram().getSelectedScenario().getFont().getFontData()[0],
				fontData);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IAction#run()
	 */
	public void run() {
		FontDialog fontDialog = new FontDialog(getWorkbenchPart().getSite().getShell());
		fontDialog.setFontList(viewer.getMSCDiagram().getSelectedScenario().getFont().getFontData());
		FontData fontData = fontDialog.open();
		if (fontData != null) {
			execute(getCommand(fontData));
		}
	}
}
