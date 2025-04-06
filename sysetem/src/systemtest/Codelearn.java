package systemtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Codelearn {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@id='testing']")).click();
		driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
		
		String heading1 = driver.findElement(By.xpath("//div[@class='card-content']")).getText();
		System.out.println(heading1);
		
		System.out.println("****************");
		
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("test");
		
		WebElement store = driver.findElement(By.xpath("//input[@id='join']"));
		store.clear();
		store.sendKeys("sucessfully done");
		String pobj = store.getAttribute("value");
		System.out.println(pobj);
		
		WebElement checkh = driver.findElement(By.xpath("//input[@id='noEdit']"));
		boolean grade = checkh.isEnabled();
		System.out.println(grade);
		
		WebElement checkred = driver.findElement(By.xpath("//input[@id='dontwrite']"));
		boolean gradeg = checkred.isEnabled();
		System.out.println(gradeg);
		
		driver.navigate().back();
				
		driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();  
		
		WebElement fruit = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select myfruit = new Select(fruit);
		myfruit.selectByVisibleText("Apple");
		
		String text = driver.findElement(By.xpath("//p[contains(text(),'You have selected Apple')]")).getText();
		System.out.println(text);
			
		WebElement co = driver.findElement(By.xpath("//select[@id='superheros']"));
		  
		Select select = new Select(co);
		select.selectByIndex(1);
		Thread.sleep(2000);
		
		String store1 = driver.findElement(By.xpath("(//p[@class='subtitle'])[2]")).getText();
		System.out.println(store1);
	//============================================================================================//	
		driver.navigate().back();
		
		driver.findElement(By.linkText("Dialog")).click();
	    driver.findElement(By.xpath("(//button[@id='accept'])")).click(); 
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    
	    driver.findElement(By.xpath("//button[@id='confirm']")).click();
	    Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();				
	    String alert2 = driver.switchTo().alert().getText();
	    System.out.println(alert2);
	    
	    
		/*driver.get("https://letcode.in/radio");
		WebElement oh =driver.findElement(By.id("maybe"));
		oh.getText();
		boolean p= oh.isEnabled();
		System.out.println(p);
	    */
	    driver.quit();
		
	}

}
