/*
 * Created on 30.03.2005
 */
package com.site.UCMScenarioViewer.actions;

import org.eclipse.ui.actions.RetargetAction;
import com.site.UCMScenarioViewer.utils.Helper;

/**
 * Contains constructors only. Methods are called from the parent class
 * 
 * @author Sasha
 *
 */
public class SetFontRetargetAction extends RetargetAction {

	/**
	 * Constructor
	 * 
	 * @param actionID
	 * @param text
	 */
	public SetFontRetargetAction(String actionID, String text) {
		super(actionID, text);
	}

	/**
	 * Constructor
	 * 
	 * @param actionID
	 * @param text
	 * @param style
	 */
	public SetFontRetargetAction(String actionID, String text, int style) {
		super(actionID, text, style);
	}
	
	/**
	 * Constructor
	 */
	public SetFontRetargetAction() {
		super(Helper.SET_FONT_ACTION_ID, Helper.SET_FONT_ACTION_TEXT);
		setToolTipText(Helper.SET_FONT_ACTION_TEXT);
		setImageDescriptor(Helper.FONT_CHANGE_BUTTON);
	}


}
