package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(features = ("src/test/java/features/palasibazar.feature"),
dryRun =false,
glue={"Pages","base"},
snippets = SnippetType.CAMELCASE,
monochrome = false,
plugin = {"pretty", 
		"html:reports",
		"rerun:target/failed_scenarios.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
tags = {"@smoke"}

)

public class palasibar extends AbstractTestNGCucumberTests{

}
