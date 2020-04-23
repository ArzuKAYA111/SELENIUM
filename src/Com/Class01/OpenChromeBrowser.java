package Com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		 
		 
           
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//exe mac te yok
            WebDriver driver=new ChromeDriver();
         Thread.sleep(2000);// actigi browser i 2 sn bekletiyor.
            driver.close();
            
	}

}
