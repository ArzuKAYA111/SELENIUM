package Com.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com.Utils.BaseClass;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
/*in Alert interface we have 4 methods
 * 1-getText()
 * 2-.accept()
 * 3-dismiss()
 * 4.sendKeys()
 */
		 WebDriver driver = BaseClass.setUp();// Below code is for UItestPractice.com  
		 
		 driver.manage().window().maximize();	// bunu yapmayinca sayfa tam acilmadigi icin sistem calismadi cunku buttonlara click yapamadi  
		 
		driver.findElement(By.xpath("//button[@id='alert']")).click();

		// Handling simple alert/PopUps
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String simpleAText = simpleAlert.getText();
		System.out.println("This is simple alert text:: " + simpleAText);
		Thread.sleep(1000);
		simpleAlert.accept();
		Thread.sleep(1000);

		// Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String confirmAText = confirmAlert.getText();
		System.out.println("This is Confirm alert text:: " + confirmAText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		Thread.sleep(1000);

		// Handling Prompt alerts/confirmation alerts by providing some confirmation
		// message.
		String name="Alex";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("This is Prompt alert text:: " + promptAlert.getText());
		promptAlert.sendKeys(name);
		promptAlert.accept();
		String text = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("Text added to alert box:: "+text);
		
		
		if (text.contains(name)) {
			System.out.println("Text "+name+" was successfully added");
		}else{
			System.err.println("Text "+name+" was not entered");
		}

//		BaseClass.tearDown();

	}

}