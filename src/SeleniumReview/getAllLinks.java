package SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Utils.BaseClass;

public class getAllLinks extends BaseClass{//http://the-internet.herokuapp.com/


	public static void main(String[] args) {
		setUp();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int numOfLinks = allLinks.size();
		System.out.println(numOfLinks);
		
		for(WebElement link:allLinks) {
			String textOfLinks = link.getText();
			String links = link.getAttribute("href");
			System.out.println(textOfLinks + "   " + links);
		}

	}

}