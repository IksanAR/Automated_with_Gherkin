Feature: Add To Cart
  Scenario: Verify user be able add to cart product
    Given User open the web
    When user input username
    And user input password
    And user click button login
    And user choose product
    And user click button add to cart
    And user click icon cart
    Then user redirect to page cart with list product