package cyber_bnb.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cyber_bnb.pages.BookPage;
import cyber_bnb.pages.HomePage;
import cyber_bnb.pages.SignInPage;
import cyber_bnb.utilities.BrowserUtils;
import cyber_bnb.utilities.ConfigurationReader;
import cyber_bnb.utilities.Driver;

public class Testoj3 {
	
	SignInPage signIn = new SignInPage();
	BookPage book = new BookPage();
	HomePage home = new HomePage();
	
	@Given("the team lead has an existing reservation")
	public void the_team_lead_has_an_existing_reservation() {
		
		Driver.getDriver().get(ConfigurationReader.getProperty("qa1_url"));
		
		signIn.email.sendKeys("jalabaster7f@drupal.org");
		signIn.password.sendKeys("terimapam");
		
		signIn.signInButton.click();
		
		BrowserUtils.waitFor(4);
		
		home.huntButton.click();
		
		
	}
	@When("the user tries to reserve second time dates {int} time {string} to {string} and clicks search button")
	public void the_user_tries_to_reserve_second_time_dates_time_to_and_clicks_search_button(Integer day, String timeS, String timeE) {
		BrowserUtils.waitFor(3);
		home.dateButton.click();
		home.dateButton.sendKeys(""+day);
		
		BrowserUtils.waitFor(3);
		
		Select times = new Select(home.startHour);
		times.selectByVisibleText(timeS);
		
		BrowserUtils.waitFor(3);
		
		Select timeF = new Select(home.finishHour);
		timeF.selectByVisibleText(timeE);
		
		BrowserUtils.waitFor(2);
		
		home.searchButton.click();
	}
	
	
	@Then("it should give message {string} at the screen")
	public void it_should_give_message_at_the_screen(String error) {
		BrowserUtils.waitFor(3);
		
		String actual=book.doubleMessage.getText();
		
		Assert.assertEquals(actual, error);
		
		
	}
}
