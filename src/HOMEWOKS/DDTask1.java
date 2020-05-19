package HOMEWOKS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Utils.BaseClass;

/*TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department 
Select Computers
Quit browser 
 */
public class DDTask1 extends BaseClass {

	public static void main(String[] args) {

		BaseClass.setUp();

		WebElement amzndpart = driver.findElement(By.id("searchDropdownBox"));

		Select selectdeprt = new Select(amzndpart);

		List<WebElement> alloptions = selectdeprt.getOptions();

		System.out.println("There are " +alloptions.size()+" department options ");

		for (WebElement allDepartment : alloptions) {
			String departments = allDepartment.getText();
			System.out.println(departments);
		}
		
       //Select Computer ByVisibleText()

//selectdeprt.selectByVisibleText("Computers");

           //Select Computer  ByValue(); 

		selectdeprt.selectByValue("search-alias=computers");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	tearDown();
		
		
	}

}
