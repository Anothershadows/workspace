package letscode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) {
		// Set ChromeDriver executable path
	//	System.setProperty("webdriver.chrome.driver",
	//			"C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();

		// Click on "Testing" and then "Dialog"
		driver.findElement(By.id("testing")).click();
		driver.findElement(By.linkText("Dialog")).click();

		// Click on the "Prompt" button
		driver.findElement(By.id("prompt")).click();

		// Handle the alert
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		String print = "Protest";
		alert.sendKeys(print);
		System.out.println(print);
		alert.accept();
		driver.quit();
	}
}
