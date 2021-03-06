package Com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {
	   public static void main(String[] args) {
		   
		//making connection to the web driver
		   
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// back slash ( \\ ) kullanirsak ikii kullanmamiz gerek , forward kullanirsak ( / ) tek,yada iki kullanabiliriz 
		    
		
		        WebDriver driver= new ChromeDriver();//go ahead and open chrome browser
		        
		        
		        driver.get("https://www.facebook.com");//will lunch the specified url on currnt opened browser
		        
		        
		        String actualUrl=driver.getCurrentUrl();//This method will fetch the current url
		        
		        
		        String expectedUrl="https://www.facebook.com/";//this is the expected url we created.
		        
		        
		        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		            String title=driver.getTitle();//Return the current title of web application
		            System.out.println(title);
		        }else {
		            System.out.println("Wrong Url is returned");
		        }
		        
		        
		        driver.close();//Terminate the session/browser (it is is destroying the object above).
		        
		        
		    }
	   
		}