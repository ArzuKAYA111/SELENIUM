package Com.test;
import Com.Pages.logoIsDisplay;
import Com.Utils.CommonMethods;

/* TC 1: HRMS Logo Validation
Navigate to “http://166.62.36.207/humanresources/symfony/web/index”
Verify Syntax logo is displayed
Close the browser

 */
public class HrmnLogoTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		
		logoIsDisplay logdis=new logoIsDisplay();
		
Boolean logoDisplay=logdis.logo.isDisplayed();
		
		wait(2);
	
	if (logoDisplay) {
		System.out.println("Logo is display "+logoDisplay);
		System.out.println("Test case is passed");
	}else {
		System.err.println("Logo is Not  display,Test case is failed ");
	}
	
	//tearDown();
	
	}

	

}
