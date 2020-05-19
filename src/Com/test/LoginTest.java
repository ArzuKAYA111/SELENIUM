package Com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) {
		
		/*
		 * User should be able to login to the application with valid credentials
		 */
		
		//open browser and navigate to url
		setUp();                        //url=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
		driver.manage().window().maximize();
		//sending username
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		//sending password
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
//		click on login
		
		
		//close browser
		tearDown();

	}
}