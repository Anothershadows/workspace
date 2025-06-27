package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ("@target/failed_scenarios.txt"), 
dryRun = false, 
glue = { "Pages","base" }, 
snippets = SnippetType.CAMELCASE, 
monochrome = false, 
plugin = { "pretty", 
		"html:reports",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }


)

public class rerun extends AbstractTestNGCucumberTests {

}
