package seg.jUCMNav.model.commands.changeImpactAnalysis;

import grl.IntentionalElementRef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.JOptionPane;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import seg.jUCMNav.editors.UCMNavMultiPageEditor;
import seg.jUCMNav.model.commands.JUCMNavCommand;
import seg.jUCMNav.model.commands.Slicing.ConcurrencyHandler;
import seg.jUCMNav.model.commands.create.AddCommentCommand;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.map.Stub;
import ucm.map.UCMmap;
import urn.URNspec;
import urncore.Comment;
import urncore.IURNDiagram;
import urncore.URNdefinition;
import urncore.UrncoreFactory;

/**
 *  Change impact Algorithm algorithm that performs Forward slicing technique given a resp ref as a criterion
 *
 * @author HasanKaff
 *
 */

public class UCMChangeImpactAnalysisCommand extends Command implements JUCMNavCommand{
	private EObject Criterion;
	public static ForSlicingAlg Prevslicing=null;
	public ForSlicingAlg slicing;
	public String OutPutFile;
	public URNspec urn;
	public UCMNavMultiPageEditor  editor;
	public static UCMChangeImpactAnalysisCommand prevCommand=null;
	public EditPartViewer viewer;
	public Boolean removeType;
	public String fileName;
	public Boolean delType;
	private ArrayList<String> criterionVariables=new ArrayList<String>();
	private String infoRelevantResRefs= "";  
	private String infoUrnLinks= "";
	// remove comment - undo()
    Comment com;
    IURNDiagram graph;
    Command cmd;
  /**
   * Creates a new forward slicing command
   * @param Criterion a resp-ref, StartPoint, or a NodeConnection as a slicing criterion
   * @param criterionVariables criterion variables related to the slicing criterion
   */
	  public UCMChangeImpactAnalysisCommand(EObject Criterion,ArrayList<String> criterionVariables,int changeType){
		  this.Criterion = Criterion;
	      this.criterionVariables=criterionVariables;
	        
	      if(changeType == 2)
			//JOptionPane.showMessageDialog(null,"2. Addition/Deletion");
	        delType=true;
	      else
			//JOptionPane.showMessageDialog(null,"1. Modification");
			delType=false;
	        setLabel("Forward static slicing"); //$NON-NLS-1$   
	  }
	  
	  /**
	     * @see org.eclipse.gef.commands.Command#canExecute()
	     */
	    public boolean canExecute() {
	    	return true;	        
	    }
	    
	    /**
	     * @see org.eclipse.gef.commands.Command#execute()
	     */
	    public void execute() {
	      testPreConditions();
	    	redo();
	    }

	    /**
	     * 
	     * @see org.eclipse.gef.commands.Command#redo()
	     */
	    public void redo() {
	    	
	    	IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	    	   editor=(UCMNavMultiPageEditor) page.getActiveEditor();
	    	   //saving the current editor before copying the file
	          editor.doSave(new NullProgressMonitor());
	    	   urn=	editor.getModel();
	    	    
	    	   //************** Test****************
	    	   //String expression="x=x+y;if(p==0){a=b;} else y=0;";
	    	   /*String expression="y=3; p=x+y; z=y-2; if(p==0) p=r; r=r+2; p=0;x=1;x=r;";
	    	   ArrayList<String> SC=new ArrayList<String>();
	    	   SC.add("x");
	    	   ForDataControlDep dep= new ForDataControlDep(SC);
	    	   dep.setDelType(false);
	    	   dep.setExpression(expression);
	    	   dep.analizeExpression();*/
	    	   //******************************************
	    	   runSlicingAlg();
	    	  }
	    
	    public void runSlicingAlg()
	    {
	    	NodeConnection startingNC=null;
	    	NodeConnection backwardStartingNC=null;
	    	if(Criterion instanceof PathNode)
	    	 startingNC=(NodeConnection) ((PathNode)Criterion).getSucc().get(0);
	    	//otherwise it's a node connection
	    	else
	    	{
	    		//The criterion (which is a link here) will be the startingLink for traversal
	    		startingNC= (NodeConnection)  Criterion;
	    	}
	    		
			// used for concurrency forward check
	    	 if(Criterion instanceof RespRef)
	    		 backwardStartingNC=(NodeConnection) ((PathNode)Criterion).getSucc().get(0);
	    	
	    		slicing=new ForSlicingAlg(startingNC,criterionVariables);
	    		//setting required attributes 
	    		slicing.setCriterion(Criterion);
	    		slicing.setViewer(viewer);
	    		slicing.setUrn(urn);
	    		slicing.setEditor(editor);
	    		if(Criterion instanceof PathNode)
	    			slicing.setTargetMap(((PathNode)Criterion).getDiagram());
	    		else
	    			slicing.setTargetMap(((NodeConnection)Criterion).getDiagram());
	    		ForSlicingAlg.concurrencyGroups.clear();
	    		ForSlicingAlg.unrelatedStubINS.clear();
	    		ForSlicingAlg.maps.clear();
	    		ForSlicingAlg.EndPoints.clear();
	    		ForSlicingAlg.UnrelatedOrForkbranches.clear();
	    		ForSlicingAlg.allNotRelevantRespRefList.clear();
	    		ForSlicingAlg.allRelevantRespRefList.clear();
	    		slicing.visitedNodes.clear();
	    		slicing.visitedNodes.add(Criterion);
	    		 
	    		if(Criterion instanceof PathNode)
	    		{
	    			slicing.setUrn(((PathNode)Criterion).getDiagram().getUrndefinition().getUrnspec());
	    			slicing.maps.add((UCMmap)((PathNode)Criterion).getDiagram());
	    		}
	    			else
	    			{
	    			slicing.setUrn(((NodeConnection)Criterion).getDiagram().getUrndefinition().getUrnspec());
	    			slicing.maps.add((UCMmap)((NodeConnection)Criterion).getDiagram());
	    			//when criterion is a node connection, add unrelated branches of the source
	    			ArrayList<NodeConnection> temp=new ArrayList<NodeConnection>();
	    			PathNode source=(PathNode) ((NodeConnection)Criterion).getSource();
	    			for(Object link:source.getSucc())
	    				temp.add((NodeConnection) link);
	    			//remove the current node connection
	    			temp.remove((NodeConnection)Criterion);
	    			//add to the unrelatedOrFork list
	    			for(NodeConnection nc:temp)
	    			{
	    				if(!slicing.UnrelatedOrForkbranches.contains(nc))
	    					slicing.UnrelatedOrForkbranches.add(nc);
	    				if(!slicing.unrelatedStubINS.contains(nc))
	    					slicing.unrelatedStubINS.add(nc);
	    			}
	    			//add source to visited nodes list
	    			slicing.visitedNodes.add((EObject)source);
	    			}
	    			
	    		 slicing.emptyRespRef.clear();
	    		 ForSlicingAlg.criterionExcludedNC.clear();
	    		 ForSlicingAlg.concurrencyNodeConnections.clear();
	    		 ForSlicingAlg.criterionForwardBranches.clear();
	    		 ForSlicingAlg.allPaths.clear();
	    		 ArrayList<EObject> pathVisitedJoins=new ArrayList<EObject>();
	    	     //adding the resp-ref criterion in the visitedNodes list
	    		 	 
	    		 if(Criterion instanceof RespRef)
	    		 {	
	    			 slicing.forwardNodeConnections.clear();
	    			 slicing.backwardCheck_criterion(backwardStartingNC, pathVisitedJoins);
	    			 System.out.println("criterion concurrent branches="+ slicing.forwardNodeConnections.size());
	    			if(!slicing.forwardNodeConnections.isEmpty())
	    			{
	    				//if no variables are there, no need to create concurrency groups
	    				if(criterionVariables!=null)
	    				slicing.Concurreny_CreateGroup(slicing.getStartingNodeConnection());
	    				Iterator<NodeConnection> it=slicing.forwardNodeConnections.iterator();
	    				while(it.hasNext())
	    				{
	    					NodeConnection nc=it.next();
	    					//we add the criterion forward branches to run them after running the basic instance
	    					ForSlicingAlg.criterionForwardBranches.add(nc);
	    					ForSlicingAlg.concurrencyNodeConnections.add(nc);
	    				}
	    			}
	    			
	               }
	    			//if no criterion variables are there, execute normal slicing algorithm
	    			if(criterionVariables!=null)
	    			{
			    		slicing.executeAlg(criterionVariables ,startingNC,new Stack<Stub>(),pathVisitedJoins,slicing.unrelatedTree,slicing.commonTree,false);
			    		ForSlicingAlg.allPaths.add(slicing);
	    			}
	    			//otherwise, execute the other form of traversal in which no dependencies are computed
	    			else
	    				slicing.executeAlg(startingNC,new Stack<Stub>(),pathVisitedJoins);
	    			
	    		if(Criterion instanceof RespRef)
	    		{
	    			//now we create and execute the criterion's forward concurrent slicing instances
	    			if(!ForSlicingAlg.criterionForwardBranches.isEmpty())
	    			{
	    				ForSlicingAlg sl;
	    			Iterator<NodeConnection> iter=ForSlicingAlg.criterionForwardBranches.iterator();
	    			while(iter.hasNext())
	    			{
	    				NodeConnection nc=iter.next();
	    				sl=new ForSlicingAlg(nc,criterionVariables);
	    				sl.setCriterion(Criterion);
	    				if(criterionVariables!=null)
	    				{
	    				sl.executeAlg(criterionVariables, nc, new Stack<Stub>(), new ArrayList<EObject>(),sl.unrelatedTree,sl.commonTree,false);
	    				ForSlicingAlg.allPaths.add(sl);
	    				}
	    				//otherwise, execute the other form of traversal in which no dependencies are computed
	    				else
	    					sl.executeAlg(nc, new Stack<Stub>(), new ArrayList<EObject>());
	    			}
	    			
	    			}
	    		}
	    		
	    			    		
	    		//handle concurrency
	    		//first remove inconsistency
	    		if(criterionVariables!=null)
	    		for(RespRef resp:ForSlicingAlg.allRelevantRespRefList)
	    			ForSlicingAlg.allNotRelevantRespRefList.removeAll(Collections.singleton(resp));	
	    		
	    		System.out.println("NO of Instances="+ForSlicingAlg.allPaths.size());
	    		if(criterionVariables!=null)
	    		{
		    		ForConcurrencyHandler con=new ForConcurrencyHandler();
		    		con.handleGroups(ForSlicingAlg.concurrencyGroups);
	    		}
	    		
	    		System.out.println("Number of unrelated respRef= "+ slicing.allNotRelevantRespRefList.size());
	    		if(Criterion instanceof RespRef){
	    			slicing.allRelevantRespRefList.add((RespRef)Criterion);	    			
	    		}
	    		System.out.println("Related RespRef= "+slicing.allRelevantRespRefList.size());
	    		
	    		
	    		System.out.println("# od visited Node= "+slicing.visitedNodes.size());
	    		int temp = 0;
	    		String names = "";
	    		for(EObject ob: slicing.visitedNodes)
	    			if(ob instanceof RespRef){
	    				names += ++temp + " - "+ ((RespRef)ob).getRespDef().getName() + "\n";
	    			}


	    		temp = 0;
	    		
	    		
	    		slicing.checkUrnLink();
	    		
	    		//Display the relevant ResRefs  
	    			
	    		infoRelevantResRefs += "Number of Relevant RespRes :[ " + (slicing.allRelevantRespRefList.size() + 
	    				slicing.allRelevantRespRefListTemp.size() + slicing.allRelevantElementListTemp.size()) + " ]\n";
	    		for(RespRef respp: slicing.allRelevantRespRefList)
	    			infoRelevantResRefs += "- Name :" + respp.getRespDef().getName() + "  ID :" + respp.getRespDef().getId()+ "\n";
	    		//JOptionPane.showMessageDialog(null, urnLinkInfo);
	    		infoRelevantResRefs += " ======== urn Links ======== \n";
	    		
	    		//JOptionPane.showMessageDialog(null, infoRelevantResRefs + slicing.infoCommentUrlLinks);
	    		
	    		if(slicing.foundUrnLinks)
	    			createInfoComment();
	    		
	       	    slicing.coloring();	       	    
    			
    	      testPostConditions();
	    	     

	    }
	    /**
	     * @see org.eclipse.gef.commands.Command#undo()
	     */
	    public void undo() {
	    	
	    		slicing.Uncoloring();
	    		slicing.allRelevantRespRefListTemp.clear();
	    	
	    		infoRelevantResRefs = "";
	    		infoUrnLinks = "";
	    		
	    		//Remove the added infoComment
	    		ArrayList<URNdefinition> specDiagrams = new ArrayList<URNdefinition>(urn.getUrndef().getSpecDiagrams());
	    		if(!specDiagrams.isEmpty())
	    		for (EObject specDiagram : specDiagrams){
	    			if(specDiagram instanceof IURNDiagram)
	    				for(Object comment :((IURNDiagram)specDiagram).getComments())
	    					if(((Comment)comment).getFillColor() == "228,228,228"){
	    						IURNDiagram graph = (IURNDiagram)((RespRef) Criterion).getDiagram();
	    						//cmd = new AddCommentCommand(graph, com);
	    						//cmd.undo();
	    						if(graph.getComments().contains(comment)) {
	    							graph.getComments().remove(((Comment)comment));
	    							break;
	    						}
	    					}
	    		}
	      
	    }

	    public void createInfoComment(){
	    	if(slicing.foundUrnLinks == true){
	    		com =UrncoreFactory.eINSTANCE.createComment();
		    	com.setDescription(" \n" + slicing.infoCommentUrlLinks);
	    		//JOptionPane.showMessageDialog(null, infoUrnLinks);
		    	com.setHeight(infoUrnLinks.split("\n").length * 200);
		    	com.setWidth(300);
		    	com.setX(600);
		    	com.setY(15);
		    	com.setFillColor("228,228,228");
		    	IURNDiagram graph = (IURNDiagram)((RespRef) Criterion).getDiagram();
		    	cmd = new AddCommentCommand(graph, com);
		    	cmd.execute();
	    	}
	    }
	     
	@Override
	public void testPreConditions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testPostConditions() {
		// TODO Auto-generated method stub
		
	}
	
	
}
