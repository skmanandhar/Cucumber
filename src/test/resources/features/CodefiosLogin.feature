
@CodefiosFeature
Feature: Codefios page login functionality validation

Background:
    Given User is on codefios login page

  Scenario: User should be able to login with valid credentials
    When User enters username as "demo@codefios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should be landing on dashboard page

  #Scenario Outline: User should be able to login with valid credentials
    #When User enters username as "<username>"
    #When User enters password as "<password>"
    #When User clicks on sign in button
    #Then User should be landing on dashboard page
    #
    #Examples:
    #	|username|password|
    #	|demo1@codefios.com|abc123|
    #	|demo@codefios.com|abc123|
    #	|demo1@codefios.com|abcdef|
    #	|||