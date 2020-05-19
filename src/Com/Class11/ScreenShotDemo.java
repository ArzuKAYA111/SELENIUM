package Com.Class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Com.Utils.CommonMethods;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		
	setUp();	//url=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
//             username=Admin
//		    	password=Hum@nhrm123

	
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		Thread.sleep(2000);
		
		//Create an object of TakesScreenshot interface and cast the Webdriver with it.
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		//Use getScreenshotAs() method to take the screenshot(int the constructor pass Type.File
		File SrcFile=ts.getScreenshotAs(OutputType.FILE);
		
		
		//Copy the file from source to a another destination 
		try {
		FileUtils.copyFile(SrcFile, new File("ScreenShot/HRMS/dasboared.png"));
		                                              //folderPath
	                                          //ScreenShot...>     foldername 
		                                      //HRMN .....>        created new folder name
		                                      // dashboared.....>  FileName
		                                      // png......>        File type
		}catch(IOException e) {
			
			e.printStackTrace();
			System.out.println("Screenshot was not taken");	
		}
		
		
		
	}

}
