/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network.edit.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import seg.network.model.network.Node;

/**
 * @author Etienne Tremblay
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SetConstraintCommand extends Command {
	
	private static final String Command_Label_Location = "change location command";
	private static final String Command_Label_Resize = "resize command";
	private Point newPos;
	
	private Point oldPos;
	
	private Node node;

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		oldPos = new Point(node.getX(), node.getY());
		node.setX(newPos.x);
		node.setY(newPos.y);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		node.setX(newPos.x);
		node.setY(newPos.y);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		node.setX(oldPos.x);
		node.setY(oldPos.y);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#getLabel()
	 */
	public String getLabel() {
		return Command_Label_Resize;
	}

	/**
	 * @param newPos The newPos to set.
	 */
	public void setNewPos(Point newPos) {
		this.newPos = newPos;
	}
	
	/**
	 * @param node The node to set.
	 */
	public void setNode(Node node) {
		this.node = node;
	}
}
