package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SDHooks {
	
	public static WebDriver driver;

	@Before
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();
	}

	@After
	public void TearDown() {

		driver.close();

	}

}
