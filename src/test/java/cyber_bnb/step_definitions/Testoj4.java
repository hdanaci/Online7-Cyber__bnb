package cyber_bnb.step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cyber_bnb.pages.BookPage;
import cyber_bnb.pages.HomePage;
import cyber_bnb.utilities.BrowserUtils;

public class Testoj4 {
	HomePage home = new HomePage();
	BookPage book = new BookPage();
	
	@Then("user selects the desired dates {int} time {string} to {string} and clicks button")
	public void user_selects_the_desired_dates_time_to_and_clicks_button(Integer day, String timeS, String timeE) {
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
		
		BrowserUtils.waitFor(2);
		
	}
	
	@Then("user confirms all rooms displayed")
	public void user_confirms_all_rooms_displayed(List<String> room) {
		
		for (int i = 0; i <room.size(); i++) {
			Assert.assertEquals(room.get(i), book.roomNames.get(i).getText());

		}
		
	}
	
	
}
