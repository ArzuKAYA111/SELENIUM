package Com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
	/*
url=http://166.62.36.207/humanresources/symfony/web/index.php/auth/loginusername=Admin
password=Hum@nhrm123	
	 */
		
		setUp();
		
		//identify username based on the parent
				WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
				sendText(username, ConfigsReader.getProperty("username"));
				
				//identify password based on the following sibling
				WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
				sendText(password, ConfigsReader.getProperty("password"));
				
				//identify login based on parents previous sibling
//				WebElement loginBtn=driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input"));
//				click(loginBtn);
				
				//identify login btn based on grandparent 
				WebElement loginBtn=driver.findElement(By.xpath("//form[@id='frmLogin']/div[5]/input"));
				click(loginBtn);
				
				Thread.sleep(6000);
				tearDown();

			}
		}
		