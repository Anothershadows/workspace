package flipcart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003buyphone {
	static WebDriver driver;
	@Test(groups = {"reg"})	
	public void TC003buyphone003() {
	//public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Open Flipkart
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"))
				.getAttribute("title");
		System.out.println(searchbox);

		WebElement k = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		k.sendKeys("mobiles");
		String v = k.getAttribute("value");
		System.out.println(v);

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("(//div[@class='col col-7-12']//div)[1]")).click();
		Thread.sleep(5000);
		Set<String> windowsHandles = driver.getWindowHandles();
		// System.out.println(windowsHandles);
		List<String> list = new ArrayList<String>(windowsHandles);
		driver.switchTo().window(list.get(1));
		String s = driver.getCurrentUrl();
		System.out.println(s);
		driver.findElement(By.id("pincodeInputId")).sendKeys("607401");
		driver.findElement(By.xpath("//span[normalize-space(text())='Check']")).click();
		WebElement re = driver.findElement(By.xpath("(//input[@name='exchange-options']/following-sibling::div)[3]"));
		// List<WebElement> ht =driver.findElement("");
		WebElement o = driver.findElement(By.xpath("(//input[@name='exchange-options']/following-sibling::div)[3]"));
		boolean isDisplayed = o.isDisplayed();
		System.out.println(isDisplayed);
		driver.findElement(By.xpath("(//label[contains(@class,'tJjCVx mwTY-N')]//div)[1]")).click();
		driver.findElement(By.xpath("(//label[contains(@class,'tJjCVx mwTY-N')]//div)[2]")).click();

	}
}