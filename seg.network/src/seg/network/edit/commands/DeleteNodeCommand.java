/*
 * Created on 2005-02-07
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.edit.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.gef.commands.Command;

import seg.network.model.network.Link;
import seg.network.model.network.Network;
import seg.network.model.network.Node;

/**
 * @author Etienne Tremblay
 *
 */
public class DeleteNodeCommand extends Command {
	
	private static final String	DeleteCommand_Label = "DeleteNodeCommand";
	private Node toDelete; // The node to delete.
	private List source; // List of all the source nodes.
	private List target; // List of all the target nodes.
	private List downLinks; // Reference to the links going to target.
	private List upLinks; // Reference to the links coming from source.
	private Network network;
	
	public DeleteNodeCommand(){
		source = new ArrayList();
		target = new ArrayList();
		downLinks = new ArrayList();
		upLinks = new ArrayList();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		if(toDelete != null)
			return true;
		else
			return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		ListIterator it = toDelete.getDownstreamLinks().listIterator();
		while(it.hasNext()){
			Link link = (Link)it.next();
			target.add(link.getTarget());
		}
		downLinks.addAll(toDelete.getDownstreamLinks());
		
		it = toDelete.getUpstreamLinks().listIterator();
		while(it.hasNext()){
			Link link = (Link)it.next();
			source.add(link.getSource());
		}
		upLinks.addAll(toDelete.getUpstreamLinks());
		redo();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		removeLinks();
		network.getNodes().remove(toDelete);
	}
	
	private void removeLinks(){
		ListIterator it = toDelete.getDownstreamLinks().listIterator();
		while(it.hasNext()){
			Link link = (Link)it.next();
			Node target = link.getTarget();
			target.getUpstreamLinks().remove(link);
			network.getLinks().remove(link);
		}
		toDelete.getDownstreamLinks().clear();
		it = toDelete.getUpstreamLinks().listIterator();
		while(it.hasNext()){
			Link link = (Link)it.next();
			Node source = link.getSource();
			source.getDownstreamLinks().remove(link);
			network.getLinks().remove(link);
		}
		toDelete.getUpstreamLinks().clear();
	}
	
	private void addLinks(){
		int i=0;
		ListIterator it = downLinks.listIterator();
		while(it.hasNext()){
			Link link = (Link)it.next();
			((Node)(target.get(i++))).getUpstreamLinks().add(link);
			toDelete.getDownstreamLinks().add(link);
			network.getLinks().add(link);
		}
		i=0;
		it = upLinks.listIterator();
		while(it.hasNext()){
			Link link = (Link)it.next();
			((Node)(source.get(i++))).getDownstreamLinks().add(link);
			toDelete.getUpstreamLinks().add(link);
			network.getLinks().add(link);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		network.getNodes().add(toDelete);
		addLinks();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#getLabel()
	 */
	public String getLabel() {
		return DeleteCommand_Label;
	}
	
	/**
	 * @return Returns the toDelete.
	 */
	public Node getToDelete() {
		return toDelete;
	}
	
	/**
	 * @param toDelete The toDelete to set.
	 */
	public void setToDelete(Node toDelete) {
		this.toDelete = toDelete;
	}
	/**
	 * @return Returns the network.
	 */
	public Network getNetwork() {
		return network;
	}
	/**
	 * @param network The network to set.
	 */
	public void setNetwork(Network network) {
		this.network = network;
	}
}
