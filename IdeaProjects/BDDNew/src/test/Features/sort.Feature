Feature: sortOptions
  As a user
  I should be able to sort the products
  @sortByAtoZ
  Scenario: verify values in drop down
    Given I am on home page "https://www.saucedemo.com"
    When I do login with username "standard_user" and password "secret_sauce"
    Then I should see "Name(A to Z)" and "Name(Z to A)" options in drop down
@sortByLtoH
    Scenario: verify price low to high in drop down option
      Given I am on home page "https://www.saucedemo.com"
      When I do login with username "standard_user" and password "secret_sauce"
      When I choose "price low to high" sort option
      And I should see the products sorted accordingly