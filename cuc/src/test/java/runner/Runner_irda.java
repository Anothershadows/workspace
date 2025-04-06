package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ("src/test/java/featutes/irda.feature"), 
dryRun = false, 
glue = "Pages", 
snippets = SnippetType.CAMELCASE, 
monochrome = true
//plugin = {"preety","Https:Report", }

)

public class Runner_irda extends AbstractTestNGCucumberTests {

}
