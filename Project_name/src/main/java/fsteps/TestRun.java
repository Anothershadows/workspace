package fsteps;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestRun {
	
RemoteWebDriver driver;


  @Given("user should navigate to the application") 
  public void userShouldNavigateToTheApplication() 
  { driver = new ChromeDriver();
  driver.get("https://bookcart.azurewebsites.net/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  
  }
 
/*
 * @Given("User click on login button") public void userClickOnLoginButton() {
 * driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[2]")).click
 * (); }
 * 
 * 
 * @Given("User enter the username as ortoni") public void
 * userEnterTheUsernameAsOrtoni() {
 * driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-1")
 * ).sendKeys("ortoni"); }
 * 
 * @Given("User enter the password as pass{int}") public void
 * userEnterThePasswordAsPass(Integer int1) {
 * driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-2")
 * ).sendKeys("pass1234"); }
 * 
 * @When("User clicks the login button") public void userClicksTheLoginButton()
 * { driver.findElement(By.xpath("//span[text()='Login']")).click(); }
 * 
 * @Then("login should be success") public void loginShouldBeSuccess() { String
 * name =driver.findElement(By.xpath("//span[text()=' ortoni']")).getText();
 * System.out.println("the"+name); driver.quit(); }
 * 
 * //===================================
 * 
 * @Given("User click on login button") public void userClickOnLoginButton() {
 * driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[2]")).click
 * (); }
 * 
 * 
 * @Given("User enter the username as gokul") public void
 * userEnterTheUsernameAsGokul() {
 * 
 * driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-1")
 * ).sendKeys("gokul"); }
 * 
 * @Given("User enter the password as pass") public void
 * userEnterThePasswordAsPass() {
 * 
 * driver.findElement(By.cssSelector("input.mat-mdc-input-element.ng-tns-c19-2")
 * ).sendKeys("pass"); }
 * 
 * @When("login should be fail") public void loginShouldBeFail() {
 * //driver.findElement(By.xpath("//span[text()='Login']")).click(); String
 * err=driver.findElement(By.xpath(
 * "//mat-card-subtitle[@class='mat-mdc-card-subtitle']//mat-error[1]")).getText
 * (); Assert.assertEquals(err, "Username or Password is incorrect.");
 * driver.quit(); } }
 * 
 * 
 * 
 */








