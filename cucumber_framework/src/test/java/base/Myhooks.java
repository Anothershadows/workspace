package base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import utiles.Automation_report;

public class Myhooks extends reusable {
	@Before
	public void setup() {
		System.out.println("Report generated");
		ChromeOptions options = new ChromeOptions();

        // ✅ Use new headless mode for better screenshot support
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        
		Automation_report.startReport();
		Automation_report.create("insurance", "Gokul", "Sanity");
		System.out.println("Program start");
		

	}
	@After
	public void tearDown() {
	    Automation_report.endReport();
	}
	
/*	public void Afterscanerio(Scenario scenario) {
		boolean failed = scenario.isFailed();
		System.out.println("is Failed" + failed);
		if (failed) {
		//	byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		//	scenario.embed(screenshotAs, "image/png");
		//	scenario.embed(screenshotAs, "image/png");
			
			   byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

		        // Save screenshot file to disk
		        String screenshotName = scenario.getName().replaceAll(" ", "_");
		        String screenshotPath = "test-output/screenshots/" + screenshotName + ".png";
		        File screenshotFile = new File(screenshotPath);
		        screenshotFile.getParentFile().mkdirs(); // Ensure directory exists
		        
		     //   scenario.attach(screenshotBytes, "image/png", screenshotName);
		        scenario.embed(screenshotBytes, "image/png");

		} */
	@AfterStep
    public void afterScenarioStep(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Take screenshot and return file path
                String screenshotName = scenario.getName().replaceAll(" ", "_");
                String screenshotPath = Automation_report.captureScreenshot(driver);

                // Embed in Cucumber HTML report
                if (screenshotPath != null && new File(screenshotPath).exists()) {
                    byte[] screenshotBytes = Files.readAllBytes(new File(screenshotPath).toPath());
                    scenario.embed(screenshotBytes, "image/png");
                } else {
                    System.out.println("Screenshot file not found: " + screenshotPath);
                }

                // Log in Extent Report
                Automation_report.stepReport("fail", "Step failed: " + scenario.getName());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}