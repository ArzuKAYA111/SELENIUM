package HOMEWOKS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*TC 2: Syntax Page URL Verification:
1. Open chrome browser
2. Navigate to “https://www.zillow.com/”
3. Navigate to “https://www.google.com/”
4. Navigate back to Zillow Page
5. Refresh current page
6. Verify url contains “Zillow” */
public class SyntaxPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.zillow.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
				
	  String actualUrl=driver.getCurrentUrl();	
				
		if(actualUrl.equalsIgnoreCase("https://www.zillow.com/")){
			
			System.out.println("Perfect navigation");
		}else {
			System.out.println("You faild navigation");
			}
		driver.close();
		
		}}


