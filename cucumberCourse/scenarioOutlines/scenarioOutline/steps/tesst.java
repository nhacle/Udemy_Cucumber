package scenarioOutline.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tesst {

	@Given("^user navigate to \"([^\"]*)\"$")
	public void user_navigate_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user clicks on the login portal button$")
	public void user_clicks_on_the_login_portal_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enters the \"([^\"]*)\" username$")
	public void user_enters_the_username(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enters the \"([^\"]*)\" password$")
	public void user_enters_the_password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the user should be presented with the following promt alert \"([^\"]*)\"$")
	public void the_user_should_be_presented_with_the_following_promt_alert(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
