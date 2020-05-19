package Com.Class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 1: Amazon link count: 
Open chrome browser
Go to “https://www.amazon.com/”
Get all links
Get number of links that has text
Print to console only the links that has text
 */
public class TaskAmazon {

	public static String url="https://www.amazon.com/"; 
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
	
        driver.get(url);
		
		
       List<WebElement> allLinks= driver.findElements(By.tagName("a"));
       
        int count=0;
        for(WebElement links:allLinks) {
        	
        	String texts=links.getText();
        	
        	if (!texts.isEmpty()) {
        		System.out.println(texts);
        		count++;
        	}
        	
        }
   
        System.out.println("All list number = "+ allLinks.size());
        
       System.out.println("All links with text are " +count); 
  
	}}