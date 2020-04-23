package Com.Class02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersCommand  {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
				
	  String actualUrl=driver.getCurrentUrl();	
				
		if(actualUrl.equalsIgnoreCase("https://www.facebook.com/")){
			
			System.out.println("Perfect navigation");
		}else {
			System.out.println("You faild navigation");
			}
		driver.close();
		
		}}


