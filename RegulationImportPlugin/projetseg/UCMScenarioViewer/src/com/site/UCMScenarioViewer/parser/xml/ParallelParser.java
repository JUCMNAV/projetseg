package com.site.UCMScenarioViewer.parser.xml;

import java.io.IOException;
import java.util.HashMap;

import org.kxml.Xml;
import org.kxml.parser.ParseEvent;
import org.kxml.parser.XmlParser;

import com.site.UCMScenarioViewer.model.ParallelSequence;
import com.site.UCMScenarioViewer.model.Sequence;

public class ParallelParser {

	private ParallelSequence par;

	private XmlParser parser;

	public ParallelParser(XmlParser parser) {
		this.par = new ParallelSequence("id", "par");
		this.parser = parser;
	}

	public ParallelSequence parseParallel(HashMap lines, HashMap components) {
		try {
			boolean keepParsing = true;

			while (keepParsing) {
				ParseEvent event = parser.read();

				switch (event.getType()) {
				case Xml.START_TAG:
					if (event.getName().equals("seq")) {
						Sequence seq = new Sequence(event.getAttribute(0)
								.getValue(), "par sequence");
						SequenceParser sequenceParse = new SequenceParser(
								parser, seq);
						seq = sequenceParse.parseSequence(lines, components);
						par.addChild(seq);
					}

					break;

				case Xml.END_TAG:
					if (event.getName().equals("par"))
						keepParsing = false;
					break;
				}
			}

		} catch (IOException e) {
		}
		return par;
	}

}