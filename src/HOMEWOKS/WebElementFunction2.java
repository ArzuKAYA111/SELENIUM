package HOMEWOKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 2: HRMS Application Negative Login: 
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Verify error message with text “Password cannot be empty” is displayed.
 */
public class WebElementFunction2 {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement userName = driver.findElement(By.xpath("//input[starts-with(@id,'txt') and @name='txtUsername']"));

		userName.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input [@id='txtPassword' or name='txtPassword']"));

		//password.sendKeys("Hum@nhrm123");

		String valvalue = password.getAttribute("value");

		System.out.println("Password value :: " + valvalue);

		Thread.sleep(3000);

		if (password.getAttribute("value").isEmpty()) {

			System.out.println("Password can not be empty Please check password field ");

		} else {

			System.out.println("users can login successfully");

			WebElement login = driver.findElement(By.cssSelector("input#btnLogin"));// there is id attribute we can do
																					// sccSelector ...>Tagname#valueOfidAttribute													
			login.click();

			Thread.sleep(3000);

			System.out.println("User succesfully looged in ,Test Case paased");
			driver.quit();
		}
	}

}
