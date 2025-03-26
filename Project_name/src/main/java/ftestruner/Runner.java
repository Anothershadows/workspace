
  package ftestruner;
  
  import cucumber.api.CucumberOptions; import cucumber.api.SnippetType; import
  cucumber.api.testng.AbstractTestNGCucumberTests;
  
  @CucumberOptions( features = ("src/main/java/Feture/Ccart.book"), 
		  dryRun =! true, 
		  glue = "ftestruner", 
		  snippets = SnippetType.CAMELCASE, 
		  monochrome =true,
		  plugin = {"pretty"}
  
  )
  
  public class Runner extends AbstractTestNGCucumberTests {
  
  }
