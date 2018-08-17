package cyber_bnb.step_definitions;


import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cyber_bnb.pages.HomePage;
import cyber_bnb.pages.SelfPage;
import cyber_bnb.pages.SignInPage;
import cyber_bnb.utilities.BrowserUtils;
import cyber_bnb.utilities.Driver;

public class Test_1StepDefs {

	SignInPage signInPage = new SignInPage();
	HomePage homePage = new HomePage();
	SelfPage selfPage = new SelfPage();

	@When("I login using username {string} and password {string}")
	public void i_login_using_username_and_password(String username, String password) {
		signInPage.email.sendKeys(username);
		signInPage.password.sendKeys(password);
		signInPage.signInButton.click();
	}

	@When("The user click on myself")
	public void the_user_click_on_myself() {
		BrowserUtils.waitFor(2);
		BrowserUtils.hover(homePage.myButton);
		BrowserUtils.waitFor(2);
		homePage.selfButton.click();
	}

	@Then("users full name {string} {string} should be displayed")
	public void users_full_name_should_be_displayed(String firstname, String lastname) {
		BrowserUtils.waitFor(2);
		String actual = selfPage.name.getText();
		String expected = firstname + " " + lastname;
		assertEquals(expected, actual);
		BrowserUtils.waitFor(2);
		Driver.closeDriver();
	}

}
