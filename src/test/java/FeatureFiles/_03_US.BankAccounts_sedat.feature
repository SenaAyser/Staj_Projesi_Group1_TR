Feature: Bank account Functionality


  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario: Create Bank Accounts
    And navigate to bank accounts page
    When create a bank accounts
    Then Success message should be displayed

  Scenario: Delete bank accounts
    And navigate to bank accounts page
    When delete a bank accounts
    Then Success message should be displayed