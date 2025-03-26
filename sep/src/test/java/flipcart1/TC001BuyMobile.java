package flipcart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Automation.Automationqa.reusable;

public class TC001BuyMobile extends reusable {
	static reusable r = new reusable();
	@Test(groups = {"sanity"})	
	public void TC001BuyMobile001() throws InterruptedException {
//	public static void main(String[] args) throws InterruptedException {
		
		r.browserLaunch();
		r.launchurl("https://www.flipkart.com/");
		r.toMaximize(driver);
		String searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"))
				.getAttribute("title");
		System.out.println(searchbox);

		WebElement k = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		reusable.tofill(k, "mobiles");
		String v = k.getAttribute("value");
		System.out.println(v);

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("(//div[@class='col col-7-12']//div)[1]")).click();
		Thread.sleep(5000);
		
		Set<String> windowsHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowsHandles);
		driver.switchTo().window(list.get(1));
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		driver.findElement(By.id("pincodeInputId")).sendKeys("607401");
		driver.findElement(By.xpath("//span[normalize-space(text())='Check']")).click();

		WebElement o = driver.findElement(By.xpath("(//input[@name='exchange-options']/following-sibling::div)[3]"));
		boolean isDisplayed = o.isDisplayed();
		System.out.println(isDisplayed);

		reusable.tocheckable(o);

	}
}
