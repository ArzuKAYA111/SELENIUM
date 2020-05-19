package Com.Class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Utils.BaseClass;

public class DropDownDemo1 extends BaseClass {//url=http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html       configs1 dan bunu sec calistiracagin zaman

	public static void main(String[] args) throws InterruptedException {

		BaseClass.setUp();// can be only  setUp because we inherited it //Open chrome browser and lucnch Syntax Practice Site

		WebElement weekDD = driver.findElement(By.id("select-demo"));

		Select select = new Select(weekDD);//Object select class accepts WebElement.

		/*
		 * Selenium provides three different ways to select a value from a DD. 1.
		 * 1. byIndex();
		 * 2. ByVisibleText(String str);
		 * 3. ByValue();
		 */

		List<WebElement> options=select.getOptions();
		System.out.println("Number of Opetions in the DD:: "+options.size());

		//select.selectByIndex(1);

		for(int i=1;i<options.size();i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}

		
		select.selectByVisibleText("Friday");//can select an option by Visible text.
		//In the parameter provide the text Visible on UI.
		
		
		Thread.sleep(3000);
		tearDown();

	}

}