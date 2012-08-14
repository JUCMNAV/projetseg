package com.site.UCMScenarioViewer.parser.xml;

import java.io.FileReader;
import java.io.IOException;

import org.kxml.Xml;
import org.kxml.io.ParseException;
import org.kxml.parser.ParseEvent;
import org.kxml.parser.XmlParser;

import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.utils.Helper;

/**
 * @author Tolik
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class ScenarioGroupParser {

	private ScenarioGroup group;

	private FileReader reader;

	public ScenarioGroupParser(FileReader fileR) {
		this.group = new ScenarioGroup();
		this.reader = fileR;
	}

	public void setGroup(ScenarioGroup s) {
		this.group = s;
	}

	public ScenarioGroup getGroup() {
		return this.group;
	}

	public ScenarioGroup parseScenarioGroup() throws ParseException {
		try {
			int count = 0;
			boolean keepParsing = true;
			XmlParser parser = new XmlParser(reader);

			String id = "";
			String name = "";
			String scenDefID = "";
			String description = "";

			while (keepParsing) {
				ParseEvent event = parser.read();

				switch (event.getType()) {
				case Xml.START_TAG:

					if (event.getName().equals("group")) {

						count = event.getAttributeCount();

						for (int i = 0; i < count; i++) {
							if (event.getAttribute(i).getName().equals("name"))
								name = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"group-id"))
								id = event.getAttribute(i).getValue();

						}

						group = new ScenarioGroup(id, name);
					}

					if (event.getName().equals("scenario")) {

						count = event.getAttributeCount();

						for (int i = 0; i < count; i++) {

							if (event.getAttribute(i).getName().equals("name"))
								name = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"scenario-definition-id"))
								scenDefID = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"description"))
								description = event.getAttribute(i).getValue();

						}

						Scenario scenario = new Scenario(scenDefID, name,
								description);
						ScenarioParser scenP = new ScenarioParser(scenario,
								parser);
						group.addChild(scenP.parseScenario());

					}

					break;
					
				case Xml.END_TAG:
					if(event.getName().equals("group"))
						keepParsing = false;
						break;

				case Xml.END_DOCUMENT:
					// end of document;
					keepParsing = false;
					break;
				}
			}

		} catch (IOException e) {
			throw new ParseException(Helper.ERR_MSG_PARSING, e);
		}
		return group;

	}

}