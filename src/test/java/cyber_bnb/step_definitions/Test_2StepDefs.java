package cyber_bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cyber_bnb.pages.HomePage;
import cyber_bnb.pages.SelfPage;
import cyber_bnb.pages.SignInPage;
import cyber_bnb.pages.TeamPage;
import cyber_bnb.utilities.BrowserUtils;
import cyber_bnb.utilities.ConfigurationReader;
import cyber_bnb.utilities.Driver;

public class Test_2StepDefs {

	SignInPage signInPage = new SignInPage();
	HomePage homePage = new HomePage();
	SelfPage selfPage = new SelfPage();
	TeamPage teamPage = new TeamPage();

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		Driver.getDriver().manage().window().fullscreen();
		Driver.getDriver().get(ConfigurationReader.getProperty("qa1_url"));
		signInPage.email.sendKeys("jalabaster7f@drupal.org");
		signInPage.password.sendKeys("terimapam");
		signInPage.signInButton.click();
	}

	@When("the user click on team button")
	public void the_user_click_on_team_button() {
		BrowserUtils.waitFor(2);
		BrowserUtils.hover(homePage.myButton);
		homePage.teamButton.click();
		
	}

	@Then("the user should be able to see following names")
	public void the_user_should_be_able_to_see_following_names(List<String> teamMember) {
		BrowserUtils.waitFor(2);
		for (int i = 2; i <= 8; i += 2) {
			assertEquals(teamPage.findGruopMember(i-1).getText(),teamMember.get(i/2-1));
			
		}
	}

}
