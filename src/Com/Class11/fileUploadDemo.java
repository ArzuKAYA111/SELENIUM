package Com.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDemo {

	public static void main(String[] args) throws InterruptedException {

	String url="https://the-internet.herokuapp.com/";
	

	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
    driver.manage().window().maximize();

	driver.get(url);
	
	String filePath="C:\\Users\\beyha\\eclipse-workspace\\SeleniumJavaBatch6\\ScreenShot\\HRMS\\myFile.png";// to from ScreenShot folderinside the eclipse workspace
	//String filePath1="C:\\Users\\beyha\\OneDrive\\Desktop\\myFiles.png"; //to from desktop
	
	
	//click on File Upload link
	driver.findElement(By.linkText("File Upload")).click();
	
	
	//We simply use sendkeys() method to upload the file.
	//locate the choose element and send() path of file to it.
	
	driver.findElement(By.id("file-upload")).sendKeys(filePath );
	                                                            
	
	
	
	//click on upload button
			driver.findElement(By.id("file-submit")).click();
			Thread.sleep(3000);
			
		//	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
