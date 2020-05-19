package Com.Class09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 1: Table headers and rows verification
Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 5 rows and 4 columns
Print name of all column headers 
Print data of all rows
Quit Browser
Collaps
 */
public class TASKtable {

	public static void main(String[] args) {
		
		String url="http://166.62.36.207/syntaxpractice/";
		
	System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		driver.get(url);	
	
	
		
	//cssSelector ile define   table[id=‘task-table’] tbody tr td  bos yerlere > arrow da koyabiliriz
		
	//cssSelector ile define 	table[id=‘ctl00_MainContent_orderGrid’]>tbody>tr>td:nth-child(3)
		
		
	}
	
	

}
