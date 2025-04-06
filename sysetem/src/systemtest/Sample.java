package systemtest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='testing']")).click();
		
        driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();  
		
        WebElement fruit = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select myfruit = new Select(fruit);
		myfruit.selectByVisibleText("Apple");
		
		String text = driver.findElement(By.xpath("(//p[@class='subtitle'])")).getText();
		System.out.println(text);
        
		WebElement co = driver.findElement(By.xpath("//select[@id='superheros']"));  
		Select select = new Select(co);
		select.selectByIndex(1);
		Thread.sleep(2000);
		String t = driver.findElement(By.xpath("(//p[@class='subtitle'])[2]")).getText();
		System.out.println(t);
		
		                                            
	    driver.quit();
	}}
