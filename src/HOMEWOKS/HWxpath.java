package HOMEWOKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Using xPath ONLY
TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info (skip dropdowns)
Click Submit
User successfully registered */
public class HWxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Go to “http://newtours.demoaut.com/”
		driver.navigate().to("http://newtours.demoaut.com/");
//		Click on Register Link
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
//		Fill out all required info (skip dropdowns)
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("Aylin");
		
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("Gumus");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'phone')]")).sendKeys("134567789");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("A.gul@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("6968 redclock drive ");
		
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Grandpreire ");
		
		driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("Dallas");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'state')]")).sendKeys("Texas");
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("123456 ");
		
		driver.findElement(By.xpath("//select[@name='country'] //option[@value='207']")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@name,'email')]")).sendKeys("A.gul@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123123 ");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123123 ");
		
//		Click Submit
		driver.findElement(By.xpath("//input[contains(@name,'register')]")).click();
//		Thread.sleep(3000);
//		driver.close();
	}
}