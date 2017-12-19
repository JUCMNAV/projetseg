package seg.jUCMNav.actions;
import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.util.BundleUtility;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import seg.jUCMNav.JUCMNavPlugin;
import seg.jUCMNav.model.ModelCreationFactory;
import seg.jUCMNav.model.commands.changeImpactAnalysis.ForDataControlDep;
import seg.jUCMNav.model.commands.changeImpactAnalysis.UCMChangeImpactAnalysisCommand;
import seg.jUCMNav.views.preferences.DisplayPreferences;
import ucm.map.*;
import urn.URNspec;
import urncore.Responsibility;
import seg.jUCMNav.editors.UCMNavMultiPageEditor;
import seg.jUCMNav.editors.UrnEditor;




//GMF
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import seg.jUCMNav.model.commands.Slicing.*;

public class UCMChangeImpactAnalysisDeletionAction extends URNSelectionAction{
	public static final String UCMChangeImpactAnalysisDeletion= "seg.jUCMNav.UCMChangeImpactAnalysisDeletion"; //$NON-NLS-1$
	public static EditPartViewer Viewr;
	public static boolean dialogFinished;
	RespRef R;URNspec urn;
	EObject criterion;
	
	public UCMChangeImpactAnalysisCommand UCMCIAmcd;
	 /**
     * @param part
     */
	 public UCMChangeImpactAnalysisDeletionAction(IWorkbenchPart part) {
	        super(part);
	             
	        setId(UCMChangeImpactAnalysisDeletion);
	        dialogFinished=false;
	        //setImageDescriptor(JUCMNavPlugin.getImageDescriptor("icons/delete16.gif")); //$NON-NLS-1$
	    }
	 
	 /**
     * True if we select one responsibility .
     */
	    protected boolean calculateEnabled() {
	 	   EditPart t;
		   SelectionHelper sel = new SelectionHelper(getSelectedObjects());
		   if ( getSelectedObjects().size()==1 && (sel.getSelectionType()==SelectionHelper.RESPONSIBILITYREF || sel.getSelectionType()==SelectionHelper.NODECONNECTION || sel.getSelectionType()==SelectionHelper.STARTPOINT) ) 
		   {
	         t=  ((EditPart) getSelectedObjects().get(0));		     
		     Viewr= t.getViewer();
		     EObject obj= (EObject) t.getModel();
		     
		 		if(obj instanceof RespRef){
		 			R= (RespRef) obj ;
		 			criterion=R;
		 			return true;
		 		}
		         		
		 		else if(obj instanceof StartPoint){
		 			criterion=obj;
		 			return true;
		 		}
	
		 		else if(obj instanceof NodeConnection ){
		 			PathNode pred=(PathNode) ((NodeConnection) obj).getSource();
		 			if(pred instanceof OrFork || pred instanceof Timer || pred instanceof WaitingPlace)
		 			{
		 				criterion=obj;
		 				return true;
		 			}
		 		}
		   }
		  return false;
	    }
	    
	    /**
	     * @return a {@link UCMChangeImpactAnalysisCommand}
	     */
	  protected Command getCommand() {
		  //*********************
	        
	    	Boolean isEmptyExpression=false;
	    	if(calculateEnabled()){   
	    		ArrayList<String> leftexpressionVariables=new ArrayList<String>();
	    		//check if it's not empty
	    		if(criterion instanceof RespRef)
	    		{
	    			if(R.getRespDef().getExpression()!=null && !R.getRespDef().getExpression().isEmpty())
	        		{
	        			leftexpressionVariables=new ArrayList<String>();	
		    	    	ForDataControlDep obj=new ForDataControlDep(null);
		    	    	obj.setExpression(R.getRespDef().getExpression());
		    	    	leftexpressionVariables=obj.getLeftVar();
	        		}
	        		//otherwise it's empty
	        		else
	        			isEmptyExpression=true;	    	    	
	    		}
	    		
	    		//if criterion is endpoint
	    		/*else if(criterion instanceof EndPoint)
	    		{
	    			EndPoint endpoint= (EndPoint) criterion;
	    			leftexpressionVariables=new ArrayList<String>();	
	    	    	DataControlDep obj=new DataControlDep(null);
	    	    	String condition=endpoint.getPostcondition().getExpression();
	    	    	if(condition!=null)
	    	    	leftexpressionVariables=obj.getConditionVariables(condition);
	    		}*/
	    		//if criterion is StartPoint
				  else if(criterion instanceof StartPoint){
					  	StartPoint endpoint= (StartPoint) criterion;
					  	leftexpressionVariables=new ArrayList<String>();	
		    	    	DataControlDep obj=new DataControlDep(null);
		    	    	String condition=endpoint.getPrecondition().getExpression();
		    	    	leftexpressionVariables=obj.getConditionVariables(condition);
		    		}
	    		//otherwise it's node connection criterion
	    		else
	    		{
	    			NodeConnection nodeConn= (NodeConnection) criterion;
	    			String condition=nodeConn.getCondition().getExpression();
	    			leftexpressionVariables=new ArrayList<String>();	
	    	    	DataControlDep obj=new DataControlDep(null);
	    	    	if(condition!=null)
	    	    		leftexpressionVariables=obj.getConditionVariables(condition);
	    		}
	    	
	    		if(!leftexpressionVariables.isEmpty())
	    			UCMCIAmcd = new UCMChangeImpactAnalysisCommand(criterion,leftexpressionVariables,2);
	    		else
	    			UCMCIAmcd = new UCMChangeImpactAnalysisCommand(criterion,null,2);	
		  
	    		UCMChangeImpactAnalysisCommand.prevCommand= UCMCIAmcd;
		  
	    		return UCMCIAmcd; 
	  }
	    	
	    	//if calculateEnables==false
	    	else 
	    		return null;
	  }
}
