package cyber_bnb.step_definitions;

import cucumber.api.java.en.Then;
import cyber_bnb.pages.BookPage;
import cyber_bnb.utilities.BrowserUtils;

public class Testoj2 {
	
	BookPage book=new BookPage();
	
	@Then("user cancels the reservation")
	public void user_cancels_the_reservation() {
		
		BrowserUtils.waitFor(2);
		
		book.scheduleBar.click();
		BrowserUtils.waitForClickablility(book.cancelConf, 2);
		
		book.cancelConf.click();
	}

}
