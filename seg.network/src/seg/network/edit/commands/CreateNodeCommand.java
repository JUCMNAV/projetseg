/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.edit.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import seg.network.model.network.Network;
import seg.network.model.network.Node;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CreateNodeCommand extends Command {
	
	private static final String	CreateCommand_Label = "CreateNodeCommand";
	private Node node;
	private Point location;
	private Network parent;
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		parent.getNodes().add(node);
		if(location != null){
			node.setX(location.x);
			node.setY(location.y);
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		parent.getNodes().add(node);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		parent.getNodes().remove(node);
	}
	
	/**
	 * @return Returns the location.
	 */
	public Point getLocation() {
		return location;
	}
	/**
	 * @param location The location to set.
	 */
	public void setLocation(Point location) {
		this.location = location;
	}
	/**
	 * @return Returns the node.
	 */
	public Node getNode() {
		return node;
	}
	/**
	 * @param node The node to set.
	 */
	public void setNode(Node node) {
		this.node = node;
	}
	/**
	 * @return Returns the parent.
	 */
	public Network getParent() {
		return parent;
	}
	/**
	 * @param parent The parent to set.
	 */
	public void setParent(Network parent) {
		this.parent = parent;
	}
}
