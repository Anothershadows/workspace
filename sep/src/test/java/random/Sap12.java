package random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sap12 { 

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the SAP website
        driver.get("https://www.sap.com/india/index.html");

        // Handle the consent popup if it appears
        try {
            WebElement consentButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.id("truste-consent-button")));
            consentButton.click();
        } catch (Exception e) {
            System.out.println("Consent button not found or not clickable.");
        }
        
        try {
			driver.findElement(By.cssSelector("header>div>div:nth-of-type(2)")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Access Shadow DOM elements
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Step 1: Access the first Shadow DOM (ds-contextual-navigation-profile)
            WebElement shadowHost1 = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.tagName("ds-contextual-navigation-profile")));
            WebElement shadowRoot1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost1);

            // Step 2: Access the second Shadow DOM (ds-action-menu) inside the first Shadow DOM
            WebElement shadowHost2 = shadowRoot1.findElement(By.tagName("ds-action-menu"));
            WebElement shadowRoot2 = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost2);

            // Step 3: Access the third Shadow DOM (ds-icon) inside the second Shadow DOM
            WebElement shadowHost3 = shadowRoot2.findElement(By.tagName("ds-icon"));
            WebElement shadowRoot3 = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost3);

            // Step 4: Find and click the profile icon inside the third Shadow DOM
            WebElement profileIcon = shadowRoot3.findElement(By.cssSelector("span.icon_inner"));
            profileIcon.click();

            System.out.println("Profile icon clicked successfully!");
        } catch (Exception e) {
            System.out.println("Failed to interact with Shadow DOM elements: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}