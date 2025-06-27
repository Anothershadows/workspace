package POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.reusable;

public class TrainingAllPage extends reusable {

    public TrainingAllPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement username;

    public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "login-button")
    private WebElement loginButton;


	

	


}
