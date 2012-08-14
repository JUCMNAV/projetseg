/*
 * Created on 05.03.2005
 */
package com.site.UCMScenarioViewer.commands;

import org.eclipse.gef.commands.Command;

import com.site.UCMScenarioViewer.model.Scenario;

/**
 * Helps manage reordering of lifelines when user drags a life line in the outline 
 * tree view and drops it in a different location by responding to user actions in the
 * view and delivering user changes to the model.
 */
public class ReorderLifeLinesCommand extends Command {

	private Scenario scenario;
	private int oldIndex = -1;
	private int newIndex = -1;
	
	/**
	 * Default constructor.
	 */
	public ReorderLifeLinesCommand() {
		super();
	}

	/**
	 * @param label
	 */
	public ReorderLifeLinesCommand(String label) {
		super(label);
	}
	
	public ReorderLifeLinesCommand(Scenario scenario, int oldIndex, int newIndex) {
		this.scenario = scenario;
		this.oldIndex = oldIndex;
		this.newIndex = newIndex;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return super.canExecute() && scenario != null && oldIndex >= 0 && newIndex >= 0;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		scenario.insertLifeLine(oldIndex, newIndex);
	}
}
