package sanityflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpageaction{
	
	public static WebDriver driver;{
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	}
	public loginpageaction geturl(String url) {
		driver.get(url);
		return this;
	}
	public loginpageaction Emailid(String username) {
		driver.findElement(By.id("txtLogin")).sendKeys(username);
		return this;
	}
	public loginpageaction password(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		return this;
	}
	public loginpageaction click() {
		driver.findElement(By.id("btnLogin")).click();
		return this;
	}
	public void login(String Emailid,String password) {
		Emailid("username");
		password("password");
	}

}
