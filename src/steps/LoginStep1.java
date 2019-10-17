package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep1 
{
	@Given("^user navigate to facebook website$")
	public void user_navigate_to_facebook_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

/***	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}	*/
	
/***	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}	*/
	
	@When("^user enter (\\d+) and \"([^\"]*)\"$")
	public void user_enter_and(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user should be navigated to home page$")
	public void user_should_be_navigated_to_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
