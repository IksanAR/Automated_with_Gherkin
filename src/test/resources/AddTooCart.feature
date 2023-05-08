Feature: Add To Cart
  Scenario: Verify user be able add to cart product
    Given User open the web
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    And user choose product
    And user click button add to cart
    And user click icon cart
    Then user redirect to page cart with list product