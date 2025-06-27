package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ("src/test/java/features/irda.feature"), 
dryRun = false, 
glue = {"Pages","base"}, 
snippets = SnippetType.CAMELCASE, 
monochrome = true,
plugin = {"pretty", 
		"rerun:target/failed_scenarios.txt",
		"html:reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
tags = {"@smoke"}

)

public class Rirda extends AbstractTestNGCucumberTests {

}
