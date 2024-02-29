
@CodefiosDBFeature
Feature: Codefios page login functionality validation

Background:
    Given User is on codefios login page

  Scenario: User should be able to login with valid credentials
    When User enters "username" from Database
    When User enters "password" from Database
    When User clicks on sign in button
    Then User should be landing on dashboard page
