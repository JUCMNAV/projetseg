package com.site.UCMScenarioViewer.parser.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

import com.site.UCMScenarioViewer.model.Action;
import com.site.UCMScenarioViewer.model.Condition;
import com.site.UCMScenarioViewer.model.DoElement;
import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Message;
import com.site.UCMScenarioViewer.model.ParallelSequence;
import com.site.UCMScenarioViewer.model.ResetTimer;
import com.site.UCMScenarioViewer.model.Sequence;
import com.site.UCMScenarioViewer.model.SetTimer;
import com.site.UCMScenarioViewer.model.TimeOut;

public class SequenceParser {

	private Sequence sequence;

	private BufferedReader reader;

	private boolean flag = true;

	public SequenceParser(BufferedReader bufread) {
		this.sequence = new Sequence("id", "Sequence");
		this.reader = bufread;
		flag = true;
	}

	public SequenceParser(Sequence seq, BufferedReader bufread) {
		this.sequence = seq;
		this.reader = bufread;
	}

	public void setFlag(boolean f) {
		this.flag = f;
	}

	public boolean getFlag() {
		return flag;
	}

	public Sequence parseSequence(HashMap lifeLines, String lines) {
		try {
			String line, temp = "", parl = "", endPar = "", tempL = "";
			line = lines;

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, "' ,;:");

				while (st.hasMoreTokens()) {
					String s = st.nextToken();

					if (s.equals("par") && st.hasMoreTokens()) {
						endPar = st.nextToken();

						if (endPar.equals("begin")) {
							setFlag(true);
							ParallelSequence par = new ParallelSequence();
							ParallelParser parParse = new ParallelParser(reader);
							par = parParse.parseParallel(lifeLines, line);
							sequence.addChild(par);
							break;
						}

						if (endPar.equals("end")) {
							setFlag(false);
							parl = "";
							return sequence;
						}
					}

					if (!st.hasMoreTokens() && s.equals("par")) {
						setFlag(true);
						return sequence;
					}
					

					if (s.equals("in")) {
						break;
					}

					if (s.equals("out")) {
						String temp2 = "";
						String msg = st.nextToken();

						while (st.hasMoreTokens()) {
							s = st.nextToken();
							if (lifeLines.containsKey(s)) {
								temp2 = s;
							}
						}
						Message message = new Message("", msg,
								(LifeLine) lifeLines.get(tempL),
								(LifeLine) lifeLines.get(temp2));
						sequence.addChild(message);

					} else {
						//if(st.nextToken().equals("endinstance")) break;
						if (s.equals("condition")) {
							temp = st.nextToken();
							DoElement element = new Condition("", temp,
									(LifeLine) lifeLines.get(tempL),
									temp);
							sequence.addChild(element);
							break;
						}
						if (s.equals("action")) {
							temp = st.nextToken();
							DoElement element = new Action("", temp,
									(LifeLine) lifeLines.get(tempL));
							sequence.addChild(element);
							break;

						}
						
						if (s.equals("/*")) {
							String stmp = s;
							while(!stmp.equals("*/")||line == null){
								line = reader.readLine();
								StringTokenizer stemp = new StringTokenizer(line,";:., ");
								while(stemp.hasMoreTokens()){
								stmp = stemp.nextToken();
								if(stmp.equals("*/")) break;
								}
							}
						//break;	
						}
						
						if(s.equals("text")){
							break;							
						}
						
						if (s.equals("set")) {
							DoElement element = new SetTimer("", st.nextToken(),
									(LifeLine) lifeLines.get(tempL));
							sequence.addChild(element);
							break;
						}
						if (s.equals("reset")) {
							DoElement element = new ResetTimer("", st.nextToken(),
									(LifeLine) lifeLines.get(tempL));
							sequence.addChild(element);
							break;
						}
						if (s.equals("timeout")) {
							DoElement element = new TimeOut("", st.nextToken(),
									(LifeLine) lifeLines.get(tempL));
							sequence.addChild(element);
							break;
						}
						
					}
					
					if (lifeLines.containsKey(s)) {
						
						tempL = s;
					}
					

				}

				line = reader.readLine();
			}

		} catch (IOException e) {
		}
		return sequence;

	}

}