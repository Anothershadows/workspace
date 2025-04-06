package Automation.Automationqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class robatclass extends reusable {

	public static void main(String[] args) throws AWTException, InterruptedException {
	reusable.browserLaunch();
			
			reusable.launchurl("https://formsmarts.com/html-form-example");
			 
		//maximuse windows
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			WebElement element =driver.findElement(By.xpath("//iframe[@allow='camera; fullscreen; geolocation']"));
			driver.switchTo().frame(element);
			WebElement element1 = driver.findElement(By.xpath("//*[contains(@id, 'u_kXZ_4607')]"));
			element1.sendKeys("test");
//			
//			WebElement element1 = driver.findElement(By.xpath("//input[@id='u_iVk_4607']"));
//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//			WebElement element2	= wait.until(ExpectedConditions.visibilityOf(element1));
//					element2.sendKeys("test");
			Actions action = new Actions(driver);
			action.doubleClick(element1).perform();  
			
			Robot robot = new Robot();  			
			robot.keyPress(KeyEvent.VK_CONTROL + VK_C);
			
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_C);
			
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			
			
			Thread.sleep(5000);
			

	}

}
