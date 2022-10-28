$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Homepage.feature");
formatter.feature({
  "name": "Homepage Scenario adding a product to the cart",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the correct username and password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_enter_the_correct_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the login happy path",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I click Add To Cart on product \"Sauce Labs Backpack\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_click_Add_To_Cart_on_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Basket value should be \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.basket_value_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/SDLogin.feature");
formatter.feature({
  "name": "Login Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the login happy path",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I enter the correct username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_enter_the_correct_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SDLoginStepDef.i_should_land_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});