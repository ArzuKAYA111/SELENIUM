package Com.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.Utils.BaseClass;

public class ActionClassAmozonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	
		WebDriver driver=BaseClass.setUp();       // Extend yapmadan base class i kullanmak iscin
		
		
		WebElement account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions action=new Actions(driver);
		
		
		action.moveToElement(account).perform();
		
	WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newcust']"));

	if(element.getText().contains("Starts")) {	;
	
	System.out.println("menu displayed");
	
	}else {
		System.out.println("menu did Not display");
	}
	
	//How to rightclick on an element 
	action.contextClick(element).perform();
	
	
	//How to double click on an element 
	WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

	action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
	
	
	//action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movie").perform();
			Thread.sleep(5000);
			BaseClass.tearDown();
	
	
		
	}

}
