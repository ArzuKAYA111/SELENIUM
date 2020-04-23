package HOMEWOKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* TC 1: Amazon Page Title Verification: 
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
*/
public class AmazonPage {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.amazon.com");
	
	String url=driver.getTitle();
	
	System.out.println(url);
	
	Thread.sleep(300);
	
	driver.close();
	

	
	
	
	
	
	
	
	
	}

}
