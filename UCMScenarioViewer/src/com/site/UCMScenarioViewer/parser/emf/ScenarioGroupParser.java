package com.site.UCMScenarioViewer.parser.emf;

import java.util.Iterator;

import org.kxml.io.ParseException;

import ucmscenarios.ScenarioDef;
import ucmscenarios.ScenarioSpec;

import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.ScenarioGroup;

/**
 * @author jkealey
 */
public class ScenarioGroupParser {

	private ScenarioGroup group;

	private ScenarioSpec scenariospec;

	public ScenarioGroupParser(ScenarioSpec fileR) {
		this.group = new ScenarioGroup();
		this.scenariospec = fileR;
	}

	public void setGroup(ScenarioGroup s) {
		this.group = s;
	}

	public ScenarioGroup getGroup() {
		return this.group;
	}

	public ScenarioGroup parseScenarioGroup() throws ParseException {


		for (Iterator iter = scenariospec.getGroups().iterator(); iter.hasNext();) {
			ucmscenarios.ScenarioGroup src = (ucmscenarios.ScenarioGroup) iter.next();

			if (group==null) // the if is here because there is a limitation in the scenario viewer that doesn't support multiple groups 
				group = new ScenarioGroup(src.getId(), src.getName());

			for (Iterator iterator = src.getScenarios().iterator(); iterator.hasNext();) {
				ScenarioDef srcscenario = (ScenarioDef) iterator.next();

				Scenario scenario = new Scenario(srcscenario.getId(), srcscenario.getName(), srcscenario.getDescription());
				ScenarioParser scenP = new ScenarioParser(scenario, srcscenario);
				group.addChild(scenP.parseScenario());
			}
		}

		return group;

	}

}