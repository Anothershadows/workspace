package Automation.Automationqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pointer {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		WebElement cl = driver.findElement(By.xpath(""));
		Point  pointer = cl.getLocation();
		int h = pointer.getX();
		int u = pointer.getY();
		System.out.println(h +" " +u);	
		Actions action = new Actions(driver);
		action.moveToLocation(h, u).click().perform();
		
		

	}

}
