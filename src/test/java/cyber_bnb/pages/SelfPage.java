package cyber_bnb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cyber_bnb.utilities.Driver;

public class SelfPage {

	public SelfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//div[@class='media-content']/p)[1]")
	public WebElement name;
	
	@FindBy(xpath = "(//div[@class='media-content']/p)[2]")
	public WebElement role;
	
	@FindBy(xpath = "(//*[@class='title is-6'])[1]")
	public WebElement Sname;

	@FindBy(xpath = "(//*[@class='title is-6'])[2]")
	public WebElement Srole;

	@FindBy(xpath = "(//*[@class='title is-6'])[3]")
	public WebElement Steam;

	@FindBy(xpath = "(//*[@class='title is-6'])[4]")
	public WebElement batch;

	@FindBy(xpath = "(//*[@class='title is-6'])[5]")
	public WebElement Scampus;
	

}
