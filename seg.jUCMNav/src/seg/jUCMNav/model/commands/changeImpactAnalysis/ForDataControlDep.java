package seg.jUCMNav.model.commands.changeImpactAnalysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Singleton;

/**
 * provides necessary functions to calculate data and control flow dependencies for CIA algorithm
 * @author HasanKaff
 *
 */
public class ForDataControlDep {
	private String expression;
	private ArrayList <String> criterionVariables=new ArrayList<String>();
	Boolean Relevant=false;
	Stack<String> conditionStack=new Stack<String>();
	ArrayList<ArrayList<String>> allStatementsStack=new ArrayList<ArrayList<String>>();
	private ArrayList<String> leftVar=new ArrayList<String>();
	private Boolean delType=false;
	/**
	 * computes dependencies during traversal according criterion variables    
	 *
	 * @param criterionVariables variables related to slicing criterion
	 */
	public ForDataControlDep(ArrayList <String> criterionVariables) {
		
		this.criterionVariables=criterionVariables;
		Relevant=false;
		conditionStack.clear();
		allStatementsStack.clear();		
	}
 
	/**
	 * executes data and control flow analysis for the resp ref's expression only. 
	 * Regarding Orfork's condition , this will be handled in different method
	 *  @return all the variables within the code expression
	 */
	public ArrayList<String> analizeExpression()
	{		
		if(expression==null || expression.isEmpty())
		{ //System.err.println("empty");
			return null;
		}
		PrepareExpression();
		while (!expression.isEmpty())
		{
			if(expression.startsWith("if(")){
				analizeCondition();
			}
			//otherwise the expression starts with a code statement
			else{
				analizeStatement();	
			}
		}
		
		ArrayList<String> statement=new ArrayList<String>();
		ArrayList<String> allVariables=new ArrayList<String>();
		
		//storing all left-side assignment variables (needed in CIA feature)
			leftVar.clear();
			for(ArrayList<String> st: allStatementsStack)
				//the left variables are always indexed in position 0
					if(!leftVar.contains(st.get(0)))
						leftVar.add(st.get(0));
				
		// here, after building the statementstack, dependencies 
		//will be checked with relevant variables
		
		for(ArrayList<String> st:allStatementsStack)
		{			
			statement=st;
			for(String item:statement)
				//the right side variables and condition var are separated by adding extra char "0"
				if(!allVariables.contains(item) && item!="0")
					allVariables.add(item);
			
			//check if the left side assignment variable of the statement
			// is contained in the relevant variable,if true the statement 
			//is relevant to the slice, and the right side variables+variables of conditions(if any)
			//under which the statement lies are also added to the relevant variables list
			
			// modification and deletion works the same type is selected
			if(criterionVariables!=null)
			{
				//first, check the right side
				for(String var:getStRightVar(statement))
					if(criterionVariables.contains(var))
					{
						Relevant=true;
						System.out.println("modType-Statement with variables:"+statement+" is Relevant\n");
						//add the left side variable
						if(!criterionVariables.contains(statement.get(0)))
								criterionVariables.add(statement.get(0));
						break;
					}
					//if it is not true, check whether the statement resides within a condition
					//that contains variable(s) included in SC
									
					//if the statement still not relevant,it means it's either assigned to constant, or the right vars are not in SC
					//in this case,check whether the left side variable is in SC list; if yes, remove it from SC
					else if(!Relevant && criterionVariables.contains(statement.get(0)))
					{
						criterionVariables.removeAll(Collections.singleton(statement.get(0)));
						System.out.println("Statement with variables:"+statement+" NOT Relevant, variable ("+ statement.get(0)+") has been removed from SC list\n");
					}
					else
						System.out.println("Statement with variables:"+statement+" NOT Relevant \n");
	
			
			}
				
			
		}
		//System.out.println("varaibles relevant :"+criterionVariables);		
		return allVariables;		
	}
	
	/**
	 * Extract all variables within expression
	 */
	private void analizeStatement()
	{
		String[] result;
		ArrayList<String> conditionVariables=new ArrayList<String>();
		result=Parsing.extractStatement(expression);
		
		String statement=result[0];
		
		//expression after subtracting the code statement
		expression=result[1];
		 ArrayList<String> statementVariables= Parsing.getVariables(statement);
		 //check whether the statement lies under conditions,if true , condition
		 // variables will be added along with statement's variables
		 if(!conditionStack.empty())
		 {
			 //separate these variables with "0" character
			 statementVariables.add("0");
			 for(String condition:conditionStack)
			 {
				 conditionVariables=Parsing.getVariables(condition);
				 for(String variable:conditionVariables)
				 {
					 if(!statementVariables.contains(variable))
						 statementVariables.add(variable);
				 }
			 }
		 }
		 allStatementsStack.add(statementVariables);
		  
	}

	/**
	 * Handles Conditions within expression
	 */
	public void analizeCondition()
	{
		ArrayList<String> code=new ArrayList<String>();
		code=Parsing.extractCondition(expression);
		expression=code.get(1);
		//add the condition to condition-stack
		conditionStack.push(code.get(0));
		//if the code starts with '{' , it means the condition has multiple statements
		if(expression.charAt(0)=='{')
		{
			//remove the character '{' from the original code expression
			expression=expression.substring(1);
			//continue until the end of condition, stopping criterion is '}'
			while(expression.charAt(0)!='}')
			{
				//if there is an if condition inside the current condition
				if (!expression.isEmpty() && expression.startsWith("if"))
				{
					analizeCondition();
				}
				//otherwise it starts with a code statement
				else {
					analizeStatement();
				}
			}			
			//remove the character '}' from the original code expression
			expression=expression.substring(1);
		}
				//then the condition has only one statement
				else 
				{   //has one if
					if (expression.length()>=2 && expression.startsWith("if"))
						analizeCondition();
					//otherwise has one statement
					else
						analizeStatement();
				}
					
		//if the condition has elseif after 
		if(!expression.isEmpty() && expression.length()>=6 && expression.startsWith("elseif"))
		{
			analizeCondition(); 
		}
		//if it has else
		else if(!expression.isEmpty() && expression.length()>=4 && expression.startsWith("else"))
				{
			
			// remove else from expression
			expression=expression.substring(4);
			//if the code starts with '{' , it means the else has multiple statements
			if(expression.charAt(0)=='{')
			{
				//remove the character '{' from the original code expression
				expression=expression.substring(1);
				//continue until the end of condition, stopping criterion is '}'
				while(expression.charAt(0)!='}')
				{
					//if there is an if condition inside the current condition
					if (!expression.isEmpty() && expression.startsWith("if"))					
						analizeCondition();					
					//otherwise it starts with a code statement
					else 
						analizeStatement();					
				}				
				//remove the character '}' from the original code expression
				expression=expression.substring(1);			 
				}
			
			//otherwise the else has either one condition or one statement
			else if(expression.length()>=2 && expression.startsWith("if"))
			
				analizeCondition();
				//otherwise has one statement
				else
					analizeStatement();
				}
			
		//whether there is else ,elseif, or none, the condition is removed at the end 
		conditionStack.pop();
	}
	
	/**
	 * gets the expression string
	 */
	public String getExpression()
	{
		return expression;
	}
	/**
	 * Removes whitespace, and comments from expression.Usaually, this method is called before analyzing the code expression.
	 */
	private void PrepareExpression()
	{		
		expression=expression.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "");
		expression=expression.replaceAll("\\s+","");
	}
	/**
	 * sets the expression  before analyze it by {@link #analizeExpression()}
	 * @param expression the code expression as a string
	 */
	
	public void setExpression(String expression)
	{
		Relevant=false;
		conditionStack.clear();
		allStatementsStack.clear();
		this.expression=expression;
	}
	
	/**
	 * Adds the variables within a condition into the '<em> Relevant variables List</em>'.Usually this method 
	 * is called when an <em>Orfork</em>, <em>WaitingPlace</em>, <em>StartPoint</em>,or <em>EndPoint</em> that has a condition, is encountered during backward traversal
	 * @param condition condition as a string
	 */
	public void addConditionVariables(String condition)
	{  
		setExpression(condition);
		PrepareExpression();
		ArrayList<String> varlist=Parsing.getVariables(expression);
		
      for(String variable:varlist)
      {
    	  if(!criterionVariables.contains(variable))
    	  criterionVariables.add(variable);
      }     
	}
	/**
	 * gets the variables contained within a condition expression
	 * @param condition condition as a string
	 * @return list of all variables within the condition
	 */
	public ArrayList<String> getConditionVariables(String condition)
	{
		setExpression(condition);
		PrepareExpression();
		ArrayList<String> varlist=Parsing.getVariables(expression);
		return varlist;
	}
	 /**
	  * This method returns all the variables within a code of '<em>respref's </em>'expression
	  * 
	  * @return all variables contained within the code expression
	  */
    public ArrayList<String> getAllVariables(){ 
	    return analizeExpression();
    }

	public  ArrayList <String> getCriterionVariables() {
		return criterionVariables;
	}

	public  void setCriterionVariables(ArrayList <String> criterionVariables) {
		this.criterionVariables = criterionVariables;
	}
	
	public void updateCriterionVariables(ArrayList<String> criterionVariables)
	{
		for(String var:criterionVariables)
			if(!this.criterionVariables.contains(var))
				this.criterionVariables.add(var);
	}
	/**
	 * Retrieves the left-side variables of all statements in the expression
	 * @return left-side variables
	 */
	public ArrayList<String> getLeftVar()
	{
		analizeExpression();
		return leftVar;
	}

	public Boolean getDelType() {
		return delType;
	}

	/**
	 * Analyze a code statement gets its right side variables
	 * @param statementVars : extracted variables of the statement in the form of array
	 * @return List of all right side variables otherwise an empty list
	 */
	public ArrayList<String> getStRightVar(ArrayList<String> statementVars)
	{
	 ArrayList<String> rightVar=new ArrayList<String>();
		 int i=1;
		 String variable;
		 while(i<statementVars.size())
		 {
			 variable= statementVars.get(i);
			 if(variable!="0")
			 { rightVar.add(variable);
			 i++;
			 }
			 else 
				 break;
			 
		 }
	  return rightVar;
	}
	/**
	 * Analyze a code statement gets its all variables of conditions in which the statement resides
	 * @param statementVars : extracted variables of the statement in the form of array
	 * @return List of variables  otherwise an empty list
	 */
	public ArrayList<String> getStCondVar(ArrayList<String> statementVars)
	{
	 ArrayList<String> condVar=new ArrayList<String>();
		 
		 if(statementVars.contains("0"))
		 {
			 int i=statementVars.indexOf("0")+1;
			 while(i<statementVars.size())
			 {
				 condVar.add( statementVars.get(i));
			 i++;
			 }
		 }
	  return condVar;
	}
	
	
	public void setDelType(Boolean delType) {
		this.delType = delType;
	}
		
}
		

