package cyber_bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

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

public class Test_3StepDefs {

	SignInPage signInPage = new SignInPage();
	HomePage homePage = new HomePage();
	SelfPage selfPage = new SelfPage();
	TeamPage teamPage = new TeamPage();

	@Given("the user sign in using email {string} and password {string}")
	public void the_user_sign_in_using_email_and_password(String email, String password) {
		Driver.getDriver().manage().window().fullscreen();
		Driver.getDriver().get(ConfigurationReader.getProperty("qa1_url"));
		BrowserUtils.waitFor(2);
		signInPage.email.sendKeys(email);
		BrowserUtils.waitFor(2);
		signInPage.password.sendKeys(password);
		BrowserUtils.waitFor(2);
		signInPage.signInButton.click();
	}

	@When("the user is on the my self page")
	public void the_user_is_on_the_my_self_page() {
		BrowserUtils.waitFor(3);
		BrowserUtils.hover(homePage.myButton);
		homePage.selfButton.click();
	}

	@Then("the user information should be displayed")
	public void the_user_information_should_be_displayed(Map<String, String> map) {
		BrowserUtils.waitFor(3);
		String expectedName = map.get("name");
		assertEquals(expectedName, selfPage.Sname.getText());
		BrowserUtils.waitFor(2);
		String expectedRole = map.get("role");
		assertEquals(expectedRole, selfPage.Srole.getText());
		BrowserUtils.waitFor(2);
		BrowserUtils.hover(homePage.myButton);
		homePage.signOutButton.click();
		Driver.closeDriver();
		
	}
}
