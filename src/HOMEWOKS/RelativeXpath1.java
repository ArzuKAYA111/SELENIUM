package HOMEWOKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;

/*
 * TC 3: HRMS Login
Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “parent and child relation”
 */
public class RelativeXpath1 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		//Parent xpath/child tagName
		
		WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		username.sendKeys(ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.xpath("//div[@id='divPassword']/input"));
		password.sendKeys(ConfigsReader.getProperty("password"));
		
		WebElement login=driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
		
		click(login);
		
		tearDown();
	}

}
