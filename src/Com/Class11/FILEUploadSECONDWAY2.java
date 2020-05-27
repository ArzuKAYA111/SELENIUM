package Com.Class11;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FILEUploadSECONDWAY2 {

public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","Users\\beyha\\eclipse-workspace\\SeleniumJavaBatch6\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.indeed.co.in");
		
		driver.findElement(By.className("resume-promo-link")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Upload Resume')]")).click();
		
		
		//Store the location of the file in clipboard 
		//Clipboard
		 StringSelection strSel = new StringSelection("C:\\SeleniumResume.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
		
		//Create an object for robot class
		Robot robot = new Robot();
		//Control key in the keyboard
		//Ctrl+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		 
		Dimension d1 = new Dimension(1200,1800);
		BufferedImage bufImage = robot.createScreenCapture(new Rectangle(d1));
		File f = new File("indeedScreenshot.jpg");
		ImageIO.write(bufImage,"jpg", f);
			
		
	}
}