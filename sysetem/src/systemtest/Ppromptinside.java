package systemtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ppromptinside {

	public static void main(String[] args) {
	System.setProperty("webdriver.chromeDriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://letcode.in/edit");
String myvalue = driver.findElement(By.id("getMe")).getAttribute("value");
System.out.println(myvalue);
driver.findElement(By.id("clearMe")).clear();


	}

}
