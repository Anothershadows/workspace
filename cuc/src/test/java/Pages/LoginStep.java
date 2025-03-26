package Pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import POJO.Login;
import base.reusable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends reusable { 

	@Given("user should navigate to the application")
	public void userShouldNavigateToTheApplication() {
		browserLaunch();
		launchurl("https://www.flipkart.com/");
		toMaximize(driver);

	}

	@Given("User clicks on the login button")
	public void userClickOnLoginButton() {
	//	reusable r = new reusable();
		Login l = new Login();
		l.getProfileclick().click();
	
	}

	@Given("User enters the username")
	public void userEnterTheUsername() throws InterruptedException {

		reusable r = new reusable();
		Login l = new Login();
		Thread.sleep(5000);
		l.getEntervalue().sendKeys("gokul");
	}


	@When("User clicks the login button")
	public void userClicksTheLoginButton() {
		reusable r = new reusable();
		Login l = new Login();
		l.getLogin().click();
	}

	@Then("login should be successful")
	public void loginShouldBeSuccess() {
		
		String expectedresult = "Please enter valid Email ID/Mobile number";
		WebElement actual = driver.findElement(By.xpath("//span[@class=\"llBOFA\"]/span"));
		String actual1 = actual.getText();
		assertEquals(actual1, expectedresult, "Message not match");

		
	}
}
