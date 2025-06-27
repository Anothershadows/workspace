package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ("src/test/java/features/login.feature"), 
dryRun = false, 
glue = { "Pages","base" }, 
snippets = SnippetType.CAMELCASE, 
monochrome = false, 
plugin = { "pretty", 
		"rerun:target/failed_scenarios.txt",
		"html:reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}, 
tags = { "@sanity" })

public class Runner extends AbstractTestNGCucumberTests {

}
