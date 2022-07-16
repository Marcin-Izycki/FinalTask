Feature: Add new address

  Scenario Outline: user can add new address

    Given I'm on main page
    When I got to login page
    And I log in using "Dan@gmail.com" and "secretpassword"
    And I select address
    And I create new address
    And I enter alias <alias>, address <address>, city <city>, postal code <code>, country and phone <phone>
    Then I check the added address alias <alias>, address <address>, city <city>, postal code <code>, country and phone <phone>
    And I close page

    Examples:
      | alias  | address | city | code | phone  |
      | alias2 | address | city | 222  | 222222 |
     # | alias3 | address | city | 222  | 222222 |

