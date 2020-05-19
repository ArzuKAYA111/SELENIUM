package HOMEWOKS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import Com.Utils.CommonMethods;

/* TC 2: Upload file and Take Screenshot
Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot
 */
public class UploadFileTakeScShoot extends CommonMethods {

	public static void main(String[] args) {
		
		
		setUp();
		
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='gwt-debug-cwFileUpload']"));
		
		WebElement UploadFile=driver.findElement(By.xpath("//button[@class='gwt-Button']"));
		
		String filePath="C:\\Users\\beyha\\OneDrive\\Desktop\\KURS DOSYAM\\image (5).png";
		
		chooseFile.sendKeys(filePath);
		UploadFile.click();
		
		acceptAlert();
		
	TakesScreenshot ts=(TakesScreenshot)driver;
		
	File screenFiles=ts.getScreenshotAs(OutputType.FILE);
		
	try {
		FileUtils.copyFile(screenFiles, new File("ScreenShot/GoogleWeb/FileUpload.png"));
	} catch (IOException e) {
		System.out.println("Screenshot was not taken");
		e.printStackTrace();
	}	
	
	
	//	tearDown();
		
	}

}
