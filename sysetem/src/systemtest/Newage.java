package systemtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newage {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chromedriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert(); 
		Thread.sleep(5000);
		alert.accept();
		driver.quit();

	}

}
