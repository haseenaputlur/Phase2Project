package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SDLoginStepDef {
	
	WebDriver driver=SDHooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@Given("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName=driver.findElement(By.name("user-name"));
		UserName.sendKeys("standard_user");
		
		//Step3:Enter Password
		WebElement Password=driver.findElement(By.name("password"));		
		Password.sendKeys("secret_sauce");
	}

	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn=driver.findElement(By.name("login-button"));
		LoginBtn.click();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		WebElement UserName=driver.findElement(By.name("user-name"));
		UserName.sendKeys("standard_user");
		
		//Step3:Enter Password
		WebElement Password=driver.findElement(By.name("password"));		
		Password.sendKeys("Pan@Janu03");

	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Error=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActError=Error.getText();
		Assert.assertEquals(ExpError, ActError);
	    
	}
	
	@Given("I land on homepage")
	public void i_land_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement Logo =driver.findElement(By.xpath("//div[@class='app_logo']"));
	    System.out.println("Homepage:" +Logo.getText());
	}

	@When("I enter select the product as {string}")
	public void i_enter_select_the_product_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement product =driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
		product.click();
	    
	}

	@When("I click on the Add To Cart Button")
	public void i_click_on_the_Add_To_Cart_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement AddToCart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddToCart.click();
	}

	
	
	@When("I click Add To Cart on product {string}")
	public void i_click_Add_To_Cart_on_product(String product) {
	    // Write code here that turns the phrase above into concrete actions
		product="Sauce Labs Backpack";
		
		//String xpath = "//div[@class='inventory_item_name' and contains(text(), '" + product + "')]";
		String ItemXpath= "//div[text()='" + product + " ']//following::button[1]";
		WebElement Item=driver.findElement(By.xpath(ItemXpath));
		Item.click();
					
		//String ActProduct=AddToCart.getText();
		//Assert.assertEquals(product, ActProduct);
		
	    
	}

	@Then("Basket value should be {string}")
	public void basket_value_should_be(String Count) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement CartValue=driver.findElement(By.className("shopping_cart_badge"));
		 Count=CartValue.getText();
		 Assert.assertEquals(Count, "1");
		
		
	    
	}






}
