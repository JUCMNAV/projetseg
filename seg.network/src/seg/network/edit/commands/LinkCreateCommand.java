/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.edit.commands;

import org.eclipse.gef.commands.Command;

import seg.network.model.network.Link;
import seg.network.model.network.Network;
import seg.network.model.network.Node;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LinkCreateCommand extends Command {
	
	private static final String ConnectionCommand_Label = "link";
	private static final String ConnectionCommand_Description = "link connection command";
	
	protected Node source;
	protected Node target;
	protected Link link;

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		if(source == null || target == null || link == null || source == target)
			return false;
		else
			return true;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		Network network = target.getNetwork();
		link.setNetwork(network);
		network.getLinks().add(link);
		source.getDownstreamLinks().add(link);
		target.getUpstreamLinks().add(link);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		execute();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		source.getDownstreamLinks().remove(link);
		target.getUpstreamLinks().remove(link);
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
	/**
	 * @return Returns the source.
	 */
	public Node getSource() {
		return source;
	}
	/**
	 * @param source The source to set.
	 */
	public void setSource(Node source) {
		this.source = source;
	}
	/**
	 * @return Returns the target.
	 */
	public Node getTarget() {
		return target;
	}
	/**
	 * @param target The target to set.
	 */
	public void setTarget(Node target) {
		this.target = target;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#getLabel()
	 */
	public String getLabel() {
		return ConnectionCommand_Label;
	}
}
