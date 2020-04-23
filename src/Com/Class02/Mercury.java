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

	public static void main(String[] args) {
		
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get(url);
		
				driver.findElement(By.linkText("Register here").click;

				driver.findElement(By.Name("Register here").clic

	}

}
