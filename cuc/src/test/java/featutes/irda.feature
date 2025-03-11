@sanity
Feature: irda
  

  @tag1
  Scenario: irda of india
    Given verify user can navigate irda
    When select eserivce
    And select form 
    And select date 
    Then click clear

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
