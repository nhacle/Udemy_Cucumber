package scenarioOutline.steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Before()
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver",
		        Paths.get(System.getProperty("user.dir")).toRealPath() + ".\\driver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@After()
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	@Given("^user navigate to \"([^\"]*)\"$")
	public void user_navigate_to(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("^user clicks on the login portal button$")
	public void user_clicks_on_the_login_portal_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-portal")).click();

	}

	@When("^user enters the \"([^\"]*)\" username$")
	public void user_enters_the_username(String username) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Switch window
		for (String winHandles : driver.getWindowHandles()) {
			driver.switchTo().window(winHandles);
		}
		// Send username key

		driver.findElement(By.id("text")).sendKeys(username);

	}

	@When("^user enters the \"([^\"]*)\" password$")
	public void user_enters_the_password(String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();
	}

	@Then("^the user should be presented with the following promt alert \"([^\"]*)\"$")
	public void the_user_should_be_presented_with_the_following_promt_alert(String message) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Alert alert = driver.switchTo().alert();// Switch to alert
		assertEquals(alert.getText().toString().toLowerCase().replaceAll("\\s", ""),
		        message.toLowerCase().replaceAll("\\s", ""));
		alert.accept();
	}
}
