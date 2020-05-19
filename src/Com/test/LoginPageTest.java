package Com.test;

import Com.Pages.DashBoaredPageElements;
import Com.Pages.LoginPageElements;
import Com.Utils.CommonMethods;
import Com.Utils.ConfigsReader;

public class LoginPageTest extends CommonMethods { 

	public static void main(String[] args) {// To Login Hrmn
setUp();
		
LoginPageElements login=new LoginPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		DashBoaredPageElements dashboard=new DashBoaredPageElements();
	
	
	
	}

}
