package com.site.UCMScenarioViewer.parser.emf;

import java.util.HashMap;
import java.util.Iterator;

import com.site.UCMScenarioViewer.model.ParallelSequence;
import com.site.UCMScenarioViewer.model.Sequence;

public class ParallelParser {

	private ParallelSequence par;

	private ucmscenarios.Parallel src;

	public ParallelParser(ucmscenarios.Parallel src) {
		this.par = new ParallelSequence(src.getId(), "par");
		this.src = src;
	}

	public ParallelSequence parseParallel(HashMap lines) {
		for (Iterator iter = src.getChildren().iterator(); iter.hasNext();) {
			ucmscenarios.Sequence srcseq = (ucmscenarios.Sequence) iter.next();
			Sequence seq = new Sequence(srcseq.getId(), srcseq.getName());
			SequenceParser sequenceParse = new SequenceParser(srcseq, seq);
			seq = sequenceParse.parseSequence(lines);
			par.addChild(seq);
		}
		return par;
	}

}