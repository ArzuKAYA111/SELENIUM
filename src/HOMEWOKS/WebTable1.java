package HOMEWOKS;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Com.Utils.CommonMethods;
public class WebTable1 extends CommonMethods{
/* TC 1: Table headers and rows verification
Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table
Click on customer details
Update customers last name and credit card info
Verify updated customers name and credit card number is displayed in table
Close browser */
	public static void main(String[] args) {	
		setUp();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		  String expectedValue="Susan McLaren";
		  String Name="Susan Brown";
		  String newCrNo="37587929";
		
         	//	List Of All Rows of Table
		List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td"));
		
		for( int i=0;i<=tableRows.size(); i++){
			
			String rowTexts=tableRows.get(i).getText(); // gets text of each rows 
			
			if (rowTexts.contains(expectedValue)) {
				
			System.out.println(expectedValue + " is present there ");
				
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]/input")).click();
			WebElement CustName=driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtName")); // By CssSelector id
			
			CommonMethods.sendText( CustName, "Susan Brown");
			//CustName.sendKeys(Name);
			System.out.println(Name+ " is dis Played :: "+CustName.isDisplayed());
			
			WebElement cstCrdNo=driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox6"));// By CssSelector id
		
			CommonMethods.sendText( cstCrdNo, "37587929");
			
			System.out.println(newCrNo+ " is disPlayed :: "+cstCrdNo.isDisplayed());
			break;
			}
		}	}}
