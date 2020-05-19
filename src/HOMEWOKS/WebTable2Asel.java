package HOMEWOKS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Utils.BaseClass;

public class WebTable2Asel extends BaseClass {

public static void main(String[] args) {
		
//		TC 2: Delete Employee
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login into the application
//		Add Employee
//		Verify Employee has been added
//		Go to Employee List
//		Delete added Employee
//		Quit the browser
		
	//	drivers("chrome");
	setUp();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.cssSelector("input[name*='sern']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.cssSelector("a[id='menu_pim_addEmployee']")).click();
		
		driver.findElement(By.cssSelector("input[id='btnAdd']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		//adding an employee
		String name="Kubra";
		String last="Akca";
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("firstName"))));
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id='middleName']")).sendKeys("Zeynep");
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys(last);
		
		//store an employee Id
		String EmpId=driver.findElement(By.cssSelector("input[id='employeeId']")).getAttribute("value");
		System.out.println(EmpId);
        driver.findElement(By.cssSelector("input[id='btnSave']")).click();
        //verify employee was added
        String EmpDetail=driver.findElement(By.id("profile-pic")).getText();
        if(EmpDetail.contains(name+" "+last)) {
        	System.out.println("Employee added Test case pass");
        }else {
        	System.out.println("Failed");
        }
        //navigate to the employee list
        driver.findElement(By.linkText("Employee List")).click();
        //define the flag variable
        boolean found=false;
        while(!found) {
        //Get the first table from the employee List
        List<WebElement>row_f=driver.findElements(By.xpath("//table[@id='resultTable'/tbody/tr"));
        for(int i=1;i<=row_f.size();i++) {
        	//get text from each row
        	String rowText=row_f.get(i-1).getText();
        	//verify if row contains employee id
        	if(rowText.contains(EmpId)) {
        		//change the flag variable
        		found=true;
        		//deleting
        		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]td[1]"));
        		driver.findElement(By.id("btnDelete")).click();
        		driver.findElement(By.id("dialogDeleteBtn")).click();
        		break;
        	}
        }
        //if emp id is not found in the first page--->click next
        driver.findElement(By.xpath("//a[text()='Next']")).click();
        }
        driver.quit();
	}
}