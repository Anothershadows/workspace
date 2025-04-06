package sani;
	
	import org.openqa.selenium.By;
	import java.io.IOException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;	
	import Automation.Automationqa.reusable;
	import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

	public class sg  extends reusable {
	    public static void main(String[] args) throws IOException  {
	    	reusable.browser();
	        // Navigate to the login page
	        driver.get("https://www.infotech-cloudhr.com.sg/");
	        // Maximize the window
	        driver.manage().window().maximize();
	         
	        // Login
	        driver.findElement(By.id("txtLogin")).sendKeys("claimapplysec@infotech-hrsoftware.com.my");
	        driver.findElement(By.id("txtPassword")).sendKeys("Info@123");
	        driver.findElement(By.id("btnLogin")).click();
	       
	          
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	        try {
	            // Wait for the dynamic element to be clickable
	            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#divPayrollContent>div>button>span"))).click();
	        } catch (Exception e) {
	            // If the dynamic element is not found within the time, perform the else action
	            driver.findElement(By.cssSelector("li#Li2>a>img")).click();
	        }
	        //TMS
	        driver.findElement(By.cssSelector("a[data-text='INFO-TMS']")).click();
	        driver.findElement(By.xpath("//span[normalize-space(text())='Administration']")).click();
	        //usercreastion
	        driver.findElement(By.xpath("//a[@menu-caption='User Creation']")).click();
	    
	        /*  driver.findElement(By.id("ContentPlaceHolder1_tabUsers_tabActiveUsers_txtEmpSearchText")).sendKeys("TMS");
	        driver.findElement(By.xpath("//button[@class='btn bgInfo']")).click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	        // element = WebDriverWait(driver, 10).until(EC.element_to_be_clickable((By.ID, "element_id")))
	        driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_gvUserManagement_lnkEditUser_1']")).click();
	        driver.findElement(By.xpath("//a[@id='__tab_ContentPlaceHolder1_TabContainer1_TabPanel_AppRights']//span[1]")).click();
	        
	   */
	       WebElement table = driver.findElement(By.id("ContentPlaceHolder1_tabUsers_tabActiveUsers_gvUserManagement"));
	      List<WebElement>  heards = table.findElements(By.tagName("th"));
	        for (WebElement heading : heards) {
	        	String t = heading.getText();
	        	System.out.println(t);	
			}     
	       List<WebElement>  allrows = table.findElements(By.cssSelector("tbody tr"));
	       int s = allrows.size();
	       System.out.println(s);
	       if (s==11) {System.out.println("correct size");
	    	}else {
			System.out.println("Incorrect size");
	    	}
	      for (WebElement row : allrows) {
	      List<WebElement> colum = row.findElements(By.tagName("td"));
	       	WebElement firstcolum = colum.get(0);
	       	System.out.println(firstcolum.getText());	
		}
	      // for (int i = 0; i < s ; i++) {
			
		}
	       
	     
	       
	       
	       
	       
	  /*     WebElement r  =driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
	       Select t = new Select(r);
	       t.selectByVisibleText("ADMIN");
	       WebElement t1 = driver.findElement(By.xpath("(//select[@class='form-control']//option)[2]"));
	       System.out.println(t1.getAttribute(null));
	     
	       driver.quit();*/
	    }










	
	


