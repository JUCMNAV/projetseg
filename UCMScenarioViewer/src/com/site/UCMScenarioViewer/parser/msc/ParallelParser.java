package com.site.UCMScenarioViewer.parser.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

import com.site.UCMScenarioViewer.model.ParallelSequence;
import com.site.UCMScenarioViewer.model.Sequence;

public class ParallelParser {
	
	private ParallelSequence par;
	private BufferedReader reader;
	private boolean flag;
	
	public ParallelParser(BufferedReader bufread){
		this.par = new ParallelSequence("id", "par");
		this.reader = bufread;
	}
	
	public ParallelSequence parseParallel(HashMap lifeLines, String line){
		try{
			boolean flag = true;
			while(flag){
				line = reader.readLine();
				Sequence seq = new Sequence("", "parallel sequence");
				SequenceParser sequenceParse = new SequenceParser(seq, reader);
				seq = sequenceParse.parseSequence(lifeLines,line);
				par.addChild(seq);
				flag = sequenceParse.getFlag();
			}
			
		}catch(IOException e) {}
		return par;
	}
}