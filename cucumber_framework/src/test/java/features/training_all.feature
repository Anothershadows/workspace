Feature: Training all action

  Background: launchurl to the application

  Scenario Outline: login to source lab
    Given user name to first employee "<Username>"
    When enter the password "<Password>"
    Then I verify the the login

    Examples: 
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
