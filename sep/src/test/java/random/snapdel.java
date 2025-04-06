package random;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class snapdel {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
	//OpenDriver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	//Navigateurl
		driver.get("https://www.snapdeal.com/");
	//click login
		driver.findElement(By.xpath("//span[(text())='Sign In']")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space(text())='login']")).click();
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));				 
	//take excel    	
		String	filelocation  = "./Excel_read/snapdeal login.xlsx";	
		FileInputStream f1 = new FileInputStream(filelocation);   	
     	XSSFWorkbook work_book = new XSSFWorkbook(f1);
		XSSFSheet sheet = work_book.getSheetAt(0);
		XSSFRow row = sheet.getRow(1); 
		XSSFCell cell = row.getCell(1);
		String username = cell.getStringCellValue();
		System.out.println(username);
		XSSFCell cell1 = row.getCell(2);		
		driver.findElement(By.xpath("//form[@id=\"commonView\"]//following-sibling::input[@id='userName']")).sendKeys(username);
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.id("id=\"checkUser\"")).click();
		WebElement findElement123 = driver.findElement(By.id("id=\"userName-error\""));
		assertEquals( "Please123 enter a valid mobile number or email",findElement123);
		//asserteq
		driver.quit();
	} 

}
