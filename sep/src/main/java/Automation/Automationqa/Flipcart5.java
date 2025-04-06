package Automation.Automationqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Flipcart5 extends reusable {

	public static void main(String[] args) throws InterruptedException {
		reusable.browserLaunch();
		
		reusable.launchurl("https://www.flipkart.com/");
		 
	//maximuse windows
		 driver.manage().window().maximize();

		 
	//click
		 driver.findElement(By.xpath("//span[normalize-space(text())='Electronics']")).click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement mobile =   driver.findElement(By.xpath("driver.findElement(By.xpath(\"//a[normalize-space(text())='Bluetooth Speakers']\"))"));
	        // Wait for the weight value to be visible in the table (Example XPath)
	        WebElement weightElement = wait.until(ExpectedConditions.visibilityOfElementLocated((By) mobile));
	        mobile.click();
	//	 driver.findElement(By.xpath("driver.findElement(By.xpath(\"//a[normalize-space(text())='Bluetooth Speakers']\"))")).click();
		 driver.findElement(By.xpath("driver.findElement(By.xpath(\"//a[normalize-space(text())='Accessory Kits']\"))")).click();
		 
    //get url tabname
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
	//get search box inside letter
		 WebElement Searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		 String Searchvalue = Searchbox.getAttribute("title");
		 System.out.println(Searchvalue);
	//get sendkeys value	 
		 
		 WebElement Searchbox2= driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		 Searchbox2.sendKeys("travelbag");
		 String travel = Searchbox2.getAttribute("value");
		 System.out.println(travel);
		 driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
   //Keyboard action
		 Searchbox2.click();
		 Actions action = new Actions((WebDriver) Searchbox2);
		 action.sendKeys(Keys.BACK_SPACE).perform();
		 Thread.sleep(10000);
		 action.sendKeys(Keys.ENTER).perform();
		
		 
		 
		 driver.quit();
		

	}

}
