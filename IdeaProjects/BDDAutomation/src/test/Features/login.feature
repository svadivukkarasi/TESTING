Feature: Login feature
  As a user
  I should  log in and use the app

  @smoke @login @regression
  Scenario: User should be able to log in successfully with valid username and password
    Given I am on home page "https://www.saucedemo.com"
    When I enter username "standard_user" and password "secret_sauce"
    And  I click login button
    Then I should login successfully and gets redirected to products page with "Products"

  @login @regression
  Scenario: User should n't be able to log in with Invalid credentials.
    Given I am on home page "https://www.saucedemo.com"
    When I enter username "standard_user_Inv" and password "secret_sauce_Inv"
    And I click login button
    Then I should not be allowed login with error message "Epic sad face: Username and password do not match any user in this service"


  @login @regression
  Scenario Outline: User should be able to log in successfully with all valid credentials
    Given I am on home page "https://www.saucedemo.com"
    When I enter username "<username>" and password "secret_sauce"
    And  I click login button
    Then I should login successfully and gets redirected to products page with "Products"
    Examples:
      | username                |
      | problem_user            |
      | performance_glitch_user |
      | error_user              |
      | visual_user             |