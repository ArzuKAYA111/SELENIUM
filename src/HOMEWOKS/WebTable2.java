package HOMEWOKS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;
import Com.Utils.Constants;

/*
 * TC 2: Delete Employee
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login into the application
Add Employee
Verify Employee has been added
Go to Employee List
Delete added Employee
Quit the browser

 */
public class WebTable2 extends CommonMethods {

	public static void main(String[] args) {
	 
		setUp();

		
WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
userName.sendKeys(ConfigsReader.getProperty("username"));// configsReader
		
WebElement Password=driver.findElement(By.id("txtPassword"));	
		
Password.sendKeys(ConfigsReader.getProperty("password"));
		
WebElement logIn=driver.findElement(By.cssSelector("input[value='LOGIN']"));	
		
click(logIn);// commonMethod
		
List<WebElement> DDs = driver.findElements(By.tagName("a"));
for(WebElement oneDd: DDs) {
	String dd = oneDd.getText();
	if(dd.equals("PIM")) {
		oneDd.click();
		break;
	}
	if(dd.equals("Add Employee")) {
		oneDd.click();
		break;
	}
}


WebElement add=driver.findElement(By.xpath("//input[@id='btnAdd']"));

click(add);
String firstname="Andrea";

driver.findElement(By.xpath("input[id='firstName']")).sendKeys(firstname);;

//sendText(FirstName,"Andrea");

//FirstName.sendKeys(firstname);


//List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='resultTable']//tr")); or /tbody/tr
//
//for( int i=0;i<=tableRows.size(); i++){
//	
//	String rowTexts=tableRows.get(i).getText(); // gets text of each rows 
//	
//	if (rowTexts.contains(expectedValue)) {
//		
//	System.out.println(expectedValue + " is present there ");
//		
//	driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]/input")).click();

//sonra devam et   aadd butondan sonra
 


//table[@id='resultTable']



	}
}
