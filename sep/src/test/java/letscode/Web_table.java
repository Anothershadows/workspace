package letscode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_table {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String header12 = header.getText();
			System.out.print(header12);
		}
		System.out.println();
		// Get all rows in the table
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
//		for (WebElement row : allRows) {
//			String header123 = row.getText();
//			System.out.print(header123);
//			System.out.println();
//			
//		}
		
		// Get the first row (header row)
		List<WebElement> headerCells = allRows.get(1).findElements(By.tagName("td")); 

		// Iterate through the header cells and print their text
		for (WebElement headerCell : headerCells) {
			String headerText = headerCell.getText();
			System.out.print(headerText);

			if (headerText.equals("Chatterjee")) {

			WebElement check=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]") );
			check.click();

				Thread.sleep(3000);
				
break;
			}
		}
		driver.quit();
	}
}
