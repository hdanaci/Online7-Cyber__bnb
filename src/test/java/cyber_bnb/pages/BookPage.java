package cyber_bnb.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cyber_bnb.utilities.Driver;

public class BookPage {
	
	public BookPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	} 
	
	@FindBy(xpath="(//button[@class='button is-transparent is-white'])[3]")
	public WebElement yaleBook;
	
	@FindBy(xpath="//button[.='confirm']")
	public WebElement confirmButton;
	
	@FindBy(xpath="//div[.='conference in yale has been successfully scheduled']")
	public WebElement Cmessage;
	
	@FindBy(xpath="//div[@class='column is-one-third']/div/div/p[1]")
	public List<WebElement> roomNames;
	
	@FindBy(xpath="//td[@class='conference ng-star-inserted']")
	public WebElement scheduleBar;
	
	@FindBy(xpath="//button[.='cancel conference']")
	public WebElement cancelConf;
	
	@FindBy(xpath="//div[.='you already have a conference for 2018-08-23.']")
	public WebElement doubleMessage;
	
}
