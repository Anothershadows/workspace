package systemtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Set<String> windowhandeles =  driver.getWindowHandles();
		System.out.println(windowhandeles);
		List<String> list = new ArrayList<String>(windowhandeles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
		
		Set <String> windowhandel2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowhandel2);
		driver.switchTo().window(list.get(0));
		String windoes = driver.getCurrentUrl();
		System.out.println(windoes);
		
		
		
	}

}
