package HOMEWOKS;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 3: Syntax Demo input boxes count: 
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Simple Form Demo” links
Get all input boxes from the page
Enter “Hello” to each text box
Close browser
 */
public class WebElementFunction3 {
public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");		
		
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		
		WebElement inputForms=driver.findElement(By.cssSelector("a.dropdown-toggle"));
		
		inputForms.click();
		
		WebElement SmpFrmDemo=driver.findElement(By.linkText("Simple Form Demo"));
		SmpFrmDemo.click();
		
	List<WebElement> InputLinks = driver.findElements(By.tagName("input"));
	
		System.out.println("There are "+ InputLinks.size() + " input Links");
		
	
		for(WebElement AllLinks:InputLinks) {
			if(AllLinks.isEnabled()) {
				AllLinks.sendKeys("Hello");
			}else {
				AllLinks.clear();
				
				AllLinks.sendKeys("Hello");
			}}
	}
}
