package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ("src/test/java/features/training_all.feature"), 
dryRun = !false, 
glue = {"Page","base" ,"POJO"}, 
snippets = SnippetType.CAMELCASE, 
monochrome = false,
plugin = { "pretty", "html:reports", 
		"rerun:target/failed_scenarios.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
tags = "@test"
)

public class training_all extends AbstractTestNGCucumberTests {

}
