package seg.jUCMNav.model.commands.changeImpactAnalysis;
import java.util.ArrayList;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;

import seg.jUCMNav.actions.StaticSlicingAction;
import seg.jUCMNav.actions.UCMChangeImpactAnalysisModificationAction;
/**
 * 
 * Forward Select Slicing Criterion Wizard
 * 
 * @author HasanKaff
 */
public class ForSelectSlicingCriterionWizard extends Wizard{
	IWorkbenchPage workbench;
	IStructuredSelection selection;
	ArrayList<String> listItems;
	String criterion_Name;
	public	Boolean Removetype;
	public String fileName;
	
	private ArrayList <String> selected=new ArrayList<String>();
	public ForSelectSlicingCriterionWizard(ArrayList<String> listItems,String criterionName) {

	    super();
	    this.criterion_Name=criterionName;
	    this.listItems=listItems;
	    getSelectedVariables().clear();
	    setNeedsProgressMonitor(true);
	    
	}

	
	@Override
	public boolean performFinish() {
		
		UCMChangeImpactAnalysisModificationAction.dialogFinished=true;
		ForSelectCriterionPage pg= (ForSelectCriterionPage) getPage(ForSelectCriterionPage.PAGE_NAME);
		if(listItems!=null && pg.selectedList!=null && pg.selectedList.getItemCount()>0)
			for(String item:pg.selectedList.getItems())	
				getSelectedVariables().add(item);
			else
				selected=null;
		
		Removetype=pg.RemoveType;
		fileName=pg.fileName;
		return true;
	}

	@Override
	public boolean performCancel(){
		UCMChangeImpactAnalysisModificationAction.dialogFinished=false;
		return true;
	}
	
	 @Override

	  public void addPages() {
		 ForSelectCriterionPage criterionpage;
		
		  criterionpage=new ForSelectCriterionPage(listItems,criterion_Name);
		 
		 addPage(criterionpage);
	 }
	 @Override

	  public String getWindowTitle() {

	    return "URN Change Impact Analysis Options Selection";

	  }
/*public void init(IWorkbench workbench, IStructuredSelection selection)
{
	this.workbench=workbench.getActiveWorkbenchWindow().getActivePage();
	this.selection=selection;
}*/


	public ArrayList <String> getSelectedVariables() {
		return selected;
	}


	public void setSelectedVariables(ArrayList <String> selected) {
		this.selected = selected;
	}
}
