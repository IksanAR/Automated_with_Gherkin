Feature: Checkout
  Scenario: Verify user be able to checkout
    Given User open the web
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    And user choose product
    And user click button add to cart
    And user click icon cart
    And user click button checkout
    And user input firstname
    And user input lastname
    And user input zipcode
    And user click button continue
    And user click button finish
    Then user redirect to page checkout complete
