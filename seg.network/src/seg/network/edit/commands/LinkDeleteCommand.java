/*
 * Created on 2005-02-08
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
public class LinkDeleteCommand extends Command {
	
	private Network network;
	private Link link;
	private Node source;
	private Node target;
	
	public boolean canExecute() {
		return link != null;
	}
	
	public void execute() {
		source = link.getSource();
		target = link.getTarget();
		network = link.getNetwork();
		redo();
	}
	public void redo() {
		target.getUpstreamLinks().remove(link);
		source.getDownstreamLinks().remove(link);
		network.getLinks().remove(link);
	}
	public void undo() {
		network.getLinks().add(link);
		target.getUpstreamLinks().add(link);
		source.getDownstreamLinks().add(link);
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
