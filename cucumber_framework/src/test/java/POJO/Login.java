package POJO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.reusable;

public class Login extends reusable{
	
	public Login() {
	        PageFactory.initElements(driver, this);
	}

	public WebElement getProfileclick() {
		return profileclick;
	}

	public WebElement getEntervalue() {
		return entervalue;
	}

	public WebElement getLogin() {
		return login; 
	}

	@FindBy(xpath="//a[@title=\"Login\"]")	
	private WebElement profileclick;
	
	@FindBy(xpath="//input[@class=\"r4vIwl BV+Dqf\"]")
	private WebElement entervalue;
	
	@FindBy(xpath="//button[@class=\"QqFHMw twnTnD _7Pd1Fp\"]")
	private WebElement login;
	
}
