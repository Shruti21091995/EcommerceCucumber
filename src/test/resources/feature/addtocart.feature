Feature: Add to Cart Functionality
@LoginRequired
  Scenario: Add a product to cart
    Given user is on homepage
    When user clicks on the ProductImage
    Then user redirected to next product page
    And user click on the product to cart button
    Then the cart should have 1 item
