/*
 * Created on 13-Feb-2005
 *
 */
package com.site.UCMScenarioViewer.actions;


import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.actions.ZoomInRetargetAction;
import org.eclipse.gef.ui.actions.ZoomOutRetargetAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;

import com.site.UCMScenarioViewer.utils.Helper;

/**
 * Responsible for adding buttons to Eclipse's editor panel (zoom -in and -out functionality
 * and font change functionality). 
 */
public class UCMScenarioViewerActionBarContributor extends ActionBarContributor {

	/**
	 * Default constructor
	 */
	public UCMScenarioViewerActionBarContributor() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.ActionBarContributor#buildActions()
	 */
	protected void buildActions() {
		addRetargetAction(new ZoomInRetargetAction());
		addRetargetAction(new ZoomOutRetargetAction());
		addRetargetAction(new SetFontRetargetAction());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.ActionBarContributor#declareGlobalActionKeys()
	 */
	protected void declareGlobalActionKeys() {

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToToolBar(org.eclipse.jface.action.IToolBarManager)
	 */
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator());	
		String[] zoomStrings = new String[] {	ZoomManager.FIT_ALL, 
												ZoomManager.FIT_HEIGHT, 
												ZoomManager.FIT_WIDTH	};
		toolBarManager.add(new ZoomComboContributionItem(getPage(), zoomStrings));
		toolBarManager.add(getAction(Helper.SET_FONT_ACTION_ID));
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToMenu(org.eclipse.jface.action.IMenuManager)
	 */
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);
		MenuManager viewMenu = new MenuManager("UCM Diagram Viewer");
		viewMenu.add(getAction(GEFActionConstants.ZOOM_IN));
		viewMenu.add(getAction(GEFActionConstants.ZOOM_OUT));
		viewMenu.add(new Separator());
		viewMenu.add(getAction(Helper.SET_FONT_ACTION_ID));
		viewMenu.add(new Separator());
		menuManager.insertAfter(IWorkbenchActionConstants.M_EDIT, viewMenu);

	}
}
