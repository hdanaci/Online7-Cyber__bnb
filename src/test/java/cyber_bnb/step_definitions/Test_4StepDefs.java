package cyber_bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cyber_bnb.pages.HomePage;
import cyber_bnb.pages.SelfPage;
import cyber_bnb.pages.SignInPage;
import cyber_bnb.pages.TeamPage;
import cyber_bnb.utilities.BrowserUtils;
import cyber_bnb.utilities.ConfigurationReader;
import cyber_bnb.utilities.Driver;
import cyber_bnb.utilities.ExcelUtil;

public class Test_4StepDefs {

	SignInPage signInPage = new SignInPage();
	HomePage homePage = new HomePage();
	SelfPage selfPage = new SelfPage();
	TeamPage teamPage = new TeamPage();

	String fileLoco = "/Users/bravo/Desktop/test.xlsx";
	ExcelUtil excelObject = new ExcelUtil(fileLoco, "Sheet1");
	List<Map<String, String>> data = excelObject.getDataList();
	Map<String, String> row;
	static int count = -1;

	@Given("the user logs in using {string} and {string}")
	public void the_user_logs_in_using_and(String email, String password) {

		Driver.getDriver().get(ConfigurationReader.getProperty("qa1_url"));
		Driver.getDriver().manage().window().fullscreen();

		signInPage.email.sendKeys(email);
		signInPage.password.sendKeys(password);
		signInPage.signInButton.click();

		count++;

	}

	@Then("the user information should be assert excelfile")
	public void the_user_information_should_be_assert_excelfile() {
		BrowserUtils.waitFor(2);
		row = data.get(count);

		String actualName = selfPage.Sname.getText();
		String expectedName = row.get("name");
		BrowserUtils.waitFor(1);
		assertEquals(expectedName, actualName);

		BrowserUtils.waitFor(1);
		String actualRole = selfPage.Srole.getText();
		String expectedRole = row.get("role");
		BrowserUtils.waitFor(1);
		assertEquals(expectedRole, actualRole);

		BrowserUtils.waitFor(1);
		String actualteam = selfPage.Steam.getText();
		String expectedTeam = row.get("team");
		BrowserUtils.waitFor(1);
		assertEquals(expectedTeam, actualteam);

		BrowserUtils.waitFor(1);
		String actualCampus = selfPage.Scampus.getText();
		String expectedCampus = row.get("campus");
		BrowserUtils.waitFor(1);
		assertEquals(expectedCampus, actualCampus);

		BrowserUtils.waitFor(1);
		BrowserUtils.hover(homePage.myButton);
		homePage.signOutButton.click();
		Driver.closeDriver();

	}
}
