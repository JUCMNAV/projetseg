package com.site.UCMScenarioViewer.parser;

import java.io.File;
import java.io.IOException;

import seg.jUCMNav.editors.resourceManagement.UcmScenariosModelManager;

import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.parser.emf.ScenarioGroupParser;

/**
 * Load model from EMF serialization
 * @author jkealey
 *
 */
public class EMFParserInitializer {

	public static ScenarioGroup parseMscModel(File file){
		ScenarioGroup scenG = null;
		try {			
			UcmScenariosModelManager mgr = new UcmScenariosModelManager();
			mgr.load(file);
			ScenarioGroupParser GroupParse = new ScenarioGroupParser(mgr.getModel());
			scenG = GroupParse.parseScenarioGroup();
		} catch (IOException e) {
		}
		return scenG;
	}
}
