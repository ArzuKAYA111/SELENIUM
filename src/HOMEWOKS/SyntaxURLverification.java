package HOMEWOKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*TC 2: Syntax Page URL Verification: 
Open chrome browser
Navigate to “https://www.zillow.com/”
Navigate to “https://www.google.com/”
Navigate back to Zillow Page
Refresh current page
Verify url contains “Zillow”
 */
public class SyntaxURLverification {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zillow.com/");
		Thread.sleep(1500);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1500);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(200);
		
String actualUrl=driver.getCurrentUrl();	

String actualUrl1=actualUrl.toLowerCase();

       if(actualUrl1.contains("zillow")) {
    	   System.out.println("Url contains Zillow ");
    	   
    	   
       }else {
    	   System.out.println("wrong navigation");
       }
       driver.close();
    }
}
