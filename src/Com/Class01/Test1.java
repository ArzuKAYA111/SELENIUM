package Com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1{

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe" );
            
		   WebDriver driver=new ChromeDriver();
    
            driver.get("https://www.amazon.com");
            String url=driver.getTitle();
            System.out.println(url);
            driver.close();
	}
	

}