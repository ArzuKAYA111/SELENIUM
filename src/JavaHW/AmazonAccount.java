package JavaHW;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* Store configuration in property file to create an Amazon account:
browser
url
name
email
password
*/
public class AmazonAccount {
	
public static WebDriver driver;// bu sekilde de olailir

	public static void main(String[] args) throws IOException, InterruptedException {
		
	String filePath=System.getProperty("user.dir")+"/configs/Amazon.properties";
		
		System.out.println(filePath);
		
	FileInputStream fis=new FileInputStream(filePath);	
		
		Properties prop=new Properties();
		prop.load(fis);
		
	String browser=prop.getProperty("browser");

	
	//WebDriver driver=null; bu sekilde yapabiliriz yada main method un disinda public static yapabiliriz.
		
		switch(browser.toLowerCase()){
		
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			
		driver=new ChromeDriver();
	
		break;
		
	case "firefox":
			
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			
			driver=new FirefoxDriver();
			
			break;		
	 	}
	driver.get(prop.getProperty("url"));	
	//driver.findElement(By.id()).setKeys(prop.getProperty("name"));	
	
	
	
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
		}
		
		
	}


