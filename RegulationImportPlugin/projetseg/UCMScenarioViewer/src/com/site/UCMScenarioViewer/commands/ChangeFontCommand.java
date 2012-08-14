/*
 * Created on 29.03.2005
 */
package com.site.UCMScenarioViewer.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.swt.graphics.FontData;

import com.site.UCMScenarioViewer.UCMScenarioViewer;

/**
 * Implementation of 'font switching' command.
 */
public class ChangeFontCommand extends Command {

	private FontData newFont = UCMScenarioViewer.getApplicationFont().getFontData()[0];
	private FontData oldFont = UCMScenarioViewer.getApplicationFont().getFontData()[0];
	

	public ChangeFontCommand(FontData newFont) {
		this.newFont = newFont;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return oldFont.getHeight() != newFont.getHeight()
			|| oldFont.getStyle() != newFont.getStyle()
			|| !oldFont.getName().equals(newFont.getName());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
        redo();
	}
    
    public void redo() {
    	UCMScenarioViewer.setApplicationFont(newFont);
    }
    
    public void undo() {
    	UCMScenarioViewer.setApplicationFont(oldFont);
    }
    
}
