@CodefiosNegativeFeature
Feature: Codefios page login functionality validation

  Scenario: User should be able to login with valid credentials
    Given User is on codefios login page
    When User enters username as "d@codefios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should be landing on dashboard page
