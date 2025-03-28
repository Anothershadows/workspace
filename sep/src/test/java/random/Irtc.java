package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irtc {
	static WebDriver driver;
	
//  	 public void calander() {	
//	    WebDriverManager.chromedriver().setup();
//  	driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();	
//		driver = new EdgeDriver();
//		maximze driver
//	}
	@Parameters({"browser"})
	@Test	
	public void brows(String browser) {	
	WebDriverManager.edgedriver().setup();	
	switch(browser) {
	case"chrome":
		driver = new ChromeDriver();
		break;
	default:
		System.err.println("not done");
		break;
	case"edge":
		driver = new EdgeDriver();
		break;
	}
		driver.manage().window().maximize();	
		//clear cookies
		driver.manage().deleteAllCookies();	
	//launch url		
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement cal = driver.findElement(By.xpath("//div[@class='form-group ui-float-label']//p-calendar[1]")); 
		cal.click();		
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("span.ui-datepicker-next-icon.pi")).click();
		WebElement cal2 =driver.findElement(By.xpath("//td[contains(.,'15')]"));
		cal2.click();
	}
}
