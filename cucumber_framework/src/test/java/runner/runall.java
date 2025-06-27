package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(features = ("src/test/java/features"),
dryRun =false,
glue={"Pages","base"},
snippets = SnippetType.CAMELCASE,
monochrome = false,
plugin = {"pretty", 
		"html:reports",
		"rerun:target/failed_scenarios.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	
		}

//tags={"@allrun"}

)
public class runall extends AbstractTestNGCucumberTests{

}
