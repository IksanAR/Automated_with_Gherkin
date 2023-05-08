Feature: Login
  Scenario: Verify user able to login with valid username and password
    Given User open the web
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    Then User redirect to page product list

