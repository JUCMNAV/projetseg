package com.site.UCMScenarioViewer.parser.xml;

import java.io.IOException;
import java.util.HashMap;

import org.kxml.Xml;
import org.kxml.parser.ParseEvent;
import org.kxml.parser.XmlParser;

import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.Sequence;

public class ScenarioParser {

	private Scenario scenario;

	private XmlParser parser;

	public ScenarioParser(Scenario scenario, XmlParser parser) {
		this.scenario = scenario;
		this.parser = parser;
	}

	public Scenario parseScenario() {
		try {
			int count = 0;
			boolean keepParsing = true;

			String id = "";
			String name = "";
			String component = "";
			HashMap lifeLines = new HashMap();
			HashMap componentNames = new HashMap();

			while (keepParsing) {
				ParseEvent event = parser.read();

				switch (event.getType()) {
				case Xml.START_TAG:

					if (event.getName().equals("instance")) {

						count = event.getAttributeCount();

						for (int i = 0; i < count; i++) {

							if (event.getAttribute(i).getName().equals("id"))
								id = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals("name"))
								name = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"component"))
								component = event.getAttribute(i).getValue();
						}

						LifeLine line = new LifeLine(id, name);
						scenario.addChild(line);
						lifeLines.put(id, line);
						componentNames.put(component, id);
					}

					break;

				case Xml.END_TAG:
					if (event.getName().equals("scenario"))
						keepParsing = false;

					if (event.getName().equals("instances")) {
						SequenceParser sequenceParse = new SequenceParser(
								this.parser);
						Sequence seq = sequenceParse.parseSequence(lifeLines,
								componentNames);
						scenario.addChild(seq);
					}
					if(event.getName().equals("group"))
							keepParsing = false;

					break;

				case Xml.END_DOCUMENT:
					// end of document;
					keepParsing = false;
					break;

				}
			}

		}

		catch (IOException e) {
		}

		return scenario;

	}
}