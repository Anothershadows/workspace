package systemtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testallnow {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chromedriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox']")).sendKeys("toys");
	driver.sendKeys(Keys.ENTER);
	
		
	

	}

}
