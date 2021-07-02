package com.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.basePack.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
				 glue={"com.StepDef"},
				 monochrome=true,
				 dryRun=false,
				 strict=false,
				// tags= {"@Greens or @Nykaa"}, 
				 snippets=SnippetType.CAMELCASE,
				 plugin= {"pretty",
						  "json:src\\test\\resources\\Reports\\output.json",
						  "html:src\\test\\resources\\Reports",
						  "junit:src\\test\\resources\\Reports\\scenario.xml",
						  "rerun:src\\test\\resources\\FailedScenarios\\failedScenarios.txt"})

public class TestRunner  {
	
	//Putting it in at after class as @After Class will be generate or run only one in the entire program execution - we need only report once that too after 
	// all scenario executions
	
	@AfterClass
	public static void jvmReportCallMethod() {
		
		JVMReport.generatReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\output.json");
	}

}
