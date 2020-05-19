package Com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators) */
public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		
		 String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get(url);
				
				
				driver.manage().window().maximize();
		
	        driver.findElement(By.linkText("Register here")).click();
			driver.findElement(By.name("firstName")).sendKeys("Arzu");
			driver.findElement(By.name("lastName")).sendKeys("Kaya");
			driver.findElement(By.name("phone")).sendKeys("1234567");
			driver.findElement(By.id("userName")).sendKeys("Kaya111");
			driver.findElement(By.name("address1")).sendKeys("Dallas 6968");
			driver.findElement(By.name("address2")).sendKeys("Duncenwill");
			driver.findElement(By.name("city")).sendKeys("Dallas");
			driver.findElement(By.name("state")).sendKeys("Texas");
			driver.findElement(By.name("postalCode")).sendKeys("75238");
			driver.findElement(By.name("country")).sendKeys("United State");
			driver.findElement(By.id("email")).sendKeys("Krdnz_Trbzn@gmail.com");
			driver.findElement(By.name("password")).sendKeys("ShAn1216");
			driver.findElement(By.name("confirmPassword")).sendKeys("ShAn1216");
			driver.findElement(By.name("register")).click();
			
			 Thread.sleep(20000);
			 driver.close();
	 }}
