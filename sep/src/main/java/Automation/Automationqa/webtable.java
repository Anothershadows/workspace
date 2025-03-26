package Automation.Automationqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webtable extends reusable{

	public static void main(String[] args) {
		
		reusable.browserLaunch();
		reusable.toMaximize(driver);
		reusable.launchurl("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement table = driver.findElement(By.xpath("//table[contains(.,'StructureCountryCityHeightBuiltRank…Total4 buildingsBurj KhalifaUAEDubai829m20101Clock Tower HotelSaudi ArabiaMecca601m20122Taipei 101TaiwanTaipei509m20043Financial CenterChinaShanghai492m20084')]"));
	//	List <WebElement> tableheader = table.findElements(By.tagName("th"));
		List <WebElement> tableheader = table.findElements(By.xpath("//tr[contains(.,'StructureCountryCityHeightBuiltRank…')]"));
		for (WebElement webElement : tableheader) {
			System.out.println(webElement.getText());
		}
  //	List <WebElement> allow1 = table.findElements(By.xpath("(//table[@data-ezoic-video-excluded='1']//tbody/tr)[2]"));
		List <WebElement> allow = table.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr"));
		int size = allow.size();
		System.out.println(size);
	/*	
		for (WebElement wb : allow) {
	    List <WebElement> colum = wb.findElements(By.tagName("td"));
	    WebElement fc =colum.get(0);
	    System.out.println(fc.getText());
		}
	*/	
		for (int i = 0; i < size; i++) {
			List <WebElement> rows = allow.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(3);
			String text=lastname.getText();
			System.out.println(text);
			
		
		if (text.equals("601m")) {
			String input = driver.findElement(By.xpath("//span[normalize-space(text())='2010']")).getText();
			System.out.println("You did it" + input);
			break;
		}
		}
		driver.quit();
	}
}
