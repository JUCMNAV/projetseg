package iwToJavaInstantiator;

import intermediateWorkflow.IwWorkflow;

import java.util.List;
import java.util.Set;

public class TextView {
	private String workspacePath;
	public String getWorkspacePath() {
		return workspacePath;
	}
	public void setWorkspacePath(String workspacePath) {
		this.workspacePath = workspacePath;
	}
	
	private StringBuffer _content;
	public String getContent() {
		return _content.toString();
	}
	public void setContent(String _content) {
		this._content = new StringBuffer(_content);
	}
	
	public TextView(String workspacePath){
		this.workspacePath = workspacePath;
		this._content = new StringBuffer();
	}
	
	public void append(String toAppend) {
		_content.append(toAppend);
	}
	
	public void appendLine(String line) {
		append(line);
		appendNextLine(); 
	}
	
	public void appendNextLine() { 
		append("\n");
	}
	
	public void appendIndent(int level, String toAppend) {
		for(int i=0; i<level; i++){
			append("    ");
		}
		append(toAppend);
	}
	
	
	public void appendWithDelimiter(Set<IwWorkflow> workflows, String delimiter /*no function pointers in java*/) {
		boolean isFirst = true;
		for(IwWorkflow workflow : workflows){
			if(isFirst) {
				isFirst = false;
			}else {
				append(delimiter);
			}
			append(workflow.jiBindMethodParam());
		}
	}
	
	public void appendWithDelimiter(List<String> params, String delimiter /*no function pointers in java*/) {
		boolean isFirst = true;
		for(String param : params){
			if(isFirst) {
				isFirst = false;
			}else {
				append(delimiter);
			}
			append(param);
		}
	}
	
	/*public <T extends String> void appendWithDelimiter(List<T> col, String delimiter,T parse) {
		boolean isFirst = true;
		col.each{e|
			if(isFirst) then
				isFirst:=false
			else
				append(delimiter)
			end
			append(parse(e))
		}
		for(T t : col){
			if(isFirst) {
				isFirst = false;
			}else {
				append(delimiter);
			}
			append(parse(t));
		}
	}*/
}
