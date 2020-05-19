package Com.test;

import Com.Pages.LoginPage;
import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;

public class HrmsLoginTest extends CommonMethods{

	public static void main(String[] args) { //Test Of LoginPage Hrms
		
		setUp();
		LoginPage login=new LoginPage();
		
	sendText(login.username, ConfigsReader.getProperty("username"));
		
	sendText(login.password, ConfigsReader.getProperty("password"));	
		
	click(login.loginBtn);
	
	wait(5);
	//tearDown();
	
	}

}
