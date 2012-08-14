package com.site.UCMScenarioViewer.parser.xml;

import java.io.IOException;
import java.util.HashMap;

import org.kxml.Xml;
import org.kxml.parser.ParseEvent;
import org.kxml.parser.XmlParser;

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

	private XmlParser parser;

	public SequenceParser(XmlParser parser) {
		this.sequence = new Sequence("id", "Sequence");
		this.parser = parser;
	}

	public SequenceParser(XmlParser parser, Sequence seq) {
		this.sequence = seq;
		this.parser = parser;
	}

	public Sequence parseSequence(HashMap lines, HashMap components) {
		try {
			int count = 0;
			boolean keepParsing = true;

			String Doid = "";
			String name = "";
			String type = "";
			String component = "";
			String mid = "";
			String source = "";
			String dest = "";
			String instance = "";
			String id = "";

			while (keepParsing) {
				ParseEvent event = parser.read();

				switch (event.getType()) {
				case Xml.START_TAG:

					if (event.getName().equals("do")) {

						count = event.getAttributeCount();

						for (int i = 0; i < count; i++) {

							if (event.getAttribute(i).getName().equals(
									"hyperedge-id"))
								Doid = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals("name"))
								name = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals("type"))
								type = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"component-name"))
								component = event.getAttribute(i).getValue();

						}

						if (!type.equals("Connect_Start")
								&& !type.equals("Connect_End")
								&& !type.equals("Trigger_End")) {
							DoElement element = null;
							String b = (String) components.get(component);
							if (type.equals("Resp"))
								element = new Action(Doid, name, (LifeLine) lines.get(b));
							if (type.equals("Start")
									|| type.equals("End_Point"))
								element = new StartEndMessage(Doid, name,
										(LifeLine)lines.get(b));
							if (type.equals("Timer_Set"))
								element = new SetTimer(Doid, name, (LifeLine)lines.get(b));
							if (type.equals("Timer_Reset"))
								element = new ResetTimer(Doid, name, (LifeLine)lines.get(b));
							if (type.equals("Timeout"))
								element = new TimeOut(Doid, name, (LifeLine)lines.get(b));
							if (element != null)
								sequence.addChild(element);
						}

					}

					if (event.getName().equals("message")) {

						count = event.getAttributeCount();

						for (int i = 0; i < count; i++) {

							if (event.getAttribute(i).getName().equals("id"))
								mid = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals("name"))
								name = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"source-id"))
								source = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"destination-id"))
								dest = event.getAttribute(i).getValue();

						}

						Message message = new Message(mid, name,
								(LifeLine) lines.get(source), (LifeLine) lines
										.get(dest));
						sequence.addChild(message);

					}

					if (event.getName().equals("condition")) {

						count = event.getAttributeCount();
						String expression = "";

						for (int i = 0; i < count; i++) {

							if (event.getAttribute(i).getName().equals(
									"hyperedge-id"))
								id = event.getAttribute(i).getValue();
							
							if (event.getAttribute(i).getName().equals(
									"name"))
								name = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"expression"))
								expression = event.getAttribute(i).getValue();

							if (event.getAttribute(i).getName().equals(
									"instance"))
								instance = event.getAttribute(i).getValue();

						}

						DoElement element = new Condition(id, name,
								(LifeLine) lines.get(instance),
								expression);
						sequence.addChild(element);
					}

					if (event.getName().equals("par")) {
						ParallelSequence par = new ParallelSequence();
						ParallelParser parParse = new ParallelParser(parser);
						par = parParse.parseParallel(lines, components);
						sequence.addChild(par);
					}

					break;

				case Xml.END_TAG:
					if (event.getName().equals("seq"))
						keepParsing = false;

					if (event.getName().equals("scenario"))
						keepParsing = false;

					break;

				}
			}
		}

		catch (IOException e) {
		}
		return sequence;

	}

}