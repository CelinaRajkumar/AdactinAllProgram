package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.event.SnippetsSuggestedEvent;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features={"@src\\test\\resources\\FailedScenarios\\failedScenarios.txt"},
				 glue="com.StepDef",
				 dryRun=false,
				 monochrome=true,
				 snippets=SnippetType.CAMELCASE,
				 strict=false)


public class TestReRunner {

	
	
	
}
