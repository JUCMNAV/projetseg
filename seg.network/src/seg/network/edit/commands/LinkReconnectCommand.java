/*
 * Created on 2005-02-09
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.edit.commands;

import org.eclipse.gef.commands.Command;

import seg.network.model.network.Link;
import seg.network.model.network.Node;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LinkReconnectCommand extends Command {
	
	private Link link;
	private Node oldSource;
	private Node newSource;
	
	private Node newTarget;
	private Node oldTarget;

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return link != null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		oldSource = link.getSource();
		oldTarget = link.getTarget();
		redo();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		// TODO Auto-generated method stub
		super.undo();
	}
	/**
	 * @return Returns the link.
	 */
	public Link getLink() {
		return link;
	}
	/**
	 * @param link The link to set.
	 */
	public void setLink(Link link) {
		this.link = link;
	}
}
