package HOMEWOKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* Using Css ONLY
TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info (skip dropdowns)
Click Submit
User successfully registered
*/
public class HWccsSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		driver.findElement(By.cssSelector("a[href*='register']")).click();
		
		driver.findElement(By.cssSelector("input[name*='firstName']")).sendKeys("Jane");
		
		driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys("White");
		
		driver.findElement(By.cssSelector("input[size^='15']")).sendKeys("98653678");
		
		driver.findElement(By.cssSelector("input[name*='userName']")).sendKeys("Jane.Jane@gmail.com");
		
		driver.findElement(By.cssSelector("input[name*='address1']")).sendKeys("Plano");
		
		driver.findElement(By.cssSelector("input[name*='address2']")).sendKeys("Duncleville");
		
		driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("Dallas");
		
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Texas");
		
		driver.findElement(By.cssSelector("input[name$='Code']")).sendKeys("37485ahs");
		
		driver.findElement(By.cssSelector("select[name='country'] option[value='207']")).click();
		
		driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("Jane.Jane@gmail.com");
		
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("5673322");
		
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("5673322");
		
		driver.findElement(By.cssSelector("input[name='register']")).click();
		
		
	   Thread.sleep(4000);
	
	//	driver.close();
		
		
		
	}
	}