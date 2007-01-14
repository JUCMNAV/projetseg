package com.site.UCMScenarioViewer.parser.msc;

import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.Sequence;

public class ScenarioParser {

	private Scenario scenario;

	private BufferedReader reader;

	public ScenarioParser(Scenario scenario, BufferedReader bufread) {
		this.scenario = scenario;
		this.reader = bufread;
	}

	public Scenario parseScenario(String lines) {
		try {
			String line, temp = "";
			line = lines;
			boolean outLoop = false, inLoop = true, exitLoop = false;
			LifeLine lifeL;
			HashMap lifeLines = new HashMap();

			while (inLoop) {
				StringTokenizer st = new StringTokenizer(line, "\' ,;:");
				String s = "";

				while (st.hasMoreTokens()) {

					temp = st.nextToken();
					if (st.hasMoreTokens()) {
						s = st.nextToken();
						if (s.equals("instance")) {
							if (s.equals("instance")) {
								lifeL = new LifeLine("", temp);
								scenario.addChild(lifeL);
								lifeLines.put(temp, lifeL);
								outLoop = true;
							}

						} else if (outLoop) {
							exitLoop = true;
							break;
						}
					}

				}

				if ((exitLoop) && (outLoop)) {
					break;
				}
				line = reader.readLine();
			}
			SequenceParser sequenceParse = new SequenceParser(reader);
			Sequence seq = sequenceParse.parseSequence(lifeLines, line);
			scenario.addChild(seq);

		} catch (IOException e) {
		}

		return scenario;
	}
}