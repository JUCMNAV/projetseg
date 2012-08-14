/*
 * Created on 13-Feb-2005
 *
 
package com.site.UCMScenarioViewer.utils;

import java.util.ArrayList;

import com.site.UCMScenarioViewer.model.DoElement;
import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Message;
import com.site.UCMScenarioViewer.model.ParallelSequence;
import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.model.Sequence;

*//**
 * @author oboyk022
 * @deprecated
 *
 *//*
public class TestModel {

	public ArrayList lifelines = new ArrayList();
	public ArrayList lifelines2 = new ArrayList();

	*//**
	 * 
	 *//*
	public TestModel() {
		super();
	}
	
	public ScenarioGroup getTestModel() {
		ScenarioGroup model = new ScenarioGroup("00", "Test Scenario Group");
		Scenario scenario = new Scenario("01", "Test Scenario #1", "bla");
		lifelines.add(new LifeLine("02", "Comp 1"));
		lifelines.add(new LifeLine("03", "Comp 2"));
		lifelines.add(new LifeLine("05", "Comp 4"));
		lifelines.add(new LifeLine("05", "Comp 5"));
		lifelines.add(new LifeLine("06", "Comp 6"));
		lifelines.add(new LifeLine("07", "Env 1"));
		lifelines.add(new LifeLine("08", "Env 2"));
		lifelines.add(new LifeLine("09", "Env 3"));
		for (int i=0; i<lifelines.size(); i++) {
			scenario.addChild(lifelines.get(i));
		}
		Sequence seq = new Sequence("10", "Bla");
		ArrayList messages = new ArrayList();
		messages.add(new DoElement("40", "Start", (LifeLine)lifelines.get(0), DoType.START_END_MSG));
		messages.add(new Message("11", "Msg1", (LifeLine)lifelines.get(0), (LifeLine)lifelines.get(1)));
		messages.add(new Message("12", "Msg2", (LifeLine)lifelines.get(1), (LifeLine)lifelines.get(5)));
		messages.add(new DoElement("20", "Action 1", (LifeLine)lifelines.get(5), DoType.ACTION));
		messages.add(new Message("13", "Msg3", (LifeLine)lifelines.get(5), (LifeLine)lifelines.get(6)));
		messages.add(new DoElement("21", "Action Prepare to Launch the Rocket from Houston city", (LifeLine)lifelines.get(6), DoType.ACTION));
		messages.add(new DoElement("22", "Action 3", (LifeLine)lifelines.get(6), DoType.ACTION));
		messages.add(new Message("14", "Msg4", (LifeLine)lifelines.get(6), (LifeLine)lifelines.get(5)));
		messages.add(new DoElement("30", "Any fuel left?", (LifeLine)lifelines.get(5), DoType.CONDITION));
		messages.add(createParSeq1());
		messages.add(new DoElement("31", "Set Time", (LifeLine)lifelines.get(5), DoType.SET_TIMER));
		messages.add(new Message("15", "Msg5", (LifeLine)lifelines.get(5), (LifeLine)lifelines.get(4)));
		messages.add(new DoElement("32", "ResetTime", (LifeLine)lifelines.get(5), DoType.RESET_TIMER));
		messages.add(createParSeq2());
		messages.add(new Message("16", "Msg6", (LifeLine)lifelines.get(4), (LifeLine)lifelines.get(3)));
		messages.add(new DoElement("33", "Time Out", (LifeLine)lifelines.get(3), DoType.TIME_OUT));
		messages.add(new DoElement("23", "Action 4", (LifeLine)lifelines.get(3), DoType.ACTION));
		messages.add(new Message("17", "Messageg 7", (LifeLine)lifelines.get(3), (LifeLine)lifelines.get(4)));
		messages.add(new Message("18", "Messageg 8", (LifeLine)lifelines.get(4), (LifeLine)lifelines.get(0)));
		//messages.add(new ParallelSequence("99", "Empty"));
		messages.add(new DoElement("41", "End", (LifeLine)lifelines.get(0), DoType.START_END_MSG));

		for (int i=0; i<messages.size(); i++) {
			seq.addChild(messages.get(i));
		}
		
		scenario.addChild(seq);
		model.addChild(scenario);
		model.addChild(createScenario2());
		return model;
	}
	
	public ParallelSequence createParSeq1() {
		Sequence seq1 = new Sequence("100", "Sequence 1");
		Sequence seq2 = new Sequence("200", "Sequence 2");
		
		seq1.addChild(new Message("101", "First", (LifeLine)lifelines.get(0), (LifeLine)lifelines.get(1)));
		seq1.addChild(new DoElement("102", "Do Something", (LifeLine)lifelines.get(1), DoType.ACTION));
		seq1.addChild(new Message("103", "Second", (LifeLine)lifelines.get(1), (LifeLine)lifelines.get(0)));
		
		seq2.addChild(new Message("201", "First", (LifeLine)lifelines.get(1), (LifeLine)lifelines.get(0)));
		seq2.addChild(new DoElement("202", "Do Something", (LifeLine)lifelines.get(0), DoType.ACTION));
		seq2.addChild(createParSeq3());
		seq2.addChild(new Message("203", "Second", (LifeLine)lifelines.get(0), (LifeLine)lifelines.get(1)));
		
		ParallelSequence par = new ParallelSequence("1000", "Parallel stuff and other sentimental bullshit");
		par.addChild(seq1);
		par.addChild(seq2);
		
		return par;		
	}
	
	public ParallelSequence createParSeq2() {
		Sequence seq1 = new Sequence("1100", "Sequence 1-1");
		Sequence seq2 = new Sequence("1200", "Sequence 1-2");
		Sequence seq3 = new Sequence("1300", "Sequence 1-3");
		
		seq1.addChild(new Message("1101", "First", (LifeLine)lifelines.get(0), (LifeLine)lifelines.get(1)));
		seq1.addChild(new DoElement("1102", "Do Something", (LifeLine)lifelines.get(1), DoType.CONDITION));
		seq1.addChild(new Message("1103", "Second", (LifeLine)lifelines.get(1), (LifeLine)lifelines.get(2)));
		
		seq2.addChild(new Message("1201", "First", (LifeLine)lifelines.get(3), (LifeLine)lifelines.get(4)));
		seq2.addChild(new DoElement("1202", "Do Something", (LifeLine)lifelines.get(4), DoType.TIME_OUT));
		seq2.addChild(new Message("1203", "Second", (LifeLine)lifelines.get(4), (LifeLine)lifelines.get(3)));
		
		seq3.addChild(new Message("1301", "First", (LifeLine)lifelines.get(3), (LifeLine)lifelines.get(2)));
		seq3.addChild(new Message("1303", "Second", (LifeLine)lifelines.get(2), (LifeLine)lifelines.get(1)));

		ParallelSequence par = new ParallelSequence("1000", "Real sentimental bullshit");
		par.addChild(seq1);
		par.addChild(seq2);
		par.addChild(seq3);
		
		return par;		
		
	}
	
	public ParallelSequence createParSeq3() {
		Sequence seq1 = new Sequence("2100", "Sequence 2-1");
		Sequence seq2 = new Sequence("2200", "Sequence 2-2");
		Sequence seq3 = new Sequence("2300", "Sequence 2-3");
		
		seq1.addChild(new Message("2101", "First", (LifeLine)lifelines.get(2), (LifeLine)lifelines.get(4)));
		seq1.addChild(new DoElement("1102", "Do Something", (LifeLine)lifelines.get(4), DoType.ACTION));
		
		seq2.addChild(new Message("2201", "First", (LifeLine)lifelines.get(4), (LifeLine)lifelines.get(5)));
		seq2.addChild(new DoElement("2202", "Do Something", (LifeLine)lifelines.get(5), DoType.RESET_TIMER));
		seq2.addChild(new Message("2203", "Second", (LifeLine)lifelines.get(5), (LifeLine)lifelines.get(7)));
		
		seq3.addChild(new Message("2301", "First", (LifeLine)lifelines.get(5), (LifeLine)lifelines.get(3)));
		seq3.addChild(new Message("2303", "Second", (LifeLine)lifelines.get(3), (LifeLine)lifelines.get(6)));

		ParallelSequence par = new ParallelSequence("1000", "Real sentimental bullshit");
		par.addChild(seq1);
		par.addChild(seq2);
		par.addChild(seq3);
		
		return par;				
	}
	
	public Scenario createScenario2() {
		Scenario scenario = new Scenario("S01", "Test Scenario #2", "bla");

		lifelines2.add(new LifeLine("S02", "S-Comp 1"));
		lifelines2.add(new LifeLine("S03", "S-Comp 2"));
		lifelines2.add(new LifeLine("S05", "S-Comp 4"));
		for (int i=0; i<lifelines2.size(); i++) {
			scenario.addChild(lifelines2.get(i));
		}
		Sequence seq = new Sequence("S10", "Bla2");
		ArrayList messages = new ArrayList();
		messages.add(new DoElement("S40", "S-Start", (LifeLine)lifelines2.get(0), DoType.START_END_MSG));
		messages.add(new Message("S11", "S-Msg1", (LifeLine)lifelines2.get(0), (LifeLine)lifelines2.get(1)));
		messages.add(new Message("S12", "S-Msg2", (LifeLine)lifelines2.get(1), (LifeLine)lifelines2.get(2)));
		messages.add(new DoElement("S20", "S-Action 1", (LifeLine)lifelines2.get(2), DoType.ACTION));
		messages.add(new Message("S13", "S-Msg3", (LifeLine)lifelines2.get(2), (LifeLine)lifelines2.get(1)));
		messages.add(new DoElement("S41", "S-End", (LifeLine)lifelines2.get(0), DoType.START_END_MSG));
		for (int i=0; i<messages.size(); i++) {
			seq.addChild(messages.get(i));
		}
		scenario.addChild(seq);
		return scenario; 
	}

}
*/