package random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sckscaner {
static WebDriver driver ; 
	public static void main(String[] args) {
		//open Driver;
	//	WebDriverManager.chromedriver().setup();
	//	driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();	
		driver = new EdgeDriver();
		//open webpage;
		driver.get("https://www.skyscanner.co.in/flights/arrivals-departures/maa/chennai-arrivals-departures");
		//check list

	}

}
