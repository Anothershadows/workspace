package systemtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);	
		
		driver.findElement(By.name("fname")).sendKeys("protest");
		
		WebElement tr =driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(tr);
		
		driver.findElement(By.name("email")).sendKeys("gyuj");
		
		
		
		
		
	}

}
