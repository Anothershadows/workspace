import org.openqa.selenium.Alert;

public class Pop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			WebDriver driver = new ChromeDriver();	
			driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	        driver.findElement(By.name("alertbox")).click();
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        Thread.sleep(1000);
	        driver.quit();

			//driver.findElement.by.(//button[@name='alertbox'])
				
				
	}

}

/*package systemtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
   // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Accept (OK) the alert
        alert.accept();     
     
        driver.quit();
    }
}*/
