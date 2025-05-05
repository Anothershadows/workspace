package anothershadow;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import sourcebase.baseclass;
public class Loginpage extends baseclass {
	
	public Loginpage(RemoteWebDriver driver) {
	this.driver = driver;
	}
	
	
	public Loginpage entureUserName(String Username) {
		
		driver.findElement(By.name("email")).sendKeys(Username);
		return this ;
	}
    public Loginpage enturePassword(String Password) {
		driver.findElement(By.name("password")).sendKeys(Password);
		return this;
	}
    public dashboard clickLogin() {
    	driver.findElement(By.xpath("(//button[@class='button is-primary'])[1]")).click();
    	return new dashboard();
    	
    }
	}


