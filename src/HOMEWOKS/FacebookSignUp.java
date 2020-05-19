package HOMEWOKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* TC 1: Facebook sign up: 
Open chrome browser
Go to “https://www.facebook.com/”
Enter first name
Enter last name
Enter mobile number
Click on sign up button
 */
public class FacebookSignUp {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com");
		
		String url= driver.getTitle();
		System.out.println(url);
		
	
		driver.findElement(By.name("firstname")).sendKeys("Jane");
		
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		
		driver.findElement(By.id("u_0_r")).sendKeys("aaaaaaaaa");
		
        driver.findElement(By.name("websubmit")).click();
	}

}
