package jAoUrnToIw;

import jAoUrnToRam.util.StringExtensions;

public class InOutExpression {
	private String out;
	public String getOut() {
		return out;
	}

	public InOutExpression() { 
		out = null; 
		in = null;
	}
	
	private String in;
	public String getIn() {
		return in;
	}

	private String outKeyword;
	private String inKeyword;
	
	public boolean hasOut() {
		return out != null;
	}
		
	public boolean hasIn() { 
		return in != null;  
	}	

	public void construct(String expression) {
		outKeyword = "out ";
		inKeyword = "in ";
	
		if(expression.toLowerCase().indexOf(outKeyword)==0) {
			expression = expression.substring(outKeyword.length(), expression.length());	
			int index = expression.indexOf(" ");	
					
			if(index==-1) {
				out = expression;
				expression = "";
			}
			else {
				out = expression.substring(0, index);
				expression = expression.substring(index+1, expression.length());				
			}
			out = StringExtensions.capitalizaFirtLetter(out);
		}
		if(expression.toLowerCase().indexOf(inKeyword)==0) {
			in = expression.substring(inKeyword.length(), expression.length());
			in = StringExtensions.capitalizaFirtLetter(in);
		}	
	}
}
