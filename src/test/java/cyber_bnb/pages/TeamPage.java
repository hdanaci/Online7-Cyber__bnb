package cyber_bnb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cyber_bnb.utilities.Driver;

public class TeamPage {

	public TeamPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public WebElement findGruopMember(int num) {
		return Driver.getDriver().findElement(By.xpath("(//p[@class='title is-6'])" + "[" + num + "]"));
	}

}
