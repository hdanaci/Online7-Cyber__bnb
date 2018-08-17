package cyber_bnb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cyber_bnb.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "hunt")
	public WebElement huntButton;

	@FindBy(id = "date")
	public WebElement dateButton;

	//
	@FindBy(id = "timelineStart")
	public WebElement startHour;

	@FindBy(id = "timelineFinish")
	public WebElement finishHour;

	@FindBy(xpath = "//button[@class='button is-dark']")
	public WebElement searchButton;

	@FindBy(xpath = "(//button[.='book'])[3]")
	public WebElement roomBookButton;

	@FindBy(xpath = "(//p[@class='title is-size-4'])[1]")
	public WebElement roomName;

	@FindBy(xpath = "//button[.='confirm']")
	public WebElement confirmButton;

	@FindBy(xpath = "//div[.='conference in yale has been successfully scheduled']")
	public WebElement confirmMessage;

	@FindBy(linkText = "self")
	public WebElement selfButton;

	@FindBy(partialLinkText = "my")
	public WebElement myButton;

	@FindBy(linkText = "team")
	public WebElement teamButton;
	
	@FindBy(linkText = "sign out")
	public WebElement signOutButton;

}
