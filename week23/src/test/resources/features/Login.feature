Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    Then User should be navigated to the home page
