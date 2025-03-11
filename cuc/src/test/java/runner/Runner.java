package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ("src/test/java/featutes/"),
//login.feature
dryRun = false, 
glue = "Pages", 
snippets = SnippetType.CAMELCASE, 
monochrome = false,
plugin = {"pretty", "html:reports",
		},
tags={"@smoke"}

)
public class Runner extends AbstractTestNGCucumberTests {
	  
}
