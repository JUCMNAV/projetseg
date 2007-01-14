/*
 * Created on 29.03.2005
 */
package com.site.UCMScenarioViewer.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.swt.graphics.FontData;

import com.site.UCMScenarioViewer.model.Scenario;

/**
 * Implementation of 'font switching' command.
 */
public class ChangeFontCommand extends Command {

	private Scenario scenario;
	private FontData newFont;
	private FontData oldFont;
	
	/**
	 * Default constructor.
	 */
	public ChangeFontCommand() {
		super();
	}

	/**
	 * @param label
	 */
	public ChangeFontCommand(String label) {
		super(label);
	}
	
	public ChangeFontCommand(Scenario scenario, FontData oldFont, FontData newFont) {
		this.scenario = scenario;
		this.oldFont = oldFont;
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
		scenario.changeFont(oldFont, newFont);
	}
}
