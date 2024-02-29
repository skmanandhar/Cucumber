
@AddAccountFeature
Feature: Add Account Functionality validation

  Scenario: User should be able to login and add account
    Given User is on codefios login page
    When User enters username as "demo@codefios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    
    Then User should be landing on dashboard page
    When User clicks on list accounts link
    
    Then User should be landing on account list page
    When User clicks on Add account button
    When User enters account name as "My Spending Account"
    When User enters description as "Account for fun and hobbies"
    When User enters initial balance as "5000"
    When User enters account number as "13579"
    When User enters contact person as "Shyam"
    When User clicks on save button
    Then User should be able to see account added alert
    
    
    
    