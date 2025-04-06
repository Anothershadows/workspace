package snippet;

public class Snippet {
	Feature: BookCart application
	
	Scenario: Login should be successful
	  Given user should navigate to the application
	  And user clicks on the login button 
	  And user enters the username as "ortoni"
	  And user enters the password as "pass1234"
	  When user clicks the login button
	  Then login should be successful
	
	Scenario: Login should fail
	  Given user should navigate to the application
	  And user clicks on the login button 
	  And user enters the username as "gokul"
	  And user enters the password as "passkoush"
	  When user clicks the login button
	  Then login should fail
	
}

