Feature: BookCart application

Scenario: Login should be success

Given user should navigate to the application
And User click on login button 
And User enter the username as ortoni
And User enter the password as pass1234
When User clicks the login button
Then login should be success