package systemtest;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button 
 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.ChromeDriver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		WebElement els = driver.findElement(By.id("position"));
		Point point = els.getLocation();
		int x =point.getX();
		int y =point.getY();
		System.out.println("x"+x+"l"+y);
		driver.quit();
		
		

	}

}
