package HOMEWOKS;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Utils.BaseClass;
/*TC 2: Select and Deselect values
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Select Dropdown List” links
Select value from “Select List Demo” section
Verify value has been selected
Select 4 options from “Multi Select List Demo”
Deselect 1 of the option from the dd
Quit browser*/
public class DDTask2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
	BaseClass.setUp();

	WebElement InputForms= driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	InputForms.click();
	Thread.sleep(3000);
	
	WebElement SelDropDwn= driver.findElement(By.linkText("Select Dropdown List"));
	SelDropDwn.click();
	
	
	WebElement SelclDemo=driver.findElement(By.cssSelector("#select-demo"));
	Select selctSLD=new Select(SelclDemo);
	
	Boolean isDDMultpl=selctSLD.isMultiple();
	System.out.println("DD is Multpl ::"+ isDDMultpl);
	
	List<WebElement> DropDown=selctSLD.getOptions();
	
	for(WebElement options:DropDown) {
	String Texts=options.getText();
	if(Texts.equals("Friday")) {
		options.click();
	}}
	
	
	WebElement MulDD=driver.findElement(By.id("multi-select"));
	    Select SlctMult=new Select(MulDD);
	
	   Boolean isDDMultp=SlctMult.isMultiple();
	   System.out.println("Select list is Multpl ::"+ isDDMultp);
	
	if (isDDMultp) {
		SlctMult.selectByIndex(3);
		Thread.sleep(1000);
		SlctMult.selectByIndex(5);
		Thread.sleep(1000);
		SlctMult.selectByIndex(1);
		SlctMult.selectByIndex(7);
		Thread.sleep(3000);
	}
	SlctMult.deselectByIndex(1);
	//tearDown();
	
	}

}
