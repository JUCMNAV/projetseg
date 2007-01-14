package com.site.UCMScenarioViewer.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.parser.msc.*;


public class MSCParserInitializer {
/*
	public static void main (String[] args)
	{     
		try{    
		File msc = new File("c:/Scenario1-par.msc");
		ScenarioGroup scenG = new ScenarioGroup();
		BufferedReader bufR = new BufferedReader(new FileReader(msc));
	 	mscScenarioGroup scenGParser = new mscScenarioGroup(bufR);
		//scenGParser.parseScenarioGroup();

		//BufferedReader bufR = new BufferedReader(new FileReader(file));
		//mscScenarioGroup GroupParse = new mscScenarioGroup(bufR);//(fileRead);
		scenG = scenGParser.parseScenarioGroup();
		//System.out.println("Done\n");

		
	      		//ScenarioGroup x = parseMscModel(msc); 
     	   	//parseMscModel(msc);              
	  	}                            
		 catch(IOException e){}            
	} 
	*/
	public static ScenarioGroup parseMscModel(File file){
		ScenarioGroup scenG = new ScenarioGroup();
		try {			
			BufferedReader bufR = new BufferedReader(new FileReader(file));
			ScenarioGroupParser GroupParse = new ScenarioGroupParser(bufR);//(fileRead);
			scenG = GroupParse.parseScenarioGroup();
		} catch (IOException e) {
		}
		return scenG;
	}
}
