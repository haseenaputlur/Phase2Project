Feature: Login Feature Scenario

  #@regression
  Background: 
    Given I have launched the application

  @sanity
  Scenario: This scenario is to define the login happy path
    When I enter the correct username and password
    And I click on the Login Button
    Then I should land on the home page

  Scenario: This scenario is to define the failure path
    When I enter the incorrect username and password
    And I click on the Login Button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"
