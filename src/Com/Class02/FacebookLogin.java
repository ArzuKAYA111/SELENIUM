package Com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("syntax123");
		driver.findElement(By.tagName("input")).click();
		

	}

}
