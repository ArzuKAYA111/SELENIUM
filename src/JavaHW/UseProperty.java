package JavaHW;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
/* CREATE A PROPERTY FILE TO STORE following configurations:
browser=
url=
username=
password=
In your Selenum code use values from properties file to open 
specifified browser, navigate to specified url and enter username and password*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*CREATE A PROPERTY FILE TO STORE following configurations:
browser=
url=
username=
password=

In your Selenum code use values from properties file to open specifified browser, navigate to specified url and enter username and password */
public class UseProperty {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

String filePath="C:\\Users\\beyha\\eclipse-workspace\\SeleniumJavaBatch6\\configs\\Use.Properties" ;
		
		
		  WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream(filePath);
		
		 Properties prop=new Properties();	
		 prop.load(fis);
		
		
driver.get(prop.getProperty("url"));

driver.findElement(By.name("txtUsername")).sendKeys(prop.getProperty("username"));     
driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));     
driver.findElement(By.id("btnLogin")).click();    	

	System.out.println(driver.getTitle());
	
	driver.close();
	
	}
}
