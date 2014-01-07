package iwToJavaInstantiator;

import java.util.ArrayList;
import java.util.List;

public class JavaView extends TextView {

	public JavaView(String workspacePath) {
		super(workspacePath);
	}
	
	public void appendPackage(String name) {
		append("package ");
		append(name);
		append(";\n\n");
	}
	
	public void appendImport(String name) {
		append("import ");
		append(name);
		append(";\n");
	}
	
	public void appendPublicMemberDefaultConstructor(String type, String name) {
		appendPublicMember(type,name,"new "+type+"()");
	}
	
	public void appendPublicMember_1Param(String type, String name, String param) {
		StringBuilder initialization = new StringBuilder();
		initialization.append("new");
		initialization.append(" ");
		initialization.append(type);
		initialization.append("(");
		initialization.append(param);
		initialization.append(")");
		
		appendPublicMember(type,name, initialization.toString());
	}
	
	public void appendPublicMember(String type, String name, String initialization) {
		appendIndent(1,"public ");
		append(type);
		append(" ");
		append(name);
		append("=");
		append(initialization);
		append(";\n");
	}
	
	//*********************************************************
	//LocalVar init with constructor 
	//*********************************************************/
	public void appendLocalVarConstructor_0Param(String type, String name) {
		List<String> params = new  ArrayList<String>();
		appendLocalVarConstructor_NParams(type,name,params);
	}
	
	public void appendLocalVarConstructor_1Param(String type, String name, String param1) {
		List<String> params = new ArrayList<String>();
		params.add(param1);
		appendLocalVarConstructor_NParams(type,name,params);
	}
	
	public void appendLocalVarConstructor_NParams(String type,String name,List<String> params) {
		appendIndent(2,type);
		append(" ");
		append(name);
		append("=new ");
		append(type);
		append("(");
		
		appendWithDelimiter(params,","); 
		append(");\n");
	}
	
	//*********************************************************
	//Class Declaration
	//*********************************************************/
	public void appendClass_Pre(String classHeader) {
		appendNextLine();
		append(classHeader);
		append("{\n");
	}

	public void appendClass_Post() {
		append("}\n");	
	}
	
	//*********************************************************
	//Method Declaration
	//*********************************************************/
	public void appendMethod_Pre(String methodHeader) {
		appendNextLine();
		appendIndent(1,methodHeader);
		append("{\n");
	}
	
	public void appendMethod_Post() {
		appendIndent(1,"}\n");
	}
	
	//*********************************************************
	//MethodInvocation
	//*********************************************************/
	public void appendMethodInvocation_0Param(String methodName) {
		appendIndent(2,methodName);
		append("();\n");
	}
	
	//*********************************************************
	//MethodInvocationOn
	//*********************************************************/
	public void appendMethodInvocationOn_0Param(String methodOwner, String methodName) {
		List<String> params = new ArrayList<String>();
		appendMethodInvocationOn_NParams(methodOwner,methodName,params);
	}
	
	public void appendMethodInvocationOn_1Param(String methodOwner, String methodName, String param1) {
		List<String> params = new ArrayList<String>();
		params.add(param1);
		appendMethodInvocationOn_NParams(methodOwner,methodName,params);
	}
	
	public void appendMethodInvocationOn_2Params(String methodOwner,String methodName,String param1,String param2) {
		List<String> params = new ArrayList<String>();
		params.add(param1);
		params.add(param2);
		appendMethodInvocationOn_NParams(methodOwner,methodName,params);
	}
	
	public void appendMethodInvocationOn_3Params(String methodOwner, String methodName, String param1, String param2, String param3) {
		List<String> params = new ArrayList<String>();
		params.add(param1);
		params.add(param2);
		params.add(param3);
		appendMethodInvocationOn_NParams(methodOwner,methodName,params);
	}
	
	public void appendMethodInvocationOn_4Params(String methodOwner, String methodName, String param1,String param2,String param3, String param4) {
		List<String> params = new ArrayList<String>();
		params.add(param1);
		params.add(param2);
		params.add(param3);
		params.add(param4);
		appendMethodInvocationOn_NParams(methodOwner,methodName,params);
	}
	
	public void appendMethodInvocationOn_NParams(String methodOwner, String methodName,List<String> params) {
		appendIndent(2,methodOwner);
		append(".");
		append(methodName);
		append("(");
		appendWithDelimiter(params,",");
		append(");\n");
	}
}
