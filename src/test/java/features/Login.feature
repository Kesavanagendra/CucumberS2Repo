Feature: To test the Functionality of demowebshop

  Scenario Outline: functionality of Login
    When User click on Login
    Then User enter username '<username>'
    And User enter password '<password>'
    Then User click on login button
    Then User click on Logout button

    Examples: 
      | username       | password   |
      | Itest@test.com | Itest@test |
