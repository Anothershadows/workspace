package flipcart1;

import java.util.HashSet;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Automation.Automationqa.reusable;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TC002phonecount extends reusable {

	static WebDriver driver;
	reusable r = new reusable();
	@Test(groups = {"reg"})	
	public void TC002phonecount002() {
	//public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		// maximze driver
		driver.manage().window().maximize();

		// clear cookies
		driver.manage().deleteAllCookies();

		// launch url
		driver.get("https://www.flipkart.com/");

		// get url name
		driver.getCurrentUrl();

		// print header element name
		String header = driver.findElement(By.xpath("//span[normalize-space(text())='Login']")).getText();
		System.out.println(header);
		String header2 = driver.findElement(By.xpath("(//a[@class='_1krdK5 _3jeYYh'])[1]")).getText();
		System.out.println(header2);
		String header3 = driver.findElement(By.xpath("(//a[@class='_1krdK5 _3jeYYh'])[2]")).getText();
		System.out.println(header3);

		// print inside search box
		WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		String n = searchbox.getAttribute("title");
		System.out.println(n);
		
		// send keys value
		searchbox.sendKeys("mobile");
		String v = searchbox.getAttribute("value");
		System.out.println(v);
		
		// keyboard action enter
		Actions mn = new Actions(driver);
		searchbox.sendKeys(Keys.ENTER);

		// selectdrop dows
		WebElement dropdown = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(2);
		drop.selectByVisibleText("₹30000");
		

		// List all elements that contain the text "Phone"
		List<WebElement> phoneElements = driver.findElements(By.xpath("//*[contains(text(), 'Phone')]"));

		// Print the count of elements containing the text "Phone"
		System.out.println("Count of 'Phone' text on the page: " + phoneElements.size());
		
		// Create a Set to store unique text values containing "Phone"
		Set<String> uniquePhoneTexts = new HashSet<>();

		// Find all elements that contain the text "Phone"
		List<WebElement> phoneElements1 = driver.findElements(By.xpath("//*[contains(text(), 'Phone')]"));

		// Loop through each element and add its text to the Set
		for (WebElement element : phoneElements1) {
			uniquePhoneTexts.add(element.getText().trim());
		}

		// Print the count of unique 'Phone' texts on the page
		System.out.println("Count of unique 'Phone' text occurrences on the page: " + uniquePhoneTexts.size());

		driver.quit();

	}
}
