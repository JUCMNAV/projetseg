package com.site.UCMScenarioViewer.parser.emf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import ucmscenarios.Event;
import ucmscenarios.EventType;
import ucmscenarios.ModelElement;
import ucmscenarios.Parallel;
import ucmscenarios.ScenarioDef;

import com.site.UCMScenarioViewer.model.Action;
import com.site.UCMScenarioViewer.model.Condition;
import com.site.UCMScenarioViewer.model.DoElement;
import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Message;
import com.site.UCMScenarioViewer.model.ParallelSequence;
import com.site.UCMScenarioViewer.model.ResetTimer;
import com.site.UCMScenarioViewer.model.Sequence;
import com.site.UCMScenarioViewer.model.SetTimer;
import com.site.UCMScenarioViewer.model.StartEndMessage;
import com.site.UCMScenarioViewer.model.TimeOut;

public class SequenceParser {

	private Sequence sequence;

	private ModelElement src;

	public SequenceParser(ScenarioDef src) {
		this.sequence = new Sequence(src.getId(), src.getName());
		this.src = src;
	}

	public SequenceParser(ucmscenarios.Sequence parent, Sequence seq) {
		this.sequence = seq;
		this.src = parent;
	}

	public Sequence parseSequence(HashMap lines) {

		List children = null;

		if (src instanceof ScenarioDef) {
			ScenarioDef def = (ScenarioDef) src;
			children = def.getChildren();

		} else if (src instanceof ucmscenarios.Sequence) {
			ucmscenarios.Sequence seq = (ucmscenarios.Sequence) src;
			children = seq.getChildren();
		}

		if (children!=null) {

			for (Iterator iter = children.iterator(); iter.hasNext();) {
				ModelElement me = (ModelElement) iter.next();
				parseModelElement(lines, me);
			}
		}

		return sequence;

	}

	private void parseModelElement(HashMap lines, ModelElement me) {
		if (me instanceof Event) {
			Event srcevent = (Event) me;

			DoElement element = null;

			String id = srcevent.getId();
			String name = srcevent.getName();
			LifeLine line = (LifeLine) lines.get(srcevent.getInstance());

			switch (srcevent.getType().getValue()) {
			case EventType.RESPONSIBILITY:
				element = new Action(id, name, line);
				break;
			case EventType.START_POINT:
			case EventType.END_POINT:
				element = new StartEndMessage(id, name, line);
				break;
			case EventType.TIMER_SET:
				element = new SetTimer(id, name, line);
				break;
			case EventType.TIMER_RESET:
				element = new ResetTimer(id, name, line);
				break;
			case EventType.TIMEOUT:
				element = new TimeOut(id, name, line);
				break;
			default:
				// these are ignored.
				break;
			}

			if (element != null)
				sequence.addChild(element);

		} else if (me instanceof ucmscenarios.Condition) {
			ucmscenarios.Condition srccond = (ucmscenarios.Condition) me;
			DoElement element = new Condition(srccond.getId(), srccond.getLabel(), (LifeLine) lines.get(srccond.getInstance()), srccond.getExpression());
			sequence.addChild(element);
		} else if (me instanceof ucmscenarios.Message) {
			ucmscenarios.Message srcmsg = (ucmscenarios.Message) me;
			Message message = new Message(srcmsg.getId(), srcmsg.getName(), (LifeLine) lines.get(srcmsg.getSource()), (LifeLine) lines.get(srcmsg
					.getTarget()));
			sequence.addChild(message);
		} else if (me instanceof Parallel) {
			Parallel srcpar = (Parallel) me;

			ParallelParser parParse = new ParallelParser(srcpar);
			ParallelSequence par = parParse.parseParallel(lines);
			sequence.addChild(par);
		} else if (me instanceof ucmscenarios.Sequence) {
			// srcseq child of src : flatten
			ucmscenarios.Sequence srcseq = (ucmscenarios.Sequence) me;
			for (Iterator iter = srcseq.getChildren().iterator(); iter.hasNext();) {
				ModelElement element = (ModelElement) iter.next();
				parseModelElement(lines, element);
				
			}
		}
	}

}