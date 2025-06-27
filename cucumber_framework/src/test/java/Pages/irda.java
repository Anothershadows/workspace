package Pages;

import POJO.irdaPOJO;
import base.reusable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utiles.Automation_report;

public class irda extends reusable {
	
	public static irdaPOJO ir;
	@Given("verify user can navigate irda")
	public void verifyUserCanNavigateIrda() {		
	//	browserLaunch();
		launchurl("https://irdai.gov.in/");	
		toMaximize(driver);
			    
	}

	@When("select eserivce")
	public void selectEserivce() throws InterruptedException {
		 ir = new irdaPOJO();
		 Thread.sleep(4000);
		toclick(ir.getClickservice());
	}

	@When("select form")
	public void selectForm() {
		toclick(ir.getSelectfromedate());    
	    
	}

	@When("select date")
	public void selectDate() {
		toclick(ir.getChoosedate());
	  	    
	}
	
	@When("test")
	public void test() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test done");
	}


	@Then("click clear")
	public void clickClear() {
	    
	    
	}

}
