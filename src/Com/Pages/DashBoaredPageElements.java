package Com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Utils.BaseClass;

public class DashBoaredPageElements {

	@FindBy(id="welcome")
	public WebElement welcome;
	
	public  DashBoaredPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
