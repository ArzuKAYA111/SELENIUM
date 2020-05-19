package SeleniumReview;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;
/*Homework -- Create account
Go to facebook.com
Verify “Create a new account” is Displayed
Fill out First name, lastname, email, new password
Select your birthday from given dropdowns
Select gender
Click sign up
 */
public class HW1 extends CommonMethods {

	

	public static void main(String[] args) {

		setUp();
		
WebElement signUp=driver.findElement(By.linkText("Sign Up"));
		
	   System.out.println("sign up is displayed :: "+signUp.isDisplayed());
	
WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
	    CommonMethods.sendText(firstname, "Andrea");
	
WebElement lastname=driver.findElement(By.name("lastname"));   
	   CommonMethods.sendText(lastname, ConfigsReader.getProperty("lastname"));
	   
WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__'and @id='u_0_r']"));
	   CommonMethods.sendText(email, ConfigsReader.getProperty("email"));
	   
WebElement Remail=driver.findElement(By.name("reg_email_confirmation__"));   
	   CommonMethods.sendText(Remail, ConfigsReader.getProperty("email"));
	   
WebElement password=driver.findElement(By.name("reg_passwd__"));  
	   CommonMethods.sendText(password, ConfigsReader.getProperty("password"));
	   
WebElement month=driver.findElement(By.id("month"));
		selectDdValue(month,"Apr");
	
	   
WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day' ]"));
selectDdValue(day,20);
		
		getWaitObject();
		
WebElement year=driver.findElement(By.name("birthday_year"));
selectDdValue(year,33);
	
List<WebElement> RadioBut=driver.findElements(By.xpath("//input[@class='_8esa']"));
		clickRadioOrCheckbox(RadioBut,"1");
		
		
		
		
		
		
		
		
		
		
		

  } 
		
	}




