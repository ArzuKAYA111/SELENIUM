package Com.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo2 {

	public static String url="https://demoqa.com/automation-practice-form/";
	public static void main(String[] args) throws InterruptedException {
	


		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
	
		driver.get(url);
		
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='sex-0']"));
		
		// to be sure is it present 
		System.out.println(maleRadioB.isDisplayed() );
		
		
		System.out.println(maleRadioB.isEnabled());
		
	

		
	}

	}

