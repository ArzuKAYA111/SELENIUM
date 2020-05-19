package SeleniumReview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
// Click on new browser button switch to vindow  Agile Testing and ATDD Automation –  Free Tutorials is visible
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		
		WebElement newBrowserTabButton=driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		
		newBrowserTabButton.click();
		
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println("Parent window id:: "+parentwindow);
		
		
		Set<String>allwindows=driver.getWindowHandles();
		
		Iterator <String> it=allwindows.iterator();
		while (it.hasNext()) {
			String childids= it.next();
			if (!parentwindow.equals(childids)) {
				driver.switchTo().window(childids);
			}
		}
		
		WebElement header=driver.findElement(By.xpath("//strong[contains(text(),'Agile Testing')]"));
		String headerText=header.getText();
		
		System.out.println(headerText);
		
		System.out.println(headerText+" is displayed " +header.isDisplayed());
		
		
		
		//driver.quit();// it will close parent window
		
		
		
		
		
		
	}}