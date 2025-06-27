package random;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class coverall {

	public static void main(String[] args) throws InterruptedException {
		//lunch driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//windows max
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		remote.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//store webelement
		//WebElement store=remote.findElement(By.className(" css-yk16xz-control"));
		WebElement value=driver.findElement(By.id("withOptGroup"));
		//WebElement value=remote.findElement(By.xpath("//div[@class='css-yk16xz-control']"));
		value.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//store and click the option
		//WebElement optionToSelect=remote.findElement(By.xpath("//div[@class='css-1uccc91-singleValue']"));
	
		WebElement dropsown = driver.findElement(By.xpath("//div[@id=\"withOptGroup\"]"));
		dropsown.click();
		Thread.sleep(5000);
		
		List <WebElement> value1 = driver.findElements(By.xpath("//div[@class=' css-1uccc91-singleValue']"));
		Thread.sleep(5000);
		value1.get(0).click();
		
		
		
		
		/*	
		//launch url
	driver.get("https://demoqa.com/");
       driver.findElement(By.className("banner-image")).click();
		
		Set<String> windowsHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowsHandles);
		driver.switchTo().window(list.get(1));
		
		String parent = driver.getWindowHandle();
		Set<String> otherwindow = driver.getWindowHandles();
		for (String ch : otherwindow ) {
			if(!ch.equals(parent)) {
				driver.switchTo().window(ch);
				break;
			}
			
		}
		
		
		driver.findElement(By.xpath("//a[@class=\"navbar__tutorial-menu\"]")).click();	
	*/	
		
		
		
//		driver.get("https://letcode.in/window");
//		driver.navigate().to("https://letcode.in/edit");
//		driver.navigate().back();
//		driver.navigate().forward();
//		
//		//pass value
//		WebElement insidename =driver.findElement(By.xpath("(//label[normalize-space(text())='Enter your full Name']/following::input)[1]"));
//		String inname = insidename.getText();
//		System.out.println(inname);
//		
//		
//		driver.findElement(By.xpath("//input[@id=\"fullName\"]")).sendKeys("gokul");
//		
//		String inside = driver.findElement(By.xpath("//input[@value=\"I am good\"]")).getAttribute("value");
//		System.out.println(inside);
//		
//		driver.navigate().to("https://letcode.in/frame");
//		WebElement frame1 =driver.findElement(By.xpath("//div[@class='card-content']//iframe[1]"));
//		driver.switchTo().frame(frame1);
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("gokul");
//		driver.navigate().to("https://letcode.in/alert");
//		driver.findElement(By.id("accept")).click();
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.id("confirm")).click();
//		driver.switchTo().alert().dismiss();
//		//driver.quit();
//		driver.findElement(By.xpath("(//div[@class='control']//button)[3]")).click();
//		driver.switchTo().alert().sendKeys("tesr");
//		driver.switchTo().alert().accept();
//		driver.navigate().to("https://letcode.in/dropdowns");
//		WebElement fruitdrop = driver.findElement(By.id("fruits"));
//		
//		Select s = new Select(fruitdrop);
//		s.selectByIndex(3);
		
//		 WebElement v = driver.findElement(By.id("superheros"));
//		 Select s = new Select(v);
//		 s.getAllSelectedOptions();
//	 s.getOptions();
		 
//		 s.selectByIndex(2);
//		 s.selectByValue("ca");
//		 s.selectByVisibleText("Batwoman");
	
//			List<WebElement>  all = s.getOptions();		
//		for (WebElement W : all) {		
//			String text = W.getText();
//			System.out.println(text);		
//		} 
		//driver.findElement(By.id("home")).click();
	//	Set<String> windowHandles = driver.getWindowHandles();
		

		/*String parentid = driver.getWindowHandle();
		 System.out.println("parentid:"+parentid);
		 Set<String> Allid = driver.getWindowHandles();
		 System.out.println("Allid:"+ Allid);
		 Thread.sleep(5000);
		 for (String e : Allid) {
		 if(!Allid.equals(parentid)){
		  driver.switchTo().window(parentid);}
		 
		 driver.findElement(By.xpath("(//footer[@class='card-footer']//a)[2]")).click(); */
//		
		
		
		
	
		
		
		

	}

}
