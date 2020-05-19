package SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitReview {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		
		WebElement   startDownloadButton  =driver.findElement(By.cssSelector("button[id='downloadButton']"));
		
		startDownloadButton.click();
		//Present means is there on the Dom 
		//visibility means there is on the web page
		//Sth can be visible on page but can not be present on the Dom maybe?
		
		//Sth can be invisible on page but be present on the Dom ?
		
		
		//We use explicit mostly when we need verification, good point
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'Complete!']")));
		WebElement completeStatus = driver.findElement(By.xpath("//div[text() = 'Complete!']"));
		String competeStatusText = completeStatus.getText();
		System.out.println(competeStatusText);
		WebElement closeButton = driver.findElement(By.xpath("//button[text() = 'Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();
		
		driver.close();
	}

}