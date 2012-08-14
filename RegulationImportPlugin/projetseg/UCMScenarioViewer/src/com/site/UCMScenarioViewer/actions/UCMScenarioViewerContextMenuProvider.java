/*
 * Created on 13-Feb-2005
 *
 */
package com.site.UCMScenarioViewer.actions;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IMenuManager;

/**
 * Provides context menu support for main viewer. Currently inactive. Included 
 * mainly for possiblity of adding functionality in the future.
 * 
 * Many things commented out by DA to please the compiler...
 * 
 * @author oboyk022
 */
public class UCMScenarioViewerContextMenuProvider extends ContextMenuProvider {

//	private ActionRegistry actionRegistry;

	public UCMScenarioViewerContextMenuProvider(EditPartViewer viewer) {
		super(viewer);
	}

	public UCMScenarioViewerContextMenuProvider(EditPartViewer viewer, ActionRegistry registry) {
		super(viewer);
//		setActionRegistry(registry);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ContextMenuProvider#buildContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
	}
/*
	private ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	private void setActionRegistry(ActionRegistry registry) {
		actionRegistry = registry;
	}
*/
}
