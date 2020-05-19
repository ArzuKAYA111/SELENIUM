package HOMEWOKS;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Com.Utils.BaseClass;
/*TC 1: JavaScript alert text verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Alerts & Modals” links
Click on “Javascript Alerts” links
Click on button in “Java Script Alert Box” section
Verify alert box with text “I am an alert box!” is present
Click on button in “Java Script Confirm Box” section
Verify alert box with text “Press a button!” is present
Click on button in “Java Script Alert Box” section
Enter text in the alert box
Quit browser */
public class Alerts{

public static void main(String[] args) throws InterruptedException {
		    WebDriver driver=BaseClass.setUp();
                driver.manage().window().maximize();	
                
		List<WebElement >Alertlist=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		  	for(WebElement alertmodl:Alertlist) {
			
			String MdlText=alertmodl.getText();
			System.out.println(MdlText);
	
			if(MdlText.equals("Alerts & Modals")) {
				alertmodl.click();	
				break;
}}
		Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='javascript-alert-box-demo.html']")).click();
	
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();//defined the alert button
	
	     Thread.sleep(2000);
	Alert simpleAlert = driver.switchTo().alert();
	Thread.sleep(2000);
	String AlertText=simpleAlert.getText();
	Thread.sleep(2000);
	System.out.println("Is alert box present ! "+AlertText);
	                                                                                                   System.out.println("   ");
	simpleAlert.accept();
	
	     Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();	
	Thread.sleep(2000);	
	Alert confirmAlert = driver.switchTo().alert();	
	Thread.sleep(2000);
	String confirmText=confirmAlert.getText();
	System.out.println("confirm alert text is "+confirmText);
		                                                                                              System.out.println("   ");
	confirmAlert.accept();
	
	    Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
	Alert promptAlrt=driver.switchTo().alert();
	Thread.sleep(2000);	
	String promptText = promptAlrt.getText();
	System.out.println("confirm alert text is ::"+ promptText);
	Thread.sleep(2000);	
	String name="Arzu";
	promptAlrt.sendKeys(name);
	
	promptAlrt.accept();
	
	WebElement CheckText=driver.findElement(By.id("prompt-demo"));
	String addedText=CheckText.getText();
	System.out.println("Name added to alert box "+addedText);
	                                                                                                 System.out.println(" ");
	if(addedText.contains(name)){
		System.out.println("Your name "+name +" was successfully entered to system" );
	}else {
		System.err.println(name +" was not entered Check your code ");
	}
	System.out.println("Test is completed Successfully");
	
		
	}}
