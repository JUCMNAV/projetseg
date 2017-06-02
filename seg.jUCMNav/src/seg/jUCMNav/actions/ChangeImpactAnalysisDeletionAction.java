package seg.jUCMNav.actions;


import grl.IntentionalElementRef;
import grl.LinkRef;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IWorkbenchPart;
import seg.jUCMNav.model.commands.changeImpactAnalysis.ChangeImpactAnalysisCommand;


/**
 * action for GRL change impact analysis Deletion
 * 
 * @author hasanKaff
 */
 
public class ChangeImpactAnalysisDeletionAction  extends URNSelectionAction {

	public static final String ChangeImpactAnalysis = "seg.jUCMNav.ChangeImpactAnalysis";
	public static EditPartViewer Viewr;
	private EObject criterion;
	
	/**
     * @param part
     */
	public ChangeImpactAnalysisDeletionAction(IWorkbenchPart part) {
		super(part);
		setId(ChangeImpactAnalysis);
		//setImageDescriptor(JUCMNavPlugin.getImageDescriptor("icons/delete16.gif")); //$NON-NLS-1$
	//icons/StrategyNumImp16.gif
	}

	/**
    * at this level, the value is True, if select one Intentional/Indicator element selected. 
    */
	protected boolean calculateEnabled() {

		EditPart ePart;
		if(getSelectedObjects().size() != 1)
			return false;
        SelectionHelper sel = new SelectionHelper(getSelectedObjects());
        if(sel.getSelectionType() == SelectionHelper.INTENTIONALELEMENTREF || sel.getSelectionType() == SelectionHelper.LINKREF){
        	ePart= ((EditPart)getSelectedObjects().get(0));
			EObject obj = (EObject) ePart.getModel();
			
			if(obj instanceof IntentionalElementRef){
				//intElement = (IntentionalElementRef) element;
				criterion = obj;				
				return true;
			}else if(obj instanceof LinkRef){
				criterion = obj;
				return true;
			}
			else return false;
			
        }
        
		return false;
    }
	
	/**
     * @return a {@link ChangeImpactAnalysisCommand}
     */
	
	 protected Command getCommand() {
		 if(calculateEnabled()){			 
			 Command cmd= new ChangeImpactAnalysisCommand(criterion, 2);
			 return cmd;
		 }
		 return null;
	 }
}
