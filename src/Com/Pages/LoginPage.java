package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Utils.CommonMethods;

public class LoginPage extends CommonMethods {

	// we test it in test Com Test Pagkage
		
	// goal of this class is store	the WebElements
		
	public	WebElement username=driver.findElement(By.id("txtUsername"));
		
	public	WebElement password=driver.findElement(By.id("txtPassword"));
	public	WebElement loginBtn=driver.findElement(By.id("btnLogin"));

		// we created instance variables to accese evryawher we did them public
		
		
	}


