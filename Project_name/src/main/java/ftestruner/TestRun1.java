 package ftestruner;
	
	  import java.util.concurrent.TimeUnit;
	  
	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.testng.Assert;
	  import cucumber.api.java.en.Given;
	  import cucumber.api.java.en.Then;
	  import cucumber.api.java.en.When;
	  
	  public class TestRun1 {
	  
	  WebDriver driver;
	  
	  @Given("User should navigate to the application")
	  public void userShouldNavigateToTheApplication() {
	  driver = new ChromeDriver();
	  driver.get("https://bookcart.azurewebsites.net/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
 @Given("User should login as {string} and {string}")
	  public void userShouldLoginAsAnd(String username, String password) {
	 
		  driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[2]")).click();
		  driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-1")).sendKeys(username);
		  driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-2")).sendKeys(password);
		  driver.findElement(By.xpath("//span[text()='Login']")).click();
	  }
 @Given("user searches for a {string}")
	  public void userSearchesForA(String book) {
		  driver.findElement(By.xpath("//input[contains(@class,'mat-mdc-autocomplete-trigger searchbox')]")).sendKeys(book); 
		  driver.findElement(By.xpath("//mat-option[contains(@class,'mat-mdc-option mdc-list-item')]")).click();	  
	  }

 @When("User adds the book to the cart")
	  public void userAddsTheBookToTheCart() {
		  driver.findElement(By.xpath("//span[text()[normalize-space()='Add to Cart']]")).click(); }
	  
@Then("the cart badge should be updated")
	  public void theCartBadgeShouldBeUpdated() {
	driver.quit();
}}
	/* String bagh =driver.findElement(By.id("mat-badge-content-0")).getText();
     try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
     Assert.assertEquals(Integer.parseInt(bagh)>0 , true);
	 driver.quit();
	  }/*
	  }
  
	  
	  /*
	  @Given("user should navigate to the application") public void
	  userShouldNavigateToTheApplication() { driver = new ChromeDriver();
	  driver.get("https://bookcart.azurewebsites.net/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  }
	  
	  @Given("User should login as {string} and {string}") public void
	  userShouldLoginAsAnd(String username, String password) {
	  driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[2]")).click
	  ();
	  driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-1")
	  ).sendKeys("username");
	  driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-2")
	  ).sendKeys("password");
	  driver.findElement(By.xpath("//span[text()='Login']")).click(); }
	  
	  @Given("User searches for a {string}") public void userSearchesForA(String
	  book) {
	  
	  driver.findElement(By.
	  xpath("//input[contains(@class,'mat-mdc-autocomplete-trigger searchbox')]")).
	  sendKeys("Roomies"); driver.findElement(By.
	  xpath("//mat-option[contains(@class,'mat-mdc-option mdc-list-item')]")).click
	  (); }
	  
	  @When("user adds the book to the cart") public void
	  userAddsTheBookToTheCart() {
	  
	  driver.findElement(By.xpath("//span[text()[normalize-space()='Add to Cart']]"
	  )).click(); }
	  
	  @Then("the cart badge should be updated") public void
	  theCartBadgeShouldBeUpdated() {
	  
	  String bagh =driver.findElement(By.xpath(
	  "(//span[@class='mat-mdc-button-touch-target'])[2]")).getText();
	  
	  try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
	  Auto-generated catch block e.printStackTrace(); }
	  Assert.assertEquals(Integer.parseInt(bagh)>0, true); }}
	 */