Feature: Verify user login successfully
  Scenario: Verify user should login successfully

    Given I am on the login page
    When I enter a valid Username
    And I enter a valid Password
    And I click on login button
    Then I should revert to the login dashboard page
