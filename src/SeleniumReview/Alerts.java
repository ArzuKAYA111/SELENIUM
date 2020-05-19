package SeleniumReview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");

WebElement alertbutton=driver.findElement(By.id("alert"));
		
alertbutton.click();
		
	Alert alert=driver.switchTo().alert();// focused to alert
	Thread.sleep(2000);
alert.accept();

WebElement timealert=driver.findElement(By.xpath("//button[text()='Timing Alert']"));
timealert.click();

WebDriverWait wait= new WebDriverWait(driver,20);

wait.until(ExpectedConditions.alertIsPresent());

Thread.sleep(3000);

alert.accept();








	}

}
