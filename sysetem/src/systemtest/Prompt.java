/*
package systemtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Prompt {
	
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='testing']")).click();
		driver.findElement(By.linkText("Dialog")).click();
		driver.findElement(By.xpath("//button[@id='prompt']")).click();				
	    String alert2 = driver.switchTo().alert().getText();
	    System.out.println(alert2);
	    String print = "Protest";
	    Alert alert=driver.switchTo().alert();
	    alert.sendKeys(print); 	
	    System.out.println(print);
	    alert.accept();
        driver.findElement(By.id("modern")).click();
    }
	}

*/


package systemtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Prompt {
    public static void main(String[] args) {
        // Set ChromeDriver executable path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
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

        // Attempt to click "modern" button using JavaScript Executor
        try {
            WebElement modernButton = driver.findElement(By.id("modern"));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", modernButton);
        } catch (Exception e) {
            System.out.println("Failed to click 'modern' button using normal click or JavaScript");
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
