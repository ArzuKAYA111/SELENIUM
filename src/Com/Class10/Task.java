package Com.Class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Utils.CommonMethods;

/*
 * TC 1: Table headers and rows verification
Open chrome browser
Go to “https://www.aa.com/homePage.do”
Enter From and To
Select departure as May 14 of 2020
Select arrival as November 8 of 2020
Click on search
Close browser

 */
public class Task extends CommonMethods{

	public static void main(String[] args) {
	
		
		setUp();
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[3]//td[5]")).click();
		
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();;
	//	driver.findElement(By.xpath(""));
		
		
		//List<WebElement> fromdate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//div[@class=‘ui-datepicker-title’]
		
		
		//div[@class=‘ui-datepicker-group ui-datepicker-group-first’]
		
		//div[@class=‘ui-datepicker-group ui-datepicker-group-last’]
		
		
		
		
		
		
		
		
	}

}
