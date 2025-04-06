package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Palasibazar{ 
	
static WebDriver driver;

	public static void main(String[] args) {
		//open browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//get url
		driver.get("https://www.policybazaar.com/");
		//windows max
		driver.manage().window().maximize();
		driver.navigate().to("https://travel.policybazaar.com/?newpq=1&utm_term=newjourney&pb_source=google_brand&pb_medium=ppc&pb_campaign=Policy_Bazaar_Tier_100Brand&gad_source=1&gclid=CjwKCAiAl4a6BhBqEiwAqvrquoL82FprN28WW_Jno-Citwyptuaf8DFniQMorTdFcx9GZ2F63SUJbBoCtVMQAvD_BwE&pb_content=newpq");
		driver.findElement (By.xpath ("(//div[@class=\"newPq_duration_wrap__dateCol\")")).click();

		
		//get current url
		driver.getCurrentUrl();
		//select screen
		driver.findElement(By.xpath("//a[normalize-space(text())='Insurance Products']")).click();
		// mouse action
		driver.findElement(By.xpath("//a[normalize-space(text())='Insurance Products']")).click();
		//move other element 
		driver.findElement(By.xpath("(//div[@class='ruby-col-3 hidden-md']//span)[2]")).click();
		//navigate to old windows
		driver.navigate().back();
		//click tratel
		driver.switchTo().defaultContent();
		//select travel insurance
	 	driver.findElement(By.xpath("//p[contains(.,'Travel Insurance')]")).click();
	 WebElement u =	driver.findElement(By.xpath("//section[@id='root']//div[@id='newPq_mainWrapper']//div[@class='newPq_duration_wrap_dateCol']\r\n"));
	 	u.click();
	    WebElement p = driver.findElement(By.xpath("//div[@class='newPq_duration_wrap__dateCol']/p[1]/span"));
	  String r = p.getText();
	  System.out.println(r);

	 //driver.findElement(By.xpath("//span[text()='Start date']")).click();
		
	 	WebElement g  = driver.findElement(By.xpath("//button[@aria-label='Oct 10, 2024']"));
		g.click();
		
		
	}
}

