package systemtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Copyfirst {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ChromeDriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();

	}

}
