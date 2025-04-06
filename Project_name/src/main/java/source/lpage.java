package source;

import org.testng.annotations.Test;

import anothershadow.Loginpage;
import sourcebase.baseclass;

public class lpage extends baseclass{
	@Test
	public void logintest() {
		new Loginpage(driver)
		.entureUserName("gokulgod007@gmail.com")
		.enturePassword("Info@123")
		.clickLogin();
		
	}
	

}
