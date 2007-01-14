package com.site.UCMScenarioViewer.parser.msc;

import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.ScenarioGroup;


public class ScenarioGroupParser {

	private ScenarioGroup group;
	private BufferedReader reader;

	public ScenarioGroupParser(BufferedReader bufread) {
		this.group = new ScenarioGroup();
		this.reader = bufread;
	}

	public void setGroup(ScenarioGroup s) {
		this.group = s;
	}

	public ScenarioGroup getGroup() {
		return this.group;
	}

	public ScenarioGroup parseScenarioGroup() {
		try {

			String line,MSC_doc_name="";
			line = reader.readLine();
			boolean inLoop = true;
			
			while(line != null)
			{
				StringTokenizer st = new StringTokenizer(line, "\' ,;");
				while(st.hasMoreTokens()&& inLoop)
				{
					String s = st.nextToken();
					if(s.equals("mscdocument"))
					{
						MSC_doc_name="MSC "+st.nextToken();
						inLoop=false;
					}
				}
				line = reader.readLine(); 
				if (!inLoop){break;}   

			}
			group = new ScenarioGroup("",MSC_doc_name);
			Scenario scenario = new Scenario("",MSC_doc_name,"");
			ScenarioParser scenParse = new ScenarioParser(scenario,reader);
			group.addChild(scenParse.parseScenario(line));

		} catch (IOException e) {}
			
		
		return group;
	
	}
}

