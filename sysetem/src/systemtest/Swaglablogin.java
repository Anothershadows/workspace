package systemtest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swaglablogin {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   Actions act = new Actions(driver);
	   
	   act.sendKeys(Keys.TAB).sendKeys("secret_sauce").sendKeys(Keys.ENTER).build().perform();
	//driver.findElement(By.id("login-button")).click();
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.quit();




	}}