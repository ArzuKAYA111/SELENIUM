package HOMEWOKS;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.Utils.BaseClass;

/*TC 2: Syntax Frame verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Others” link
Click on “Iframe” link
Click on the “Home” link inside the first frame
Verify “Syntax logo” is displayed in second frame
Quit browser
*/
public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BaseClass.setUp();
        driver.manage().window().maximize();
       
	List<WebElement> other=driver.findElements(By.xpath("//a[@class='dropdown-toggle' and@data-toggle='dropdown']"));
	Thread.sleep(1000);
	
	for(WebElement otherOPt:other) {
		String DDopt=otherOPt.getText();
		System.out.println(DDopt);
	
	if(DDopt.equals("Others")) {
		otherOPt.click();
		break;
	}	
}
	WebElement iframe= driver.findElement(By.linkText("Iframe"));
	Thread.sleep(1000);
	iframe.click();
	
	driver.switchTo().frame("FrameOne");
	WebElement Home=driver.findElement(By.linkText("Home"));
	Home.click();
	driver.switchTo().defaultContent();
	
	
	driver.switchTo().frame("FrameTwo");
	Thread.sleep(1000);
    WebElement Logo=driver.findElement(By.xpath("//img[@class='custom-logo']"));
	Boolean isLogoDisplayed=Logo.isDisplayed();
	if(isLogoDisplayed) {
		
		System.out.println("Logo is disPlayed "+ isLogoDisplayed);
	}else {
		System.err.println("logo is not displyed  ");
	}
	driver.switchTo().defaultContent();
	System.out.println("Test is completed ");
   
	//BaseClass.tearDown();
	
	}

}
