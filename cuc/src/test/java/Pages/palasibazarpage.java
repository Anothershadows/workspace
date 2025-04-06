package Pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import POJO.palasibazar;
import base.testdrive;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class palasibazarpage extends testdrive {

	@Given("the user navigates to the application")
	public void theUserNavigatesToTheApplication() {
		browserLaunch();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
	}

	@Given("the user selects a travel date")
	public void theUserSelectsATravelDate() throws InterruptedException {
		palasibazar p = new palasibazar();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		p.getClciktravel().click();
		p.getSelectdate().click();
		p.getSwitchdate();
		Thread.sleep(2000);

		LocalDate today = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
		String ariaLabel = today.format(formatter);

		System.out.println("Selecting date: " + ariaLabel);

		WebElement chooseDate = driver.findElement(By.xpath("//button[@aria-label='" + ariaLabel + "']"));

		Thread.sleep(2000);
		chooseDate.click();

		LocalDate futureDate = LocalDate.now().plusDays(5);
		String futureLabel = futureDate.format(DateTimeFormatter.ofPattern("MMM d, yyyy"));

		WebElement futureDateBtn = driver.findElement(By.xpath("//button[@aria-label='" + futureLabel + "']"));
		futureDateBtn.click();

		p.getDone().click();
	}

	@Given("the user selects the destination place")
	public void theUserSelectsTheDestinationPlace() {
		palasibazar p = new palasibazar();
		WebElement tupcontry = p.getTpyecountry();
		tupcontry.sendKeys("Hong");
		tupcontry.click();
	}

	@When("the user clicks the {string} button")
	public void theUserClicksTheButton(String string) {
		palasibazar p = new palasibazar();
		p.getClickcountry().click();
	}

	// add travel
	@When("the user reads the policy details")
	public void theUserReadsThePolicyDetails() {
		palasibazar p = new palasibazar();
		p.getAddtravel().click();
		p.getCheck1();
		p.selectDropdownByIndex(0);
	}

	@Then("the travel count should be displayed correctly")
	public void theTravelCountShouldBeDisplayedCorrectly() throws InterruptedException {
		palasibazar p = new palasibazar();
		WebElement checkradia = p.getSelectyes();
		boolean value = checkradia.isSelected();
		System.out.println(value);
		if (value == false) {
			p.getSelectyes().click();

		}
		Thread.sleep(4000);
		p.getDone().click();
		driver.quit();
	}

}