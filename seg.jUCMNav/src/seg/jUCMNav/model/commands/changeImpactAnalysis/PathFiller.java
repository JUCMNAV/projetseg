package seg.jUCMNav.model.commands.changeImpactAnalysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import seg.jUCMNav.editors.UCMNavMultiPageEditor;
import seg.jUCMNav.editors.UrnEditor;
import seg.jUCMNav.editparts.NodeConnectionEditPart;
import seg.jUCMNav.model.ModelCreationFactory;
import seg.jUCMNav.model.commands.transformations.DividePathCommand;
import seg.jUCMNav.model.commands.transformations.SplitLinkCommand;
import ucm.map.NodeConnection;
import ucm.map.OrJoin;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.map.UCMmap;
import urn.URNspec;

/**
 * Used to add nodes to a specific path/branch
 * @author HsnKaff
 *
 */
public class PathFiller {

	public PathNode previousNode;
	public PathNode currentNode;
	public NodeConnection currentNodeConnection;
	/**
	 * add nodes sequentially to a path
	 * @param pathStartPoint startpoint of a path 
	 */
	public PathFiller(PathNode pathStartPoint) {
		currentNode=previousNode=pathStartPoint;
		currentNodeConnection=(NodeConnection) currentNode.getSucc().get(0);
	}
	
	/**
	 * traverse the path backwardly and gets its startPoint node. The path should be a straight path <b>(contains no Orjoins,AND-joins with multiple branches).
	 * @param startingLink: The starting link to start traversal
	 * @param Name: The desired name to be set for the start point
	 * @return The path's start point
	 */
	public StartPoint getPathSP(NodeConnection startingLink, String Name)
	{
	  StartPoint SP=null;
	  PathNode currentNode= (PathNode) startingLink.getSource();
	  
	  while(!(currentNode instanceof StartPoint))
	  {
		  currentNode=(PathNode) ((NodeConnection)currentNode.getPred().get(0)).getSource();
	  }
	  SP=(StartPoint) currentNode;
	  SP.setName(Name);
	  return SP;
	}
	
	/**
	 * Creates a new resp and add it to a target map within a specific link.
	 * @param TargetNodeConnection The link in which the new respRef will be placed
	 */
	public void createResp(String Name)
	{
		// get the target diagram
		UCMmap map=(UCMmap) currentNodeConnection.getDiagram();
		//get the current target
		URNspec urn=currentNodeConnection.getDiagram().getUrndefinition().getUrnspec();
		     //create a new respref instance
			//GetNewObject 
			RespRef RespInstance =(RespRef) ModelCreationFactory.getNewObject(urn, RespRef.class);
		RespInstance.setName(Name);
			/* we need to find the editPart of the target link
		 in order to access its its x and y coordinations
		these coordinations are necessary for command of creating resp 
		 we created finadEditPart function to do so. */ 
		EditPart editPart=findEditPart(currentNodeConnection);
		//this command will split the link and add the new respRef(it can be any pathNode) in the middle of it. 
		SplitLinkCommand comm = new SplitLinkCommand(map, RespInstance, currentNodeConnection,((NodeConnectionEditPart) editPart).getMiddlePoint().x, ((NodeConnectionEditPart) editPart).getMiddlePoint().y);
		comm.execute();
		previousNode=currentNode;
		currentNode=comm.getNode();
		currentNodeConnection=(NodeConnection) currentNode.getSucc().get(0);
	}
	
public void createStub(String Name)
{
	URNspec urn=currentNode.getDiagram().getUrndefinition().getUrnspec();
	Stub stub = (Stub) ModelCreationFactory.getNewObject(urn, Stub.class, 0);
	stub.setName(Name);
}

public void createORjoin()
{
	URNspec urn=currentNode.getDiagram().getUrndefinition().getUrnspec();
	OrJoin newORjoin=(OrJoin) ModelCreationFactory.getNewObject(urn, OrJoin.class);
	EditPart editPart=findEditPart(currentNodeConnection);
	DividePathCommand	comm = new DividePathCommand(newORjoin, currentNodeConnection, ((NodeConnectionEditPart) editPart).getMiddlePoint().x, ((NodeConnectionEditPart) editPart).getMiddlePoint().y);
	comm.execute();
	previousNode=currentNode;
	currentNode=comm.getNewNode();
	currentNodeConnection=(NodeConnection) currentNode.getSucc().get(0);
}
	
	/**
	 * This method is used only to get the link of a path that connects its startpoint and endPoint
	 * @param Name: the desired name to be set for the path's start point
	 * @return the link as node connection
	 */

	public NodeConnection getLink(String Name)
	{
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		UCMNavMultiPageEditor   editor=(UCMNavMultiPageEditor) page.getActiveEditor();
		URNspec urn =editor.getModel();
		//the newly created UCM will have exactly one map only
		UCMmap map=(UCMmap) urn.getUrndef().getSpecDiagrams().get(0);
		StartPoint sp=null;
		/* The map will contain nothing but the new path
		so there will be only one startpoint, and one end point as nodes */
		for(Object node: map.getNodes())
		{
			if(node instanceof StartPoint)
				
				{
				//catch the startPoint
				sp=(StartPoint) node;
				break;
				}
		}
		sp.setName(Name);
		//now we will return the successor link of the start point of the path
		
		return (NodeConnection) sp.getSucc().get(0);
	}

	/**
	 * Finds the editpart of a given model element
	 * @param element target element. It can be either a pathNode or a NodeConnection
	 * @return
	 */
	public EditPart findEditPart(EObject element)
	{
		
		
		EditPart modelEditPart=null;
		//get the active editor
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		UCMNavMultiPageEditor   editor=(UCMNavMultiPageEditor) page.getActiveEditor();
		for(int i=0; i<editor.getPageCount();i++)
		{
			//how to get the editpart of the model element
			UrnEditor pageEditor=(UrnEditor) editor.getEditor(i);
			//compare the diagrams to get the right editor to which the element belongs
			
			  if(element instanceof PathNode && pageEditor.getModel().equals(((PathNode) element).getDiagram()))
			  {
				   modelEditPart = (EditPart) pageEditor.getGraphicalViewer().getEditPartRegistry().get(element);
				   
				   if(modelEditPart !=null)
					   return modelEditPart;
			  }
			  else if(element instanceof NodeConnection && pageEditor.getModel().equals(((NodeConnection) element).getDiagram()))
			  {
				  modelEditPart = (EditPart) pageEditor.getGraphicalViewer().getEditPartRegistry().get(element);
				   
				   if(modelEditPart !=null)
					   return modelEditPart;
			  }
		}
		return modelEditPart;
	}


}
