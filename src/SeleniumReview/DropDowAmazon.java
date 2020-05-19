package SeleniumReview;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Utils.BaseClass;
/*
 * Go to amazon.com
	 * select books from the search dropdown
	 * type Harry potter
	 * and click on Search
	 * check Unofficial CookBook checkbox on the left under Book Series
 */
public class DropDowAmazon extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	
		setUp();
		
WebElement AllDrDow=driver.findElement(By.id("searchDropdownBox"));
		
AllDrDow.click();


Select selectDD=new Select(AllDrDow);

List<WebElement> AllList=selectDD.getOptions();


for(WebElement AllOptions:AllList) {
	String AllText = AllOptions.getText();
	System.out.println(AllText);
}

selectDD.selectByVisibleText("Books");

WebElement searchTextbox = driver.findElement(By.cssSelector("input[id = 'twotabsearchtextbox']"));
searchTextbox.sendKeys("Harry Potter");
WebElement searchButton = driver.findElement(By.xpath("//input[@type = 'submit'][@class = 'nav-input']"));
searchButton.click();

List<WebElement> bookSeriesCheckboxes = driver.findElements(By.className("a-spacing-micro"));
for(WebElement bookSeriesCheckbox: bookSeriesCheckboxes) {
	String checkboxText = bookSeriesCheckbox.getText();
	if(!bookSeriesCheckbox.isSelected() && checkboxText.equals("Unofficial Cookbook")) {
		Thread.sleep(1000);
		bookSeriesCheckbox.click();
		break;
	}
}

}

}