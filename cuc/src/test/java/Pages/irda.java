package Pages;

import POJO.irdaPOJO;
import base.reusable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class irda extends reusable {
	public static irdaPOJO ir;
	
	@Given("verify user can navigate irda")
	public void verifyUserCanNavigateIrda() {		
		browserLaunch();
		launchurl("https://irdai.gov.in/");	
			    
	}

	@When("select eserivce")
	public void selectEserivce() {
		 ir = new irdaPOJO();
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

	@Then("click clear")
	public void clickClear() {
	    
	    
	}

}
