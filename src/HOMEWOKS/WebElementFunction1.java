package HOMEWOKS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 1: HRMS Application Login: 
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password
Click on login button
Then verify Syntax Logo is displayed.
 */
public class WebElementFunction1 {
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		
	System.out.println(driver.getTitle());	
		
	WebElement  userName=driver.findElement(By.xpath("//input[@type='text']"));
           	System.out.println(userName.isDisplayed());
	        System.out.println(userName.isEnabled());
	        userName.sendKeys("Admin");
	
	WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
	
	if (password.isEnabled()) {
		password.sendKeys("Hum@nhrm123");
	}else {
		password.clear();
		System.out.println("Paasword is now Enable ");
	}
	WebElement login=driver.findElement(By.cssSelector("input[id='btnLogin']"));
	login.click();
	
	WebElement logoSnytx=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
	System.out.println("Logo is Present "+logoSnytx.isDisplayed());
	System.out.println("User succesfully looged in ,Test Case paased");
	}

}
