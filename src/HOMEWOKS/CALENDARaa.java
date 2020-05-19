package HOMEWOKS;
import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import Com.Utils.CommonMethods;
/*TC 1: Calendar headers and rows verification
Open chrome browser
Go to “https://www.aa.com/homePage.do”
Enter From and To
Select departure as July 14 of 2020
Select arrival as November 8 of 2020
Close browser
Depart Month Year Xpath: "//div[contains(@class, 'ui-corner-left')]/div"
Depart Month Days Xpath: //div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td
Next Button Xpath: //a[@title='Next']
Return Month Xpath: //span[@class='ui-datepicker-month']
Return Days Xpath: //table[@class='ui-datepicker-calendar']/tbody/tr/td
You can put the logic the way you want.*/
public class CALENDARaa extends CommonMethods {
	public static void main(String[] args) {
		
	setUp();	
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		
//		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();//To click on Depart Calendar
//		
//		String deprtmonth=driver.findElement(By.xpath("//div[contains(@class,'ui-helper-clearfix ui-corner-left')]")).getText();// to get months Names
//		
//		while(!deprtmonth.equals("July")) {
//			
//		WebElement month=driver.findElement(By.xpath("//a[@title='Next']"));// to click next button(To Change month)
//		WaitForClickability(month);
//		  month.click();
//			deprtmonth=driver.findElement(By.xpath(" //span[@class='ui-datepicker-month']")).getText();// to get month
//		}
//		
//		List<WebElement> departDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));// to get the days
//		
//		for(WebElement Dprtdate:departDate) {
//			String DeprtDates=Dprtdate.getText();
//			if(DeprtDates.equals("14")) {
//				Dprtdate.click();
//				break;
//			}
//			
//		}
	
	
		
     driver.findElement(By.xpath("//input[@name='returnDate']")).click();//To click on Depart Calendar
	String retrnmonth=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group ui-datepicker-group-first')]/table/tbody/tr/td")).getText();// to get months Names
	
	while(!retrnmonth.equals("November")) {
		
	WebElement Rmonth=driver.findElement(By.xpath("//button[@id='hero-next']"));// to click next button(To Change month)
	WaitForClickability(Rmonth);
	Rmonth.click();
		retrnmonth=driver.findElement(By.xpath(" //span[@class='ui-datepicker-month']")).getText();// to get month
	}
//		
//		List<WebElement> departDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));// to get the days
//		
//		for(WebElement Dprtdate:departDate) {
//			String DeprtDates=Dprtdate.getText();
//			if(DeprtDates.equals("14")) {
//				Dprtdate.click();
//				break;
//			}
//			
//		}
	
	}

}
