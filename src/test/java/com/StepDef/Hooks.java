package com.StepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.basePack.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	
	@Before
	public void launcher() {
		
		launch();
		maximize();
		
	}
	
	@After 
	public void closebow(Scenario s) throws Throwable {
		
		if(s.isFailed()) {
			
			failtesttakeSnap(s);
			
		}
		
		else {
		
		String name = s.getName();
		
//		String name = str.replaceAll(" ", "_");
		takeSnap(name);
		
		
		
	
		}
		exit();
}}
