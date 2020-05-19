package HOMEWOKS;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*TC 4: Radio Buttons Practice  
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Radio Buttons Demo” links
Click on any radio button in “Radio Button Demo” section.
Verify correct radio is clicked
Click on any radio button in “Group Radio Buttons Demo” section.
Verify correct checkbox is clicked Quit browser  */
public class WebElementFunction4 {
	        public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement InputForms= driver.findElement(By.cssSelector("a.dropdown-toggle"));
		InputForms.click();
		
		WebElement RadButsDemo= driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons')]"));
		RadButsDemo.click();
		Thread.sleep(3000);
		List<WebElement> radBtEl= driver.findElements(By.cssSelector("input[type='radio']"));
		System.out.println("There are "+ radBtEl.size() +" buttons ");
		
		String actualButt="Female";
		String actalageButt="5 - 15";
		
		for(WebElement  RBelement:radBtEl) {
		    if(RBelement.getAttribute("value").contains(actualButt)) {
			RBelement.click();
			System.out.println("You have successfully clicked the female button. ");
		}
		if(RBelement.getAttribute("value").contains(actalageButt) ) {
			RBelement.click();
			System.out.println("You have successfully clicked on the age 5 - 15 button , Test passed");
			break;
		}}
		Thread.sleep(5000);
	//	driver.quit();
		}
	}


