@smoke
Feature: F01_homepage |

  Scenario: guest user fills out form

    When  user enter first name "mohamed" and last name "sakr"
    And   user enter business name "xyz"
    And   user enter email "mohamed12@example.com"
    And   user enter result
    Then   user click submit
