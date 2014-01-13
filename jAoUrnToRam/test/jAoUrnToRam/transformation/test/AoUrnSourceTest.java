package jAoUrnToRam.transformation.test;

import static org.junit.Assert.*;

import intermediateWorkflow.IwModel;
import jAoUrnToRam.transformation.AoUrnSource;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import urn.URNspec;

public class AoUrnSourceTest {
	
	private List<AoUrnSource> _inputModels;
	
	@Before
	public void setUp() throws Exception {
		String[] testCases = AoUrnToRamTestCases.getTestCases(); 
		
		for(String testCase : testCases){
			AoUrnSource inputModel = new AoUrnSource(testCase);
			_inputModels.add(inputModel);
		}
	}
	
	@Test
	public void testToIw() {
		for(AoUrnSource inputModel : _inputModels){
			IwModel iwModel = inputModel.toIw();
			
			URNspec root = inputModel.getRoot();
			
			
		}
		fail("Not yet implemented");
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPath() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}
}
