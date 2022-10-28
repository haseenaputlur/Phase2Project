Feature: Homepage Scenario adding a product to the cart

  Background: 
    Given I have launched the application
    And I enter the correct username and password
    And I click on the Login Button

  @sanity
  Scenario: This scenario is to define the login happy path
    When I click Add To Cart on product "Sauce Labs Backpack"
    Then Basket value should be "1"
