/*
 * Created on 04.03.2005
 */
package com.site.UCMScenarioViewer.commands;

import org.eclipse.gef.commands.Command;

import com.site.UCMScenarioViewer.model.ScenarioGroup;

/**
 * Helps manage user action of picking a different scenario in the outline 
 * tree view by responding to user actions in the view and delivering user changes to the model.
 */
public class SwitchScenarioCommand extends Command {

	private ScenarioGroup group;
	private int number = -1;
	
	/**
	 * Default constructor.
	 */
	public SwitchScenarioCommand() {
		super();
	}

	/**
	 * @param label
	 */
	public SwitchScenarioCommand(String label) {
		super(label);
	}
	
	/**
	 * @param group
	 * @param number
	 */
	public SwitchScenarioCommand(ScenarioGroup group, int number) {
		this.group = group;
		this.number = number;
	}
		
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return super.canExecute() && group != null && number >= 0;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		if (canExecute()) {
			group.setSelectedScenario(number);
		}
	}
}
