package Com.Class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth	
Quit browser*/
public class dropdownFacebook {
	
public static String url="https://www.facebook.com";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get(url);
		
		WebElement monthDDown=driver.findElement(By.id("month"));
		
		Select selectm=new Select(monthDDown);
		List<WebElement> options=selectm.getOptions();
		selectm.selectByVisibleText("May");
		
	
		WebElement dayDDown=driver.findElement(By.id("day"));
		
		Select selectd=new Select(dayDDown);
		
		List<WebElement> dayOptions=selectd.getOptions();
	for (int i=1; i<=dayOptions.size();i++) {
	
		if (i==20) {
			selectd.selectByIndex(i);
		}
	}
	
	WebElement yearDDown=driver.findElement(By.id("year"));
	     Select selectyear=new Select(yearDDown);
	
	  //  List<WebElement> yearOptions=selectyear.getOptions();
	    	
	selectyear.selectByValue("1984");
	
	//driver.quit();
	}
	
	}

