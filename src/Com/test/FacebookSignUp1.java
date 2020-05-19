package Com.test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Com.Utils.BaseClass;
import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;
public class FacebookSignUp1 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BaseClass.setUp();
	 	
    	WebElement username=driver.findElement(By.name("firstname"));	
		sendText(username,ConfigsReader.getProperty("username"));
		
	    WebElement lastName =driver.findElement(By.name("lastname"));	
		sendText(lastName,ConfigsReader.getProperty("lastname"));
		
    	WebElement email=	driver.findElement(By.name("reg_email__"));
		sendText(email, ConfigsReader.getProperty("email"));
		
		WebElement reemail=	driver.findElement(By.name("reg_email_confirmation__"));
		sendText(reemail, ConfigsReader.getProperty("email"));
		
		WebElement password=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		sendText(password,ConfigsReader.getProperty("password"));
		
		WebElement month=driver.findElement(By.id("month"));
		selectDdValue(month,"May");
		
		
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day' ]"));
		selectDdValue(day,20);
		
		getWaitObject();
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		selectDdValue(year,37);
	
		List<WebElement> RadioBut=driver.findElements(By.xpath("//input[@class='_8esa']"));
		clickRadioOrCheckbox(RadioBut,"1");
		
	//WebElement SignUp=driver.findElement(By.xpath("//button[@id='u_0_13']"));
		//click(SignUp);
		
	//	tearDown();
			
	}
}
