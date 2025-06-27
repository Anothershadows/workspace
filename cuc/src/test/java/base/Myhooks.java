package base;

import org.openqa.selenium.OutputType;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Myhooks extends reusable {

	@Before
	public void beforeScanerio() {
		System.out.println("Program start");
		browserLaunch();
		implicitewait();

	}

	@After
	public void Afterscanerio(Scenario scenario) {
		boolean failed = scenario.isFailed();
		System.out.println("is Failed" + failed);
		if (failed) {
			byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");

		}
	}

}
