Feature: Add item to cart and finalize

  Scenario: user add product to cart

    Given I'm on main page
    When I got to login page
    And I log in using "Dan@gmail.com" and "secretpassword"
    ##Next Steps###
    And I go on main page
    And I select Hummingbird Printed Sweater
    And I select size and quantity
    And I add product to Cart
    And I proceed to checkout
    And I confirm the address
    And I select shipping method
    And I select payment
    And I process the order
    And I make screenshot
    And I close page
