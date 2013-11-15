package iwToStepView;

import intermediateWorkflow.IwNode;
import intermediateWorkflow.IwStep;

public class StepView {
	private String imgFolderWindowsPath;
	public void setImgFolderWindowsPath(String imgFolderWindowsPath) {
		this.imgFolderWindowsPath = imgFolderWindowsPath;
	}

	private String workspacePath;
	public void setWorkspacePath(String workspacePath) {
		this.workspacePath = workspacePath;
	}

	private StringBuffer  _dot;
	private IwStep step;
	private boolean isStubsFromOtherConcernsPlaceholderRequired = false;
	
	public String getImgFolderWindowsPath() {
		return imgFolderWindowsPath;
	}
	
	public String getWorkspacePath() {
		return workspacePath;
	}

	public String getDot() {
		return _dot.toString();
	}
	
	public void setDot(StringBuffer dot){
		_dot = dot;
	}
	
	public IwStep getStep(){
		return step;
	}
	
	public void setStep(IwStep aStep){
		step = aStep;
	}
	
	public StepView() {}
	
	public void append(String toAppend) {
		_dot.append(toAppend);
	}
	
	public void appendLine(String line) {
		append(line);
		append("\n");
	}
	
	public void appendImg(String imageName) {
		//String imgWindowsPath = imgFolderWindowsPath.windowsPathAppend(imageName);
		String imgWindowsPath = jAoUrnToRam.util.StringExtensions.windowsPathAppend(imgFolderWindowsPath, imageName);
		append("<img src=\""+imgWindowsPath+"\"></img>");
	}
	
	public boolean isPartOfStepView(IwNode node) {
		//SEE LATER
		return step==node.getStep();
	}
	
	public void appendStubsFromOtherConcernsPlaceholder() {
		isStubsFromOtherConcernsPlaceholderRequired = true;
		append("StubsFromOtherConcernsPlaceholder_80C8D3AF_486D_4EB9_8A4A_B63B09537442");
	}
	
	public void appendStubFromOtherConcerPlaceholder() {
		if(isStubsFromOtherConcernsPlaceholderRequired==true) {
			appendLine("");
			append("    ");
			appendStubsFromOtherConcernsPlaceholder();
			appendLine("[label=\"*\",style=dashed]");
		}
	}
	
	public String getCustomizableClassColor() {
		return "gray";
	}
	
	public String dotEscape(String toEscape) {
		return "\""+dotEscapeInner(toEscape)+"\"";
	}
	
	public String dotEscapeInner(String toEscape) {
		String result = toEscape.replace("\\","\\\\");
		result = result.replace("\"","\\\"");
		
		return result;
	}
	
	public String getStepName(){
		return getStep().getName();
	}
	
	public String getConcernName(){
		return getStep().getConcern().getName();
	}
}
