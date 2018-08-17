package cyber_bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cyber_bnb.pages.HomePage;
import cyber_bnb.pages.SignInPage;
import cyber_bnb.utilities.BrowserUtils;
import cyber_bnb.utilities.ConfigurationReader;
import cyber_bnb.utilities.Driver;

public class SmokeTestStepDefs {

	SignInPage signIn = new SignInPage();
	HomePage home = new HomePage();

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("qa1_url"));
	}

	@Given("the user login using email {string} and password {string}")
	public void the_user_login_using_email_and_password(String username, String password) {
		signIn.email.sendKeys(username);
		signIn.password.sendKeys(password);
	}

	@Given("the user clicks on the sign in button")
	public void the_user_clicks_on_the_sign_in_button() {
		signIn.signInButton.click();
	}

	@When("user clicks on hunt to make reservation")
	public void user_clicks_on_hunt_to_make_reservation() {
		BrowserUtils.waitFor(4);
		home.huntButton.click();
	}

	@When("user chooses August {int}, {int} at  {string} - {string} as the desired date")
	public void user_chooses_August_at_as_the_desired_date(Integer day, Integer year, String startHour,
			String finishHour) {

		BrowserUtils.waitFor(3);
		home.dateButton.sendKeys("" + day);

		BrowserUtils.waitFor(2);
		Select selectSHour = new Select(home.startHour);
		selectSHour.selectByVisibleText(startHour);

		BrowserUtils.waitFor(2);

		Select selectFHour = new Select(home.finishHour);
		selectFHour.selectByVisibleText(finishHour);

		BrowserUtils.waitFor(2);

		home.searchButton.click();
	}

	@Then("user clicks on book for {string} as the room")
	public void user_clicks_on_book_for_as_the_room(String string) {
		BrowserUtils.waitFor(2);
		home.roomBookButton.click();
	}

	@Then("user verify room name {string}")
	public void user_verify_room_name(String roomName) {
		String actual = home.roomName.getText();
		assertEquals(roomName, actual);
	}
	
	 @Then("user clicks on confirm button to reserve the room")
	 public void user_clicks_on_confirm_button_to_reserve_the_room() {
		 BrowserUtils.waitFor(2);
		 home.confirmButton.click();
	 }
	
	 @Then("{string} message displayed")
	 public void message_displayed(String message) {
		 BrowserUtils.waitFor(2);
		 String actual = home.confirmMessage.getText();
		 System.out.println(actual);
		 assertEquals(message, actual);
	 }

}
