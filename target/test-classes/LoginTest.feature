Feature: Login
  Scenario: Verify user able to login with valid username and password
    Given User open the web
    When user input username
    And user input password
    And user click button login
    Then User redirect to page product list

