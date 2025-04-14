package random;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iffotech {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//body[@itemtype=\"https://schema.org/WebPage\"]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//img[@src='assets/img/flags/fl-sg.png']/parent::a")).click();
		//driver.findElement(By.xpath("//a[@title='Country']//ancestor::a")).click();
		//driver.findElement(By.xpath("//span[text() = 'Videos']/parent::a")).click();
		WebElement table = driver.findElement(By.tagName("tbody"));		
		List<WebElement> row3 = driver.findElements(By.tagName("tr"));
		List<WebElement> rows = row3.get(3).findElements(By.tagName("td"));
		for(WebElement row : rows) {
			
			String name = row.getText();
		//	System.out.println(name);
			if(name.equals("John White")) {
				WebElement johnCheckbox = driver.findElement(By.xpath("//td[text()='John White']/following-sibling::td[3]/input[@type='checkbox']"));
				johnCheckbox.click();
			}
		}
		
		

	}

}
