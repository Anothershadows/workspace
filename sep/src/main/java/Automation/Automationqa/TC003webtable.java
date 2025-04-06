package Automation.Automationqa;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003webtable extends reusable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");	
		driver.manage().window().maximize();

		WebElement country = driver.findElement(By.tagName("table"));

		List<WebElement> row = country.findElements(By.tagName("tr"));

		WebElement selectrow = row.get(4);

		List<WebElement> cell = selectrow.findElements(By.tagName("td"));

		for (WebElement Celleach : cell) {

			String g = Celleach.getText();

			System.out.println(g);

			if (g.equals("Catalan")) {

				WebElement cehc = driver
						.findElement(By.xpath("//table[@id='countries']/tbody[1]/tr[4]/td[1]/input[1]"));
				Boolean checkbox = cehc.isEnabled();
				System.out.println(checkbox);

			}
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			
			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.navigate().to("https://cosmocode.io/automation-practice-handling-waits/");
			driver.findElement(By.xpath("//input[@type='Checkbox']")).click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement name = driver.findElement(By.id("firstName"));
			WebElement expwait = wait.until(ExpectedConditions.visibilityOf(name));
			expwait.click();

		}
	}
}
