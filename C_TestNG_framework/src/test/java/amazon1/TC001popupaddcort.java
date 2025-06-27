package amazon1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC001popupaddcort {
	static WebDriver driver;
	
	@Test(groups = {"sanity"})
	public static void TC001uniccount001() throws InterruptedException {
	//public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//maximze driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().deleteAllCookies();	
		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-1-announce")).click();
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
	//move to 2 dom
		WebElement t = driver.findElement(By.id("ewc-content"));
		t.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[1]"));
		t.click();
		Thread.sleep(3000);
		WebElement Y =driver.findElement(By.id("quantity-selector_5"));
		Y.click();
		driver.quit(); 


	}
}
