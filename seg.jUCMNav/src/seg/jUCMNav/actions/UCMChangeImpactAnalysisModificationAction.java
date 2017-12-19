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
import seg.jUCMNav.model.commands.Slicing.DataControlDep;
import seg.jUCMNav.model.commands.Slicing.SelectSlicingCriterionWizard;
import seg.jUCMNav.model.commands.changeImpactAnalysis.ForSelectSlicingCriterionWizard;
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

public class UCMChangeImpactAnalysisModificationAction extends URNSelectionAction{
	public static final String UCMChangeImpactAnalysisModification = "seg.jUCMNav.UCMChangeImpactAnalysisModification"; //$NON-NLS-1$
	public static EditPartViewer Viewr;
	public static boolean dialogFinished;
	RespRef R;URNspec urn;
	EObject criterion;
	
	public UCMChangeImpactAnalysisCommand UCMCIAmcd;
	 /**
     * @param part
     */
	 public UCMChangeImpactAnalysisModificationAction(IWorkbenchPart part) {
	        super(part);
	             
	        setId(UCMChangeImpactAnalysisModification);
	        dialogFinished=false;
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
 		}else if(obj instanceof StartPoint){
 			criterion=obj;
 			return true;
 		}else if(obj instanceof NodeConnection )
 		{
 			PathNode pred=(PathNode) ((NodeConnection) obj).getSource();
 			if(pred instanceof OrFork || pred instanceof Timer || pred instanceof WaitingPlace){
 				criterion=obj;
 				return true;
 			}
 		}
	   }
	     return false;
	} //calculateEnabled
	    
	 /**
     * @return a {@link UCMChangeImpactAnalysisCommand}
     */
	 protected Command getCommand() {

		  Boolean isEmptyExpression=false;
		  if(calculateEnabled()){
			  ArrayList<String> expressionVariables=null;
			  if(criterion instanceof RespRef)
	    		{
	    			if(R.getRespDef().getExpression()!=null && !R.getRespDef().getExpression().isEmpty())
	        		{
	        			expressionVariables=new ArrayList<String>();	
		    	    	DataControlDep obj=new DataControlDep(null);
		    	    	obj.setExpression(R.getRespDef().getExpression());
		    	    	expressionVariables=obj.getAllVariables();
	        		}
	        		//otherwise it's empty
	        		else
	        			isEmptyExpression=true;	    	    	
	    		}
			//if criterion is StartPoint
			  else if(criterion instanceof StartPoint){
				  	StartPoint endpoint= (StartPoint) criterion;
	    			expressionVariables=new ArrayList<String>();	
	    	    	DataControlDep obj=new DataControlDep(null);
	    	    	String condition=endpoint.getPrecondition().getExpression();
	    	    	expressionVariables=obj.getConditionVariables(condition);
	    		}
			//otherwise it's node connection criterion
	    		else
	    		{
	    			NodeConnection nodeConn= (NodeConnection) criterion;
	    			String condition=nodeConn.getCondition().getExpression();
	    			expressionVariables=new ArrayList<String>();	
	    	    	DataControlDep obj=new DataControlDep(null);
	    	    	expressionVariables=obj.getConditionVariables(condition);
	    		}
			  
			  String name=null;
			  
			  if(criterion instanceof RespRef)
				  name=R.getRespDef().getName();
			  else if(criterion instanceof StartPoint)
				  name= ((StartPoint) criterion).getName();
			  else{
				  name=((PathNode) ((NodeConnection)criterion).getSource()).getName()+" Condition";
			  }
			  
			  UCMChangeImpactAnalysisCommand cmd;
			  if(expressionVariables!=null && !expressionVariables.isEmpty())
			  {
				  WizardDialog dialog = new WizardDialog(null, new ForSelectSlicingCriterionWizard(expressionVariables,name));
				  dialog.open();
				  ForSelectSlicingCriterionWizard wiz=(ForSelectSlicingCriterionWizard)dialog.getCurrentPage().getWizard();
			  
			 //coloring can be done
		    	if(dialogFinished)
		    	{
		    		System.out.println("Finish clicked");
	    			
		    		if(wiz.getSelectedVariables()!=null && !wiz.getSelectedVariables().isEmpty())
		    			cmd = new UCMChangeImpactAnalysisCommand(criterion,wiz.getSelectedVariables(),1);
		    		else
		    			cmd = new UCMChangeImpactAnalysisCommand(criterion,null,1);
		    		
		    		UCMChangeImpactAnalysisCommand.prevCommand=(UCMChangeImpactAnalysisCommand) cmd; 
					//JOptionPane.showMessageDialog(null,"Command - 1");
	    		wiz.dispose();
	        	return  cmd;
		    	
		    	}
		    	else
		    	{
		    		System.out.println("Cancel Pressed");
		    		return null;		    		
		    	}
		  }
			  //otherwise there is no code expression
			  else
			  {
				  cmd = new UCMChangeImpactAnalysisCommand(criterion,null,1);
		    		UCMChangeImpactAnalysisCommand.prevCommand=(UCMChangeImpactAnalysisCommand) cmd;   
		    		return cmd;
			  }
		  }
		  else
		  {return null;}
	  }  	    
}
