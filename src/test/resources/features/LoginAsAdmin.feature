@automated

Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials

    Given admin is on login page
    When admin enters username and password
    And clicks on login button
    Then admin is navigated to the home page