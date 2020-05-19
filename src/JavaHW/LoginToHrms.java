package JavaHW;
/* /*CREATE A PROPERTY FILE TO STORE following configurations:
browser=
url=                                                        //HW un Aselin yaptigi 
username=
password=
In your Selenum code use values from properties file to open specifified browser, navigate to specified url and enter username and password */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {
	   
	public static WebDriver driver ;
	
public static void main(String[] args) throws IOException, InterruptedException {
	
String filePath=System.getProperty("user.dir")+"/configs/configuration.properties";//file in yerini belirliyor /file i programa ekliyor
		
//System.out.println(filePath);//	file'in yerini cek etmek icin yazdirabiliriz
	
//String filePath="/Users/beyha/eclipse-workspace/SeleniumJavaBatch6/configs/configuration.properties";//kendimiz copy paste yapabiliriz
//System.out.println(filePath);

	FileInputStream fis= new FileInputStream(filePath);	
	
	Properties prop = new Properties();	
		
	prop.load(fis);
	
	String browser =prop.getProperty("browser");
	
	WebDriver driver=null;
	
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
driver.findElement(By.id("txtUsername")).sendKeys (prop.getProperty("username"));
driver.findElement(By.id("txtPassword")).sendKeys (prop.getProperty("password"));
driver.findElement(By.name("Submit")).click();

	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.close();
	}}
