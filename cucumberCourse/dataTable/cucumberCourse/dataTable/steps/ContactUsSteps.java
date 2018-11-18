package cucumberCourse.dataTable.steps;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps {

	WebDriver driver;

	@Before
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver",
		        Paths.get(System.getProperty("user.dir")).toRealPath() + ".\\driver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@Given("^I access webdriveruniversity$")
	public void i_access_webdriveruniversity() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://www.webdriveruniversity.com");
	}

	@When("^I click on the contact us button$")
	public void i_click_on_the_contact_us_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("contact-us")).click();
	}

	@Then("^I enter a valid first name$")
	public void i_enter_a_valid_first_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		for (String winHandler : driver.getWindowHandles()) {
			driver.switchTo().window(winHandler);
		}
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Tom");
	}

	@Then("^I enter a valid last name$")
	public void i_enter_a_valid_last_name(DataTable table) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		List<List<String>> data = table.raw();
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys(data.get(0).get(2));
	}

	@Then("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("webdriveruniversiy@outlook.com");
		;
	}

	@Then("^I enter comments$")
	public void i_enter_comments(DataTable table) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		List<List<String>> data = table.raw();
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(1) + "\n");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(1).get(1));
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[value='SUBMIT']")).click();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
