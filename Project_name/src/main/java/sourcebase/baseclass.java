package sourcebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	String URL = "https://letcode.in/signin";
	
	protected RemoteWebDriver driver = null;
	@BeforeMethod
	public void browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public void colseapp() {
		driver.quit();
		
	}
			}
