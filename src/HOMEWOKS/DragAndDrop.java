package HOMEWOKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.Utils.CommonMethods;

/* TC 1: Drag and Drop verification
Open chrome browser
Go to “http://www.uitestpractice.com/”
Click on “Droppable” link
Using mouse drag “Drag me to my target” to the “Drop Here”
Close the browser
 */
public class DragAndDrop extends CommonMethods {

	public static void main(String[] args) {
		
		
		setUp();
		
	WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::p  "));
		
	WebElement drop	=driver.findElement(By.xpath("//div[@id='droppable']"));
		
	
	      Actions act=new Actions(driver);
	      
	      
	//1Way Longer Way
	      
		//act.clickAndHold(drag).moveToElement(drop).release().perform();
		
	//2 Way shorter Way	
		
		act.dragAndDrop(drag, drop).perform();
		
		wait(5);
		
	//	driver.quit();
		
		
	}

}
