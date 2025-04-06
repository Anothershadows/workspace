package letscode;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

 org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lets_code {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		//Launch browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			
		driver.navigate().to("https://letcode.in/edit");
		Robot robot = new Robot();
		driver.findElement(By.id("fullName")).click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_CONTROL);		
		robot.keyPress(KeyEvent.VK_C); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("g")));	
	//	robot.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.id("fullName")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyRelease(KeyEvent.VK_V);
		
	//	driver.quit();
		
		
		driver.navigate().to("https://letcode.in/dropdowns");
		driver.manage().window().maximize(); 
		 
		WebElement b = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
		Select v = new Select(b);
		v.selectByIndex(3);
		
		
		WebElement b1 = driver.findElement(By.id("superheros"));
		Select v1 = new Select(b1);
		v1.selectByIndex(3);
		WebElement b13 =driver.findElement(By.xpath("(//div[@class=\"notification is-success\"]/p)[2]"));
		String lb = b13.getText();
		System.out.println(lb);
		
		WebElement table = driver.findElement(By.id("id=\"simpletable\""));
 List<WebElement> headers =	table.findElements(By.tagName("th"));
	
		
	

		
		
	
	//	Assert.assertEquals(lb,"You have selected Batman");
	//	driver.quit();
	 
		
		
		
		//Alert
		driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		driver.findElement(By.xpath("//button[@id=\"accept\"]")).click();
		Alert alert = driver.switchTo().alert();
		String g = alert.getText();
		System.out.println(g);
		alert.accept();
		driver.findElement(By.id("confirm")).click();
		alert.dismiss();
		driver.findElement(By.xpath("//button[@id=\"modern\"]")).click();
		driver.findElement(By.xpath("//button[@aria-label=\"close\"]")).click();
		driver.quit();
		
		//Handeling inputs
		String  Einsidefield = driver.findElement(By.xpath("//input[@placeholder='Enter first & last name']")).getAttribute("placeholder");
		System.out.println(Einsidefield);
		//enter name 
	    WebElement name = driver.findElement(By.id("fullName"));
	    name.sendKeys("Another Shadows");
	    String ENT = name.getAttribute("value");
	    System.out.println(ENT);    
	    //Clearme	     
	    driver.findElement(By.id("clearMe")).clear();
	    //Isselectable
	    WebElement p = driver.findElement(By.xpath("//input[@id=\"noEdit\"]"));
		boolean l =p.isSelected();
		System.out.println(l);
		//readyonly
		WebElement k = driver.findElement(By.xpath("//input[@id='dontwrite']"));
		boolean j =k.isEnabled();
		System.out.println(j);
		driver.navigate().back(); 
		driver.getCurrentUrl();
		driver.navigate().to("https://letcode.in/buttons");
		//find points
		 
		 WebElement DG = driver.findElement(By.id("position"));
	     Point point = DG.getLocation();
		 int A = point.getX();
		 int B = point.getY();
		 System.out.println("x"+A+"Y"+B);
		 //coloue
		 String C = DG.getCssValue("background-color");
		 System.out.println(C);
		 //hight&with 
		 Rectangle h = DG.getRect();
		 Dimension dime = h.getDimension();
		 System.out.println("width"+ dime.width);
		 System.out.println("Hight"+dime.height);		

	} 

}
