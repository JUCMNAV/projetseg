package jAoUrnToRam;

import jAoUrnToRam.test.AoUrnToRamTestCases;

public class JAoUrnToRamMain {
	private static final String testRoot = "testcases\\actual"; 
	
	public static void main(String[] args) {
		AoUrnToRam trnsfrmr = new AoUrnToRam(testRoot); //to be refactored for plugin build
		
		for(String testCase : AoUrnToRamTestCases.getTestCases()){
			trnsfrmr.transform(testCase);
		}
	}
}