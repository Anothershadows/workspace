package Pages;

import org.testng.annotations.Test;

import POJO.TrainingAllPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class training_all  {
	@Given("user name to first employee {string}")
	public void userNameToFirstEmployeeStandard_user() {
		TrainingAllPage a = new TrainingAllPage();
		a.getUsername().sendKeys("username");
	}

	@When("enter the password {string}")
	public void enterThePasswordSecret_sauce() {
		TrainingAllPage a = new TrainingAllPage();
		a.getPassword().sendKeys("password");

	}

	@Then("I verify the <status> in step")
	public void userNameToFirstEmployeeVisual_user() {
		TrainingAllPage a = new TrainingAllPage();
		a.getLoginButton().click();
	}

}
