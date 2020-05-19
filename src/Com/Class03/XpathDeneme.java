package Com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDeneme {

	
		
		public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		public static void main(String[] args) throws InterruptedException {
			
			//input[@id="txtUsername"]	
			
		

			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
		
			driver.get(url);
			
		  
//	        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//			
//			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
//			
//			driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
//			
//			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[html/body/div[4]/div[2]/div/div[2]/input]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[starts-with(text(),'Log')]")).click();
			
			driver.findElement(By.xpath("//input[@class=form]")).click();
			
			
		}

	}