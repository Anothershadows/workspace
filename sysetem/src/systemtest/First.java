package systemtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the correct ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sciencedaily.com/news/fossils_ruins/archaeology/");
        Thread.sleep(9000);
        driver.quit();
    }
}
