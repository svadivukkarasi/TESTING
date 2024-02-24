Feature: List if products feature
  As a User
  On successful login
  I should see list of products available to buy

  Background:
    Given I am on home page "https://www.saucedemo.com"
    When I enter username "standard_user" and password "secret_sauce"
    And  I click login button
    Then I should login successfully and gets redirected to products page with "products"

  Scenario: Verify available list of products
    Then I should  see 6 products listed

  Scenario Outline: Verify products are listed appropriately
    Then I should see products with <title>,<price>,<description>,<image> and <Add to cart> button

    Examples:
      | title                            | price  | description                                         | image                            | Add to cart |
      | Sauce Labs Backpack              | $29.99 | carry.allTheThings() with the sleek                 | Sauce Labs Backpack              | Add to cart |
      | Sauce Labs Bike Light            | $9.99  | A red light isn't the desired state                 | Sauce Labs Bike Light            | Add to cart |
      | Sauce Labs Bolt T-Shirt          | $15.99 | Get your testing superhero on                       | Sauce Labs Bolt T-Shirt          | Add to cart |
      | Sauce Labs Fleece Jacket         | $49.99 | It's not every day that you come across a midweight | Sauce Labs Fleece Jacket         | Add to cart |
      | Sauce Labs Onesie                | $7.99  | Rib snap infant onesie for the junior               | Sauce Labs Onesie                | Add to cart |
      | Test.all TheThings()T-Shirt(Red) | $15.99 | This classic Sauce Labs t-shirt is perfect to wear  | Test.all TheThings()T-Shirt(Red) | Add to cart |
