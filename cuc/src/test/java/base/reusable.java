package base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class reusable {
	
	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;
	public static Alert a;
	public static JavascriptExecutor js;
	public static Select s;


	//1.Browser launch
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	//2.Get url method
	public static void 	launchurl(String url) {
		driver.get(url);
	}
	//3.Maximize the windows
    public static void toMaximize(WebDriver driver) {
	driver.manage().window().maximize();
	}
    
    //4 Delete Cookies
    public static void deletecookies() {
    	driver.manage().deleteAllCookies();
     }
    //5.Get page Title
    public static String pageTitle() {
    	String title = driver.getCurrentUrl();
    	return title;
    }
    //6.Get page url
     public static String pageurl() {
     String title = driver.getCurrentUrl();
     return title;
    }
    //7.Passing text to particular field
    public static void tofill(WebElement element, String value) {
    	element.sendKeys(value);
    }
    //8.Click login or submit button
    public static void toclick(WebElement element) {
    	element.click(); 	
    }
    //9.Close the browser
    public static void closetab() {
    	driver.close();
    }
    //10.Quite the browser
    public static void Qutebrowser() {
    	driver.quit();
    }
    //11.isEnabled
    public static void tocheckable(WebElement element) {
    	boolean Enable = element.isEnabled();
    }
    //12.tocheckdisplay
    public static void tocheckdespplay(WebElement element) {
    	boolean Displayed = element.isDisplayed();
    }
    //13.tocheckselected
    public static void isselected(WebElement element) {
    	boolean selected = element.isSelected();
    }
    //14.tonavigateurl
    public static void tonavigateurl(String value) {
    	driver.navigate().to(value);
    }
    //15.toforward
    public static void toforward() {
    	driver.navigate().forward();
    }
    //16.tobackword
    public static void tobackword() {
    	driver.navigate().back();
    }
    //17.torefresh
    public static void torefresh() {
    	driver.navigate().refresh();
    }
    //18.get perticular text
    public static String togettex(WebElement element) {
    	String text = element.getText();
    	return text; 	
    }
    //19.get the attribute value
    public static String  getattribute(WebElement element) {
    	String Attribute = element.getAttribute("value");
    	return Attribute;
    }
    
    //20.move the cursor one element to another
    public static void tomovethecursor(WebElement element) {   	
     ac = new Actions(driver);
     ac.moveToElement(element).perform();  
    }
    //21.Drag one field to another field
    public static void draganddrop(WebElement source, WebElement target){
    	ac = new Actions(driver);
    	ac.dragAndDrop(source, target).perform();
    	
    }
    //22.Double click the element
    public static void doubleClik(WebElement element){
    	ac = new Actions(driver);
    	ac.doubleClick().perform();
    	
    }
    //23.Right click the element 
    public static void contextclcik(WebElement element ){
    	ac = new Actions(driver);
    	ac.contextClick().perform(); 
 	
    }
    //24.Release the key
    public static void tokeyup(WebElement element , CharSequence value ){
    	ac = new Actions(driver);
    	ac.keyUp(element, value);
 	
 }
    //25.press the key
    public static void tokeydown(WebElement element , String value){
    	ac = new Actions(driver);
    	ac.keyDown(element , value);	
    }
 

	  //26.Method for Shift key action
  public static void toshiftkey() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyRelease(KeyEvent.VK_SHIFT);
  }

  //27.Method for Tab key action
  public static void totabkey() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_TAB);
      r.keyRelease(KeyEvent.VK_TAB);
  }

  //28.Method for Select All action
  public static void toselectall() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_CONTROL);
  }

  //29.Method for Cut action
  public static void tocut() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_X);
      r.keyRelease(KeyEvent.VK_X);
      r.keyRelease(KeyEvent.VK_CONTROL);
  }

  //30.Method for Copy action
  public static void tocopy() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_C);
      r.keyRelease(KeyEvent.VK_C);
      r.keyRelease(KeyEvent.VK_CONTROL);
  }

  //31.Method for Undo action
  public static void toundo() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_Z);
      r.keyRelease(KeyEvent.VK_Z);
      r.keyRelease(KeyEvent.VK_CONTROL);
  }

  //32.Method for Redo action
  public static void toredo() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_Y);
      r.keyRelease(KeyEvent.VK_Y);
      r.keyRelease(KeyEvent.VK_CONTROL);
  }

  //33.Method for Paste action
  public static void topaste() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_CONTROL);
  }

  //34.Method for Down arrow key action
  public static void todown() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
  }

  //35.Method for Up arrow key action
  public static void topressup() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_UP);
      r.keyRelease(KeyEvent.VK_UP);
  }

  //36.Method for Enter key action
  public static void toenter() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
  }

  //37.Method for A key action
  public static void topressA() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
  }

  //38.Method for X key action
  public static void topressX() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_X);
      r.keyRelease(KeyEvent.VK_X);
  }

  //39.Method for C key action
  public static void topressC() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_C);
      r.keyRelease(KeyEvent.VK_C);
  }

  // Method for V key action
  public static void topressv() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_V);
  }

  // Method for Z key action
  public static void topressZ() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_Z);
      r.keyRelease(KeyEvent.VK_Z);
  }

  // Method for Y key action
  public static void topressY() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_Y);
      r.keyRelease(KeyEvent.VK_Y);
  }
 
    //43.toAcceptalert
    public static void toAcceptalert(){
    	a = driver.switchTo().alert();
    	a.accept();
    }
    //44.toDismissAlert
    public static void toDismissAlert(){
    	a = driver.switchTo().alert();
    	a.dismiss();
    }
    //45.tosendkeysalert
    public static void tosendkeysalert(String value){
    	a = driver.switchTo().alert();
    	a.sendKeys(value);
 	}
    //46.take screen shot option   		
    public void screenshot( WebDriver driver) throws IOException {
    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    Files.copy(file,new File("C:\\Users\\gokul\\Pictures\\Screenshots\\m.jpg")); 
    System.out.println("Screenshot taken and saved to C:\\Users\\gokul\\Pictures\\Screenshots\\mm.jpg");		     
    }
   //47.passvalue in field using javascript
    public static void insertvalue(WebElement element, String value){
    	js = (JavascriptExecutor)driver;
    	js.executeScript(value,element);
    	
 	
 }
    //48.click the button using javascript
    public static void clickjavascript(WebElement element){
    	js = (JavascriptExecutor)driver;
    	js.executeScript("argument[0].clcik()",element);
 	
    }
    //49.scroll the pageup value using javascript
    public static String getvalue(WebElement element){
    	js = (JavascriptExecutor)driver;
    	Object txt = (js.executeScript("return arfument[0].getattributes('value')", element));
    	String s =(String) txt;
    	return s;	
    }
    //50.scroll the pagedown value using javascript
    public static void toscrollup(String value, WebElement element){
    	js = (JavascriptExecutor)driver;
    	js.executeScript(value, element);
 	
    }
    //51.scroll the page
    public static void toscrolldown(String value, WebElement element){
    	js = (JavascriptExecutor)driver;
    	js.executeScript(value, element);
 	
    }
    //52.select the element by index
    public static void toselectbyindex(WebElement element, int i){
    	s = new Select(element);
    	s.selectByIndex(i);	
    }
    //53.select the element by value
    public static void toselectbyvalue(WebElement element, String value){
    	s = new Select(element);
    	s.selectByValue(value);	
    }
    //54.select the element using text
    public static void toselectbyvisibletest(WebElement element, String text){
    	s = new Select(element);
    	s.selectByContainsVisibleText(text);
    }
    //55.select multiple element
    public static boolean selectismultiple(WebElement element){
    	s = new Select(element); 
    	boolean m = s.isMultiple();
    	return m;
 }
    //56.deselct all element
    public static void todeselectall(WebElement element){
    	s= new Select(element);
    	s.deselectAll();
 	
    }
    //57.deselect all element by index
    public static void todeselecetbyIndex(WebElement element ,int i){
    	s= new Select(element);
    	s.deselectByIndex(i);
 	
    }
    //58.deselct all element by its value
    public static void todeselecetbyvalue(WebElement element ,int i, String value){
    	s= new Select(element);
    	s.deselectByValue(value);
    }
    //59.deselct all element by its visible test
    public static void todeselecetbytest(WebElement element , String test){
    	s= new Select(element);
    	s.deselectByVisibleText(test);	
 	
    }
    //60.select all element by using list
    public static void toselectall(WebElement element){
    	s= new Select(element);
    	List<WebElement> option= s.getOptions();
    	for (int i=0;i<=option.size();i++) {
    		s.deselectByIndex(i);
    	}
 	
    }
    //61.to get option by using list
    public static void togetoptions(WebElement element){
    	s= new Select(element);
    	List<WebElement> options= s.getOptions();
    	for (int i=0;i<options.size(); i++) {
    		WebElement option = options.get(i);
    		String text = option.getText();
    		System.out.println(text);   	
    	}	
    }
    //62.select all select option using list
    public static void togetallselectedoption(WebElement element){
    	s= new Select(element);
    	List<WebElement> options= s.getAllSelectedOptions();
    	for (int i=0;i<options.size();i++) {
    		WebElement option = options.get(i);
    		String text = option.getText();
    		System.out.println(text);   	
    	}
    	
 	
    }
    //63.select first option
    public static void togetfirstselectedoptions(WebElement element){
	 s= new Select(element);
	 s.getFirstSelectedOption(); 	
    }
 
    //64.to get window handle
    public static void tohandlewindow(){
    	String parid = driver.getWindowHandle();
    	System.out.println(parid);
 	
    }
    //65.to get window handles
    public static void tohandlewindows(){
    	Set<String> allwinid = driver.getWindowHandles();
    	for(String allid : allwinid) {
    		driver.switchTo().window(allid);
    	}	
    }
    //66.to windows handles
    public static void towindowhandles (Object parId){
	 Set<String> allwinid = driver.getWindowHandles();
 	for(String allid : allwinid) {
 		if(!parId.equals(allid)) {
 		driver.switchTo().window(allid);
 	}
 	}
    }
    //67.tomultiplewindow
    private void tomultiplewindows(int value){
	 Set<String> Setofid = driver.getWindowHandles();
	 List<String> li= new LinkedList<String>();
	 li.addAll(Setofid);
	 driver.switchTo().window(li.get(value));
    }
 	 
 	//68.wait method
 	public static void implicitewait(){
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
 	}
 	//69.scrolldownjavascript
 	public static void ScrolldownjavaScript(){
 		js = (JavascriptExecutor) driver;
 		js.executeScript("Window.scrollBy(0,600)");	
 	}
   }