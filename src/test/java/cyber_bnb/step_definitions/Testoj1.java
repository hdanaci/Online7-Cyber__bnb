package cyber_bnb.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cyber_bnb.pages.BookPage;
import cyber_bnb.pages.HomePage;
import cyber_bnb.utilities.BrowserUtils;

public class Testoj1 { 
	
	HomePage home = new HomePage();
	BookPage book = new BookPage();
	
	@Then("user clicks on the hunt button")
	public void user_clicks_on_the_hunt_button() {
		BrowserUtils.waitFor(3);
		home.huntButton.click();
	}
	
	@Then("user selects the desired dates {int} time {string} to {string} and clicks search button")
	public void user_selects_the_desired_dates_time_to_and_clicks_search_button(Integer day, String timeS, String timeE) {
		
		BrowserUtils.waitFor(3);
		home.dateButton.click();
		home.dateButton.sendKeys(""+day);
		
		BrowserUtils.waitFor(3);
		
		Select times = new Select(home.startHour);
		times.selectByVisibleText(timeS);
		
//		home.startHour.click();
//		home.startHour.sendKeys(timeS);
		
		BrowserUtils.waitFor(3);
		
		Select timeF = new Select(home.finishHour);
		timeF.selectByVisibleText(timeE);
		
//		home.finishHour.click();
//		home.finishHour.sendKeys(timeE);
		
		BrowserUtils.waitFor(2);
		
		home.searchButton.click();
		
		BrowserUtils.waitFor(2);
		book.yaleBook.click();
		
		BrowserUtils.waitFor(2);
		book.confirmButton.click();
		
	}
	@Then("confirmation message displayed")
	public void confirmation_message_displayed() {
		BrowserUtils.waitFor(3);
		String confirm = book.Cmessage.getText();
		String actual="conference in yale has been successfully scheduled";
		BrowserUtils.waitFor(3);
		Assert.assertEquals(confirm, actual);
		
	}
	
}
