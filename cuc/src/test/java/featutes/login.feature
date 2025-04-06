

@smoke
Feature: Login functionality

  Scenario: Valid user login
  
  
    Given user should navigate to the application
    And User clicks on the login button
    And User enters the username
    When User clicks the login button
    Then login should be successful
