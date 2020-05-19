package HOMEWOKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;

/*
 * 
TC 4: HRMS Login
Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “following and preceding siblings”
click login button using JS executer.

 */
public class AdvanceXpath2 extends CommonMethods{

	public static void main(String[] args) {
	
		
		setUp();
		
		//Define previous element based on next element /preceding siblings
		
		WebElement username=driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
		username.sendKeys(ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		password.sendKeys(ConfigsReader.getProperty("password"));
		
		//define next element based on previous elements  / uncle-nephew
		WebElement login=driver.findElement(By.xpath("//div[@id='divPassword']/following-sibling::div/input"));
		
		click(login);
		
		//tearDown();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
